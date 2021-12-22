<script>
    const data = [
        ["Introduction (Combined Lecture (Offline))"],
        [
            "Introduction to Data, big data, modern data use scenario (Combined Lecture (Offline))",
        ],
        [
            "Online class and offline Class - orientation (Combined Lecture (Offline))",
        ],
        [
            "Introduction to data structure",
            "https://drive.google.com/file/d/1bXOShnwDAtcvSB7rqHjkDLAcDSImXFQ4/view?usp=sharing",
        ],
        [
            "Data structure need, characteristics and types",
            "https://drive.google.com/file/d/1UrzwjPs46Tz4zyHOJ4VNroTo5lTFulL8/view?usp=sharing",
        ],
        [
            "Need, Characteristics, and Operations on data structures",
            "https://drive.google.com/file/d/1vAVCe-Xtt5kZ26lqXfH4-qtuKQp-cYFU/view?usp=sharing",
        ],
        [
            "Introduction to array, operations, examples, introduction to stack",
            "https://drive.google.com/file/d/1w77OQBl1VOgrbMdpPb2n0CDf10OOXN9V/view?usp=sharing",
        ],
        [
            "Stack, stack examples, operations, push, pop, and peep. Applications of stack",
            "https://drive.google.com/file/d/1gw65vCKWB0Owv7pKQwd-QJxRcAmmn8eP/view?usp=sharing",
        ],
        [
            "Queue, operations, examples, applications, and variations",
            "https://drive.google.com/file/d/1cd3Mi3SNKb-cdxJl0Nj59MmcrD6HvLIc/view?usp=sharing",
        ],
        [
            "Queue, operations, examples, applications, and variations",
            "https://drive.google.com/file/d/1j5AP2Cilof4nVvVkKsg2HGsnC_VQBPE_/view?usp=sharing",
        ],
        [
            "Linked List Single and double",
            "https://drive.google.com/file/d/1ZJxxeSxn8XelGBIHMpHcAtQl7psn1r6B/view?usp=sharing",
        ],
        [
            "Linked List Single and double",
            "https://drive.google.com/file/d/1scNXulzW3LHngGinJE9Aso52ShyoVolZ/view?usp=sharing",
        ],
        [
            "Tree and graph",
            "https://drive.google.com/file/d/1aUvvER4YtiobcRXn9oqXNgENy7XNMC8W/view?usp=sharing",
        ],
        [
            "Hashing, Searching and Sorting,",
            "https://drive.google.com/file/d/1Wq7VH24zboUryW0y6ZyEPYNOe8ag7qFv/view?usp=sharing",
        ],
        [
            "Tutorial 1 and Revision",
            "https://drive.google.com/file/d/12UkEL_qXQYXdT2p7HT60K99adNPS_zpP/view?usp=sharing",
        ],
        [
            "Logic Gates, And, Or, and Not Gates with Block or Transfer a Word",
            "https://drive.google.com/file/d/1Hfq7hiu1db5MG2L1mxMCM7cCRuy0MtoO/view?usp=sharing",
        ],
    ];
</script>

<div class="innerSection" title="Students can find these links in email sent by Prof. P. S. Sajja">
    <h2 class="mb">Lectures' Links:</h2>
    <ol>
        {#each data as [lecture, link]}
            <li>
                {#if link}
                    <a href={link} target="_blank">{lecture}</a>
                {:else}
                    {lecture}
                {/if}
            </li>
        {/each}
    </ol>
    <blockquote class="my">
        <q>Links are not mentioned for the lectures taken offline due to technical
        or other problems.</q>
        - Prof. (Dr.) Priti Srinivas Sajja (<a href="https://pritisajja.info" target="_blank">pritisajja.info</a>)
    </blockquote>
</div>