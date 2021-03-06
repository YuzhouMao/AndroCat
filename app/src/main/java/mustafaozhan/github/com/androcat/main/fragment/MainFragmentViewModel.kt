package mustafaozhan.github.com.androcat.main.fragment

import mustafaozhan.github.com.androcat.base.BaseViewModel

/**
 * Created by Mustafa Ozhan on 2018-07-22.
 */
class MainFragmentViewModel : BaseViewModel() {

    override fun inject() {
        viewModelComponent.inject(this)
    }

    fun getUsername() = dataManager.loadUserName().toString()
}
