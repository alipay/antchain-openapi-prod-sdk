// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class ModifySpProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_access_code")
    public String productAccessCode;

    // 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
    @NameInMap("order_no")
    @Validation(required = true, maxLength = 64, minLength = 32)
    public String orderNo;

    // 产品码 全局唯一
    @NameInMap("product_code")
    @Validation(required = true, maxLength = 20, minLength = 3)
    public String productCode;

    // 产品实例Id
    @NameInMap("instance_id")
    @Validation(required = true, maxLength = 50, minLength = 20)
    public String instanceId;

    // 具体规格配置信息（JSON格式）会按照key进行排序
    @NameInMap("specification")
    @Validation(required = true)
    public String specification;

    // 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
    @NameInMap("access_code")
    @Validation(required = true, maxLength = 24, minLength = 3)
    public String accessCode;

    // 变配类型：
    // ONLY_SPECIFICATION只规格变配,
    // SPECIFICATION_AND_TIME 规格和时间同时变配
    @NameInMap("modify_type")
    @Validation(required = true, maxLength = 32, minLength = 4)
    public String modifyType;

    // 变配新的开始时间。格式为UTC时间。
    // modify_type是SPECIFICATION_AND_TIME时，必填
    @NameInMap("new_start_time")
    public String newStartTime;

    // 变配新的结束时间。格式为UTC时间.
    //  modify_type是SPECIFICATION_AND_TIME时，必填
    @NameInMap("new_end_time")
    public String newEndTime;

    // 商业业务信息，如签约的项目ID、合同ID、合作伙伴ID等
    @NameInMap("business_data")
    public String businessData;

    // 具体规格配置信息（JSON格式）会按照key进行排序。
    // 此字段传入的是变配前的老规格信息。
    @NameInMap("old_specification")
    public String oldSpecification;

    // 具体规格配置信息（JSON格式）会按照key进行排序.
    // 传入新的规格信息，包括在新的规格中不存在，但是老的规格中有的kv。
    @NameInMap("new_specification")
    public String newSpecification;

    public static ModifySpProductRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySpProductRequest self = new ModifySpProductRequest();
        return TeaModel.build(map, self);
    }

    public ModifySpProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ModifySpProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ModifySpProductRequest setProductAccessCode(String productAccessCode) {
        this.productAccessCode = productAccessCode;
        return this;
    }
    public String getProductAccessCode() {
        return this.productAccessCode;
    }

    public ModifySpProductRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public ModifySpProductRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ModifySpProductRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifySpProductRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public ModifySpProductRequest setAccessCode(String accessCode) {
        this.accessCode = accessCode;
        return this;
    }
    public String getAccessCode() {
        return this.accessCode;
    }

    public ModifySpProductRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public ModifySpProductRequest setNewStartTime(String newStartTime) {
        this.newStartTime = newStartTime;
        return this;
    }
    public String getNewStartTime() {
        return this.newStartTime;
    }

    public ModifySpProductRequest setNewEndTime(String newEndTime) {
        this.newEndTime = newEndTime;
        return this;
    }
    public String getNewEndTime() {
        return this.newEndTime;
    }

    public ModifySpProductRequest setBusinessData(String businessData) {
        this.businessData = businessData;
        return this;
    }
    public String getBusinessData() {
        return this.businessData;
    }

    public ModifySpProductRequest setOldSpecification(String oldSpecification) {
        this.oldSpecification = oldSpecification;
        return this;
    }
    public String getOldSpecification() {
        return this.oldSpecification;
    }

    public ModifySpProductRequest setNewSpecification(String newSpecification) {
        this.newSpecification = newSpecification;
        return this;
    }
    public String getNewSpecification() {
        return this.newSpecification;
    }

}
