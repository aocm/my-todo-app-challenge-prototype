<template>
  <TasksLayout
    :menu-list="menuList"
    :task-list="tasks.taskList"
  />
</template>

<script>
import TasksLayout from 'layouts/TasksLayout.vue'
import { mapState } from 'vuex'

const menuList = [
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

export default {
  name: 'Tasks',
  components: { TasksLayout },
  data () {
    return {
      drawer: false,
      menuList,
      // taskList,
      text: ''
    }
  },

  computed: mapState(['tasks'])
}
</script>
