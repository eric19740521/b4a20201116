package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xpage2 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xpage2");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xpage2.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.b4xdrawer _drawer = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _hamburgericon = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn2 = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public void  _b4xpage_appear() throws Exception{
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.b4xpage2 parent) {
this.parent = parent;
}
b4a.example.b4xpage2 parent;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 59;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 60;BA.debugLine="B4XPages.GetManager.ActionBar.RunMethod(\"setDispl";
parent._b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (ba)._actionbar /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setDisplayHomeAsUpEnabled",new Object[]{(Object)(parent.__c.True)});
 //BA.debugLineNum = 61;BA.debugLine="Dim bd As BitmapDrawable";
_bd = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
 //BA.debugLineNum = 62;BA.debugLine="bd.Initialize(HamburgerIcon)";
_bd.Initialize((android.graphics.Bitmap)(parent._hamburgericon.getObject()));
 //BA.debugLineNum = 63;BA.debugLine="B4XPages.GetManager.ActionBar.RunMethod(\"setHomeA";
parent._b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (ba)._actionbar /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setHomeAsUpIndicator",new Object[]{(Object)(_bd.getObject())});
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _b4xpage_closerequest() throws Exception{
ResumableSub_B4XPage_CloseRequest rsub = new ResumableSub_B4XPage_CloseRequest(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_B4XPage_CloseRequest extends BA.ResumableSub {
public ResumableSub_B4XPage_CloseRequest(b4a.example.b4xpage2 parent) {
this.parent = parent;
}
b4a.example.b4xpage2 parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 40;BA.debugLine="If Main.ActionBarHomeClicked Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._main._actionbarhomeclicked /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 41;BA.debugLine="Drawer.LeftOpen = Not(Drawer.LeftOpen)";
parent._drawer._setleftopen /*boolean*/ (parent.__c.Not(parent._drawer._getleftopen /*boolean*/ ()));
 //BA.debugLineNum = 42;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
 //BA.debugLineNum = 45;BA.debugLine="If Drawer.LeftOpen Then";

case 4:
//if
this.state = 7;
if (parent._drawer._getleftopen /*boolean*/ ()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 46;BA.debugLine="Drawer.LeftOpen = False";
parent._drawer._setleftopen /*boolean*/ (parent.__c.False);
 //BA.debugLineNum = 47;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 7:
//C
this.state = -1;
;
 //BA.debugLineNum = 50;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 20;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 21;BA.debugLine="B4XPages.SetTitle(Me, \"畫面2\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("畫面2"));
 //BA.debugLineNum = 24;BA.debugLine="Drawer.Initialize(Me, \"Drawer\", Root, 200dip)";
_drawer._initialize /*String*/ (ba,this,"Drawer",_root,__c.DipToCurrent((int) (200)));
 //BA.debugLineNum = 25;BA.debugLine="Drawer.CenterPanel.LoadLayout(\"Page2\")";
_drawer._getcenterpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().LoadLayout("Page2",ba);
 //BA.debugLineNum = 26;BA.debugLine="Drawer.LeftPanel.LoadLayout(\"Left\")";
_drawer._getleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().LoadLayout("Left",ba);
 //BA.debugLineNum = 28;BA.debugLine="HamburgerIcon = xui.LoadBitmapResize(File.DirAsse";
_hamburgericon = _xui.LoadBitmapResize(__c.File.getDirAssets(),"hamburger.png",__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (32)),__c.True);
 //BA.debugLineNum = 31;BA.debugLine="B4XPages.AddMenuItem(Me, \"menu1\")";
_b4xpages._addmenuitem /*b4a.example.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("menu1"));
 //BA.debugLineNum = 32;BA.debugLine="B4XPages.AddMenuItem(Me, \"menu2\")";
_b4xpages._addmenuitem /*b4a.example.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("menu2"));
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_disappear() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Private Sub B4XPage_Disappear";
 //BA.debugLineNum = 70;BA.debugLine="B4XPages.GetManager.ActionBar.RunMethod(\"setHomeA";
_b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (ba)._actionbar /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setHomeAsUpIndicator",new Object[]{(Object)(0)});
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_menuclick(String _tag) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub B4XPage_MenuClick (Tag As String)";
 //BA.debugLineNum = 80;BA.debugLine="If Tag = \"menu1\" Then";
if ((_tag).equals("menu1")) { 
 //BA.debugLineNum = 81;BA.debugLine="xui.MsgboxAsync(\"menu1\",\"b4x\")";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("menu1"),BA.ObjectToCharSequence("b4x"));
 };
 //BA.debugLineNum = 84;BA.debugLine="If Tag = \"menu2\" Then";
if ((_tag).equals("menu2")) { 
 //BA.debugLineNum = 85;BA.debugLine="xui.MsgboxAsync(\"menu2\",\"b4x\")";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("menu2"),BA.ObjectToCharSequence("b4x"));
 };
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_resize(int _width,int _height) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Private Sub B4XPage_Resize (Width As Int, Height A";
 //BA.debugLineNum = 75;BA.debugLine="Drawer.Resize(Width, Height)";
_drawer._resize /*String*/ (_width,_height);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public String  _btn1_click() throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub btn1_Click";
 //BA.debugLineNum = 108;BA.debugLine="xui.MsgboxAsync(\"選單!按鈕1\", \"B4X\")";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("選單!按鈕1"),BA.ObjectToCharSequence("B4X"));
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public String  _btn2_click() throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub btn2_Click";
 //BA.debugLineNum = 112;BA.debugLine="xui.MsgboxAsync(\"選單!按鈕2\", \"B4X\")";
_xui.MsgboxAsync(ba,BA.ObjectToCharSequence("選單!按鈕2"),BA.ObjectToCharSequence("B4X"));
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub Button1_Click";
 //BA.debugLineNum = 102;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"MainPage";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"MainPage");
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 5;BA.debugLine="Private Drawer As B4XDrawer";
_drawer = new b4a.example.b4xdrawer();
 //BA.debugLineNum = 6;BA.debugLine="Private HamburgerIcon As B4XBitmap";
_hamburgericon = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private btn1 As Button";
_btn1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private btn2 As Button";
_btn2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
