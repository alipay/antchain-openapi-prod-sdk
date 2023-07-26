// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ApplicationListResp extends TeaModel {
    // 应用程序ID
    @NameInMap("application_id")
    public String applicationId;

    // 链ID
    @NameInMap("access_key")
    public String accessKey;

    // 合约(创建实例时填写的合约名称。)
    @NameInMap("name_list")
    public java.util.List<String> nameList;

    public static ApplicationListResp build(java.util.Map<String, ?> map) throws Exception {
        ApplicationListResp self = new ApplicationListResp();
        return TeaModel.build(map, self);
    }

    public ApplicationListResp setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ApplicationListResp setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public ApplicationListResp setNameList(java.util.List<String> nameList) {
        this.nameList = nameList;
        return this;
    }
    public java.util.List<String> getNameList() {
        return this.nameList;
    }

}
