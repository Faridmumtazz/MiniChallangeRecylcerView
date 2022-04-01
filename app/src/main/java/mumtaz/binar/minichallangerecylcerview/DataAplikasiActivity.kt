package mumtaz.binar.minichallangerecylcerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_data_aplikasi.*

class DataAplikasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_aplikasi)

        val dataaplikasi = arrayListOf(
            DataApk("Binar Academy", "Lentera Bangsa ","Education","85","185mb","200jt",R.drawable.binar),
            DataApk("Lintasi", "Lintasi Group","Education","75","105mb","200jt",R.drawable.binar),
            DataApk("Studio", "Studio Group","Education","85","185jt","200jt",R.drawable.binar)
        )

        val adapter = AdapterAplikasi(dataaplikasi)
        val laymanajer = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_apk.layoutManager = laymanajer
        rv_apk.adapter = adapter
    }
}