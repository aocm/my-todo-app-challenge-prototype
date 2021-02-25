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
          <q-list>

            <template v-for="(menuItem, index) in menuList">
              <q-item :key="index" clickable :active="menuItem.label === 'Outbox'" v-ripple>
                <q-item-section avatar>
                  <q-icon :name="menuItem.icon" />
                </q-item-section>
                <q-item-section>
                  {{ menuItem.label }}
                </q-item-section>
              </q-item>
              <q-separator :key="'sep' + index"  v-if="menuItem.separator" />
            </template>
          </q-list>
        </q-scroll-area>
      </q-drawer>
    <q-page-container>
      <q-list bordered class="rounded-borders">
        <q-item-label header>Tasks</q-item-label>

        <q-separator spaced />
        <q-item>
          <q-item-section avatar top>
            <q-icon name="check_box_outline_blank" color="black" size="34px" />
          </q-item-section>

          <q-item-section top class="col-2 gt-sm">
            <q-item-label class="q-mt-sm">taskA</q-item-label>
          </q-item-section>

          <q-item-section >
            <q-item-label lines="1">
              <span class="text-weight-medium">task ~~~~~ </span>
            </q-item-label>
          </q-item-section>

          <q-item-section top side>
            <div class="text-grey-8 q-gutter-xs">
              <q-btn class="gt-xs" size="12px" flat dense round icon="delete" />
              <q-btn size="12px" flat dense round icon="more_vert" />
            </div>
          </q-item-section>
        </q-item>

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
  </q-layout>
</template>

<script>
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
  name: 'TaskLayout',
  data () {
    return {
      drawer: false,
      menuList,
      text: ''
    }
  }
}
</script>
