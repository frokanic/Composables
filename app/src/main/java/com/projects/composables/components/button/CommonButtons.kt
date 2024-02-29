package com.projects.composables.components.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * https://m3.material.io/components/buttons/overview
 * https://developer.android.com/jetpack/compose/components/button
 */
@Composable
fun CommonButtons() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {}
            /**
             * Although parameters can be further modified, by leaving them as is, you
             * can be sure m3 guidelines are being followed. So, change with caution!
             */
        ) {
            Text(text = "Confirm")
        }

        Spacer(modifier = Modifier.height(8.dp))

        ElevatedButton(
            onClick = {}
        ) {
            Icon(
                imageVector = Icons.Outlined.Add,
                contentDescription = "Add to cart",
                /**
                 * From the material 3 website: "Icons: Standard size for leading and
                 * trailing icons is now 18dp". So, since the default size of Icon is
                 * not 18 dp, it appears it should be given programmatically, if I
                 * choose to add an icon to my button.
                 */
                modifier = Modifier.size(18.dp)
            )
            Text(text = "Add to cart")
        }

        Spacer(modifier = Modifier.height(8.dp))

        FilledTonalButton(
            onClick = {}
        ) {
            Text(text = "Open in browser")
        }

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedButton(
            onClick = {}
        ) {
            Text(text = "Back")
        }

        Spacer(modifier = Modifier.height(8.dp))

        TextButton(
            onClick = {}
        ) {
            Text(text = "Learn more")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CommonButtonsPreview() {
    CommonButtons()
}