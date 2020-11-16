B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	

	
	Dim Drawer As B4XDrawer
	Public Page2 As B4Xpage2
	Public Page3 As B4Xpage3
	Private Button2 As Button
	
	Private pmgr As B4XPagesManager 'ignore
	Private Button3 As Button
End Sub

Public Sub Initialize
	pmgr  =  B4XPages.GetManager
	B4XPages.GetManager.TransitionAnimationDuration = 0
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	B4XPages.SetTitle(Me, "主畫面")
	
	Drawer.Initialize(Me, "Drawer", Root, 200dip)	'選單頁面大小
	Drawer.CenterPanel.LoadLayout("MainPage")
	Drawer.LeftPanel.LoadLayout("left")
	
'	
	Page2.Initialize
	B4XPages.AddPage("Page2", Page2)
	
	Page3.Initialize
	B4XPages.AddPage("Page3", Page3)
	
	

	'B4XPages.SetTitle(Me,Starter.loc.Localize("home"))
	
End Sub


'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.




Sub Button1_Click
	B4XPages.ShowPage("Page2")
	'xui.MsgboxAsync("Hello world!", "B4X")
End Sub

Sub Button2_Click
	B4XPages.ShowPage("Page3")
	 
End Sub

Sub Button3_Click
	B4XPages.ClosePage(Me)
End Sub