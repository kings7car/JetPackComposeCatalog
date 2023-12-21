@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.jetpackcomposecatalog

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposecatalog.ui.theme.CheckInfo
import com.example.jetpackcomposecatalog.ui.theme.JetPackComposeCatalogTheme
import com.example.jetpackcomposecatalog.ui.theme.ScaffoldExample
import com.example.jetpackcomposecatalog.ui.theme.SimpleRecyclerView
import com.example.jetpackcomposecatalog.ui.theme.SuperHeroGridView
import com.example.jetpackcomposecatalog.ui.theme.SuperHeroStickyView
import com.example.jetpackcomposecatalog.ui.theme.SuperHeroView
import com.example.jetpackcomposecatalog.ui.theme.SuperHeroWithSpecialControlView


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeCatalogTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {

                    ScaffoldExample()
                    //SuperHeroStickyView()
                    //SuperHeroWithSpecialControlView() video 69
                    //SuperHeroGridView() //video 68
                    //SuperHeroView() // video 66
                    //SimpleRecyclerView() video 65

                    /*//Codigo para los dialogs mostrar u ocultar
                    var show by remember {
                        mutableStateOf(false)
                    }
                    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Button(onClick = { show = true }) {
                            Text(text = "Mostrar dialogo")
                        }
                        MyConfirmationDialog(
                            show = show,
                            onDismiss = { show = false }
                        )
                        /*MyAlertDialog(
                            show = show,
                            onDismiss = { show = false },
                            onConfirm = { Log.i("car", "click") })*/
                    }


                    //MyRadioButton()

                    var selected by remember {
                        mutableStateOf("Car")
                    }


                    //MyTriStatusCheckbox()

                    /*var myText by remember {
                        mutableStateOf("Car")
                    }
                    MyTextField(myText) {myText = it}*/

                    val myOptions = getOptions(listOf("Car", "Luka", "Sam", "Galy", "Yola"))
                    Column {
                        //MyProgress()
                        //MyProgressAdvance()
                        //MyCheckBoxWithText()

                        /*myOptions.forEach {
                            MyCheckBoxWithTextCompleted(it)
                        }*/


                        // MyRadioButtonList(selected, {selected = it})

                        //MyCard()

                        //MyBadgeBox()
                        // MyDivider()

                        // MyDropDownMenu()

                        //BasicSlider()

                        //AdvanceSlider()

                        // MyRangeSlider()

                    }*/
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetPackComposeCatalogTheme {
        MyDropDownMenu()
    }
}

//Divider

@Composable
fun MyDivider() {
    Divider(
        Modifier
            .fillMaxWidth()
            .padding(top = 16.dp), color = Color.Red
    )
}

//SPINNERS
@Composable
fun MyDropDownMenu() {
    var selectedText by remember {
        mutableStateOf("")
    }
    var expanded1 by remember {
        mutableStateOf(false)
    }

    val desserts = listOf("Helado", "Chocolate", "Cafe", "Fruta", "Chilaquiles")
    Column(Modifier.padding(20.dp)) {
        OutlinedTextField(
            value = selectedText,
            onValueChange = { selectedText = it },
            enabled = false,
            readOnly = true,
            modifier = Modifier
                .clickable { expanded1 = true }
                .fillMaxWidth()
        )

        DropdownMenu(
            expanded = expanded1,
            onDismissRequest = { expanded1 = false },
            Modifier.fillMaxWidth()
        ) {
            desserts.forEach { dessert ->
                DropdownMenuItem(text = { Text(text = dessert) }, onClick = {
                    expanded1 = false
                    selectedText = dessert
                })
            }
        }
    }
}

//BadgeBox
@Composable
fun MyBadgeBox() {
    BadgedBox(badge = { Badge { Text("8") } }, Modifier.padding(15.dp)) {
        Icon(imageVector = Icons.Default.Star, contentDescription = "")
    }
}

//CARD
@Composable
fun MyCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 12.dp),
        shape = MaterialTheme.shapes.small,
        colors = CardDefaults.cardColors(Color.Red, Color.Green),
        border = BorderStroke(5.dp, Color.Green)


    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Ejemplo 1")
            Text(text = "Ejemplo 2")
            Text(text = "Ejemplo 3")
        }

    }
}


