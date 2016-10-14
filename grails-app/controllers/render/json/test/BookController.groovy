package render.json.test

class BookController {

    // controller action
    def renderJson() {
        render(contentType:"application/json") {
            book = "Great"
        }
    }
}
