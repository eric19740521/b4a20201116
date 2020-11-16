B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.2
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	
	Private Drawer As B4XDrawer
	Private HamburgerIcon As B4XBitmap
	
	Private Button1 As Button
	Private btn1 As Button
	Private btn2 As Button
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	B4XPages.SetTitle(Me, "畫面2")

	'load the layout to Root
	Drawer.Initialize(Me, "Drawer", Root, 200dip)
	Drawer.CenterPanel.LoadLayout("Page2")
	Drawer.LeftPanel.LoadLayout("Left")
	'Page3 = B4XPages.GetPage("Page 3")
	HamburgerIcon = xui.LoadBitmapResize(File.DirAssets, "hamburger.png", 32dip, 32dip, True)


	B4XPages.AddMenuItem(Me, "menu1")
	B4XPages.AddMenuItem(Me, "menu2")

End Sub

'Home and back key 做在一起了
Private Sub B4XPage_CloseRequest As ResumableSub
	#if B4A
	'home button
	If Main.ActionBarHomeClicked Then
		Drawer.LeftOpen = Not(Drawer.LeftOpen)
		Return False
	End If
	'back key
	If Drawer.LeftOpen Then
		Drawer.LeftOpen = False
		Return False
	End If
	#end if
	Return True
End Sub


'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.
'
Sub B4XPage_Appear
	
	#if B4A
	Sleep(0)
	B4XPages.GetManager.ActionBar.RunMethod("setDisplayHomeAsUpEnabled", Array(True))
	Dim bd As BitmapDrawable
	bd.Initialize(HamburgerIcon)
	B4XPages.GetManager.ActionBar.RunMethod("setHomeAsUpIndicator", Array(bd))
	#End If
	
End Sub

Private Sub B4XPage_Disappear
	#if B4A
	B4XPages.GetManager.ActionBar.RunMethod("setHomeAsUpIndicator", Array(0))
	#end if
End Sub

Private Sub B4XPage_Resize (Width As Int, Height As Int)
	Drawer.Resize(Width, Height)
End Sub


Sub B4XPage_MenuClick (Tag As String)
	If Tag = "menu1" Then
		xui.MsgboxAsync("menu1","b4x")
	End If
	
	If Tag = "menu2" Then
		xui.MsgboxAsync("menu2","b4x")
	End If
	
End Sub

'
'Sub B4XPage_Foreground
'	Log("Page2 Foreground")
'End Sub
'
'Sub B4XPage_Background
'	Log("Page2 Background")
'End Sub
'
'

Sub Button1_Click
	B4XPages.ShowPageAndRemovePreviousPages("MainPage")
End Sub
'


Sub btn1_Click
	xui.MsgboxAsync("選單!按鈕1", "B4X")
End Sub

Sub btn2_Click
	xui.MsgboxAsync("選單!按鈕2", "B4X")
End Sub