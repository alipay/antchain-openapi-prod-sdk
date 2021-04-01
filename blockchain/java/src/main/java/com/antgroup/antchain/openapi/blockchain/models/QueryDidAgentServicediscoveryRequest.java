// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDidAgentServicediscoveryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询页数
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 需要查找的服务类型
    @NameInMap("service_type")
    @Validation(required = true)
    public String serviceType;

    // 场景码，找dis工作人员进行分配
    // 
    @NameInMap("biz_code")
    public String bizCode;

    public static QueryDidAgentServicediscoveryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDidAgentServicediscoveryRequest self = new QueryDidAgentServicediscoveryRequest();
        return TeaModel.build(map, self);
    }

    public QueryDidAgentServicediscoveryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDidAgentServicediscoveryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDidAgentServicediscoveryRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryDidAgentServicediscoveryRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public QueryDidAgentServicediscoveryRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
