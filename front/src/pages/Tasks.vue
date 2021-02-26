<template>
  <TasksLayout
    :menu-list="menuList"
    :task-list="taskList"
  />
</template>

<script>
import TasksLayout from 'layouts/TasksLayout.vue'
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

const taskList = [
  {
    title: 'dummy1'
  },
  {
    title: 'dummy2'
  }
]
export default {
  name: 'Tasks',
  components: { TasksLayout },
  data () {
    return {
      drawer: false,
      menuList,
      taskList,
      text: ''
    }
  }
}
</script>
