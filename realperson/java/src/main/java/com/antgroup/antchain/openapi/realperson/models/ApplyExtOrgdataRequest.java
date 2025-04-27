// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class ApplyExtOrgdataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 是	入参加密模式：
    // "0"（默认值）：不加密；
    // "4"：RSA加密
    @NameInMap("encrypt_type")
    @Validation(required = true)
    public String encryptType;

    // 星火保
    @NameInMap("org_name")
    @Validation(required = true)
    public String orgName;

    // 外部机构数据类型，取值如下： AXINSUR_BANK_LIVENESS：星火保蚂蚁推荐卡
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // 机构上报数据，json数组
    @NameInMap("data_content")
    @Validation(required = true)
    public String dataContent;

    public static ApplyExtOrgdataRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyExtOrgdataRequest self = new ApplyExtOrgdataRequest();
        return TeaModel.build(map, self);
    }

    public ApplyExtOrgdataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyExtOrgdataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyExtOrgdataRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public ApplyExtOrgdataRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public ApplyExtOrgdataRequest setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public ApplyExtOrgdataRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public ApplyExtOrgdataRequest setDataContent(String dataContent) {
        this.dataContent = dataContent;
        return this;
    }
    public String getDataContent() {
        return this.dataContent;
    }

}
