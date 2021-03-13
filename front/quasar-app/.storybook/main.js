// .storybook/main.js

const webpackFinal = require('../webpack-config.js');

module.exports = {
  //👇 Location of our stories
  stories: ['../src/components/**/*.stories.js', '../src/layouts/**/*.stories.js'],
  addons: ['@storybook/addon-links', '@storybook/addon-essentials'],
  webpackFinal
};