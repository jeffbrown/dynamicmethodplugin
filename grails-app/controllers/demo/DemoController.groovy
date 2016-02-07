package demo

class DemoController {

    def add(int x, int y) {
        def sum = addNumbers(x, y)

        render "$x plus $y is 11."
    }
}
