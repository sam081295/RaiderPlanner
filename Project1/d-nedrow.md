#### Pull Request #1: "Project 1 requirements"

https://github.com/d-nedrow/RaiderPlanner/pull/1

This was a first try at a pull request made by Dustin-Layne. Upon examining the changes in github, I noticed he hadn't created a new branch, but was instead working from his master branch. Reading his comment, it was clear that this pull request was done with some amount of frustration. Instead of doing code changes, he had created the Project1 folder with some of the files we need to submit. I was already working on my own version of these files, so I didn't want to merge these changes into my master branch.

For the reasons stated above, I decided to reject this pull request.

Nonetheless, I also thought it would be a good idea to get some practice by doing a checkout of this pull request onto my local machine and examining the changes there. Here I ran into a problem of my own making. When I created the new local branch to pull these changes down into, I made the mistake of having my own currently-untracked Project1 folder in my master branch (and so in the new branch as well). When I tried to pull the changes from github, the merge failed because the Project1 files Dustin had created conflicted with my untracked Project1 files. It took me a few minutes of being disoriented (and a little concerned over whether I had just done harm to my master branch somehow) to finish investigating and realize exactly what was wrong. I cancelled the merge and deleted the temporary branch. On master, I moved the untracked Project1 folder out of the working directory to a safe location. Then I created the local branch again and once again pulled Dustin's changes down to examine them. Everything worked smoothly, I was relieved I had done no harm, and was happy to have learned a lesson about untracked files.



#### Pull Request #2: "Pull request fixes issue #21"

https://github.com/d-nedrow/RaiderPlanner/pull/2

This was the pull request submitted by Sabrina Pyatt (lilrina). The purpose was to fix issue #21 on gzdwsu/RaiderPlanner: the html files in the project were not passing an html validator check. Upon looking at the original html files, I noticed that index and help had a combined 33 errors/warnings. The files download, contribute, and about were actually empty files. Sabrina's code fixes added content to the empty files, and reduced the number of errors/warnings in index and help from 33 down to 4.

These changes were clearly within the scope of issue #21. While the issue is not completely resolved, substantial progress was made. I decided that this progress was plenty good enough for this project, so I accepted the pull request. The pull request presented no problems whatever and could have been merged on github. However, I used my experience from the first pull request to checkout this request locally and examine the changes on my computer. Everything went smoothly.



#### Pull Request #3: "RP Notification 1"

https://github.com/d-nedrow/RaiderPlanner/pull/3

This was the pull request submitted by Conner Brigman (chunkeymonkey79).  The purpose was to fix issue #6 on gzdwsu/RaiderPlanner: the notifications menu had a "mark all as read" button, but we wanted to add a "mark all as unread" button to reverse this. Upon testing Conner's changes, I noticed that the newly added button did indeed work to change the notifications icon itself back to the way it looks when a user has unread notifications. In that sense, it was successful. It did not, however, go on to change the styling of individual notifications back to their unread style. 

Conner's changes were definitely within the scope of the issue. Although they didn't complete the entire requirements of the issue, I thought it was certainly good enough progress for this project. I decided to accept the pull request. Having had some practice with pull requests, this one went very smoothly. I had no problems with it at all.