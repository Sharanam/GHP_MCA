<script>
    import DBMS from "../subjects/dbms/name.svelte";
    import Fundamentals_DBC from "../subjects/Fundamentals_DBC/name.svelte";
    import Fundamentals_PSS from "../subjects/Fundamentals_PSS/name.svelte";
    import CN from "../subjects/cn/name.svelte";
    import OS_DBC from "../subjects/os_DBC/name.svelte";
    import OS_JVS from "../subjects/os_JVS/name.svelte";
    import Python from "../subjects/python/name.svelte";
</script>

<table>
    <thead>
        <tr>
            <th>Time</th>
            <th>Monday</th>
            <th>Tuesday</th>
            <th>Wednesday</th>
            <th>Thursday</th>
            <th>Friday</th>
            <th>Saturday</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td class="time">10-12 AM</td>
            <td colspan="6">Lab</td>
        </tr>
        <tr>
            <td class="time">12-1 PM</td>
            <td>
                <DBMS />
            </td>
            <td>
                <DBMS />
            </td>
            <td style="background-color:salmon">
                <OS_JVS />
            </td>
            <td style="background-color:salmon">
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
            <td class="time">1-2 PM</td>
            <td colspan="6"> Break</td>
        </tr>
        <tr>
            <td class="time">2-3 PM</td>
            <td>
                <Fundamentals_PSS />
            </td>
            <td>
                <Fundamentals_PSS />
            </td>
            <td><Fundamentals_DBC /></td>
            <td><Fundamentals_DBC /></td>
            <td><DBMS /></td>
            <td><DBMS /></td>
        </tr>
        <tr>
            <td class="time">3-4 PM</td>
            <td><Python /></td>
            <td><Python /></td>
            <td><Python /></td>
            <td><Python /></td>
            <td><OS_DBC /></td>
            <td><OS_DBC /></td>
        </tr>
        <tr>
            <td class="time">4-5 PM</td>
            <td style="background-color:salmon" title="This lecture is introduced as an emergency lectures since 22nd December, 2021."><OS_JVS /></td>
            <td style="background-color:salmon" title="This lecture is introduced as an emergency lectures since 22nd December, 2021."><OS_JVS /></td>
            <td><CN /></td>
            <td><CN /></td>
            <td />
            <td />
        </tr>
    </tbody>
</table>

<style>
    table,
    tr,
    td,
    th {
        border: 1px solid white;
        border-collapse: collapse;
        padding: 7px;
        text-align: center;
        width: max-content;
    }
    table {
        border: 1px solid wheat;
    }
</style>
