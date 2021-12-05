<script>
    import { Router, Route, Link } from "svelte-navigator";
    import Subjects from "./subjects/fin.svelte";
    import Syllabus from "./Syllabus.svelte";
    import CN from "./subjects/cn/fin.svelte";
    import CFDBC from "./subjects/Fundamentals_DBC/fin.svelte";
    import CFPSS from "./subjects/Fundamentals_PSS/fin.svelte";
    import DBMS from "./subjects/dbms/fin.svelte";
    import OSDBC from "./subjects/os_DBC/fin.svelte";
    import OSJVS from "./subjects/os_JVS/fin.svelte";
    import Python from "./subjects/python/fin.svelte";
</script>

<Link to="/sem1">
    <h1>Semester 1</h1>
</Link>
<div class="container">
    <Router>
        <Route path="/">
            <Subjects />
            <Syllabus />
        </Route>
        <Route path="/CN">
            <CN />
        </Route>
        <Route path="/DBMS">
            <DBMS />
        </Route>
        <Route path="/CF-DBC">
            <CFDBC />
        </Route>
        <Route path="/CF-PSS">
            <CFPSS />
        </Route>
        <Route path="/OS-DBC">
            <OSDBC />
        </Route>
        <Route path="/OS-JVS">
            <OSJVS />
        </Route>
        <Route path="/Python">
            <Python />
        </Route>
    </Router>
</div>

<style>
    h1 {
        text-align: center;
        margin: 15px;
    }
    .container {
        width: 98%;
        margin: 0 auto;
        gap: 1em;
        display: grid;
        grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
        justify-content: center;
        align-items: center;
    }
</style>
