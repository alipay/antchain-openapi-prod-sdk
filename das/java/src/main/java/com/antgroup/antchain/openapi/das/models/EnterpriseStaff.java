// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class EnterpriseStaff extends TeaModel {
    // 主要人员名称
    /**
     * <strong>example:</strong>
     * <p>李*东</p>
     */
    @NameInMap("name")
    public String name;

    // 法人类型，1-人;2-公司
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("type")
    public String type;

    // 经理
    /**
     * <strong>example:</strong>
     * <p>职位</p>
     */
    @NameInMap("type_join")
    public java.util.List<String> typeJoin;

    public static EnterpriseStaff build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseStaff self = new EnterpriseStaff();
        return TeaModel.build(map, self);
    }

    public EnterpriseStaff setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EnterpriseStaff setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public EnterpriseStaff setTypeJoin(java.util.List<String> typeJoin) {
        this.typeJoin = typeJoin;
        return this;
    }
    public java.util.List<String> getTypeJoin() {
        return this.typeJoin;
    }

}
