package fragments

import fragments.introduction.Chapter1Notes
import fragments.introduction.Chapter2Notes
import fragments.introduction.Chapter3Notes
import fragments.introduction.Chapter4Notes
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.josh.ui_try5.Adapter.ViewPagerAdapterAll
import com.josh.ui_try5.databinding.FragmentNotesBinding

class NotesFragment : Fragment() {

    private var _binding: FragmentNotesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment

        _binding = FragmentNotesBinding.inflate(inflater, container, false)
        // val view = inflater.inflate(R.layout.fragment_notes, container, false)
        val fragmentList = arrayListOf<Fragment>(
            Chapter1Notes(),
            Chapter2Notes(),
            Chapter3Notes(),
            Chapter4Notes()
        )

        val adapter = ViewPagerAdapterAll(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewpagerNotes.adapter = adapter

        return binding.root

    }
}