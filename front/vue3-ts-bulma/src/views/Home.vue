<template>
  <div>
    <TheHeader />
    <section class="section">
      <div class="container">
        <div class="columns">
          <div class="column is-3">
            <TheSideMenu></TheSideMenu>
          </div>
          <div class="column is-9">
            <TaskContents></TaskContents>
          </div>
        </div>
      </div>
    </section>
    <TheFooter />
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue'
import TheHeader from '@/components/TheHeader.vue'
import TheFooter from '@/components/TheFooter.vue'
import TheSideMenu from '@/components/TheSideMenu.vue'
import TaskContents from '@/components/TaskContents.vue'

export default defineComponent({
  name: 'Home',
  components: {
    TheHeader,
    TheFooter,
    TheSideMenu,
    TaskContents
  },
  setup () {
    return {}
  }
})
</script>
