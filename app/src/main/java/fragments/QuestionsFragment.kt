package fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.josh.ui_try5.Adapter.ViewPagerAdapterAll
import com.josh.ui_try5.databinding.FragmentQuestionsBinding
import fragments.questions.Section1Questions
import fragments.questions.Section2Questions

class QuestionsFragment : Fragment() {

    private var _binding: FragmentQuestionsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment

        _binding = FragmentQuestionsBinding.inflate(inflater, container, false)
        // val view = inflater.inflate(R.layout.fragment_notes, container, false)
        val fragmentList = arrayListOf<Fragment>(
            Section1Questions(),
            Section2Questions()
        )

        val adapter = ViewPagerAdapterAll(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewpagerQuestions.adapter = adapter

        return binding.root

    }
}