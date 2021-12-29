<script>
    import Link from "./Link.svelte";
    import Box from "../../../common/glassBox.svelte";
    import Recordings from "./Recordings.svelte";
    import Content from "./Content.svelte";
</script>

<Box>
    <div>
        <h1>Computer Fundamentals (PSS)</h1>
        <Link />
        <Recordings />
        <Content />
    </div>
</Box>

<style>
    div {
        display: flex;
        flex-direction: column;
        align-items: center;
        min-height: 90vh;
        width: 100%;
    }
    h1{
        margin:10px 5px;
    }
</style>
