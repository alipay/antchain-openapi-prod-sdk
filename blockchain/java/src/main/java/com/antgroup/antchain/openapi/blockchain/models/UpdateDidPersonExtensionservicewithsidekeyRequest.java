// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateDidPersonExtensionservicewithsidekeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 新增的外键
    @NameInMap("add_indexs")
    public java.util.List<String> addIndexs;

    // 去掉哪些外键
    @NameInMap("delete_indexs")
    public java.util.List<String> deleteIndexs;

    // 需要更新的did doc对应的did字段；该did必须为调用者自己的did，或者托管给调用者的did
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 修改后的全量扩展字段
    // 
    @NameInMap("extension")
    @Validation(required = true)
    public String extension;

    // 场景码，找dis工作人员进行分配
    @NameInMap("biz_code")
    public String bizCode;

    public static UpdateDidPersonExtensionservicewithsidekeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDidPersonExtensionservicewithsidekeyRequest self = new UpdateDidPersonExtensionservicewithsidekeyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDidPersonExtensionservicewithsidekeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDidPersonExtensionservicewithsidekeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDidPersonExtensionservicewithsidekeyRequest setAddIndexs(java.util.List<String> addIndexs) {
        this.addIndexs = addIndexs;
        return this;
    }
    public java.util.List<String> getAddIndexs() {
        return this.addIndexs;
    }

    public UpdateDidPersonExtensionservicewithsidekeyRequest setDeleteIndexs(java.util.List<String> deleteIndexs) {
        this.deleteIndexs = deleteIndexs;
        return this;
    }
    public java.util.List<String> getDeleteIndexs() {
        return this.deleteIndexs;
    }

    public UpdateDidPersonExtensionservicewithsidekeyRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public UpdateDidPersonExtensionservicewithsidekeyRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public UpdateDidPersonExtensionservicewithsidekeyRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
