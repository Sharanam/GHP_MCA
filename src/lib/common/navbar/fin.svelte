<script>
    import Logo from "../../../assets/logo/Logo Dark.svg";
    import KeyRoutes from "./key-routes.svelte";
    import { Link } from "svelte-navigator";
</script>

<header>
    <section class="header">
        <div class="logo">
            <Link to="/">
                <img src={Logo} alt="Sharanam's Logo" class="logo" />
            </Link>
        </div>
        <KeyRoutes />
        <Link to="/search" class="btn" style="text-decoration: none;">
            <h3>Search</h3>
        </Link>
    </section>
</header>

<style>
    header {
        width: 100%;
        background: rgb(238, 174, 202);
        background: linear-gradient(
            0deg,
            rgba(238, 174, 202, 0.31) 0%,
            rgba(148, 187, 233, 0.01) 100%
        );
    }
    section.header {
        display: flex;
        flex-direction: row;
        align-items: center;
        padding: clamp(3px, 5px, 10px);
    }
    div.logo {
        flex-grow: 1;
    }
    div.logo > * {
        outline: none;
        border: 0;
    }
    img.logo {
        height: 70px;
        width: 195px;
    }
</style>
