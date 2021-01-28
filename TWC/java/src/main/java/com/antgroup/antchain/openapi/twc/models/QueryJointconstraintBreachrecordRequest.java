// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryJointconstraintBreachrecordRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询对象实体类型
    // 
    // 0：企业
    // 
    // 1：个人
    @NameInMap("entity_type")
    @Validation(required = true)
    public Long entityType;

    // 对象实体证件类型
    // 
    // 0：统一社会信用代码
    // 
    // 1：身份证号码
    @NameInMap("cert_type")
    @Validation(required = true)
    public Long certType;

    // 对象实体证件号码
    // 
    // 
    @NameInMap("cert_number")
    @Validation(required = true)
    public String certNumber;

    public static QueryJointconstraintBreachrecordRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryJointconstraintBreachrecordRequest self = new QueryJointconstraintBreachrecordRequest();
        return TeaModel.build(map, self);
    }

    public QueryJointconstraintBreachrecordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryJointconstraintBreachrecordRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryJointconstraintBreachrecordRequest setEntityType(Long entityType) {
        this.entityType = entityType;
        return this;
    }
    public Long getEntityType() {
        return this.entityType;
    }

    public QueryJointconstraintBreachrecordRequest setCertType(Long certType) {
        this.certType = certType;
        return this;
    }
    public Long getCertType() {
        return this.certType;
    }

    public QueryJointconstraintBreachrecordRequest setCertNumber(String certNumber) {
        this.certNumber = certNumber;
        return this;
    }
    public String getCertNumber() {
        return this.certNumber;
    }

}
