# Conner Brigman
GitHub: chunkeymonkey79

<strong>Issue 6 </strong>

Link: https://github.com/gzdwsu/RaiderPlanner/issues/6

## Issue Research
Classes that handled the code relating to notifications are:
* MenuController
* MainMenu.fxml
* Notification.java

Notification.java was merely the model for the rest of the code so that file wasn't touched at all, only used for reference.

## Commits
Branch name: <strong>rp-notification-1</strong>
* 93fc507 - Added new line to handle marking of read to unread.
* ab41b9b - Added comment in appropriate function, changed MarkAll to UnmarkAll (this commit was unneccessary in hindsight)
* 8ef7e99 - Added method handleUnmarkAll() to mark all read notifications unread (this commit was probably too much code at once)

The issue was partially resolved. The notifications will reset to appear as though they are unread (unread indicator returns), but the actual items do not reset.

Pull request: RP Notification 1