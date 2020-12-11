function myFunction() {
    let summary = document.querySelectorAll("div.form-section--column li");

    let street = document.querySelector("div.form-group.form-group--inline input[name='street']");
    let city = document.querySelector("div.form-group.form-group--inline input[name='city']");
    let zipCode = document.querySelector("div.form-group.form-group--inline input[name='zipCode']");
    let pickUpDate = document.querySelector("div.form-group.form-group--inline input[name='pickUpDate']");
    let pickUpTime = document.querySelector("div.form-group.form-group--inline input[name='pickUpTime']");
    let pickUpComment = document.querySelector("div.form-group.form-group--inline textarea[name='pickUpComment']");

    summary[0].innerText = street.value;
    summary[1].innerText = city.value;
    summary[2].innerText = zipCode.value;
    summary[3].innerText = pickUpDate.value;
    summary[4].innerText = pickUpTime.value;
    summary[5].innerText = pickUpComment.value;
}

