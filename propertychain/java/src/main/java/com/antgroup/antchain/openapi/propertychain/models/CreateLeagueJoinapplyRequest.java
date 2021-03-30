// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CreateLeagueJoinapplyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 备注
    @NameInMap("comment")
    public String comment;

    // 联盟Id
    @NameInMap("league_id")
    @Validation(required = true)
    public String leagueId;

    // 角色【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
    @NameInMap("role_type")
    @Validation(required = true)
    public String roleType;

    public static CreateLeagueJoinapplyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeagueJoinapplyRequest self = new CreateLeagueJoinapplyRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeagueJoinapplyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeagueJoinapplyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeagueJoinapplyRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateLeagueJoinapplyRequest setLeagueId(String leagueId) {
        this.leagueId = leagueId;
        return this;
    }
    public String getLeagueId() {
        return this.leagueId;
    }

    public CreateLeagueJoinapplyRequest setRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }
    public String getRoleType() {
        return this.roleType;
    }

}
