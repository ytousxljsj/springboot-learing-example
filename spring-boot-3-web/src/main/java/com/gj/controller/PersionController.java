package com.gj.controller;

import com.gj.domain.Persion;
import com.gj.service.PersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author dye
 * @Description TODO
 * @Date 2018/9/28
 **/
@RestController
@RequestMapping(value = "/persion")
public class PersionController {

    @Autowired
    PersionService persionService;

    /**
     * 获取 Persion列表
     * 处理"/persion"的GET请求，用来获取Persion列表
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<Persion> getPersionAll() {
        return persionService.findAll();
    }

    /**
     * 创建 Persion
     * 处理"/persion/create"的POST请求，用来新建Persion信息
     * 通过@RequestBody绑定实体参数，也可以通过@RequestParam 传递参数
     *
     * @return
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Persion postPersion(@RequestBody Persion persion) {
        return persionService.insertByPersion(persion);
    }

    /**
     * 更新 Persion
     * 处理"/update"的PUT请求，用来更新 Persion
     *
     * @param persion
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Persion putPersion(@RequestBody Persion persion) {
        return persionService.update(persion);
    }

    /**
     * 获取 Persion
     * 处理"/persion/{id}" 的 GET请求，用来获取 Persion
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Persion getPersion(@PathVariable Long id) {
        return persionService.findById(id);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public Persion deletePersion(@PathVariable Long id) {
        return persionService.delete(id);
    }
}
