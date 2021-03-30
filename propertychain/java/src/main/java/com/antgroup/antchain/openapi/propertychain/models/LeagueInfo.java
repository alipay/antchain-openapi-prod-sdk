// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class LeagueInfo extends TeaModel {
    // 时间
    @NameInMap("create_time")
    public Long createTime;

    // 联盟id
    @NameInMap("league_id")
    public String leagueId;

    // 联盟名称
    @NameInMap("league_name")
    public String leagueName;

    // 联盟描述
    @NameInMap("league_desc")
    public String leagueDesc;

    // 联盟对应的物权平台产品
    @NameInMap("product_version")
    public String productVersion;

    public static LeagueInfo build(java.util.Map<String, ?> map) throws Exception {
        LeagueInfo self = new LeagueInfo();
        return TeaModel.build(map, self);
    }

    public LeagueInfo setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public LeagueInfo setLeagueId(String leagueId) {
        this.leagueId = leagueId;
        return this;
    }
    public String getLeagueId() {
        return this.leagueId;
    }

    public LeagueInfo setLeagueName(String leagueName) {
        this.leagueName = leagueName;
        return this;
    }
    public String getLeagueName() {
        return this.leagueName;
    }

    public LeagueInfo setLeagueDesc(String leagueDesc) {
        this.leagueDesc = leagueDesc;
        return this;
    }
    public String getLeagueDesc() {
        return this.leagueDesc;
    }

    public LeagueInfo setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public String getProductVersion() {
        return this.productVersion;
    }

}
