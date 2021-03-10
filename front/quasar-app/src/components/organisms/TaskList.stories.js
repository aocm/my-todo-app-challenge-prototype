
import TaskList from './TaskList'
// import { action } from '@storybook/addon-actions'

export default {
  title: 'TaskList',
  component: TaskList,
  // Our exports that end in "Data" are not stories.
  excludeStories: /.*Data$/
}

export const actionsData = {
}

const Template = (args, { argTypes }) => ({
  components: { TaskList },
  props: Object.keys(argTypes),
  methods: actionsData,
  template: '<TaskList :task-list="taskList" />'
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
  ]
}
