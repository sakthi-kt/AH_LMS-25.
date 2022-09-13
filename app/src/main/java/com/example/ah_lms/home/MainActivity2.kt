package com.example.ah_lms.home

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.ah_lms.R
import com.example.ah_lms.fragments.*
import com.example.ah_lms.login.MainActivity
import com.google.android.material.navigation.NavigationView

class MainActivity2 : AppCompatActivity() {

      lateinit var toggle: ActionBarDrawerToggle
      lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        drawerLayout = findViewById(R.id.drawerLayout)
        val navView:NavigationView = findViewById(R.id.navigation_view)

        toggle = ActionBarDrawerToggle(this,drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

         supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {

         // it.isChecked = true

             when(it.itemId)
            {
                R.id.nav_apply -> replaceFragment(LeaveFragment(),it.title.toString())
                R.id.nav_myleaves -> replaceFragment(MyLeaveFragment(),it.title.toString())
                R.id.nav_request -> replaceFragment(RequestFragment(),it.title.toString())
                R.id.ahfamily -> replaceFragment(AhFamilyFragment(),it.title.toString())
                R.id.holidays -> replaceFragment(AhHolidaysFragment(),it.title.toString())
                R.id.profile -> replaceFragment(ProfileFragment(),it.title.toString())
                R.id.password -> replaceFragment(PasswordFragment(),it.title.toString())
                R.id.logout -> {
                    val eBuilder = AlertDialog.Builder(this)
                    eBuilder.setTitle("Logout")
                    eBuilder.setMessage("Are you sure want to log out? ")
                    eBuilder.setPositiveButton("Yes"){
                            Dialog,which->
                        val intent = Intent(this@MainActivity2, MainActivity::class.java)
                        startActivity(intent)
                        finish()
                        Toast.makeText(this,"Logged Out", Toast.LENGTH_SHORT).show()
                    }
                    eBuilder.setNegativeButton("No"){
                            Dialog,which->
                    }
                    val createBuild: AlertDialog = eBuilder.create()
                    createBuild.show()
                }
            }
            true
        }

    }
    private fun replaceFragment(fragment:Fragment,title:String){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
        drawerLayout.closeDrawers()
        setTitle(title)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}