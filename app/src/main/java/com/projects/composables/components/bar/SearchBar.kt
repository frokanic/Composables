package com.projects.composables.components.bar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MySearchBar() {

    SearchBar(
        query = "",
        onQueryChange = {},
        onSearch = {},
        active = true,
        onActiveChange = {},
        placeholder = { Text(text = "Search...") },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search Icon"
            )
        },
        trailingIcon = {

        }
    ) {

    }
//    TextField(
//        value = "",
//        onValueChange = {},
//        modifier = Modifier.fillMaxWidth(),
//        placeholder = { Text(text = "Search...") }
//    )
}

@Preview(showBackground = true)
@Composable
fun MySearchBarPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        MySearchBar()
    }

}