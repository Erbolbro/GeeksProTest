package com.skala.flower.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.skala.flower.R
import com.skala.flower.databinding.FragmentCarBinding
import com.skala.flower.ui.adapter.CarAdapter
import com.skala.flower.ui.adapter.OnClick
import com.skala.flower.ui.model.CarModel

class CarFragment : Fragment(R.layout.fragment_car) {
    private val binding by viewBinding(FragmentCarBinding::bind)
    private val onClick = object : OnClick {
        override fun onClick(carModel: CarModel) {
            findNavController().navigate(CarFragmentDirections.actionCarFragmentToDetailFragment(carModel))
        }
    }

    private val adapter = CarAdapter(onClick)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        getCar()
    }

    private fun initialize() {
        binding.rvCar.adapter = adapter
        adapter.setCarList(mutableListOf())
    }

    private fun getCar() {
        val carList = mutableListOf(
            CarModel(
                "https://knews.kg/wp-content/uploads/2022/11/toyota-prius-6-728x384-1.jpg",
                "Toyota Prius", "2023"
            ),CarModel(
                "https://cdnn21.img.ria.ru/images/155156/97/1551569763_342:0:3071:2047_1920x0_80_0_0_2a25c79225869cd0f076e023f00e2861.jpg",
                "ломбаргини", "2022"
            ),CarModel(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTVBLgkaHwe6nkWtDTOiYKJrYIB_GKXTUuG6Q&s",
                "Bugatti Veiron", "2021"
            ),CarModel(
                "https://avatars.mds.yandex.net/get-verba/787013/2a00000160984840410e310d545cdba95902/auto_main",
                "BMW X5", "2023"
            ),CarModel(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQaH8YmuE5HMntf_lfYi_Zbe2uRsEF-at_TgA&s",
                "Mers sls", "2018"
            ),CarModel(
                "https://knews.kg/wp-content/uploads/2022/11/toyota-prius-6-728x384-1.jpg",
                "Toyota Prius", "2023"
            ),CarModel(
                "https://knews.kg/wp-content/uploads/2022/11/toyota-prius-6-728x384-1.jpg",
                "Toyota Prius", "2023"
            ),CarModel(
                "https://knews.kg/wp-content/uploads/2022/11/toyota-prius-6-728x384-1.jpg",
                "Toyota Prius", "2023"
            ),CarModel(
                "https://knews.kg/wp-content/uploads/2022/11/toyota-prius-6-728x384-1.jpg",
                "Toyota Prius", "2023"
            ),CarModel(
                "https://knews.kg/wp-content/uploads/2022/11/toyota-prius-6-728x384-1.jpg",
                "Toyota Prius", "2023"
            ),CarModel(
                "https://knews.kg/wp-content/uploads/2022/11/toyota-prius-6-728x384-1.jpg",
                "Toyota Prius", "2023"
            ),CarModel(
                "https://knews.kg/wp-content/uploads/2022/11/toyota-prius-6-728x384-1.jpg",
                "Toyota Prius", "2023"
            ),CarModel(
                "https://knews.kg/wp-content/uploads/2022/11/toyota-prius-6-728x384-1.jpg",
                "Toyota Prius", "2023"
            ),CarModel(
                "https://knews.kg/wp-content/uploads/2022/11/toyota-prius-6-728x384-1.jpg",
                "Toyota Prius", "2023"
            ),
        )
        adapter.setCarList(carList)
    }
}