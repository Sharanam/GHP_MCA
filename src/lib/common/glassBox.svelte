<div class="container">
    <slot />
</div>

<style>
    div.container {
        padding: 15px;
        min-width: 6rem;
        min-height: 6rem;
        display: flex;
        align-items: center;
        justify-content: center;
        text-decoration: none;
        border: 1px solid rgba(255, 255, 255, 0.6);
        background-color: rgba(255, 255, 255, 0.1);
        backdrop-filter: blur(2px);
        border-radius: 0.5rem;
        box-shadow: 0px calc(6rem / 6) calc(6rem / 3) rgba(0, 0, 0, 0.1);
    }
</style>
