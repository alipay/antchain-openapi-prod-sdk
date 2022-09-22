// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class UpdateRecordRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // id
    @NameInMap("id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String id;

    // 快递单号，50字符（发放方式（issue_way）为快递寄送时可修改）
    @NameInMap("express_number")
    @Validation(maxLength = 50, minLength = 1)
    public String expressNumber;

    // 快递公司，50字符（发放方式（issue_way）为快递寄送时可修改）
    @NameInMap("express_company")
    @Validation(maxLength = 50, minLength = 1)
    public String expressCompany;

    // 快递地址，100字符（发放方式（issue_way）为快递寄送时可修改）
    @NameInMap("express_address")
    @Validation(maxLength = 100, minLength = 1)
    public String expressAddress;

    // 支付流水号，100字符（实施内容为善款类且执行记录状态为待发放（receive_status）必填）
    @NameInMap("pay_serial_number")
    @Validation(maxLength = 100, minLength = 1)
    public String paySerialNumber;

    // 转账方式，100字符 发放方式为善款类且执行记录状态为待发放（receive_status）必填）
    @NameInMap("transfer_method")
    @Validation(maxLength = 100, minLength = 1)
    public String transferMethod;

    public static UpdateRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecordRequest self = new UpdateRecordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateRecordRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateRecordRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateRecordRequest setExpressNumber(String expressNumber) {
        this.expressNumber = expressNumber;
        return this;
    }
    public String getExpressNumber() {
        return this.expressNumber;
    }

    public UpdateRecordRequest setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
        return this;
    }
    public String getExpressCompany() {
        return this.expressCompany;
    }

    public UpdateRecordRequest setExpressAddress(String expressAddress) {
        this.expressAddress = expressAddress;
        return this;
    }
    public String getExpressAddress() {
        return this.expressAddress;
    }

    public UpdateRecordRequest setPaySerialNumber(String paySerialNumber) {
        this.paySerialNumber = paySerialNumber;
        return this;
    }
    public String getPaySerialNumber() {
        return this.paySerialNumber;
    }

    public UpdateRecordRequest setTransferMethod(String transferMethod) {
        this.transferMethod = transferMethod;
        return this;
    }
    public String getTransferMethod() {
        return this.transferMethod;
    }

}
