package com.example.dhwallet.android.component

import androidx.compose.material.AlertDialog
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AlertDialogComponent(
    openDialog: Boolean,
    email: String,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier
) {
    if(openDialog) {
        AlertDialog(
            modifier = modifier,
            title = { },
            text = { Text(text = "$email", color = Color.White) },
            onDismissRequest = onDismissRequest,
            confirmButton = {
                TextButton(onClick = onDismissRequest) {
                    Text(text = "Ok", color = Color.White)
                }
            },
            backgroundColor = Color(0x1CFD3C72),
            contentColor = Color.White
        )
    }
}
@Preview
@Composable
fun AlertDialogComponent_Preview() {
    AlertDialogComponent(openDialog = true, email = "Teste", onDismissRequest = { /*TODO*/ })
}