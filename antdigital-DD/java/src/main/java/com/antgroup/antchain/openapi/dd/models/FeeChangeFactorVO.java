// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class FeeChangeFactorVO extends TeaModel {
    // 哪个字段变更
    /**
     * <strong>example:</strong>
     * <p>newFeeEntity.field</p>
     */
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 改变类型
    /**
     * <strong>example:</strong>
     * <p>UPDATE,ADD,DELETE</p>
     */
    @NameInMap("change_type")
    @Validation(required = true)
    public String changeType;

    public static FeeChangeFactorVO build(java.util.Map<String, ?> map) throws Exception {
        FeeChangeFactorVO self = new FeeChangeFactorVO();
        return TeaModel.build(map, self);
    }

    public FeeChangeFactorVO setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public FeeChangeFactorVO setChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }
    public String getChangeType() {
        return this.changeType;
    }

}
