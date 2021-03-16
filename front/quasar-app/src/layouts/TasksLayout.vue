<template>
  <q-layout view="hHh Lpr lff" class="shadow-2 rounded-borders">
    <q-header elevated class="bg-black">
      <q-toolbar>
        <q-btn flat @click="drawer = !drawer" round dense icon="menu" />
        <q-toolbar-title>Header</q-toolbar-title>
      </q-toolbar>
    </q-header>
    <q-drawer
      v-model="drawer"
      show-if-above
      :width="200"
      :breakpoint="500"
      bordered
      content-class="bg-grey-3"
    >
      <q-scroll-area class="fit">
        <menu-list :menu-list="menuList" />
      </q-scroll-area>
    </q-drawer>
    <q-page-container>
      <task-list :task-list="taskList" />
      <q-footer bordered class="bg-white text-primary">
        <q-list class="rounded-borders">
          <q-item>
            <q-item-section>
              <q-input color="" v-model="text" label="add tasks">
                <template v-slot:prepend>
                  <q-icon name="add_tasks" />
                </template>
              </q-input>
            </q-item-section>
          </q-item>
        </q-list>
      </q-footer>
    </q-page-container>

  </q-layout>
</template>

<script>
import TaskList from '../components/organisms/TaskList.vue'
import MenuList from '../components/organisms/MenuList.vue'

export default {
  name: 'TaskLayout',
  components: { TaskList, MenuList },
  props: {
    menuList: {
      type: Array,
      default: null
    },
    taskList: {
      type: Array,
      default: null
    }
  },
  data () {
    return {
      drawer: false,
      text: ''
    }
  }
}
</script>
