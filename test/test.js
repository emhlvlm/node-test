const request = require("supertest");

describe("GET /", () => {
  it("respond with Hello Five!", (done) => {
    request("http://localhost:7000").get("/").expect("Hello Five!", done);
  })
});
