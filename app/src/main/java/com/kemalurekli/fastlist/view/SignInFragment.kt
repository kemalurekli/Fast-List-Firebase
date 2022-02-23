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
import com.kemalurekli.fastlist.databinding.FragmentHomeBinding
import com.kemalurekli.fastlist.databinding.FragmentSignInBinding
import com.kemalurekli.fastlist.viewmodel.SignInFragmentViewModel

class SignInFragment : Fragment() {

    private var _binding: FragmentSignInBinding? = null
    private val binding get() = _binding!!
    private lateinit var auth: FirebaseAuth
    private lateinit var viewModel : SignInFragmentViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = Firebase.auth
        viewModel = ViewModelProvider(this)[SignInFragmentViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSignInBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.signInButton.setOnClickListener {
            val email = binding.tvSignInUserEmail.text.toString()
            val password = binding.tvSignInUserPassword.text.toString()

            if (email.equals("")  || password.equals("")) {
                Toast.makeText(requireContext(), "Please Enter your E-mail and Password", Toast.LENGTH_LONG).show()
            }else{
                auth.signInWithEmailAndPassword(email,password).addOnSuccessListener {
                    Navigation.findNavController(requireView()).navigate(SignInFragmentDirections.actionSignInFragmentToHomeFragment())
                }.addOnFailureListener {
                    Toast.makeText(requireContext(), it.localizedMessage, Toast.LENGTH_SHORT).show()
                }
            }
        }
        binding.tvSignUpLink.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(SignInFragmentDirections.actionSignInFragmentToSignUpFragment())
        }
        binding.tvForgotPasswordLink.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(SignInFragmentDirections.actionSignInFragmentToForgotPasswordFragment())
        }
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}