const filterButtons = document.querySelectorAll(".filter-btn");
const cards = document.querySelectorAll(".card");
const quoteForm = document.getElementById("quoteForm");
const formMessage = document.getElementById("formMessage");

filterButtons.forEach((button) => {
  button.addEventListener("click", () => {
    const filter = button.dataset.filter;

    filterButtons.forEach((btn) => btn.classList.remove("active"));
    button.classList.add("active");

    cards.forEach((card) => {
      const category = card.dataset.category;
      card.style.display = filter === "todas" || category === filter ? "block" : "none";
    });
  });
});

quoteForm.addEventListener("submit", (event) => {
  event.preventDefault();

  const data = new FormData(quoteForm);
  const name = data.get("name");
  const model = data.get("model");

  formMessage.textContent = `¡Gracias, ${name}! Recibimos tu solicitud para ${model}. Te contactaremos pronto.`;
  quoteForm.reset();
});
