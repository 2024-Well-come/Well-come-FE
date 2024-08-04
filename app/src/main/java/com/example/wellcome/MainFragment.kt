package com.example.wellcome

import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.wellcome.databinding.FragmentMainBinding

class MainFragment: Fragment() {
    lateinit var binding: FragmentMainBinding
    val data1 = Article("강원도의 힐링을", "힐링", 1)
    val data2 = Article("강원도의 힐링을 \n그대로 느낄 수 있는 장소 8선", "지친 오늘 자연과 함께 치유해보세요", 1)
    val datas = mutableListOf(data1, data2)
    private val viewPagerAdapter = ArticleAdapter(datas)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = "나영"
        binding.profileText.setText("Well Come, "+name+"님")

        val prologue = "일상에 지친 오늘, \n웰니스 여행을 떠나볼까요?"

        // 3. SpannableStringBuilder 타입으로 변환
        val builder = SpannableStringBuilder(prologue)

        val colorBlueSpan = ForegroundColorSpan(resources.getColor(R.color.main_color))
        builder.setSpan(colorBlueSpan, 12, 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.mainText.text = builder

        binding.articleViewPager.adapter = viewPagerAdapter
    }
}