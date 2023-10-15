package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author liwenfneg
 * @email liwenfeng@gmail.com
 * @date 2023-10-15 19:39:18
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
