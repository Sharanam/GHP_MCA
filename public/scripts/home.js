document.addEventListener('keydown', keyAffair);
let keys = {
    Period() {
        (window.open("https://github.com/Sharanam/GHP_MCA", "_blank"))
    },
    Slash() {
        document.querySelector("#app > header > section > a ") && document.querySelector("#app > header > section > a ").click();
    },
    KeyH() {
        document.querySelector("#app > header > section > div > a ") && document.querySelector("#app > header > section > div > a ").click();
    },
    KeyB() {
        document.querySelector("#back_button") && document.querySelector("#back_button").click();
    },
    KeyF() {
        document.querySelector("#forward_button") && document.querySelector("#forward_button").click();
    },
}

function keyAffair(e) {
    if (!(e.altKey || e.ctrlKey || e.metaKey) && e.code in keys) keys[e.code]();
}