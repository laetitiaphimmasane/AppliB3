package fr.epsi.studentapplication

import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.json.JSONObject

class StudentActivity : BaseActivity() {
    private val data="{\n" +
            "  \"items\": [\n" +
            "    {\n" +
            "      \"picture_url\": \"https://www.numerama.com/content/uploads/2019/05/trou-noir-espace-univers-astronomie.jpg\",\n" +
            "      \"name\": \"Rodica\",\n" +
            "      \"email\": \"rodica.adigbonon@epsi.fr\",\n" +
            "      \"groupe\": \"Groupe 1\",\n" +
            "    },\n" +
            "    {\n" +
            "      \"picture_url\": \"https://cdn.futura-sciences.com/buildsv6/images/largeoriginal/2/3/1/2310c9171a_50157784_pia23441.jpg\",\n" +
            "      \"name\": \"Laetitia\",\n" +
            "      \"email\": \"laetitia.phimmasane@epsi.fr\",\n" +
            "      \"city\": \"Groupe 1\",\n" +
            "    }\n" +
            "  ]\n" +
            "}"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)
        setHeaderTitle("Student Info")
        showBack()

    }
}