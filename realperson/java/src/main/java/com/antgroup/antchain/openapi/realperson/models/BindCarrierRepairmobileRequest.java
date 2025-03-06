// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class BindCarrierRepairmobileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 失联修复初始化的流程ID
    @NameInMap("process_id")
    @Validation(required = true)
    public String processId;

    // 身份证号，和失联修复初始化接口身份证号加密方式保持一致
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 修复的手机号排序，例如绑定第一个修复手机号填入1
    @NameInMap("mobile_num")
    @Validation(required = true)
    public String mobileNum;

    // 主叫号码
    @NameInMap("mobile_a")
    @Validation(required = true)
    public String mobileA;

    // 主叫类型1-手机号码 2-固话
    // 默认为1
    @NameInMap("mobile_type")
    public String mobileType;

    public static BindCarrierRepairmobileRequest build(java.util.Map<String, ?> map) throws Exception {
        BindCarrierRepairmobileRequest self = new BindCarrierRepairmobileRequest();
        return TeaModel.build(map, self);
    }

    public BindCarrierRepairmobileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindCarrierRepairmobileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindCarrierRepairmobileRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public BindCarrierRepairmobileRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public BindCarrierRepairmobileRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public BindCarrierRepairmobileRequest setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
        return this;
    }
    public String getMobileNum() {
        return this.mobileNum;
    }

    public BindCarrierRepairmobileRequest setMobileA(String mobileA) {
        this.mobileA = mobileA;
        return this;
    }
    public String getMobileA() {
        return this.mobileA;
    }

    public BindCarrierRepairmobileRequest setMobileType(String mobileType) {
        this.mobileType = mobileType;
        return this;
    }
    public String getMobileType() {
        return this.mobileType;
    }

}
