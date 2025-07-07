// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ApplicationPageListResp extends TeaModel {
    // 应用标识
    /**
     * <strong>example:</strong>
     * <p>app20230725115808679d4f</p>
     */
    @NameInMap("application_id")
    public String applicationId;

    // 链ID
    /**
     * <strong>example:</strong>
     * <p>284f75bc-8069-443f-9d46-4576bb15f210</p>
     */
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
