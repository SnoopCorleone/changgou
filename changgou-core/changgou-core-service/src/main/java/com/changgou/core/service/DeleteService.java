package com.changgou.core.service;

/**
 * 删除相关
 *
 * @author www.itheima.com
 * @version 1.0
 * @package com.changgou.core *
 * @since 1.0
 */
public interface DeleteService<T> {

    /**
     * 根据条件删除
     *
     * @param record
     * @return
     */
    int delete(T record);

    /**
     * 根据ID 删除
     *
     * @param id
     * @return
     */
    int deleteById(Object id);


    interface InsertListService {
    }
}
