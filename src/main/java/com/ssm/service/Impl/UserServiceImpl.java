package com.ssm.service.Impl;

import com.ssm.domain.TbScore;
import com.ssm.mapper.TbScoreMapper;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @date 2018/7/8 15:06
 *
 * @since jiangjun
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private TbScoreMapper tbScoreMapper;
    @Override
    public List<TbScore> selectScore() {
        List<TbScore> list = tbScoreMapper.selectScore();

        // TODO 此处代码未完结
        return list;
    }
}
