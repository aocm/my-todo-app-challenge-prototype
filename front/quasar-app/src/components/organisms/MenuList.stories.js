
import MenuList from './MenuList'
// import { action } from '@storybook/addon-actions'

export default {
  title: 'MenuList',
  component: MenuList,
  // Our exports that end in "Data" are not stories.
  excludeStories: /.*Data$/
}

export const actionsData = {
}
const Template = (args, { argTypes }) => ({
  components: { MenuList },
  props: Object.keys(argTypes),
  methods: actionsData,
  template: '<MenuList v-bind="$props" :menu-list="menuList" />'
})

export const Tasks = Template.bind({})
Tasks.args = {
  menuList: [
    {
      icon: 'assignment_turned_in',
      label: 'Tasks',
      separator: true
    },
    {
      icon: 'delete',
      label: 'Trash',
      separator: false
    },
    {
      icon: 'settings',
      label: 'Settings',
      separator: true
    },
    {
      icon: 'list',
      label: 'List',
      separator: false
    }
  ]

}
