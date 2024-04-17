package mx.edu.itson.potros.practica10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import mx.edu.itson.potros.practica10.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivitySignInBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = Firebase.auth

        binding.welcomeTextView.text = "Hola, bienvenido"
        binding.catImageView.setImageResource(R.drawable.profile_photo)
    }
}