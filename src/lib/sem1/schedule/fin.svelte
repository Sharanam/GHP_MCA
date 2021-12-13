<script>
    import Box from "../../common/glassBox.svelte";
    import { Link } from "svelte-navigator";
    import Lecture from "./lecture.svelte";
    import MidTerm from "./midterm.svelte";
</script>

<div class="cont">
    <Box>
        <div class="overflow">
            <div>
                <Link to="/sem1">
                    <h2 class="mb">Semester 1</h2>
                </Link>
                <Lecture />
                <br />
                <MidTerm />
            </div>
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
    h2 {
        text-align: center;
    }
</style>
