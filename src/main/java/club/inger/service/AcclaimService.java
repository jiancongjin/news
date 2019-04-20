package club.inger.service;

import club.inger.dto.ResultObject;
import club.inger.entity.Comment;
import club.inger.entity.Zan;

/**
 * Created by inger on 2019/4/14.
 */
public interface AcclaimService {
    public ResultObject updateAcclaim(int type, Zan zan);
    public ResultObject cancelAcclaim(int type,  Zan zan);

}
