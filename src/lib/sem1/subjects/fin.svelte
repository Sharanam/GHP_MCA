<script>
    import { Link } from "svelte-navigator";
    import Box from "../../common/glassBox.svelte";

    let subjects = [
        ["CN","Computer Networks"],
        ["DBMS","DBMS"],
        ["CF-DBC","Computer Fundamentals (DBC)"],
        ["CF-PSS","Computer Fundamentals (PSS)"],
        ["OS-DBC","Operating System (DBC)"],
        ["OS-JVS","Operating System (JVS)"],
        ["Python","Python"],
    ];
</script>
<Box>
    <div class="subjects">
        {#each subjects as subject}
            <div>
                <Link to={subject[0]} style="text-decoration:none;">
                    <span class="button-text">{subject[1]}</span>
                </Link>
            </div>
        {/each}
    </div>
</Box>

<style>
    div.subjects {
        display: flex;
        justify-content: center;
        flex-direction: row wrap;
        flex-wrap: wrap;
        align-items: center;
        margin: 10px;
    }
    div.subjects div {
        margin: 10px;
        padding: 7px;
        border: 1px solid #ccc;
        border-radius: 5px;
        width: fit-content;
        padding: 5px;
    }
    span.button-text {
        font-size: 1.2em;
    }
</style>