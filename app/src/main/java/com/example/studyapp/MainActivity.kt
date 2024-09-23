package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.FrameLayout
import android.widget.ImageButton
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatDelegate
import androidx.viewpager2.widget.ViewPager2


class MainActivity : AppCompatActivity() {

    lateinit var toggle : ActionBarDrawerToggle
    private lateinit var frameLayout: FrameLayout
    private lateinit var discoverCourseButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_layout)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

        // Find the ViewPager2 by its ID
        val viewPager = findViewById<ViewPager2>(R.id.content_viewpaper)

        // Initialize the adapter
        val paperContentAdapter = PaperContentAdapter()

        // Set the adapter to the ViewPager2
        viewPager.adapter = paperContentAdapter

        // Optional: Set Page transformer for animations (optional)
        viewPager.setPageTransformer { page, position ->
            page.alpha = 1 - Math.abs(position) // Example transformation
        }
        viewPager.setClipToPadding(false)
        viewPager.setClipChildren(false)
        viewPager.setOffscreenPageLimit(2)
        viewPager.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER)


        /* // My course
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewCourses)
        val adapter = CourseAdapter()

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter
        // End ------------------------------------------------------------------------------------------

        // My Units
        val recyclerView1 = findViewById<RecyclerView>(R.id.recyclerViewUnits)
        val adapter1 = UnitAdapter()

        recyclerView1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView1.adapter = adapter1
        //End ------------------------------------------------------------------------------------------


        // My lesson
        *//*val recyclerView2 = findViewById<RecyclerView>(R.id.recyclerViewLessons)
        val adapter2 = LessonAdapter()

        recyclerView2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView2.adapter = adapter2*//*


        // Framelayout
        discoverCourseButton = findViewById(R.id.discover_course)
        frameLayout = findViewById(R.id.frameLayout)

        discoverCourseButton.setOnClickListener {
            if (frameLayout.visibility == View.GONE) {
                frameLayout.visibility = View.VISIBLE // Show the FrameLayout
                discoverCourseButton.rotation = 90f;
            } else {
                frameLayout.visibility = View.GONE // Hide the FrameLayout
                discoverCourseButton.rotation = -90f;
            }
        }
        frameLayout.visibility = View.GONE
        // end


        // Navigation
        val drawerLayout : DrawerLayout = findViewById(R.id.drawer_layout)
        val navView : NavigationView = findViewById(R.id.nav_view)
        val hamberger_button : ImageButton = findViewById(R.id.menu)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.Nav_Sololearn_PRO -> Toast.makeText(applicationContext, "Click Sololearn Pro", Toast.LENGTH_SHORT).show()
                R.id.Nav_Leardboard -> Toast.makeText(applicationContext, "Click Leardboard", Toast.LENGTH_SHORT).show()
                R.id.Nav_Invite_Friends -> Toast.makeText(applicationContext, "Click Invite Friends", Toast.LENGTH_SHORT).show()
                R.id.Nav_Rate -> Toast.makeText(applicationContext, "Click Rate", Toast.LENGTH_SHORT).show()
                R.id.Nav_Feedback -> Toast.makeText(applicationContext, "Click Feedback", Toast.LENGTH_SHORT).show()
                R.id.Nav_Settings -> Toast.makeText(applicationContext, "Click Settings", Toast.LENGTH_SHORT).show()
            }
            true
        }

        hamberger_button.setOnClickListener {
            drawerLayout.openDrawer(navView);
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)) {
            return  true
        }
        return super.onOptionsItemSelected(item)
    }
*/
        // End
    }

}