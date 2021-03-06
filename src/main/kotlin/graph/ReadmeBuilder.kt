package graph

fun main() {
    val lineNumber = 8
    val title = "1192. Critical Connections in a Network"
    val titleLink = "https://leetcode.com/problems/critical-connections-in-a-network/"
    val javaClassName = "CriticalConnectionsinaNetwork1192"
    val kotlinClassName = "-"

    val youtubeId = "eoHEQvicvKU"
    val bilibiliId = "BV1H84y1F7uS"
    val ixiguaId = "6954662732184420877"

    val youtube = "https://www.youtube.com/watch?v=$youtubeId"
    val bilibili = "https://www.bilibili.com/video/$bilibiliId/"
    val ixigua = "https://www.ixigua.com/i$ixiguaId/"

    val javaLink =
            "https://github.com/MagicienDeCode/LeetCode_Solution/blob/master/src/main/java/graph/$javaClassName.java"
    val kotlinLink =
            "https://github.com/MagicienDeCode/LeetCode_Solution/blob/master/src/main/kotlin/graph/$kotlinClassName.kt"

    val kotlinFinal = if (kotlinClassName == "-") "-" else "[Kotlin]($kotlinLink)"

    val result = """
            |$lineNumber|[$title]($titleLink)
            |[Java]($javaLink)
            |$kotlinFinal
            |Medium
            |[Youtube]($youtube)
            |[bilibili]($bilibili)
            |[ixigua]($ixigua)
            |
        """.trimIndent()

    println(result.replace("\n", ""))
}

/*
|1|[704. Binary Search](https://leetcode.com/problems/binary-search/)
|[Java](https://github.com/MagicienDeCode/LeetCode_Solution/blob/master/src/main/java/binarysearch/BinarySearch704.java)
|[Kotlin](https://github.com/MagicienDeCode/LeetCode_Solution/blob/master/src/main/kotlin/binarysearch/BinarySearchKotlin704.kt)
|Easy
|[Youtube](https://www.youtube.com/watch?v=boLrycDV8jA)
|[bilibili](https://www.bilibili.com/video/av97758021/)
|[ixigua](https://www.ixigua.com/i6806012949392523783/)
|
 */