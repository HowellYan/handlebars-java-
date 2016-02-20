package cn.pojo.test.showView;
import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.google.common.collect.Maps;

import java.io.IOException;
import java.util.Map;



/**
 * Created by Howell on 16/1/29.
 */
public class showView {
    public static void main(String[] agrs){
        Handlebars handlebars = new Handlebars();
        Template template = null;
        try {
            template = handlebars.compileInline("Hello {{_ID_}} {{_NAME_}}!");


            Map<String, Object> params =  Maps.newHashMap();

            ((Map)params).put("_ID_", "Hi!");
            ((Map)params).put("_NAME_", "Yang!");

            System.out.println(template.apply(params));


        } catch (IOException e) {
            System.out.print(e.getMessage().toString());
        }


    }

}
