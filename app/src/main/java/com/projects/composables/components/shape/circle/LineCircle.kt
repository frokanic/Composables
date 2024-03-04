package com.projects.composables.components.shape.circle

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun LineCircle(
    radius: Dp
) {
    Canvas(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize()
    ) {

    }
}

@Preview
@Composable
fun LineCirclePreview() {
    LineCircle(100.dp)
}