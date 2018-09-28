package com.gj.service;

import com.gj.domain.Persion;

import java.util.List;

/**
 * @Author dye
 * @Description Persion业务接口层
 * @Date 2018/9/28
 **/
public interface PersionService {

    /**
     * 获取所有的persion
     *
     * @return
     */
    List<Persion> findAll();

    /**
     * 新增Persion
     *
     * @param persion
     * @return
     */
    Persion insertByPersion(Persion persion);

    /**
     * 更新 Persion
     *
     * @param persion
     * @return
     */
    Persion update(Persion persion);

    /**
     * 获取 Persion
     *
     * @param id 编号
     * @return
     */
    Persion findById(Long id);

    /**
     * 删除 Persion
     *
     * @param id 编号
     * @return
     */
    Persion delete(Long id);
}
