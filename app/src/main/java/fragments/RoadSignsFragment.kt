package fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.josh.ui_try5.Adapter.ViewPagerAdapterAll
import com.josh.ui_try5.databinding.FragmentRoadSignsBinding
import fragments.road_signs.Chapter1RoadSigns
import fragments.road_signs.Chapter2RoadSigns
import fragments.road_signs.Chapter3RoadSigns
import fragments.road_signs.Chapter4RoadSigns

class RoadSignsFragment : Fragment() {
    private var _binding: FragmentRoadSignsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment

        _binding = FragmentRoadSignsBinding.inflate(inflater, container, false)
        // val view = inflater.inflate(R.layout.fragment_notes, container, false)
        val fragmentList = arrayListOf<Fragment>(
            Chapter1RoadSigns(),
            Chapter2RoadSigns(),
            Chapter3RoadSigns(),
            Chapter4RoadSigns()
        )

        val adapter = ViewPagerAdapterAll(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewpagerRoadsigns.adapter = adapter

        return binding.root

    }
}

