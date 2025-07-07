// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class EntityInfo extends TeaModel {
    // 0，身份证；1，电话；2，email，3，企业营业执照号
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // 具体号码
    /**
     * <strong>example:</strong>
     * <p>18701507222</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static EntityInfo build(java.util.Map<String, ?> map) throws Exception {
        EntityInfo self = new EntityInfo();
        return TeaModel.build(map, self);
    }

    public EntityInfo setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public EntityInfo setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
