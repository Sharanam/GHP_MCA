<script>
    import Box from "../../common/glassBox.svelte";
    import { Link } from "svelte-navigator";
    import DBMS from "./subjects/dbms.svelte";
    import Fundamentals_DBC from "./subjects/Fundamentals_DBC.svelte";
    import Fundamentals_PSS from "./subjects/Fundamentals_PSS.svelte";
    import CN from "./subjects/cn.svelte";
    import OS_DBC from "./subjects/os_DBC.svelte";
    import OS_JVS from "./subjects/os_JVS.svelte";
    import Python from "./subjects/python.svelte";
</script>

<div class="cont">
    <Box>
        <div class="overflow">
        <div>
            <Link to="/sem1">
                <h2 class="mb">Semester 1</h2>
            </Link>
                <table>
                    <thead>
                        <tr>
                            <td>Time</td>
                            <td>Monday</td>
                            <td>Tuesday</td>
                            <td>Wednesday</td>
                            <td>Thursday</td>
                            <td>Friday</td>
                            <td>Saturday</td>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td> 10-12 AM </td>
                            <td colspan="6">Lab</td>
                        </tr>
                        <tr>
                            <td> 12-1 PM </td>
                            <td>
                                <DBMS />
                            </td>
                            <td>
                                <DBMS />
                            </td>
                            <td>
                                <OS_JVS />
                            </td>
                            <td>
                                <OS_JVS />
                            </td>
                            <td>
                                <CN />
                            </td>
                            <td>
                                <CN />
                            </td>
                        </tr>
                        <tr>
                            <td> 1-2 PM </td>
                            <td colspan="6"> Break </td>
                        </tr>
                        <tr>
                            <td> 2-3 PM </td>
                            <td>
                                <Fundamentals_PSS />
                            </td>
                            <td>
                                <Fundamentals_PSS />
                            </td>
                            <td><Fundamentals_DBC /></td>
                            <td><Fundamentals_DBC /></td>
                            <td><DBMS /> </td>
                            <td><DBMS /> </td>
                        </tr>
                        <tr>
                            <td>3-4 PM</td>
                            <td><Python /></td>
                            <td><Python /></td>
                            <td><Python /></td>
                            <td><Python /></td>
                            <td><OS_DBC /></td>
                            <td><OS_DBC /></td>
                        </tr>
                        <tr>
                            <td>4-5 PM</td>
                            <td />
                            <td />
                            <td><CN /></td>
                            <td><CN /></td>
                            <td />
                            <td />
                        </tr>
                    </tbody>
                </table>
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
    table,
    tr,
    td {
        border: 1px solid white;
        border-collapse: collapse;
        padding: 5px;
        border-radius: 15px;
        text-align: center;
        width: max-content;
    }
    table {
        border: 1px solid wheat;
    }
</style>
