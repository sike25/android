package hu.ait.agora

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import hu.ait.agora.ui.navigation.Screen
import hu.ait.agora.ui.screen.buy_product.FeedScreen
import hu.ait.agora.ui.screen.buy_product.FeedViewModel
import hu.ait.agora.ui.screen.list_product.ListProductScreen
import hu.ait.agora.ui.screen.login.LoginScreen
import hu.ait.agora.ui.screen.login.RegisterScreen
import hu.ait.agora.ui.screen.buy_product.ProductScreen
import hu.ait.agora.ui.screen.profile.ProfileScreen
import hu.ait.agora.ui.screen.buy_product.SearchResultsScreen
import hu.ait.agora.ui.screen.splash.SplashScreen
import hu.ait.agora.ui.theme.AgoraTheme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AgoraTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AgoraNavHost()
                }
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.P)
@Composable
fun AgoraNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = Screen.Splash.route
) {
    val feedViewModel: FeedViewModel = viewModel()
    NavHost(
        modifier = modifier, navController = navController, startDestination = startDestination
    ) {

        composable(Screen.Splash.route) {
            SplashScreen( navController = navController)
        }
        composable(Screen.Login.route) {
            LoginScreen(navController = navController)
        }
        composable(Screen.Register.route) {
            RegisterScreen(navController = navController)
        }
        composable(Screen.ListProduct.route) {
            ListProductScreen(navController = navController)
        }
        composable(Screen.Feed.route) {
            FeedScreen(navController = navController, feedViewModel = feedViewModel)
        }
        composable(Screen.SearchResults.route) {
            SearchResultsScreen(navController = navController, feedViewModel = feedViewModel)
        }
        composable(Screen.Product.route) {
            ProductScreen(navController = navController, feedViewModel = feedViewModel)
        }
        composable(Screen.Profile.route) {
            ProfileScreen(navController = navController)
        }
    }
}
