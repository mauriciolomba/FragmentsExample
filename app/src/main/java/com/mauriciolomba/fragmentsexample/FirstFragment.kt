package com.mauriciolomba.fragmentsexample

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment


class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.button_next)
        button.setOnClickListener{
            val textInfo = view.findViewById<EditText>(R.id.editext_info).text.toString()

            parentFragmentManager.beginTransaction()
                .add(R.id.fragmentContainerView, SecondFragment.newInstance(textInfo))
                .addToBackStack(null)
                .commit()
        }

    }

}