//RADIO BUTTON

@Composable
fun MyRadioButton() {
    Row(Modifier.fillMaxWidth()) {
        RadioButton(
            selected = true, onClick = { }, enabled = false, colors = RadioButtonDefaults.colors(
                selectedColor = Color.Red,
                unselectedColor = Color.Yellow,
                disabledSelectedColor = Color.Green
            )
        )

        Text(text = "Ejemplo 1")
    }
}

@Composable
fun MyRadioButtonList(name: String, onItemSelected: (String) -> Unit) {


    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.fillMaxWidth()) {
            RadioButton(
                selected = name == "Car", onClick = { onItemSelected("Car") })
            Text(text = "Car")
        }
        Row(Modifier.fillMaxWidth()) {
            RadioButton(
                selected = name == "Dariel", onClick = { onItemSelected("Dariel") })
            Text(text = "Dariel")
        }
        Row(Modifier.fillMaxWidth()) {
            RadioButton(
                selected = name == "Samantha", onClick = { onItemSelected("Samantha") })
            Text(text = "Samantha")
        }
        Row(Modifier.fillMaxWidth()) {
            RadioButton(
                selected = name == "Galy", onClick = { onItemSelected("Galy") })
            Text(text = "Galy")
        }
    }
}


@Composable
fun MyTriStatusCheckbox() {
    var status by rememberSaveable {
        mutableStateOf(ToggleableState.Off)
    }
    TriStateCheckbox(state = status, onClick = {
        status = when (status) {
            ToggleableState.On -> ToggleableState.Off
            ToggleableState.Off -> ToggleableState.Indeterminate
            ToggleableState.Indeterminate -> ToggleableState.On
        }
    })
}

@Composable
fun getOptions(titles: List<String>): List<CheckInfo> {
    return titles.map {
        //necesitamos un estado para los check
        var status by rememberSaveable {
            mutableStateOf(false)
        }
        CheckInfo(
            title = it,
            selected = status,
            onCheckedChange = { status = it }
        )
    }
}


/*
STATEHOSTING ES UN PATRON PARA QUITAR LOS ESTADOS DE LOS COMPOSABLE
SACAMOS EL ESTADO A UN MIEMBRO SUPERIOR
 */


@Composable
fun MyTextFielOutlined() {
    var myText by remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        value = myText,
        onValueChange = { myText = it },
        modifier = Modifier.padding(24.dp),
        label = { Text(text = "Holaaa") },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Magenta,
            unfocusedBorderColor = Color.Red
        )

    )
}

@Composable
fun MyTextFieldAdvance() {
    var myText by remember {
        mutableStateOf("")
    }
    TextField(value = myText, onValueChange = {
        myText =
            if (it.contains("a")) {
                it.replace("a", "")
            } else {
                it
            }
    },
        label = { Text(text = "Introduce tu nombre") })
}


//text field
//cuando cambie de valor, en vez de hace logica, vamos a llamar a la funcion que le estamos pasando y sera el padre el que haga la logica
@Composable
fun MyTextField(name: String, onValueChanged: (String) -> Unit) {

    TextField(value = name, onValueChange = { onValueChanged(it) })
}

@Composable
fun MyText() {
    Column(Modifier.fillMaxSize()) {
        Text(text = "esto es un ejemplo")
        Text(text = "esto es un ejemplo", color = Color.Blue)
        Text(text = "esto es un ejemplo", fontWeight = FontWeight.ExtraBold)
        Text(text = "esto es un ejemplo", fontWeight = FontWeight.ExtraLight)
        Text(text = "esto es un ejemplo", style = TextStyle(fontFamily = FontFamily.Cursive))
        Text(
            text = "esto es un ejemplo",
            style = TextStyle(textDecoration = TextDecoration.LineThrough)
        )
        Text(
            text = "esto es un ejemplo",
            style = TextStyle(textDecoration = TextDecoration.Underline)
        )
        Text(
            text = "esto es un ejemplo5", style = TextStyle(
                textDecoration = TextDecoration.combine(
                    listOf(TextDecoration.Underline, TextDecoration.LineThrough)
                )
            )
        )

        Text(text = "esto es un ejemplo7", fontSize = 50.sp)
    }

}

