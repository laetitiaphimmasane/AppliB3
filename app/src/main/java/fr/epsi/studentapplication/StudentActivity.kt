package fr.epsi.studentapplication

import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.json.JSONObject

class StudentActivity : BaseActivity() {

    val data="{\n" +
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
        showBack()
        val students = arrayListOf<Student>()
        val jsStudents = JSONObject(data)
        val jsArrayStudents= jsStudents.getJSONArray("items")
        for(i in 0 until jsArrayStudents.length()){
            val jsStudent = jsArrayStudents.getJSONObject(0)
            val student = Student(jsStudent.optString("name",""),
                jsStudent.optString("email",""),
                jsStudent.optString("picture_url",""),jsStudent.optString("groupe",""))
            students.add(student)
            Log.d("student",student.name)
        }


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewStudents)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val studentAdapter = StudentAdapter(students)
        recyclerView.adapter=studentAdapter
    }
}