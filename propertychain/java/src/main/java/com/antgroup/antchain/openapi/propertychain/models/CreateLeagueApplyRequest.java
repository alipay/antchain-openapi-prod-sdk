// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CreateLeagueApplyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 联盟描述
    @NameInMap("league_desc")
    public String leagueDesc;

    // 联盟名称
    @NameInMap("league_name")
    @Validation(required = true)
    public String leagueName;

    // 费率
    @NameInMap("rate")
    public Long rate;

    // 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
    @NameInMap("role_type")
    @Validation(required = true)
    public String roleType;

    public static CreateLeagueApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeagueApplyRequest self = new CreateLeagueApplyRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeagueApplyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeagueApplyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeagueApplyRequest setLeagueDesc(String leagueDesc) {
        this.leagueDesc = leagueDesc;
        return this;
    }
    public String getLeagueDesc() {
        return this.leagueDesc;
    }

    public CreateLeagueApplyRequest setLeagueName(String leagueName) {
        this.leagueName = leagueName;
        return this;
    }
    public String getLeagueName() {
        return this.leagueName;
    }

    public CreateLeagueApplyRequest setRate(Long rate) {
        this.rate = rate;
        return this;
    }
    public Long getRate() {
        return this.rate;
    }

    public CreateLeagueApplyRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

}
