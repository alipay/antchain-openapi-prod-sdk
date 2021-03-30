// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class RoleRatio extends TeaModel {
    // 角色编号
    // 角色编号类型
    // 风险承担方：RISK_TAKER
    // 货物监管方：CARGO_SUPERVISION
    // 资金推荐方：CAPITAL_RECOMMEND
    // 融资推荐方：FUNDER_RECOMMEND
    // 运营管理方：MANAGEMENT
    // 技术支持方：TECHNICAL
    @NameInMap("role_code")
    @Validation(required = true)
    public String roleCode;

    // 分润比例，保留两位小数的百分比
    @NameInMap("ratio")
    @Validation(required = true)
    public String ratio;

    public static RoleRatio build(java.util.Map<String, ?> map) throws Exception {
        RoleRatio self = new RoleRatio();
        return TeaModel.build(map, self);
    }

    public RoleRatio setRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }
    public String getRoleCode() {
        return this.roleCode;
    }

    public RoleRatio setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

}
