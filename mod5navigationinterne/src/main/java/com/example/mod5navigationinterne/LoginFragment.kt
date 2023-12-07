package com.example.mod5navigationinterne

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.mod5navigationinterne.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    //méthode appelée une fois que la vue ets créée !
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {

            val user = User(
                binding.etLogin.text.toString(),
                binding.etPassword.text.toString()
            )

            val direction = LoginFragmentDirections.loginFragmentToHomeFragment(user)
            Navigation.findNavController(view).navigate(direction)

            //on navigue vers l'id de la flèche
            //Navigation.findNavController(view).navigate(R.id.loginFragmentToHomeFragment)

        }

    }


}