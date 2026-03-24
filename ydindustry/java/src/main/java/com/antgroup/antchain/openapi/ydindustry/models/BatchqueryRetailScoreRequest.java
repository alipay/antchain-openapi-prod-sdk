// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ydindustry.models;

import com.aliyun.tea.*;

public class BatchqueryRetailScoreRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 模型id
    @NameInMap("industry_id")
    @Validation(required = true)
    public String industryId;

    // 用户列表
    @NameInMap("user_id_list")
    @Validation(required = true)
    public java.util.List<String> userIdList;

    // 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
    @NameInMap("user_id_type")
    @Validation(required = true)
    public String userIdType;

    // user_id 散列类型: "MD5"：MD5（小写）, ...
    @NameInMap("encrypt_type")
    @Validation(required = true)
    public String encryptType;

    // 客户编码
    @NameInMap("customer_code")
    @Validation(required = true)
    public String customerCode;

    // 流水号，串联链路用，非必填
    @NameInMap("trans_no")
    @Validation(required = true)
    public String transNo;

    // 场景编码
    @NameInMap("instance_code")
    @Validation(required = true)
    public String instanceCode;

    // 1 moble入参，id自动映射
    // 2 id入参，id自动映射
    // 3 id入参，mobile自动映射
    @NameInMap("mapping_type")
    @Validation(required = true)
    public String mappingType;

    public static BatchqueryRetailScoreRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryRetailScoreRequest self = new BatchqueryRetailScoreRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryRetailScoreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryRetailScoreRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchqueryRetailScoreRequest setIndustryId(String industryId) {
        this.industryId = industryId;
        return this;
    }
    public String getIndustryId() {
        return this.industryId;
    }

    public BatchqueryRetailScoreRequest setUserIdList(java.util.List<String> userIdList) {
        this.userIdList = userIdList;
        return this;
    }
    public java.util.List<String> getUserIdList() {
        return this.userIdList;
    }

    public BatchqueryRetailScoreRequest setUserIdType(String userIdType) {
        this.userIdType = userIdType;
        return this;
    }
    public String getUserIdType() {
        return this.userIdType;
    }

    public BatchqueryRetailScoreRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public BatchqueryRetailScoreRequest setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
        return this;
    }
    public String getCustomerCode() {
        return this.customerCode;
    }

    public BatchqueryRetailScoreRequest setTransNo(String transNo) {
        this.transNo = transNo;
        return this;
    }
    public String getTransNo() {
        return this.transNo;
    }

    public BatchqueryRetailScoreRequest setInstanceCode(String instanceCode) {
        this.instanceCode = instanceCode;
        return this;
    }
    public String getInstanceCode() {
        return this.instanceCode;
    }

    public BatchqueryRetailScoreRequest setMappingType(String mappingType) {
        this.mappingType = mappingType;
        return this;
    }
    public String getMappingType() {
        return this.mappingType;
    }

}
