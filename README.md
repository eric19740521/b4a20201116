

Android APP手機開發工具--B4A 多頁面,使用B4XPages 

相關網址:
https://www.b4x.com/android/forum/threads/b4x-b4xpages-cross-platform-and-simple-framework-for-managing-multiple-pages.118901/#content


每個頁面:
```B4X:

Sub Class_Globals
    Private Root As B4XView 'ignore
    Private xui As XUI 'ignore
End Sub

Public Sub Initialize

End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
    Root = Root1
    'load the layout to Root

End Sub
```

新增一個頁面
B4X:
Dim Page2 As B4XPage2
Page2.Initialize
B4XPages.AddPage("Page 2", Page2)

顯示一個頁面:
B4X:
B4XPages.ShowPage("Page 3")


當作一個物件,改變頁面裡面的一個物件值:
B4X:
Page3 = B4XPages.GetPage("Page 3")
Page3.Button1.Text = "abc"


設定頁面標題:
B4X:
B4XPages.SetTitle(Me, "Draw Something")


回到主頁面:
B4X:
B4XPages.ShowPageAndRemovePreviousPages("MainPage")


關閉頁面:
'Return True to close, False to cancel
Private Sub B4XPage_CloseRequest As ResumableSub
    Dim sf As Object = xui.Msgbox2Async("Close?", "Title", "Yes", "Cancel", "No", Null)
    Wait For (sf) Msgbox_Result (Result As Int)
    If Result = xui.DialogResponse_Positive Then
        Return True
    End If
    Return False
End Sub





B4XPages Events:
* B4XPage_Created-創建頁面時調用一次。 這將在頁面變得可見之前或在調用B4XPages.AddPageAndCreate之後發生。
* B4XPage_Appear-每當頁面可見時調用。
* B4XPage_Disappear-每當可見頁面消失時調用。
* B4XPage_Background-在應用程序移至後台時調用。 在實現此子功能的所有頁面中都會引發此事件，而不僅僅是頂部事件。 
			這是保存任何需要保存的東西的好地方，因為該過程以後可能會被終止。 請注意，在B4J中，當最後一頁關閉時，它會升高。
* B4XPage_Foreground-在應用程序移至前台時調用。
* B4XPage_Resize（B4J / B4i）-調整頁面大小時調用。
* B4XPage_CloseRequest（B4J / B4A）-在B4A中，當用戶單擊後退鍵或向上指示器時調用它。 在B4J中，當用戶單擊關閉按鈕時調用它。 有關更多信息，請參見第4條。
* B4XPage_MenuClick-單擊B4i中的菜單項或BarButton時調用。 有關更多信息，請參見帖子5。
* B4XPage_KeyboardStateChanged（B4i）-鍵盤狀態更改時調用。
* B4XPage_IconifiedChanged（B4J）-在最小化或還原頁面時調用。
* B4XPage_PermissionResult（B4A）-在調用rp.CheckAndRequest之後引發。



1.File－－＞New－－＞b4apages

2.