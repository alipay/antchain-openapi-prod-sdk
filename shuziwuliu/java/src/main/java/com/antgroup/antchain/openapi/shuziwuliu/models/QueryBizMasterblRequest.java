// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryBizMasterblRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // master提单号
    @NameInMap("master_bl_no")
    @Validation(required = true)
    public String masterBlNo;

    public static QueryBizMasterblRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBizMasterblRequest self = new QueryBizMasterblRequest();
        return TeaModel.build(map, self);
    }

    public QueryBizMasterblRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBizMasterblRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBizMasterblRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public QueryBizMasterblRequest setMasterBlNo(String masterBlNo) {
        this.masterBlNo = masterBlNo;
        return this;
    }
    public String getMasterBlNo() {
        return this.masterBlNo;
    }

}
