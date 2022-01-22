<script>
    const files = [
        {
            name: "Unit - 1 & 2 (Partial Material)",
            url: "https://github.com/Sharanam/GHP_MCA/raw/master/public/Materials/Dr.%20Prashant%20P.%20Pittalia/DBMS/Unit%20-%201%20%26%202%20(Partial%20Material).pdf",
        },
        {
            name: "Unit – 2 SQL.pdf",
            url: "https://github.com/Sharanam/GHP_MCA/raw/master/public/Materials/Dr.%20Prashant%20P.%20Pittalia/DBMS/Unit%20%E2%80%93%202%20SQL.pdf",
        },
        {
            name: "Unit – 3 (SQL & PL-SQL).pdf",
            url: "https://github.com/Sharanam/GHP_MCA/raw/master/public/Materials/Dr.%20Prashant%20P.%20Pittalia/DBMS/Unit%20%E2%80%93%203%20(SQL%20%26%20PL-SQL).pdf",
        },
        {
            name: "Unit – 4 (Advanced PL-SQL).pdf",
            url: "https://github.com/Sharanam/GHP_MCA/raw/master/public/Materials/Dr.%20Prashant%20P.%20Pittalia/DBMS/Unit%20%E2%80%93%204%20(Advanced%20PL-SQL).pdf",
        },
    ];
</script>

<div class="innerSection">
    Syllabus for internal examination of PS01CMCA53 (Database Management System)
    is
    <ul>
        <li>Unit-1 (DBMS concepts, Relational database model)</li>
        <li>Unit-2</li>
        <li>Unit-3</li>
    </ul>
    <br />
    <h3>Files</h3>
    <ul>
        {#each files as file}
            <li>
                <a href={file.url} target="_blank">{file.name}</a>
            </li>
        {/each}
    </ul>
</div>
