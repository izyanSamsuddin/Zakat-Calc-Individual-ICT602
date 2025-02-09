package com.example.zakatcalc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem; // Import for handling back button
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        // Setup Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Enable the back button in the toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Show back button
            getSupportActionBar().setTitle("About");              // Set the title to "About"
        }

        // GitHub Button to open the repository link
        Button githubButton = findViewById(R.id.githubButton);
        githubButton.setOnClickListener(v -> openGitHubLink());
    }

    // Function to open the GitHub repository link
    private void openGitHubLink() {
        String githubUrl = "https://github.com/IsmidaRahim/HABIB-Zakat-Calculator-ICT602";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(githubUrl));
        startActivity(intent);
    }

    // Handle the back button click
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); // Go back to MainActivity
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
