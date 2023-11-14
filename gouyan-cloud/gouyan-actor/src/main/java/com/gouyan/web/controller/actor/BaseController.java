package com.gouyan.web.controller.actor;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gouyan.common.page.Page;
import com.gouyan.common.page.PageBuilder;
import com.gouyan.common.response.ResponseResult;

import java.util.List;

import static com.gouyan.common.page.PageBuilder.*;

/**
 * 抽取重复功能为基类
 * @Author: xianxian
 * @Create: 2020-11-19 17:37
 */
public class BaseController {

    /**
     * 开启分页
     */
    public void startPage(){
        Page page = PageBuilder.buildPage();
        Integer pageNum = page.getPageNum();
        Integer pageSize = page.getPageSize();
        if(pageNum != null && pageSize != null){
            PageHelper.startPage(pageNum, pageSize, page.getOrderByColumn());
        }
    }

    /**
     * 根据修改行数返回响应消息
     * @param rows
     * @return
     */
    public ResponseResult getResult(int rows){
        return rows == 0 ? ResponseResult.error() : ResponseResult.success();
    }

    /**
     * 分页响应消息
     * @param data
     * @return
     */
    public ResponseResult getResult(List<?> data){
        PageInfo pageInfo = new PageInfo(data);
        ResponseResult responseResult = ResponseResult.success(data);
        responseResult.put(PAGE_NUM, pageInfo.getPageNum());
        responseResult.put(PAGE_SIZE, pageInfo.getPageSize());
        responseResult.put(TOTAL, pageInfo.getTotal());
        return responseResult;
    }

    /**
     * 对象类型响应消息
     * @param data
     * @return
     */
    public ResponseResult getResult(Object data){
        return ResponseResult.success(data);
    }

}
