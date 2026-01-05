package br.com.money.converter

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import br.com.money.converter.databinding.MoneyConverterGroupViewBinding

class MoneyConverterGroupView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding = MoneyConverterGroupViewBinding.inflate(
        LayoutInflater.from(context),
        this,
        true
    )

    init {
        layoutParams = LayoutParams(
            LayoutParams.MATCH_PARENT,
            LayoutParams.WRAP_CONTENT
        )
    }

    fun bind(
        title: String,
        subtitle: String,
        message: String
    ) = with(binding) {
        tvTitle.text = title
        tvSubtitle.text = subtitle
        tvMessage.text = message
    }
}