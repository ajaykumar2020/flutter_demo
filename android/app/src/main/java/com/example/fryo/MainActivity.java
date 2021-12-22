package com.example.fryo;

import android.os.Bundle;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
  super.configureFlutterEngine(flutterEngine)
    GeneratedPluginRegistrant.registerWith(this);
  }
}

