<script>
    import Box from "../common/glassBox.svelte";
    import { Link } from "svelte-navigator";
</script>

<div class="cont">
    <Box>
        <div>
            <h2 class="mb-3">Materials Here</h2>
            <p style="color:brown;">Site under construction.</p>
            <Link to="/sem1">
                Sem 1
            </Link>
        </div>
    </Box>
</div>

<style>
    div.cont {
        min-width: 50%;
        max-width: clamp(200px, 900px, 100vw);
        margin: 0 auto;
        padding: 15px;
    }
</style>
