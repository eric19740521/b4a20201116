package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_left{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[left/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="btn1.width = 80%x"[left/General script]
views.get("btn1").vw.setWidth((int)((80d / 100 * width)));
//BA.debugLineNum = 4;BA.debugLine="btn2.width = 90%x"[left/General script]
views.get("btn2").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 6;BA.debugLine="btn1.Left= 10%x"[left/General script]
views.get("btn1").vw.setLeft((int)((10d / 100 * width)));
//BA.debugLineNum = 7;BA.debugLine="btn2.Left= 5%x"[left/General script]
views.get("btn2").vw.setLeft((int)((5d / 100 * width)));

}
}