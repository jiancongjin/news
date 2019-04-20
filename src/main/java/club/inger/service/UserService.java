
package club.inger.service;

import club.inger.dto.ResponseData;

import club.inger.dto.ResultObject;
import club.inger.entity.Collect;
import club.inger.entity.NewsLogs;
import club.inger.entity.Users;
import org.springframework.stereotype.Service;


/**
 * Created by inger on 2019/4/3.
 */


public interface UserService {
    public ResultObject insertUser(Users users);
    public ResultObject saveHistory(NewsLogs hostory);
    public ResultObject updateCollect(Collect collect);

}

