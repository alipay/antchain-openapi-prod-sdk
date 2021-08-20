// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class SendDasSmsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 接收方电话号码
    @NameInMap("receive_phone_num")
    @Validation(required = true)
    public Long receivePhoneNum;

    // 授权实例ID
    @NameInMap("auth_instance_id")
    @Validation(required = true)
    public String authInstanceId;

    public static SendDasSmsRequest build(java.util.Map<String, ?> map) throws Exception {
        SendDasSmsRequest self = new SendDasSmsRequest();
        return TeaModel.build(map, self);
    }

    public SendDasSmsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendDasSmsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendDasSmsRequest setReceivePhoneNum(Long receivePhoneNum) {
        this.receivePhoneNum = receivePhoneNum;
        return this;
    }
    public Long getReceivePhoneNum() {
        return this.receivePhoneNum;
    }

    public SendDasSmsRequest setAuthInstanceId(String authInstanceId) {
        this.authInstanceId = authInstanceId;
        return this;
    }
    public String getAuthInstanceId() {
        return this.authInstanceId;
    }

}
