<template>
  <div>
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
    <section class="section">
      <div class="container">
        <div class="columns">
          <div class="column is-3">
            <aside class="is-medium menu">
              <p class="menu-label">ログインユーザ</p>
              <ul class="menu-list">
                <li class="is-right">
                  <a href="#const" class="is-active"
                    ><i class="fab fa-css3-alt"></i> CSS</a
                  >
                </li>
                <li>
                  <a href="#let" class="is-active"
                    ><i class="fab fa-js"></i> JS</a
                  >
                </li>
                <li>
                  <a href="#let" class="is-active"
                    ><i class="fab fa-html5"></i> HTML</a
                  >
                </li>
              </ul>
              <hr />
              <p class="menu-label">タスクグループ</p>
              <ul class="menu-list">
                <li><span class="tag is-white is-medium">Lorem</span></li>
                <li><span class="tag is-white is-medium">Ipsum</span></li>
                <li><span class="tag is-white is-medium">Dolor</span></li>
                <li><span class="tag is-white is-medium">Animi</span></li>
                <li><span class="tag is-white is-medium">Eximi</span></li>
                <li><span class="tag is-white is-medium">Nullius</span></li>
                <li><span class="tag is-white is-medium">Oxipi</span></li>
                <li><span class="tag is-white is-medium">Vultus</span></li>
                <li><span class="tag is-white is-medium">Voluptatis</span></li>
                <li><span class="tag is-white is-medium">Exomarphis</span></li>
                <li><span class="tag is-white is-medium">Finimi</span></li>
                <li><span class="tag is-white is-medium">Aenigma</span></li>
                <li><span class="tag is-white is-medium">Arkham</span></li>
                <li><span class="tag is-white is-medium">Blue</span></li>
                <li><span class="tag is-white is-medium">Medium</span></li>
              </ul>
            </aside>
          </div>
          <div class="column is-9">
            <div class="content is-medium">
              <h3 class="title is-3">TaskList ¯\_(ツ)_/¯</h3>
              <div class="box">
                <h4 id="const" class="title is-3">const</h4>
                <article class="message is-primary">
                  <span class="icon has-text-primary">
                    <i class="fab fa-js"></i>
                  </span>
                  <div class="message-body">
                    Block-scoped. Cannot be re-assigned. Not immutable.
                  </div>
                </article>
                <pre><code class="language-javascript">const test = 'test';</code></pre>
              </div>
              <div class="box">
                <h4 id="let" class="title is-3">let</h4>
                <article class="message is-primary">
                  <span class="icon has-text-primary">
                    <i class="fas fa-info-circle"></i>
                  </span>
                  <div class="message-body">
                    Block-scoped. Can be re-assigned.
                  </div>
                </article>
                <pre><code class="language-javascript">let i = 0;</code></pre>
              </div>
              <div class="box">
                <article class="message is-primary">
                  <span class="icon has-text-primary">
                    <i class="fas fa-info-circle"></i>
                  </span>
                  <div class="message-body">
                    Lorem ipsum dolor sit amet, mea ne viderer veritus menandri,
                    id scaevola gloriatur instructior sit.
                  </div>
                </article>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <footer class="footer">
      <div class="columns is-mobile is-centered">
        <div class="field is-grouped is-grouped-multiline">
          <div class="control">
            <span class="tag is-dark">footer</span>
          </div>
        </div>
      </div>
    </footer>
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue'
// import HelloWorld from '@/components/HelloWorld.vue' // @ is an alias to /src

export default defineComponent({
  name: 'Home',
  components: {
    // HelloWorld
  },
  setup () {
    return {}
  }
})
</script>
