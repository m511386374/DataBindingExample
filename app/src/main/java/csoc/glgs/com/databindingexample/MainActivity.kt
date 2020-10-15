package csoc.glgs.com.databindingexample
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import csoc.glgs.com.databindingexample.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var mainBind :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBind = DataBindingUtil.setContentView(this,R.layout.activity_main)
        var bean = UseBean();
        bean.age = 27
        bean.name="ming"
        mainBind.bean = bean
        mainBind.event = object : EventListener {
            override fun onClick(view: View) {
                var bean = UseBean();
                bean.age = 28
                bean.name="meng"
                mainBind.bean = bean
            }

        }
    }

}
