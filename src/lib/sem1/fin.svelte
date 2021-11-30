<script>
    import CN from "./ComputerNetworks.svelte";
    import CF from "./ComputerFundamentals.svelte";
import Box from "../common/glassBox.svelte";
</script>
<h1>Sem 1</h1>
<div class="container">
        <CN />
        <CF />
        <CF />
        <CN />
        <CF />
        <CN />
        <CN />
        <CN />
        <CF />
        <CF />
        <CF />
        <CF />
        <CF />
        <CN />
</div>
<style>
    h1{
        text-align: center;
        margin:15px;
    }
    .container {
        width: 98%;
        margin: 0 auto;
        gap:1em;
        display: grid;
        grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
        justify-content: center;
        align-items: center;
    }
</style>