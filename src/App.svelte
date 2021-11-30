<script>
  import { Router, Route } from "svelte-navigator";
  import Navbar from "./lib/common/navbar.svelte";
  import Footer from "./lib/common/footer.svelte";
  import Home from "./lib/home/fin.svelte";
  import NotFound from "./lib/404/notFound.svelte";

  let routes = [
    { path: "/", component: Home },
    { path: "/sem1", component: Home },
  ];
</script>

<Router primary={false}>
  <div class="container">
    <Navbar />
    <main>
      {#each routes as route}
        <Route path={route.path} component={route.component} />
      {/each}
      <Route component={NotFound} />
    </main>
    <Footer />
  </div>
</Router>

<style>
  main {
    min-height: 90vh;
  }
</style>
