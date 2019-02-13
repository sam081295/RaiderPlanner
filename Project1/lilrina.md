The issue I chose to work on was the issue I originally submitted- issue #21 from https://github.com/gzdwsu/RaiderPlanner/issues/21

This issue describes the HTML files not passing the validator check. Looking at the HTML files, I found most of the errors pertained to missing alt tags for image elements and empty files. There were also some errors for duplicate ids, obsolete attributes (frameborder) and incorrect dimension units. I fixed all errors except for the ones for duplicate ids and frameborder. I didn't want to change these as I didn't want to mess up any styling of the website as these items are referenced to in css files and possibly elsewhere.

The name of the branch created to resolve this issue was: rp-webpage-1

0528aff updated all HTML files

I think this commit was good for the project and fixed most of issue #21. There are still 4 total errors that needed to be fixed for all index.html to validate. However, help.html, download.html, contribute.html, and about.html are now valid.
