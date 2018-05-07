# TextJustify
# JsonProvider
jsonProvider
this library help to justify persian text in easy way.

How to use:

Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.farshid7:TextJustify:1.0'
	}
  
  Step 3. Add FarshidTextView to XML
  
          <ir.waspar.www.persiantextjustify.FarshidTextView
            android:id="@+id/farshidTextView"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:padding="4dp"
            android:text="@string/text"
            />
	    
  Step 4 Set text to custom textview
          FarshidTextView farshidTextView=findViewById(R.id.farshidTextView);
          farshidTextView.setText(getString(R.string.text),true);


  

  