//BOTONES

@Composable
fun MyButtonExample() {
    var enabled by rememberSaveable {
        mutableStateOf(true)
    }
    Column(
        Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Button(
            onClick = { enabled = false },
            enabled = enabled,
            colors = ButtonDefaults.buttonColors(
                Color.Magenta,
                contentColor = Color.Blue
            ),
            border = BorderStroke(5.dp, Color.Green)
        ) {
            Text(text = "Hola")
        }

        OutlinedButton(
            onClick = { enabled = false },
            enabled = enabled,
            modifier = Modifier.padding(top = 8.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Magenta,
                contentColor = Color.Blue,
                Color.Blue,
                disabledContentColor = Color.Red
            )
        ) {
            Text(text = "Hola")
        }
        TextButton(onClick = { }) {
            Text(text = "Hola2")
        }
    }
}


//IMAGENES
@Composable
fun MyImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "ejemplo",
        alpha = 0.5f
    )
}

@Composable
fun MyImageAdvance() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "ejemplo",
        //redondear bordes
        //modifier = Modifier.clip(RoundedCornerShape(25f))
        modifier = Modifier
            .clip(CircleShape)
            .border(5.dp, Color.Red, CircleShape)
    )
}

@Composable
fun MyIcon() {
    Icon(
        imageVector = Icons.Rounded.Star,
        contentDescription = "Icono",
        tint = Color.Red
    )
}

//PROGRESSBAR

@Composable
fun MyProgress() {

    var showLoading by rememberSaveable { mutableStateOf(false) }

    Column(
        Modifier
            .padding(24.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        if (showLoading) {
            //progressbar circular
            CircularProgressIndicator(color = Color.Red, strokeWidth = 5.dp)
            //progressbar horizontal
            LinearProgressIndicator(
                modifier = Modifier.padding(top = 32.dp),
                color = Color.Red,
                Color.Green
            )
        }
        Button(onClick = { showLoading = !showLoading }) {

        }
    }
}

@Composable
fun MyProgressAdvance() {

    var progressStatus by rememberSaveable {
        mutableStateOf(0f)
    }

    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(progress = progressStatus)

        Row(Modifier.fillMaxSize()) {
            Button(onClick = {
                progressStatus += 0.1f
            }) {
                Text(text = "Invrementar")
            }
            Button(onClick = {
                progressStatus -= 0.1f
            }) {
                Text(text = "Reducir")
            }
        }
    }
}

//Switch
@Composable
fun MySwitch() {
    var state by rememberSaveable {
        mutableStateOf(true)
    }

    Switch(
        checked = state,
        onCheckedChange = { state = !state },
        enabled = true,
        colors = SwitchDefaults.colors(
            uncheckedThumbColor = Color.Red,
            checkedThumbColor = Color.Green,
            uncheckedTrackColor = Color.Magenta,
            checkedTrackColor = Color.Cyan
        )
    )
}

//checkbox

@Composable
fun MyCheckBox() {
    var state by rememberSaveable {
        mutableStateOf(true)
    }

    Checkbox(
        checked = state,
        onCheckedChange = { state = !state },
        enabled = true,
        colors = CheckboxDefaults.colors(
            checkedColor = Color.Red,
            uncheckedColor = Color.Yellow,
            checkmarkColor = Color.Blue
        )
    )
}

@Composable
fun MyCheckBoxWithText() {
    var state by rememberSaveable {
        mutableStateOf(true)
    }
    Row(Modifier.padding(8.dp)) {
        Checkbox(checked = state, onCheckedChange = { state = !state })
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "Ejemplo 1")
    }
}


@Composable
fun MyCheckBoxWithTextCompleted(checkInfo: CheckInfo) {

    Row(Modifier.padding(8.dp)) {
        Checkbox(
            checked = checkInfo.selected,
            onCheckedChange = { checkInfo.onCheckedChange(!checkInfo.selected) })
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = checkInfo.title)
    }
}

