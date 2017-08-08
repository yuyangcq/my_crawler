package com.yuyang.constant;

/**
 * Created by yuyang on 2017/7/10.
 */
public class Constant {
    public static final String html1 = "<html>" +
            "<head>" +
            "<title> 开源中国社区 </title>" +
            "<head>" +
            "<body class=11 href='1111' img=111>" +
            "<a class=yu href='http://baidu'> 这里是 jsoup 项目的相关文章 </a>" +
            "<h1 class=yu>" +
            "<a href='http://于'> 于洋1</a>" +
            "</h1>" +
            "</body> " +
            "<h1 class=yu>" +
            "<a href=http://熊1 img=图像> 熊丽松1</a>" +
            "<h2 class=yu1>" +
            "<a href='http://熊2'> 熊丽松2</a>" +
            "</h2>" +
            "<h3 class=yu>" +
            "<a href='http://熊3'> 熊丽松3</a>" +
            "</h3>"  +
            "</h1>" +

            "</html>";
    public static final String html ="<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
            "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
            "<head>\n" +
            "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=7\" />\n" +
            "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
            "<title>中国纪检监察报</title>\n" +
            "<link href=\"../../../tplimg/jjjc.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
            "<SCRIPT language=Javascript src=\"../../../tplimg/prototype.js\"></SCRIPT>\n" +
            "<SCRIPT language=Javascript src=\"../../../tplimg/mp.js\"></SCRIPT>\n" +
            "<SCRIPT language=Javascript src=\"../../../tplimg/calendar2.js\"></SCRIPT>\n" +
            "<SCRIPT language=Javascript src=\"../../../tplimg/range.js\"></SCRIPT>\n" +
            "<SCRIPT id=oMapScript event=onmouseover() for=pagepicmap>\n" +
            "rangeDeltaX =18;\n" +
            "rangeDeltaY = -18;\n" +
            " drawLine(event.srcElement);\n" +
            "</SCRIPT>\n" +
            "\n" +
            "<SCRIPT id=oMapScript1 event=onmouseout() for=pagepicmap>\n" +
            " MouseOutMap();\n" +
            "</SCRIPT>\n" +
            "\n" +
            "<SCRIPT id=oMapScript2 event=onclick() for=pagepicmap>\n" +
            " clickmap(event.srcElement);\n" +
            "</SCRIPT>\n" +
            "\n" +
            "<SCRIPT language=Javascript>\n" +
            "function turnpage(src,mode){\n" +
            "\n" +
            " currPos = src.selectedIndex;\n" +
            "\n" +
            " if(mode==0){//前翻\n" +
            " \tif(currPos==0) return;\n" +
            "\telse {\n" +
            "\t src.selectedIndex = currPos -1;\n" +
            "\t src.onchange();\n" +
            "\t} \n" +
            " }else{\n" +
            " if(currPos == src.length-1)\n" +
            "\t return;\n" +
            "\t else {\n" +
            "\t src.selectedIndex = currPos +1;\n" +
            "\t src.onchange();\n" +
            "\t }\n" +
            " }\n" +
            "}\n" +
            "function changeMPCld()\n" +
            "{\n" +
            " var y,m;\n" +
            " y=CLD.SY.selectedIndex+2010;\n" +
            " m=CLD.SM.selectedIndex;\n" +
            " //alert(m);\n" +
            " OBJ_MP_LOADACTION.loadPeriods(\"\",y+\"-\"+appendZero(m+1));\n" +
            "\n" +
            "}\n" +
            "</SCRIPT>\n" +
            "\n" +
            "<script type=\"text/javascript\">\n" +
            "\n" +
            "//提交表单\n" +
            "function per_submit()\n" +
            "{\n" +
            " var flag = true;\n" +
            " \n" +
            " //alert(\"content=\"+form1.contentKey.value);\n" +
            " if(form1.contentKey.value==\"\"){\n" +
            " \treturn;\n" +
            " }\n" +
            " if( flag == true ) \n" +
            " {\n" +
            " \tdocument.form1.submit(); \n" +
            " \tresult_list.innerHTML=\"正在进行检索，请耐心等待结果...\";\n" +
            " } \n" +
            "}\n" +
            "\n" +
            "</script>\n" +
            "</head>\n" +
            "\n" +
            "<body onLoad=\"initialize();initMPPage();\">\n" +
            "<div class=\"wrap\">\n" +
            "<div class=\"h78\"></div>\n" +
            "<!--左栏开始-->\n" +
            "<div class=\"w388\">\n" +
            "<p class=\"rq\">主办单位：中国纪检监察报社</p>\n" +
            "<!--版面开始-->\n" +
            "<div class=\"bm\">\n" +
            "<MAP NAME=\"pagepicmap\"><Area coords=\"2,98,225,98,225,366,2,366\" shape=\"polygon\" href=\"content_52014.htm\"><Area coords=\"176,7,347,7,347,84,176,84\" shape=\"polygon\" href=\"content_52015.htm\"><Area coords=\"235,96,347,96,347,196,235,196\" shape=\"polygon\" href=\"content_52016.htm\"><Area coords=\"235,200,347,200,347,300,235,300\" shape=\"polygon\" href=\"content_52017.htm\"><Area coords=\"235,317,347,317,347,430,235,430\" shape=\"polygon\" href=\"content_52018.htm\"><Area coords=\"225,403,225,399,225,382,9,382,9,399,117,403,117,448,9,448,9,541,225,541\" shape=\"polygon\" href=\"content_52019.htm\"><Area coords=\"235,444,347,444,347,512,235,512\" shape=\"polygon\" href=\"content_52020.htm\"></MAP><img src=../../1/2017-07/22/1/201707221_brief.jpg border=0 width=350 height=550 USEMAP=#pagepicmap> \n" +
            "</div>\n" +
            "<!--版面结束-->\n" +
            " <table width=\"380\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"sxb\">\n" +
            " <tr>\n" +
            " <td class=\"sxb1\"><a class=preart href=\"node_3.htm\"><span style='font-size:12px;font-family:webdings'>4</span>下一版</a></td>\n" +
            " <td align=\"center\" class=\"sxb2\"><a href=../../1/2017-07/22/1/201707221_pdf.pdf><IMG height=16 src=\"../../../tplimg/pdf.gif\" width=16 border=0></a></td>\n" +
            " </tr>\n" +
            " </table>\n" +
            " \n" +
            " \n" +
            "</div>\n" +
            "\n" +
            "\n" +
            " <!--左栏结束 中栏开始 -->\n" +
            "<div class=\"w344\">\n" +
            "<div class=\"h80\"></div>\n" +
            "<p class=\"rq\">2017年7月22日　星期<font class=weekday>六</font></p>\n" +
            "<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"bm00\">\n" +
            " <tr>\n" +
            " <td class=\"bm01\">第1版　　　　　　　　　　　　<span>要闻</span></td>\n" +
            " </tr>\n" +
            " <tr>\n" +
            " <td class=\"bm02\">\n" +
            "\t<div class=\"gundong\">\n" +
            "\t<ul class=\"list01\"> <li><a href=content_52014.htm><div id=mp52014>铭记光辉历史 传承红色基因 为把人民军队建设成为世界一流军队而不懈奋斗</div></a> </li> <li><a href=content_52016.htm><div id=mp52016>重庆：坚定不移深化政治巡视</div></a> </li> <li><a href=content_52020.htm><div id=mp52020>中国证监会原党委委员、主席助理张育军严重违纪被开除党籍和公职</div></a> </li> <li><a href=content_52018.htm><div id=mp52018>上海：对标规则加强自我监督</div></a> </li> <li><a href=content_52019.htm><div id=mp52019>这则通报有深意，当引以为鉴举一反三</div></a> </li> <li><a href=content_52015.htm><div id=mp52015>百余家中央部门集中晒“花钱清单”</div></a> </li> <li><a href=content_52017.htm><div id=mp52017>江苏：推动巡视工作向纵深发展</div></a> </li> </ul> </div></td>\n" +
            " </tr>\n" +
            " <tr>\n" +
            " <td class=\"bm03\">&nbsp;</td>\n" +
            " </tr>\n" +
            "</table>\n" +
            "\n" +
            "<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"bm05\">\n" +
            " <tr>\n" +
            " <td class=\"bm06\">今日关注</td>\n" +
            " </tr>\n" +
            " <tr>\n" +
            " <td class=\"bm02\">\n" +
            "\t <div class=\"bm07\">\n" +
            "\t <table cellspacing=0 cellpadding=0 border=0><tbody> <tr><td class=px12 align=left> <a href=content_52014.htm><div id=mp52014>铭记光辉历史 传承红色基因 为把人民军队建设成为世界一流军队而不懈奋斗</div></a> </td></tr> <tr><td class=px12 align=left> <a href=content_52016.htm><div id=mp52016>重庆：坚定不移深化政治巡视</div></a> </td></tr> </tbody></table> \n" +
            "\t <table cellspacing=0 cellpadding=0 border=0><tbody> <tr><td class=px12 align=left> <a href=content_52022.htm><div id=mp52022>管好身边人 严防“灯下黑”</div></a> </td></tr> </tbody></table> \n" +
            "\t <table cellspacing=0 cellpadding=0 border=0><tbody> <tr><td class=px12 align=left> <a href=content_52028.htm><div id=mp52028>昆明：严格日常管理 规范监督执纪</div></a> </td></tr> </tbody></table> \n" +
            "\t <table cellspacing=0 cellpadding=0 border=0><tbody> <tr><td class=px12 align=left> <a href=content_52041.htm><div id=mp52041>完善条例 巡视再出发</div></a> </td></tr> <tr><td class=px12 align=left> <a href=content_52044.htm><div id=mp52044>利剑锋从磨砺出</div></a> </td></tr> </tbody></table> \n" +
            "\t <table cellspacing=0 cellpadding=0 border=0><tbody> </tbody></table> \n" +
            "\t <table cellspacing=0 cellpadding=0 border=0><tbody> </tbody></table> \n" +
            "\t <table cellspacing=0 cellpadding=0 border=0><tbody> </tbody></table> \n" +
            "\t <table cellspacing=0 cellpadding=0 border=0><tbody> </tbody></table> \n" +
            "\t <table cellspacing=0 cellpadding=0 border=0><tbody> <tr><td class=px12 align=left> <a href=content_52020.htm><div id=mp52020>中国证监会原党委委员、主席助理张育军严重违纪被开除党籍和公职</div></a> </td></tr> </tbody></table> \n" +
            "\t <table cellspacing=0 cellpadding=0 border=0><tbody> <tr><td class=px12 align=left> <a href=content_52023.htm><div id=mp52023>对胆敢向扶贫物资动心思的严惩不贷</div></a> </td></tr> </tbody></table> \n" +
            "\t <table cellspacing=0 cellpadding=0 border=0><tbody> <tr><td class=px12 align=left> <a href=content_52029.htm><div id=mp52029>讷于言 勿怯言</div></a> </td></tr> </tbody></table> \n" +
            "\t <table cellspacing=0 cellpadding=0 border=0><tbody> <tr><td class=px12 align=left> <a href=content_52042.htm><div id=mp52042>多走出办公室接接地气</div></a> </td></tr> </tbody></table> \n" +
            "\t </div></td>\n" +
            " </tr>\n" +
            " <tr>\n" +
            " <td class=\"bm03\"></td>\n" +
            " </tr>\n" +
            "</table>\n" +
            "</div>\n" +
            "<!--中栏结束 右栏开始-->\n" +
            "<div class=\"w250\">\n" +
            "<div class=\"h80\"></div>\n" +
            "<table width=\"250\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"rq\">\n" +
            " <tr>\n" +
            " <td class=\"sqq\"><a class=preart href=\"../21/node_2.htm\"><FONT face=Webdings>3</FONT>上一期</a></td>\n" +
            " </tr>\n" +
            "</table>\n" +
            "\n" +
            "<table width=100% border=0 align=\"center\" cellpadding=0 cellspacing=0>\n" +
            "\n" +
            " <tr>\n" +
            " <td><script language=JavaScript>\n" +
            "<!--\n" +
            "document.write(\"<div id=detail style=position:absolute;width:300px;></div>\");\n" +
            "//-->\n" +
            " </script>\n" +
            " <table width=\"100%\" border=0 align=\"right\" cellpadding=0 cellspacing=0 style=\"margin-top:15px;\">\n" +
            " <tr align=\"center\">\n" +
            " <td><table width=\"250\" height=\"100\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n" +
            " <tr>\n" +
            " <td height=\"33\" colspan=\"2\" align=\"left\" bgcolor=\"#FFFFFF\"><form name=CLD style=\"padding:0px;margin:0px;\">\n" +
            " <table cellspacing=0 cellpadding=0 width=\"100%\" align=center border=0>\n" +
            " <tr>\n" +
            " <td><table width=\"250\" align=center border=\"0\" cellpadding=\"0\" cellspacing=\"1\" style=\"background:#FFFFFF;\">\n" +
            " <tr class=\"default\" align=center>\n" +
            " <td colspan=7 height=\"36\" style=\"background:#f7faff;\" valign=\"top\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" height=\"28\" style=\"border:1px solid #d4d4d4;\" class=\"rq2\">\n" +
            " <tr align=\"center\">\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t <td width=\"30\">&nbsp;</td>\n" +
            " <td align=\"left\"><img src=\"../../../tplimg/d1.gif\" width=\"7\" height=\"11\" style=\"cursor:hand;\" onClick=\"turnpage(SY,0)\"></td>\n" +
            " <td><select class=jumpmenu onChange=changeMPCld() name=SY>\n" +
            " <script language=JavaScript>\n" +
            "\t\t\t\t\tfor(i=2010;i<2021;i++)\n" +
            "\t\t\t\t\tdocument.write('<option>'+i+'</option>')\n" +
            " \t\t\t </script>\n" +
            " </select> </td>\n" +
            " <td><img src=\"../../../tplimg/d.gif\" width=\"7\" height=\"11\" style=\"cursor:hand;\" onClick=\"turnpage(SY,1)\"></td>\n" +
            " <td align=\"center\" nowrap><img src=\"../../../tplimg/d1.gif\" width=\"7\" height=\"11\" style=\"cursor:hand;\" onClick=\"turnpage(SM,0)\"></td>\n" +
            " <td><select class=jumpmenu onChange=changeMPCld() name=SM>\n" +
            " <script language=JavaScript>\n" +
            "\t\t\t\t<!-- \n" +
            "\t\t\t\t\tfor(i=1;i<13;i++) document.write('<option>'+i+'</option>')\n" +
            "\t\t\t\t//-->\n" +
            " \t\t\t </script>\n" +
            " </select> </td>\n" +
            " <td><img src=\"../../../tplimg/d.gif\" width=\"7\" height=\"11\" style=\"cursor:hand;\" onClick=\"turnpage(SM,1)\"></td>\n" +
            " <td align=\"right\"><strong><font id=GZ fface=\"Arial, Helvetica, sans-serif\"></font></strong></td>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"30\">&nbsp;</td>\n" +
            " </tr>\n" +
            " </table>\n" +
            "\t\t\t\t\t\t\t\t\t\t\t \n" +
            "\t\t\t\t\t\t\t\t\t\t\t </td>\n" +
            " </tr>\n" +
            " <tr align=middle bgcolor=\"#e8e8e8\" class=\"default\" style=\"line-height:22px;\">\n" +
            " <td align=\"center\" class=\"default\"><b><font face=\"Arial, Helvetica, sans-serif\">日</font></b></td>\n" +
            " <td align=\"center\" class=\"default\"><b><font face=\"Arial, Helvetica, sans-serif\">一</font></b></td>\n" +
            " <td align=\"center\" class=\"default\"><b><font face=\"Arial, Helvetica, sans-serif\">二</font></b></td>\n" +
            " <td align=\"center\" class=\"default\"><b><font face=\"Arial, Helvetica, sans-serif\">三</font></b></td>\n" +
            " <td align=\"center\" class=\"default\"><b><font face=\"Arial, Helvetica, sans-serif\">四</font></b></td>\n" +
            " <td align=\"center\" class=\"default\"><b><font face=\"Arial, Helvetica, sans-serif\">五</font></b></td>\n" +
            " <td align=\"center\" class=\"default\"><b><font face=\"Arial, Helvetica, sans-serif\">六</font></b> </td>\n" +
            " </tr>\n" +
            " <script language=JavaScript>\n" +
            "\t\t<!--\n" +
            "\t\t\tvar gNum;\n" +
            "\t\t\tfor(i=0;i<6;i++) \n" +
            "\t\t\t{\n" +
            "\t\t\t\tdocument.write('<tr align=center style=\"line-height:20px;\">');\n" +
            "\t\t\t\tfor(j=0;j<7;j++) \n" +
            "\t\t\t\t{\n" +
            "\t\t\t\t\tgNum = i*7+j;\n" +
            "\t\t\t\t\tdocument.write('<td bgcolor=\"#d2d2d2\" class=\"default\" align=center id=\"GD' + gNum +'\" style=\"cursor: default;\" width=\"14%\"><a href=\"\" id=\"CD' + gNum + '\"><span class=\"date\" style=\"font-family:Verdana, Arial;font-size:11px;\"><font _onMouseOver=\"mOvr(' + gNum +')\" onMouseOut=\"mOut()\" id=\"SD' + gNum +'\"');\n" +
            "\t\t\t\t\tdocument.write('></font></span></a><br><font id=\"LD' + gNum + '\" size=2 class=pt9 style=display:none></font></td>');\n" +
            "\t\t\t\t}\n" +
            "\t\t\t\tdocument.write('</tr>');\n" +
            "\t\t\t}\n" +
            "\t\t//-->\n" +
            " \t </script>\n" +
            " </table></td>\n" +
            " </tr>\n" +
            " </table>\n" +
            " </form></td>\n" +
            " </tr>\n" +
            " </table></td>\n" +
            " </tr>\n" +
            " </table></td>\n" +
            " </tr>\n" +
            " </table>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\t\n" +
            "\n" +
            "\n" +
            "<div style=\"clear:both;height:6px;\"></div>\n" +
            "<div class=\"search\">站内检索</div>\n" +
            "<form name=\"form1\" action=\"http://www.jjjcb.cn/search/servlet/SearchServlet.do\" onSubmit=\"per_submit();\" method=\"POST\" style=\"margin:0px; padding:0px\" target=\"_blank\">\n" +
            "<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
            " <tr>\n" +
            " <td><input name=\"contentKey\" id=\"contentKey\" type=\"text\" size=\"50\" maxlength=\"50\" style=\"width:200px;\">\n" +
            "\t \t</td>\n" +
            " <td><label>\n" +
            " <input type=\"button\" value=\"搜索\" name=\"search\" onClick=\"javascript:per_submit()\"> \n" +
            "\t \t<input type=\"hidden\" name=\"op\" value=\"<%=Constants.SEARCHMODE_SINGLE%>\">\n" +
            "\t \t<input type=\"hidden\" name=\"siteID\" value=\"\">\n" +
            "\t\t\t\t\t<input type=\"hidden\" name=\"sort\" value=\"date\">\n" +
            " </label></td>\n" +
            " </tr>\n" +
            "</table>\n" +
            "</form>\n" +
            "\n" +
            "\n" +
            "<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"border:1px solid #c0c0c0;\" class=\"mulu03\">\n" +
            "<tr>\n" +
            "<td class=\"mulu02\">版面目录</td>\n" +
            "</tr>\n" +
            " <tr>\n" +
            " <td height=\"240\" valign=\"top\" class=\"mulu04\"> <table cellspacing=0 cellpadding=2 width=100% border=0><tbody> <tr bgcolor=#ffffff> <td class=default2 align=left>&nbsp;<a id=pageLink href=./node_2.htm>第1版：要闻</a></td> <td nowrap align=middle width=55><a href=../../1/2017-07/22/1/201707221_pdf.pdf><img height=16 src=\"../../../tplimg/pdf.gif\" width=16 border=0></a></td></tr> <tr bgcolor=#e8e8e8> <td align=left class=default2>&nbsp;<a id=pageLink href=node_3.htm>第2版：综合新闻</a></td> <td nowrap align=middle width=55><a href=../../1/2017-07/22/2/201707222_pdf.pdf><img height=16 src=\"../../../tplimg/pdf.gif\" width=16 border=0></a></td></tr> <tr bgcolor=#ffffff> <td class=default2 align=left>&nbsp;<a id=pageLink href=node_4.htm>第3版：队伍建设</a></td> <td nowrap align=middle width=55><a href=../../1/2017-07/22/3/201707223_pdf.pdf><img height=16 src=\"../../../tplimg/pdf.gif\" width=16 border=0></a></td></tr> <tr bgcolor=#e8e8e8> <td align=left class=default2>&nbsp;<a id=pageLink href=node_5.htm>第4版：反腐观察</a></td> <td nowrap align=middle width=55><a href=../../1/2017-07/22/4/201707224_pdf.pdf><img height=16 src=\"../../../tplimg/pdf.gif\" width=16 border=0></a></td></tr> </tbody></table> </td>\n" +
            " </tr>\n" +
            "</table>\n" +
            "\n" +
            "<p class=\"ad01\"><a href=\"http://www.jjjcb.cn/content5.html\" target=\"_blank\"><img src=\"../../../tplimg/test01.jpg\" width=\"250\" height=\"50\" /></a></p>\n" +
            "<p class=\"ad01\"><a href=\"http://www.ccdi.gov.cn\" target=\"_blank\"><img src=\"../../../tplimg/test02.jpg\" width=\"250\" height=\"50\" /></a></p>\n" +
            "</div>\n" +
            "<div style=\"clear:both;\"></div>\n" +
            "<!--版权信息开始-->\n" +
            "\n" +
            "<div class=\"copy\"><a href=\"http://www.jjjcb.cn/content1.html\" target=\"_blank\">关于我们</a> | <a href=\"http://www.jjjcb.cn/content2.html\" target=\"_blank\">报纸征订</a> | <a href=\"http://www.jjjcb.cn/content3.html\" target=\"_blank\">投稿方式</a> | <a href=\"http://www.jjjcb.cn/content4.html\" target=\"_blank\">版权声明</a><br />\n" +
            "主办单位：中国纪检监察报社 | 通讯地址：北京市西城区广安门南街甲2号\n" +
            "</div>\n" +
            "\n" +
            "\n" +
            "\n" +
            "</div>\n" +
            "\n" +
            "<div class=\"shengming\"><p>版权声明：《中国纪检监察报》刊发的所有作品，版权均属于中国纪检监察报社。未经报社书面授权，任何单位及个人不得将《中国纪检监察报》刊发的内容用于商业用途。如进行转载、摘编，必须在报社书面授权范围内使用，并注明作品来源“中国纪检监察报”以及相关作者信息。违反上述声明者，中国纪检监察报社将追究其相关法律责任。作品内容、版权和其它问题，请邮件联系jjjcbzbs@126.com。</p></div>\n" +
            "\n" +
            "<div class=\"result_list\" style=\"display:none;\"></div>\n" +
            "</body>\n" +
            "<script>\n" +
            "var _hmt = _hmt || [];\n" +
            "(function() {\n" +
            " var hm = document.createElement(\"script\");\n" +
            " hm.src = \"//hm.baidu.com/hm.js?c01959264164f13ffdc5ade47b27fff1\";\n" +
            " var s = document.getElementsByTagName(\"script\")[0]; \n" +
            " s.parentNode.insertBefore(hm, s);\n" +
            "})();\n" +
            "</script>\n" +
            "\n" +
            "</html>\n" +
            "<!--enpproperty <founder-date>2017-07-22 23:59:59</founder-date><founder-pagenum>1</founder-pagenum><founder-papername>中国纪检监察报</founder-papername><founder-type>2</founder-type><founder-pagepicurl>jjjcb/page/1/2017-07/22/1/201707221_icon.jpg</founder-pagepicurl><founder-content>中国纪检监察报</founder-content> /enpproperty-->";

}
