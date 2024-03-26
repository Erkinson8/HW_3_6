import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_3_6.City
import com.example.hw_3_6.CityAdapter
import com.example.hw_3_6.R

class CitiesFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CityAdapter


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cities, container, false)

        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(activity)

        val cities = generateDummyCities()
        adapter = CityAdapter(cities)
        recyclerView.adapter = adapter

        return view
    }


    private fun generateDummyCities(): List<City> {
        val cities = ArrayList<City>()
        cities.add(City("Bishkek", "Kyrgyzstan" ))
        cities.add(City("London", "UK"  ))
        cities.add(City("Paris", "France" ))
        cities.add(City("New York","USA"))
        cities.add(City("Astana","Kazakhstan"))
        cities.add(City("Kiev","Ukraine"))
        cities.add(City("Bangkok","Thailand"))
        cities.add(City("Budapest","Hungry"))
        cities.add(City("Tokio","Japan"))
        cities.add(City("Kuala Lumpur","Malaysia"))
        cities.add(City("Warsaw","Poland"))
        cities.add(City("Amsterdam","Nederland"))
        cities.add(City("Prague","Czech Republic"))
        return cities
    }


}
