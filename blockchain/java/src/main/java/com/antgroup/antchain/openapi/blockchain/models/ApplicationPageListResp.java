// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ApplicationPageListResp extends TeaModel {
    // 应用标识
    @NameInMap("application_id")
    public String applicationId;

    // 链ID
    @NameInMap("access_key")
    public String accessKey;

    // 合约(创建实例时填写的合约名称。)
    @NameInMap("name_list")
    public java.util.List<String> nameList;

    public static ApplicationPageListResp build(java.util.Map<String, ?> map) throws Exception {
        ApplicationPageListResp self = new ApplicationPageListResp();
        return TeaModel.build(map, self);
    }

    public ApplicationPageListResp setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ApplicationPageListResp setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public ApplicationPageListResp setNameList(java.util.List<String> nameList) {
        this.nameList = nameList;
        return this;
    }
    public java.util.List<String> getNameList() {
        return this.nameList;
    }

}
