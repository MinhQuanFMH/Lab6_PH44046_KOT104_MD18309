package com.example.lab6kot_ph44046.model

class MovieModel (
    val title: String,
    val year: String,
    val posterUrl: String,
    val duration: String,
    val releaseDate:String,
    val genre: String,
    val shotDescription: String
) {
    companion object {
        fun getSampleMovies() = listOf(

            MovieModel("Trạng Quỳnh", "2023", "https://th.bing.com/th/id/OIP.Gx-zcrqyJsQYrr1g14qCEAHaK9?w=186&h=276&c=7&r=0&o=5&dpr=1.3&pid=1.7", "1 giờ 30 phút", "03/05/2023", "Hài hước", "Phim hài cổ trang Việt Nam kể về cuộc đời nhân vật Trạng Quỳnh dí dỏm, thông minh.") ,
            MovieModel("Mắt Biếc", "2019", "https://th.bing.com/th?id=OIP.xB0X7J8rtnP2DdN58oI8ugHaKk&w=209&h=298&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2", "2 giờ 18 phút", "10/06/2019", "Tình cảm", "Chuyện tình buồn day dứt giữa Ngạn và Hà Lan kéo dài qua nhiều năm tháng.") ,
            MovieModel("Nhà Bà Nữ", "2021", "https://th.bing.com/th/id/OIP.IutaGYKcVRyoQmvuEZTjtAHaIy?w=202&h=240&c=7&r=0&o=5&dpr=1.3&pid=1.7", "1 giờ 48 phút", "13/08/2021", "Hài hước", "Phim hài xoay quanh cuộc sống của một gia đình ba thế hệ với những mâu thuẫn và tiếng cười nhẹ nhàng.") ,
            MovieModel("Bố Già", "2022", "https://th.bing.com/th/id/OIP.3ZAZ1PuFODQL_WCp3CTNLQHaK-?w=202&h=367&c=7&r=0&o=5&dpr=1.3&pid=1.7", "2 giờ 35 phút", "01/01/2022", "Hài hước, Gia đình", "Hành trình đầy cảm xúc của Ba Sang và những đứa con, mang đến tiếng cười và thông điệp ý nghĩa về tình cảm gia đình."),
            MovieModel("Trạng Quỳnh", "2023", "https://th.bing.com/th/id/OIP.Gx-zcrqyJsQYrr1g14qCEAHaK9?w=186&h=276&c=7&r=0&o=5&dpr=1.3&pid=1.7", "1 giờ 30 phút", "03/05/2023", "Hài hước", "Phim hài cổ trang Việt Nam kể về cuộc đời nhân vật Trạng Quỳnh dí dỏm, thông minh.") ,
            MovieModel("Mắt Biếc", "2019", "https://th.bing.com/th?id=OIP.xB0X7J8rtnP2DdN58oI8ugHaKk&w=209&h=298&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2", "2 giờ 18 phút", "10/06/2019", "Tình cảm", "Chuyện tình buồn day dứt giữa Ngạn và Hà Lan kéo dài qua nhiều năm tháng.") ,
            MovieModel("Nhà Bà Nữ", "2021", "https://th.bing.com/th/id/OIP.IutaGYKcVRyoQmvuEZTjtAHaIy?w=202&h=240&c=7&r=0&o=5&dpr=1.3&pid=1.7", "1 giờ 48 phút", "13/08/2021", "Hài hước", "Phim hài xoay quanh cuộc sống của một gia đình ba thế hệ với những mâu thuẫn và tiếng cười nhẹ nhàng.") ,
            MovieModel("Bố Già", "2022", "https://th.bing.com/th/id/OIP.3ZAZ1PuFODQL_WCp3CTNLQHaK-?w=202&h=367&c=7&r=0&o=5&dpr=1.3&pid=1.7", "2 giờ 35 phút", "01/01/2022", "Hài hước, Gia đình", "Hành trình đầy cảm xúc của Ba Sang và những đứa con, mang đến tiếng cười và thông điệp ý nghĩa về tình cảm gia đình.")
        )
    }
}
enum class ListType {
    ROW, COLUMN, GRID
}