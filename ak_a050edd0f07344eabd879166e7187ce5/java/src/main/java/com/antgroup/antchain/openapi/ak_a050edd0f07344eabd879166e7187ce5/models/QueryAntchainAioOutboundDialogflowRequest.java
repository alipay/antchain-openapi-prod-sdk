// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a050edd0f07344eabd879166e7187ce5.models;

import com.aliyun.tea.*;

public class QueryAntchainAioOutboundDialogflowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 任务id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 租户id
    @NameInMap("tnt_inst_id")
    @Validation(required = true)
    public String tntInstId;

    // 业务id
    @NameInMap("biz_code")
    @Validation(required = true)
    public String bizCode;

    public static QueryAntchainAioOutboundDialogflowRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAioOutboundDialogflowRequest self = new QueryAntchainAioOutboundDialogflowRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAioOutboundDialogflowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAioOutboundDialogflowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAioOutboundDialogflowRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryAntchainAioOutboundDialogflowRequest setTntInstId(String tntInstId) {
        this.tntInstId = tntInstId;
        return this;
    }
    public String getTntInstId() {
        return this.tntInstId;
    }

    public QueryAntchainAioOutboundDialogflowRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
