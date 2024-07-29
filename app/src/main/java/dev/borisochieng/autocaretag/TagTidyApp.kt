package dev.borisochieng.autocaretag

import android.app.Application
import dev.borisochieng.autocaretag.nfc_reader.repository.NFCReaderRepository
import dev.borisochieng.autocaretag.nfc_reader.ui.NFCReaderViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.dsl.module

class AutoCareTagApp : Application() {

	override fun onCreate() {
		super.onCreate()
		startKoin {
			androidContext(this@AutoCareTagApp)
			androidLogger(Level.INFO)
			modules(appModule)
		}
	}

}

val appModule = module {
	factory { NFCReaderRepository() }
	viewModel { NFCReaderViewModel() }
}