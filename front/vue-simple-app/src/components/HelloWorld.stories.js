// src/components/Task.stories.js

import HelloWorld from './HelloWorld';
import { action } from '@storybook/addon-actions';

export default {
  title: 'HelloWorld',
  component: HelloWorld,
  // Our exports that end in "Data" are not stories.
  excludeStories: /.*Data$/,
};

export const actionsData = {
};

const Template = (args, { argTypes }) => ({
  components: { HelloWorld },
  props: Object.keys(argTypes),
  methods: actionsData,
  template: '<HelloWorld />',
});

export const Default = Template.bind({});
Default.args = {

};
