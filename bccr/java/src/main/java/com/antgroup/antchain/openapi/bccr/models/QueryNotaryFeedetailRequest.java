// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryNotaryFeedetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 公证处ID
    @NameInMap("org_id")
    @Validation(required = true)
    public String orgId;

    // 公证书类型
    @NameInMap("order_type")
    @Validation(required = true)
    public String orderType;

    // 纸质公证书份数
    @NameInMap("copies")
    public Long copies;

    // 证据列表
    @NameInMap("evid_info_list")
    @Validation(required = true)
    public java.util.List<EvidInfo> evidInfoList;

    public static QueryNotaryFeedetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNotaryFeedetailRequest self = new QueryNotaryFeedetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryNotaryFeedetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryNotaryFeedetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryNotaryFeedetailRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public QueryNotaryFeedetailRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public QueryNotaryFeedetailRequest setCopies(Long copies) {
        this.copies = copies;
        return this;
    }
    public Long getCopies() {
        return this.copies;
    }

    public QueryNotaryFeedetailRequest setEvidInfoList(java.util.List<EvidInfo> evidInfoList) {
        this.evidInfoList = evidInfoList;
        return this;
    }
    public java.util.List<EvidInfo> getEvidInfoList() {
        return this.evidInfoList;
    }

}
