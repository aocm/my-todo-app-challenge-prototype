<template>
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
</template>

<script>

export default {
  name: 'MenuList',
  props: {
    menuList: {
      type: Array,
      default: null,
      required: true
    }
  }
}
</script>
