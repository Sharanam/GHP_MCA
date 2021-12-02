<script>
  import { Router, Route } from "svelte-navigator";
  import Navbar from "./lib/common/navbar.svelte";
  import Footer from "./lib/common/footer.svelte";
  import Home from "./lib/home/fin.svelte";
  import Sem1 from "./lib/sem1/depth/fin.svelte";
  import NotFound from "./lib/404/notFound.svelte";

  let routes = [
    { path: "/", component: Home },
    { path: "/sem1", component: Sem1 },
  ];
</script>

<Router primary={false}>
  <Navbar />
  <main>
    {#each routes as route}
      <Route path={route.path} component={route.component} />
    {/each}
    <Route component={NotFound} />
  </main>
  <Footer />
</Router>

<style>
  main {
    min-height: 90vh;
  }
</style>
