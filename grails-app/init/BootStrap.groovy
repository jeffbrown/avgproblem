import demo.Widget

class BootStrap {

    def init = { servletContext ->
        def results = Widget.where {
            width > avg(width)
        }.list()
    }
    def destroy = {
    }
}
