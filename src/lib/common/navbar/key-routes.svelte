<script>
    import { useNavigate } from "svelte-navigator";
    const navigate = useNavigate();
</script>
<div style="display: none;">
    <button
        title="Go back"
        id="back_button"
        on:click={() => navigate(-1)}
    >
        &lt;-
    </button>
    <button
        title="Go forward"
        id="forward_button"
        on:click={() => navigate(1)}
    >
        -&gt;
    </button>
    <button
        title="sem_1"
        id="sem_1"
        on:click={() => navigate('/sem1')}
    >
        Sem_1
    </button>
</div>