// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class Data extends TeaModel {
    // provision数据
    /**
     * <strong>example:</strong>
     * <p>123XXX</p>
     */
    @NameInMap("provision_data")
    @Validation(required = true)
    public String provisionData;

    // 余量
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("remaining")
    public Long remaining;

    public static Data build(java.util.Map<String, ?> map) throws Exception {
        Data self = new Data();
        return TeaModel.build(map, self);
    }

    public Data setProvisionData(String provisionData) {
        this.provisionData = provisionData;
        return this;
    }
    public String getProvisionData() {
        return this.provisionData;
    }

    public Data setRemaining(Long remaining) {
        this.remaining = remaining;
        return this;
    }
    public Long getRemaining() {
        return this.remaining;
    }

}
