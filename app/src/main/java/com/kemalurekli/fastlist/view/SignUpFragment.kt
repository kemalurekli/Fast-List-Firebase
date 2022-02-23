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
import com.kemalurekli.fastlist.databinding.FragmentSignUpBinding
import com.kemalurekli.fastlist.viewmodel.SignUpFragmentViewModel

class SignUpFragment : Fragment() {
    private var _binding: FragmentSignUpBinding? = null
    private val binding get() = _binding!!
    private lateinit var auth: FirebaseAuth
    private lateinit var viewModel : SignUpFragmentViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = Firebase.auth
        viewModel = ViewModelProvider(this)[SignUpFragmentViewModel::class.java]
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSignUpBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val currentUser = auth.currentUser
        if (currentUser != null){
            Navigation.findNavController(requireView()).navigate(SignUpFragmentDirections.actionSignUpFragmentToHomeFragment())
        }
        binding.tvSignInLink.setOnClickListener {
            Navigation.findNavController(it).navigate(SignUpFragmentDirections.actionSignUpFragmentToSignInFragment())
        }
        binding.signUpButton.setOnClickListener {
            val email = binding.tvUserEmail.text.toString()
            val password = binding.tvUserPassword.text.toString()
            if (binding.tvUserPassword.text.toString() == binding.tvUserPasswordAgain.text.toString()){
                if (email.equals("")  || password.equals("")) {
                    Toast.makeText(requireContext(), "Please Enter your E-mail and Password", Toast.LENGTH_LONG).show()
                }else{
                    println("giriş başarılı")
                    auth.createUserWithEmailAndPassword(email,password).addOnSuccessListener {
                        Toast.makeText(requireContext(), "Welcome!", Toast.LENGTH_LONG).show()
                        Navigation.findNavController(requireView()).navigate(SignUpFragmentDirections.actionSignUpFragmentToHomeFragment())
                    }.addOnFailureListener {
                        Toast.makeText(requireContext(), it.localizedMessage, Toast.LENGTH_LONG).show()
                    }
                }
            }else{
                Toast.makeText(requireContext(), "Different Password", Toast.LENGTH_LONG).show()
            }
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}