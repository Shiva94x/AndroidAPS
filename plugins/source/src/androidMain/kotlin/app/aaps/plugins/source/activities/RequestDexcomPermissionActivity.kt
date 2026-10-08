package app.aaps.plugins.source.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class RequestDexcomPermissionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Schließt die Berechtigungs-Abfrage sofort ab
        finish()
    }

}
