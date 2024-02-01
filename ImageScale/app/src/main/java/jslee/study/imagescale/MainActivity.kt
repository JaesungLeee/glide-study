package jslee.study.imagescale

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView1L = findViewById<ImageView>(R.id.iv_test1_large)
        val imageView1S = findViewById<ImageView>(R.id.iv_test1_small)
        val imageView2L = findViewById<ImageView>(R.id.iv_test2_large)
        val imageView2S = findViewById<ImageView>(R.id.iv_test2_small)
        val imageView3L = findViewById<ImageView>(R.id.iv_test3_large)
        val imageView3S = findViewById<ImageView>(R.id.iv_test3_small)
        val imageView4L = findViewById<ImageView>(R.id.iv_test4_large)
        val imageView4S = findViewById<ImageView>(R.id.iv_test4_small)
        val imageView5L = findViewById<ImageView>(R.id.iv_test5_large)
        val imageView5S = findViewById<ImageView>(R.id.iv_test5_small)
        val imageView6L = findViewById<ImageView>(R.id.iv_test6_large)
        val imageView6S = findViewById<ImageView>(R.id.iv_test6_small)
        val imageView7L = findViewById<ImageView>(R.id.iv_test7_large)
        val imageView7S = findViewById<ImageView>(R.id.iv_test7_small)
        val imageView8L = findViewById<ImageView>(R.id.iv_test8_large)
        val imageView8S = findViewById<ImageView>(R.id.iv_test8_small)

        imageView1L.setImageResource(R.drawable.img_sample_large)
        imageView2L.setImageResource(R.drawable.img_sample_large)
        imageView3L.setImageResource(R.drawable.img_sample_large)
        imageView4L.setImageResource(R.drawable.img_sample_large)
        imageView5L.setImageResource(R.drawable.img_sample_large)
        imageView6L.setImageResource(R.drawable.img_sample_large)
        imageView7L.setImageResource(R.drawable.img_sample_large)
        imageView8L.setImageResource(R.drawable.img_sample_large)
        imageView1S.setImageResource(R.drawable.img_sample_small)
        imageView2S.setImageResource(R.drawable.img_sample_small)
        imageView3S.setImageResource(R.drawable.img_sample_small)
        imageView4S.setImageResource(R.drawable.img_sample_small)
        imageView5S.setImageResource(R.drawable.img_sample_small)
        imageView6S.setImageResource(R.drawable.img_sample_small)
        imageView7S.setImageResource(R.drawable.img_sample_small)
        imageView8S.setImageResource(R.drawable.img_sample_small)

        imageView1L.scaleType = ImageView.ScaleType.CENTER
        imageView1S.scaleType = ImageView.ScaleType.CENTER
        imageView2L.scaleType = ImageView.ScaleType.CENTER_INSIDE
        imageView2S.scaleType = ImageView.ScaleType.CENTER_INSIDE
        imageView3L.scaleType = ImageView.ScaleType.CENTER_CROP
        imageView3S.scaleType = ImageView.ScaleType.CENTER_CROP
        imageView4L.scaleType = ImageView.ScaleType.FIT_XY
        imageView4S.scaleType = ImageView.ScaleType.FIT_XY
        imageView5L.scaleType = ImageView.ScaleType.FIT_CENTER
        imageView5S.scaleType = ImageView.ScaleType.FIT_CENTER
        imageView6L.scaleType = ImageView.ScaleType.FIT_START
        imageView6S.scaleType = ImageView.ScaleType.FIT_START
        imageView7L.scaleType = ImageView.ScaleType.FIT_END
        imageView7S.scaleType = ImageView.ScaleType.FIT_END
        imageView8L.scaleType = ImageView.ScaleType.MATRIX
        imageView8S.scaleType = ImageView.ScaleType.MATRIX
    }
}