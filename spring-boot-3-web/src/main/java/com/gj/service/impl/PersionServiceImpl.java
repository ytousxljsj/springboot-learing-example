package com.gj.service.impl;

import com.gj.domain.Persion;
import com.gj.service.PersionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author dye
 * @Description Persion 业务层实现
 * @Date 2018/9/28
 **/
@Service
public class PersionServiceImpl implements PersionService {

    //模拟数据库，存储 Persion信息
    private static Map<Long, Persion> PERSION_DB = new HashMap<>();

    @Override
    public List<Persion> findAll() {
        return new ArrayList<>(PERSION_DB.values());
    }

    @Override
    public Persion insertByPersion(Persion persion) {
        persion.setId(PERSION_DB.size() + 1L);
        PERSION_DB.put(persion.getId(), persion);
        return persion;
    }

    @Override
    public Persion update(Persion persion) {
        persion.setId(PERSION_DB.size() + 1L);
        PERSION_DB.put(persion.getId(), persion);
        return persion;
    }

    @Override
    public Persion findById(Long id) {

        return PERSION_DB.get(id);
    }

    @Override
    public Persion delete(Long id) {
        return PERSION_DB.remove(id);
    }
}
