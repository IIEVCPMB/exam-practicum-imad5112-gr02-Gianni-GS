package com.example.campsitecommander

import android.os.Bundle
import android.text.Layout
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.campsitecommander.ui.theme.CampsiteCommanderTheme
import org.w3c.dom.Comment

class MainActivity : ComponentActivity() {
   private lateinit var splashLayout: LinearLayout

   private lateinit var mainLayout: ScrollView

   private lateinit var detailsLayout: ScrollView

   private lateinit var txtTotalItemPacked: TextView

   private lateinit var txtDetails: TextView

   private lateinit var editCategory: EditText

   private lateinit var editQuantity: EditText

   private lateinit var editComments: EditText

   private lateinit var spinnerItems: Spinner

   private val items = arrayOf(
       "Tent", "Marshmallows", "Flashlight"
   )

   private val category = IntArray(3 )

   private val quantity = IntArray(3 )



