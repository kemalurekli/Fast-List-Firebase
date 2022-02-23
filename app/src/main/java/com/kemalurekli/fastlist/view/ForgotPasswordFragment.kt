package com.kemalurekli.fastlist.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.kemalurekli.fastlist.R
import com.kemalurekli.fastlist.databinding.FragmentForgotPasswordBinding
import com.kemalurekli.fastlist.databinding.FragmentHomeBinding
import com.kemalurekli.fastlist.viewmodel.ForgotPasswordFragmentViewModel
import com.kemalurekli.fastlist.viewmodel.HomeFragmentViewModel


class ForgotPasswordFragment : Fragment() {
    private var _binding: FragmentForgotPasswordBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel : ForgotPasswordFragmentViewModel
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[ForgotPasswordFragmentViewModel::class.java]
        auth = Firebase.auth
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentForgotPasswordBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.resetPasswordButton.setOnClickListener {
           val email = binding.tvResetUserEmail.text.toString()
            if (email.isNotBlank()){
                auth.sendPasswordResetEmail(email)
                    .addOnSuccessListener {
                        Toast.makeText(requireContext(), "Check your Mail!", Toast.LENGTH_LONG).show()
                        Navigation.findNavController(requireView()).navigate(ForgotPasswordFragmentDirections.actionForgotPasswordFragmentToSignInFragment())
                    }.addOnFailureListener {
                        Toast.makeText(requireContext(), it.localizedMessage, Toast.LENGTH_LONG).show()
                    }
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}