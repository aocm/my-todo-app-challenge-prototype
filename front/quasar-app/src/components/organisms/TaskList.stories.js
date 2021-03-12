
import TaskList from './TaskList'
// import { action } from '@storybook/addon-actions'
import * as TaskStories from '../molecules/TaskItem.stories'

export default {
  title: 'TaskList',
  component: TaskList,
  // Our exports that end in "Data" are not stories.
  excludeStories: /.*Data$/
}

// export const actionsData = {
//   onDelete: action('delete-emit'),
//   onDetail: action('detail-emit')
// }
const Template = (args, { argTypes }) => ({
  components: { TaskList },
  props: Object.keys(argTypes),
  methods: TaskStories.actionsData,
  template: '<TaskList v-bind="$props" :task-list="taskList" @delete-emit="onDelete" @detail-emit="onDetail" />'
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
