<template>
  <q-page-container>
    <q-list bordered class="rounded-borders">
      <q-item-label header>Tasks</q-item-label>
      <template v-for="(taskItem, index) in taskList">
        <q-separator :key="index" spaced />
        <task-item :key="index" :title="taskItem.title" />
      </template>
    </q-list>
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
</template>

<script>
import TaskItem from 'components/molecules/TaskItem.vue'

export default {
  name: 'TaskList',
  components: { TaskItem },
  props: {
    taskList: {
      type: Array,
      default: null
    }
  }
}
</script>
