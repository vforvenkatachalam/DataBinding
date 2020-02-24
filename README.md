# DataBinding

Step 1:
-------
    In App level gradle file -> add the following code 
    
    android{
      dataBinding{
        enabled = true
      }
    }
    
Step 2:
-------
    In main_activity xml make <layout> tag as root tag
    
Step 3:
-------
    In MainActivity Kotlin file change the default setContent into binding setcontent. follow the code below
    
      lateinit var binding:ActivityMainBinding
      binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
      
Step 4 :
--------
    Create a Data class
      eg : data class MyName(var name:String = "", var nickname:String = ""){}
      
Step 5:
------
    In XML add Data tag with variable tag inside 
    eg: 
    <data>
        <variable
            name="myName"                           
            type="com.kotlin.databinding.MyName" />
    </data>
    
 Step 6:
 -------
    create a data class object and set it to the binding variable
    
    var mynameobj:MyName = MyName("venkatachalam")
    
    binding.myName = mynameobj
    
 Step 7:
 -------
     To get this effect in textview do the following changes in text attribute
     
     android:text="@={myName.name}"
     
     
 Thanks
    
