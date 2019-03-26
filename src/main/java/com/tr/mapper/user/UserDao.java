package com.tr.mapper.user;

import java.util.Map;

public interface UserDao {
    /**
     * 根基id查询
     * @param map
     * @return
     */
    public Map selectById(Map<String,Object> map);
}
