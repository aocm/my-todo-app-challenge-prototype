<template>
  <q-item>
    <q-item-section avatar top>
    <q-icon name="check_box_outline_blank" color="black" size="34px" />
    </q-item-section>

    <q-item-section >
    <q-item-label lines="1">
      <span class="text-weight-medium">{{title}} </span>
    </q-item-label>
    </q-item-section>

    <q-item-section top side>
    <div class="text-grey-8 q-gutter-xs">
      <q-btn class="gt-xs" size="12px" flat dense round icon="delete" @click="emitDeleteButton" />
      <q-btn size="12px" flat dense round icon="more_vert" @click="emitDetailButton" />
    </div>
    </q-item-section>
  </q-item>
</template>

<script>

export default {
  name: 'TaskItem',
  props: {
    title: {
      type: String,
      required: true
    }
  },
  data () {
    return {
      text: ''
    }
  },
  methods: {
    emitDeleteButton () {
      this.$emit('delete-emit', this.title)
    },
    emitDetailButton () {
      this.$emit('detail-emit', this.title)
    }
  }
}
</script>
