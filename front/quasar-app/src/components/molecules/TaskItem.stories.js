
import TaskItem from './TaskItem'
// import { action } from '@storybook/addon-actions'

export default {
  title: 'TaskItem',
  component: TaskItem,
  // Our exports that end in "Data" are not stories.
  excludeStories: /.*Data$/
}

export const actionsData = {
}

const Template = (args, { argTypes }) => ({
  components: { TaskItem },
  props: Object.keys(argTypes),
  methods: actionsData,
  template: '<TaskItem :title="title" />'
})

export const Default = Template.bind({})
Default.args = {
  title: 'tasktitle'
}
