// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ServiceRelation extends TeaModel {
    // 应用名
    @NameInMap("app_name")
    public String appName;

    // 服务id
    @NameInMap("data_id")
    public String dataId;

    public static ServiceRelation build(java.util.Map<String, ?> map) throws Exception {
        ServiceRelation self = new ServiceRelation();
        return TeaModel.build(map, self);
    }

    public ServiceRelation setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ServiceRelation setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
