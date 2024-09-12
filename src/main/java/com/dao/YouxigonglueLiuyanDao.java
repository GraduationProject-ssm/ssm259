package com.dao;

import com.entity.YouxigonglueLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxigonglueLiuyanView;

/**
 * 攻略留言 Dao 接口
 *
 * @author 
 * @since 2021-04-20
 */
public interface YouxigonglueLiuyanDao extends BaseMapper<YouxigonglueLiuyanEntity> {

   List<YouxigonglueLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}