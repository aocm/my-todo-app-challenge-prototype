<template>
  <q-list bordered class="rounded-borders">
    <q-item-label header>Tasks</q-item-label>
    <template v-for="(taskItem, index) in taskList">
      <q-separator :key="`${index}+separator`" spaced />
      <task-item
        v-on="$listeners"
        :key="index"
        :title="taskItem.title"
      />
    </template>
  </q-list>
</template>

<script>
import TaskItem from '../molecules/TaskItem.vue'

export default {
  name: 'TaskList',
  components: { TaskItem },
  props: {
    taskList: {
      type: Array,
      default: null
    }
  },
  data () {
    return {
      text: ''
    }
  },
  methods: {
    deleteButton (val) {
      console.log(val)
    },
    detailButton (val) {
      console.log(val)
    },
    inputEnter () {

    }
  }
}
</script>
