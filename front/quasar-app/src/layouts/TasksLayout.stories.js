
import TasksLayout from './TasksLayout'
// import { action } from '@storybook/addon-actions'

export default {
  title: 'TasksLayout',
  component: TasksLayout,
  // Our exports that end in "Data" are not stories.
  excludeStories: /.*Data$/
}

export const actionsData = {
}
const Template = (args, { argTypes }) => ({
  components: { TasksLayout },
  props: Object.keys(argTypes),
  methods: actionsData,
  template: '<TasksLayout :task-list="taskList" :menu-list="menuList" />'
})

export const Default = Template.bind({})
Default.args = {
  taskList: [
    {
      title: 'dummy1'
    },
    {
      title: 'dummy2'
    }
  ],
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
