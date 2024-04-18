// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class RegisterTradeUsageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 标识某个服务实体的唯一ID，例如dciContentId
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 业务服务类型，例如DCI、存证等
    @NameInMap("service_type")
    @Validation(required = true)
    public String serviceType;

    // 扩展信息，JSON格式
    @NameInMap("ext_info")
    public String extInfo;

    // 调用方唯一业务标识
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    public static RegisterTradeUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterTradeUsageRequest self = new RegisterTradeUsageRequest();
        return TeaModel.build(map, self);
    }

    public RegisterTradeUsageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterTradeUsageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterTradeUsageRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public RegisterTradeUsageRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public RegisterTradeUsageRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public RegisterTradeUsageRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

}
