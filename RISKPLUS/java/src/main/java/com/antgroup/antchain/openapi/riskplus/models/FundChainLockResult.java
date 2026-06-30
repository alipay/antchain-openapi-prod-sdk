// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class FundChainLockResult extends TeaModel {
    // 店铺名称
    /**
     * <strong>example:</strong>
     * <p>某店铺</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 店铺id
    /**
     * <strong>example:</strong>
     * <p>2022091300001</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 0:成功
    // 1:失败
    // 2:处理中
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static FundChainLockResult build(java.util.Map<String, ?> map) throws Exception {
        FundChainLockResult self = new FundChainLockResult();
        return TeaModel.build(map, self);
    }

    public FundChainLockResult setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FundChainLockResult setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public FundChainLockResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
