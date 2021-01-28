package fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.josh.ui_try5.Adapter.ViewPagerAdapterAll
import com.josh.ui_try5.databinding.FragmentMtbBinding
import fragments.mtb.Chapter1Mtb
import fragments.mtb.Chapter2Mtb

class MtbFragment : Fragment() {

    private var _binding: FragmentMtbBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment

        _binding = FragmentMtbBinding.inflate(inflater, container, false)
        // val view = inflater.inflate(R.layout.fragment_notes, container, false)
        val fragmentList = arrayListOf<Fragment>(
            Chapter1Mtb(),
            Chapter2Mtb()
        )

        val adapter = ViewPagerAdapterAll(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewpagerMtb.adapter = adapter

        return binding.root

    }
}