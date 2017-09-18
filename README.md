MonsterID
=========

![Logo](art/monster.png)

An android implementation of [MonsterID](https://www.splitbrain.org/projects/monsterid) library.
Random monster generation algorithm is based on [monsterid.js](https://github.com/KevinGaudin/monsterid.js).
MonsterIdDrawable interface based on IconDrawable from [android-iconify](https://github.com/JoanZapata/android-iconify).

Usage
-----

Simply create a ```MonsterIdDrawable``` and set it to your ```ImageView```:
```java
MonsterIdDrawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        drawable = new MonsterIdDrawable(this, "monster").sizeDp(48);
        imageView.setImageDrawable(drawable);
        drawable.setMonsterId(input.getText().toString().trim());
```

LICENSE
-------

Copyright `2017` `Deepankar Bhardwaj`

Licensed under the Apache License, Version 2.0 (the "License"); you may not use
this file except in compliance with the License.  You may obtain a copy of the
License at

    http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software distributed
	under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
	CONDITIONS OF ANY KIND, either express or implied.  See the License for the
	specific language governing permissions and limitations under the License.

