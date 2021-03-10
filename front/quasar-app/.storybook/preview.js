// .storybook/preview.js

// import '../src/index.css'; //👈 The app's CSS file goes here
import 'quasar/dist/quasar.min.css'
import '@quasar/extras/roboto-font/roboto-font.css'
import '@quasar/extras/material-icons/material-icons.css'
import '@quasar/extras/material-icons-outlined/material-icons-outlined.css'

import 'quasar/dist/quasar.css'
import Vue from 'vue';
import Quasar from 'quasar';

Vue.use(Quasar, { config: {}, directives: {} });
//👇 Configures Storybook to log the actions( onArchiveTask and onPinTask ) in the UI.
export const parameters = {
  actions: { argTypesRegex: '^on[A-Z].*' },
};