<script>
    const schedule = [
        {
            date: "01/01/2022",
            subject: {
                code: "51",
                name: "Python Programming",
            },
        },
        {
            date: "03/01/2022",
            subject: {
                code: "52",
                name: "Computer Networks",
            },
        },
        {
            date: "04/01/2022",
            subject: {
                code: "53",
                name: "DBMS",
            },
        },
        {
            date: "05/01/2022",
            subject: {
                code: "54",
                name: "Operating Systems",
            },
        },
        {
            date: "06/01/2022",
            subject: {
                code: "55",
                name: "Computer Fundamentals",
            },
        },
        {
            date: "08/01/2022",
            subject: {
                code: "56",
                name: "DBMS & OS",
            },
        },
        {
            date: "10/01/2022",
            subject: {
                code: "57",
                name: "Python Programming",
            },
        },
    ];
</script>

<table>
    <thead>
        <tr>
            <th colspan="3">Internal Test Schedule</th>
        </tr>
        <tr>
            <th> Date </th>
            <th> Subject (Code & Name) </th>
        </tr>
    </thead>
    <tbody>
        {#each schedule as subject}
            <tr>
                <td>{subject.date}</td>
                <td>PS01CMCA{subject.subject.code} : {subject.subject.name}</td>
            </tr>
        {/each}
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
        margin: auto;
    }
    tr > td {
        text-align: left;
    }
    table {
        border: 1px solid wheat;
    }
</style>
