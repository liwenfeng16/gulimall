package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.BrandEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 品牌
 *
 * @author liwenfneg
 * @email liwenfeng@gmail.com
 * @date 2023-10-15 18:36:31
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

