<script>
    import Link from "./Link.svelte";
    import Box from "../../../common/glassBox.svelte";
    import Content from "./Content.svelte";
</script>

<Box>
    <div>
        <h1>Database Management System</h1>
        <Link />
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
