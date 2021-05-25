<template>
  <section class="hero is-primary">
    <div class="hero-body">
      <div class="columns">
        <div class="column is-12">
          <div class="container content">
            <h1 class="title">Todo App My Challenge</h1>
            <h3 class="subtitle">
              Vue3 + TS + Bulma sample
            </h3>
          </div>
        </div>
      </div>
    </div>
  </section>
</template>

<script lang="ts">
import { defineComponent } from 'vue'

export default defineComponent({
  name: 'TheHeader',
  setup () {
    return {}
  }
})
</script>
