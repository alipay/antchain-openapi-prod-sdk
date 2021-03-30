// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class ThirdPartyUser extends TeaModel {
    // 用户id
    @NameInMap("user_id")
    public String userId;

    // 用户名
    @NameInMap("user_name")
    public String userName;

    // 联盟id
    @NameInMap("league_uid")
    public String leagueUid;

    // 创建时间
    @NameInMap("create_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createTime;

    public static ThirdPartyUser build(java.util.Map<String, ?> map) throws Exception {
        ThirdPartyUser self = new ThirdPartyUser();
        return TeaModel.build(map, self);
    }

    public ThirdPartyUser setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ThirdPartyUser setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ThirdPartyUser setLeagueUid(String leagueUid) {
        this.leagueUid = leagueUid;
        return this;
    }
    public String getLeagueUid() {
        return this.leagueUid;
    }

    public ThirdPartyUser setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

}
