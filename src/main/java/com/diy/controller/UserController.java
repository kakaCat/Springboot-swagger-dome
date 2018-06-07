package com.diy.controller;

import com.diy.entity.User;
import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by JAVA on 2018/6/6.
 */
/**
 * @Api value -> 修改类的名称
 *      description -> 对这个类的描述
 *
 *
 */


@Api(description = "用户管理") //描述一个类的注解value = "用户管理" ,
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * @ApiOperation    value    -> 方法的名称
     *                  notes    -> 方法的描述
     *                  tags     -> 可以替代类的名称
     *                  response -> 返回参数
     */
    /**
     *@ApiImplicitParams
     *
     *  @ApiImplicitParam     value              -> 参数的描述
     *                       name               -> 传参的对象的名称
     *                       paramType          -> 传参的对象的类型
     *                       (header->@RequestHeader
     *                       query->@RequestParam (非restful)
     *                       path->@PathVariable  (restful)
     *                       body->@RequestBody   (数据放到请求体)
     *                       form->表单
     *                       )
     *                       dataType           -> 传参的数据类型
     *                       response           -> 返回参数
     *                       responseContainer  -> 返回集合形式
     */
    @ApiOperation(
            value = "用户添加",
            notes = "注意点",

            response = User.class,
            responseContainer = "list"
//            produces = MediaType.APPLICATION_JSON_VALUE
            )
    @ApiImplicitParams({
            @ApiImplicitParam( name = "req",value = "信息参数" , paramType = "body",dataType = "string",
                    defaultValue = "{\n" +
                            "  \"id\": 0,\n" +
                            "  \"username\": \"string\"\n" +
                            "}")

    })
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Object addUser(@RequestBody String req){

        return req;
    }


    @ApiOperation(
            value = "用户添加",
            notes = "注意点",

            response = User.class

    )
    @ApiImplicitParams({
            @ApiImplicitParam( name = "user",value = "信息参数" , paramType = "body",dataType =  "User.class",
                    defaultValue = "{\n" +
                            "  \"id\": 0,\n" +
                            "  \"username\": \"string\"\n" +
                            "}")

    })
    @PostMapping("/update")
    public Object update(@RequestBody User user){

        return user;
    }




    @ApiOperation(
            value = "获取",
            notes = "注意点",
            response = User.class
            )
    @ApiImplicitParams({
            @ApiImplicitParam( name = "id",value = "主键id" , paramType = "path",dataType = "string",
                    defaultValue = "2222")

    })
    @GetMapping("/getUser/{id}")
    public Object getUser(@PathVariable String id){

        return id;
    }

    @ApiOperation(
            value = "获取",
            notes = "注意点",
            response = User.class
    )
    @ApiImplicitParams({
            @ApiImplicitParam( name = "id",value = "主键id" , paramType = "query",dataType = "string", defaultValue = "2222")

    })
    @GetMapping("/getUser")
    public Object get(HttpServletRequest req){
        String id =req.getParameter("id");
        return id;
    }


}
