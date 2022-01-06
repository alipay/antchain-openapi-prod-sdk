// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ServiceRecord extends TeaModel {
    // 服务标识
    @NameInMap("data_id")
    public String dataId;

    public static ServiceRecord build(java.util.Map<String, ?> map) throws Exception {
        ServiceRecord self = new ServiceRecord();
        return TeaModel.build(map, self);
    }

    public ServiceRecord setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
