package com.projects.composables.components.shape.circle

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun LineCircle(
    radius: Dp
) {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .size(200.dp)
    ) {

        for (i in 0..179) {
            /**
             * radians = degrees * (PI / 180)
             */
            val angleInRad = i * 2f * (PI.toFloat() /  180f) + 270f
            val lineLength = if (i % 10 == 0) 6.dp.toPx() else 3.dp.toPx()
            val strokeWidth = if (i % 10 == 0) 1.5.dp.toPx() else 0.7.dp.toPx()

            val lineStart = Offset(
                x = (radius.toPx() + lineLength) * cos(angleInRad) + center.x,
                y = (radius.toPx() + lineLength) * sin(angleInRad) + center.y
            )
            val lineEnd = Offset(
                x = (radius.toPx() - lineLength) * cos(angleInRad) + center.x,
                y = (radius.toPx() - lineLength) * sin(angleInRad) + center.y
            )

            drawLine(
                color = Color.Black,
                start = lineStart,
                end = lineEnd,
                strokeWidth = strokeWidth
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LineCirclePreview() {
    LineCircle(100.dp)
}