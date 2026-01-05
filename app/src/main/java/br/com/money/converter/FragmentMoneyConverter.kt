package br.com.money.converter

import android.os.Bundle
import android.view.View
import br.com.money.converter.databinding.FragmentMoneyConverterBinding

class FragmentMoneyConverter: BaseFragment() {

    override val layoutResource = R.layout.fragment_money_converter

    private var _binding: FragmentMoneyConverterBinding? = null
    private val binding get() = _binding!!

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.moneyConverterGroupView.bind(
            title = "Exchange",
            subtitle = "Conversor de moedas",
            message = "Digite o valor e escolha as moedas"
        )
    }


}