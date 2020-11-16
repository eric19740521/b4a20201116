package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.b4xdrawer _drawer = null;
public b4a.example.b4xpage2 _page2 = null;
public b4a.example.b4xpage3 _page3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button2 = null;
public b4a.example.b4xpagesmanager _pmgr = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button3 = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 30;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 31;BA.debugLine="Root.LoadLayout(\"MainPage\")";
_root.LoadLayout("MainPage",ba);
 //BA.debugLineNum = 32;BA.debugLine="B4XPages.SetTitle(Me, \"主畫面\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("主畫面"));
 //BA.debugLineNum = 34;BA.debugLine="Drawer.Initialize(Me, \"Drawer\", Root, 200dip)	'選單";
_drawer._initialize /*String*/ (ba,this,"Drawer",_root,__c.DipToCurrent((int) (200)));
 //BA.debugLineNum = 35;BA.debugLine="Drawer.CenterPanel.LoadLayout(\"MainPage\")";
_drawer._getcenterpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().LoadLayout("MainPage",ba);
 //BA.debugLineNum = 36;BA.debugLine="Drawer.LeftPanel.LoadLayout(\"left\")";
_drawer._getleftpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().LoadLayout("left",ba);
 //BA.debugLineNum = 39;BA.debugLine="Page2.Initialize";
_page2._initialize /*Object*/ (ba);
 //BA.debugLineNum = 40;BA.debugLine="B4XPages.AddPage(\"Page2\", Page2)";
_b4xpages._addpage /*String*/ (ba,"Page2",(Object)(_page2));
 //BA.debugLineNum = 42;BA.debugLine="Page3.Initialize";
_page3._initialize /*Object*/ (ba);
 //BA.debugLineNum = 43;BA.debugLine="B4XPages.AddPage(\"Page3\", Page3)";
_b4xpages._addpage /*String*/ (ba,"Page3",(Object)(_page3));
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub Button1_Click";
 //BA.debugLineNum = 58;BA.debugLine="B4XPages.ShowPage(\"Page2\")";
_b4xpages._showpage /*String*/ (ba,"Page2");
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _button2_click() throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub Button2_Click";
 //BA.debugLineNum = 63;BA.debugLine="B4XPages.ShowPage(\"Page3\")";
_b4xpages._showpage /*String*/ (ba,"Page3");
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public String  _button3_click() throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub Button3_Click";
 //BA.debugLineNum = 68;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 14;BA.debugLine="Dim Drawer As B4XDrawer";
_drawer = new b4a.example.b4xdrawer();
 //BA.debugLineNum = 15;BA.debugLine="Public Page2 As B4Xpage2";
_page2 = new b4a.example.b4xpage2();
 //BA.debugLineNum = 16;BA.debugLine="Public Page3 As B4Xpage3";
_page3 = new b4a.example.b4xpage3();
 //BA.debugLineNum = 17;BA.debugLine="Private Button2 As Button";
_button2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private pmgr As B4XPagesManager 'ignore";
_pmgr = new b4a.example.b4xpagesmanager();
 //BA.debugLineNum = 20;BA.debugLine="Private Button3 As Button";
_button3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 24;BA.debugLine="pmgr  =  B4XPages.GetManager";
_pmgr = _b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (ba);
 //BA.debugLineNum = 25;BA.debugLine="B4XPages.GetManager.TransitionAnimationDuration =";
_b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (ba)._transitionanimationduration /*int*/  = (int) (0);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
