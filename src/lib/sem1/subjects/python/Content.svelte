<script>
    const links = [
        {
            head: "Internals Study Material (IMP)",
            links: [
                [
                    "https://github.com/Sharanam/GHP_MCA/raw/master/public/Materials/Bharatbhai%20Patel/Python/BBP_PS01CMCA51_Unit1_Internal.pdf",
                    "BBP_PS01CMCA51_Unit1_Internal.pdf",
                ],
                [
                    "https://github.com/Sharanam/GHP_MCA/raw/master/public/Materials/Bharatbhai%20Patel/Python/BBP_PS01CMCA51_Unit2_Internal.pdf",
                    "BBP_PS01CMCA51_Unit2_Internal.pdf",
                ],
                [
                    "https://github.com/Sharanam/GHP_MCA/raw/master/public/Materials/Bharatbhai%20Patel/Python/PS01CMCA51_Unit3%20(upto%20set)_Internal.pdf",
                    "PS01CMCA51_Unit3 (upto set)_Internal.pdf",
                ],
                [
                    "https://github.com/Sharanam/GHP_MCA/raw/master/public/Materials/Bharatbhai%20Patel/Python/BBP_PS01CMCA51_Python%20MCQs_Internal.pdf",
                    "BBP_PS01CMCA51_Python MCQs_Internal.pdf",
                ],
                [
                    "https://github.com/Sharanam/GHP_MCA/raw/master/public/Materials/Bharatbhai%20Patel/Python/BBP_PS01CMCA51_Short%20Questions_Internal.pdf",
                    "BBP_PS01CMCA51_Short Questions_Internal.pdf",
                ],
            ],
        },
        {
            head: "Reference Study Material (Advanced Stuff)",
            links: [
                [
                    "https://github.com/Sharanam/GHP_MCA/raw/master/public/Materials/Bharatbhai%20Patel/Python/Python%203%20MCQs.pdf",
                    "Python 3 MCQs.pdf",
                ],
                [
                    "https://github.com/Sharanam/GHP_MCA/raw/master/public/Materials/Bharatbhai%20Patel/Python/Introduction%20to%20Python%20Programming.pdf",
                    "Introduction to Python Programming.pdf",
                ],
                [
                    "https://github.com/Sharanam/GHP_MCA/raw/master/public/Materials/Bharatbhai%20Patel/Python/PS01CMCA51%20[Python%20Programming].pdf",
                    "PS01CMCA51 [Python Programming].pdf",
                ],
                [
                    "https://github.com/Sharanam/GHP_MCA/raw/master/public/Materials/Bharatbhai%20Patel/Python/Python%20library.pdf",
                    "Python library.pdf",
                ],
            ],
        },
        {
            head: "Assignment's Questions",
            links: [
                [
                    "https://github.com/Sharanam/GHP_MCA/raw/master/public/Materials/Bharatbhai%20Patel/Python/BBP_Python%20Assignment_2021.pdf",
                    "BBP_Python Assignment_2021.pdf",
                ],
            ],
        },
        {
            head: "Reference Study Material (for MS Windows only)",
            links: [
                [
                    "https://github.com/Sharanam/GHP_MCA/raw/master/public/Materials/Bharatbhai%20Patel/Python/python3100.chm",
                    "python3100.chm",
                ],
            ],
        },
    ];
</script>
<div class="innerSection">
    <h2 class="mb">Study Material</h2>
    {#each links as link_group}
        <h3>{link_group.head}</h3>
        {#each link_group.links as link}
            <ul>
                <li>
                    <a
                        href={link[0]}
                        target="_blank"

                    >
                        {link[1]}
                    </a>
                </li>
            </ul>
        {/each}
    {/each}
</div>
