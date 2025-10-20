// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class QueryRightsprodGrantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部发放订单号
    @NameInMap("out_grant_order_no")
    @Validation(required = true)
    public String outGrantOrderNo;

    // 技术租户ID、当开通权益中心产品在非数科的应用租户下时需要填写对应的技术租户ID（涉及到时技术对接时 技术会分配，如未分配则不需要传值）
    @NameInMap("tech_tenant_id")
    public String techTenantId;

    // 扩展信息
    @NameInMap("ext_info")
    public String extInfo;

    public static QueryRightsprodGrantRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRightsprodGrantRequest self = new QueryRightsprodGrantRequest();
        return TeaModel.build(map, self);
    }

    public QueryRightsprodGrantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRightsprodGrantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRightsprodGrantRequest setOutGrantOrderNo(String outGrantOrderNo) {
        this.outGrantOrderNo = outGrantOrderNo;
        return this;
    }
    public String getOutGrantOrderNo() {
        return this.outGrantOrderNo;
    }

    public QueryRightsprodGrantRequest setTechTenantId(String techTenantId) {
        this.techTenantId = techTenantId;
        return this;
    }
    public String getTechTenantId() {
        return this.techTenantId;
    }

    public QueryRightsprodGrantRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
