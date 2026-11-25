
const Profile = {
    firstname: "Krishand",
    lastname: "Muthukumar",
    emailid: "krishandMuthukumar.info@gmail.com"
};


let fullName = (Profile.firstname + " " + Profile.lastname).toUpperCase();

let domain = Profile.emailid.split("@")[1];

let Details = `
USER PROFILE
Full Name: ${fullName}
Email: ${Profile.emailid}
Domain: ${domain}
`;

console.log(Details);
