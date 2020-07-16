package breadth_first_search

private val deltaX = intArrayOf(0, 0, -1, 1)
private val deltaY = intArrayOf(-1, 1, 0, 0)
private fun inBound(
    grid: Array<Array<*>>,
    x: Int,
    y: Int
) = x >= 0 && y >= 0 && x < grid.size && y < grid[0].size


/*

for (index in 0..3){
    val nextX = currentNode.x + deltaX[index]
    val nextY = currentNode.y + deltaY[index]
    if (inBound(heightMap,nextX,nextY)){

    }
}

 */
