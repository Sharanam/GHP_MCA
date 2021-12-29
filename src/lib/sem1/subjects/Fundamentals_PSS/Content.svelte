<script>
    const links = [
        {
            url: "http://pritisajja.info/MCA%20I%20Computer%20fundamental%20Syllabus.pdf",
            name: "Syllabus",
        },
        {
            url: "http://pritisajja.info/PS01CMCA35%20unit%203%20Digital%20electronics%2016%20%20feb%202021.pptx",
            name: "Unit 3",
        },
        {
            url: "http://pritisajja.info/Unit%204%20PS01CMCA%2035%20Data%20Structure%20Priti%20Sajja%20Part%201.pdf",
            name: "Unit 4 [Part 1]",
        },
        {
            url: "http://pritisajja.info/Unit%204%20PS01CMCA%2035%20Data%20Structure%20Priti%20Sajja%20Part%202.pdf",
            name: "Unit 4 [Part 2]",
        },
        {
            url: "http://pritisajja.info/Unit%204%20PS01CMCA%2035%20Data%20Structure%20Priti%20Sajja%20Part%203.pdf",
            name: "Unit 4 [Part 3]",
        },
        {
            url: "http://pritisajja.info/Tutorial%20Unit%203%20MCA%2035.pdf",
            name: "Tutorial Unit 3",
        },
        {
            url: "http://pritisajja.info/Tutorial%20Unit%204%20MCA%2035.pdf",
            name: "Tutorial Unit 4",
        },
    ];
</script>

<div class="innerSection">
    <p>
        All material can be found on Pritimam's webpage.
        <a
            href="http://pritisajja.info/teaching.html"
            title="pritisajja.info/teaching.html"
            target="_blank"
        >
            (http://pritisajja.info/teaching.html)
        </a>
    </p>
    <br />
    <p>Here are the direct links for ease:</p>
    <ul>
        {#each links as link}
            <li>
                <a href={link.url} target="_blank">{link.name}</a>
            </li>
        {/each}
    </ul>
</div>
