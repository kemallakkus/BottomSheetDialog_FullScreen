package com.kemalakkus.kemalakkus

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.Dialog
import android.content.res.Resources
import android.graphics.PorterDuff
import android.os.Bundle
import android.util.TypedValue
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.kemalakkus.kemalakkus.databinding.FragmentBottomSheetBinding


class BottomSheetFragment(val list: ArrayList<Choices>) : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentBottomSheetBinding
    private lateinit var bottomAdapter: BottomAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val dialog=BottomSheetDialog(requireContext())
        binding=FragmentBottomSheetBinding.inflate(layoutInflater,container,false)
        dialog.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        binding.nested.layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT

        return binding.root
    }
    @SuppressLint("ResourceAsColor")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.submitButton.setOnClickListener {
            val builder = AlertDialog.Builder(requireContext())
            builder.setTitle("Thanks")
            builder.setMessage("Thanks for your feedback!")
            builder.show()
        }

        val behavior = BottomSheetBehavior.from(view.parent as View)
        view.post {
            behavior.peekHeight =  binding.view.measuredHeight +binding.cons2.measuredHeight +binding.lin1.measuredHeight
        }

        bottomAdapter= BottomAdapter(list)
        binding.bottomRv.apply {
            adapter=bottomAdapter
        }

        bottomAdapter.onClickItem={
            if (it == true){
                binding.edit.visibility = View.VISIBLE
                binding.bottomText.visibility = View.VISIBLE
            }
            else{
                binding.edit.visibility = View.GONE
                binding.bottomText.visibility = View.GONE
            }
        }

        binding.angry.setOnClickListener {

            binding.angry.setColorFilter(ContextCompat.getColor(requireContext(), R.color.second_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.sad.setColorFilter(ContextCompat.getColor(requireContext(), R.color.first_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.neutral.setColorFilter(ContextCompat.getColor(requireContext(), R.color.first_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.happy.setColorFilter(ContextCompat.getColor(requireContext(), R.color.first_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.veryHappy.setColorFilter(ContextCompat.getColor(requireContext(), R.color.first_emoji_color), PorterDuff.Mode.SRC_IN)

            binding.what.text = "We're sorry to hear that. For us to improve, please say what went wrong:"

        }

        binding.sad.setOnClickListener {

            binding.sad.setColorFilter(ContextCompat.getColor(requireContext(), R.color.second_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.angry.setColorFilter(ContextCompat.getColor(requireContext(), R.color.first_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.neutral.setColorFilter(ContextCompat.getColor(requireContext(), R.color.first_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.happy.setColorFilter(ContextCompat.getColor(requireContext(), R.color.first_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.veryHappy.setColorFilter(ContextCompat.getColor(requireContext(), R.color.first_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.what.text = "What makes you feel way?"

        }

        binding.neutral.setOnClickListener {

            binding.neutral.setColorFilter(ContextCompat.getColor(requireContext(), R.color.second_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.angry.setColorFilter(ContextCompat.getColor(requireContext(), R.color.first_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.sad.setColorFilter(ContextCompat.getColor(requireContext(), R.color.first_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.happy.setColorFilter(ContextCompat.getColor(requireContext(), R.color.first_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.veryHappy.setColorFilter(ContextCompat.getColor(requireContext(), R.color.first_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.what.text = "What makes you feel way?"

        }

        binding.happy.setOnClickListener {

            binding.happy.setColorFilter(ContextCompat.getColor(requireContext(), R.color.second_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.angry.setColorFilter(ContextCompat.getColor(requireContext(), R.color.first_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.sad.setColorFilter(ContextCompat.getColor(requireContext(), R.color.first_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.neutral.setColorFilter(ContextCompat.getColor(requireContext(), R.color.first_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.veryHappy.setColorFilter(ContextCompat.getColor(requireContext(), R.color.first_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.what.text = "What makes you feel way?"

        }

        binding.veryHappy.setOnClickListener {

            binding.veryHappy.setColorFilter(ContextCompat.getColor(requireContext(), R.color.second_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.angry.setColorFilter(ContextCompat.getColor(requireContext(), R.color.first_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.sad.setColorFilter(ContextCompat.getColor(requireContext(), R.color.first_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.neutral.setColorFilter(ContextCompat.getColor(requireContext(), R.color.first_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.happy.setColorFilter(ContextCompat.getColor(requireContext(), R.color.first_emoji_color), PorterDuff.Mode.SRC_IN)
            binding.what.text = "What makes you feel way?"

        }

    }

}





