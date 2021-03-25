// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class OfflineConsumecardAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequest baseRequest;

    // 附言(长度不要超过500个字符)
    @NameInMap("remark")
    public String remark;

    public static OfflineConsumecardAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineConsumecardAccountRequest self = new OfflineConsumecardAccountRequest();
        return TeaModel.build(map, self);
    }

    public OfflineConsumecardAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OfflineConsumecardAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OfflineConsumecardAccountRequest setBaseRequest(BaseRequest baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public OfflineConsumecardAccountRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
