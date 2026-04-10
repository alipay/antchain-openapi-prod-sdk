// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class RegisterCdsqScratchesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 平台名称
    @NameInMap("partner_code")
    @Validation(required = true)
    public String partnerCode;

    // 交易流水号
    @NameInMap("transaction_no")
    @Validation(required = true)
    public String transactionNo;

    // 用户ID
    @NameInMap("userid")
    public String userid;

    // 购买时间
    @NameInMap("buytime")
    public String buytime;

    // 车牌号
    @NameInMap("car_no")
    @Validation(required = true)
    public String carNo;

    // 停车地址
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    public static RegisterCdsqScratchesRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterCdsqScratchesRequest self = new RegisterCdsqScratchesRequest();
        return TeaModel.build(map, self);
    }

    public RegisterCdsqScratchesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterCdsqScratchesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterCdsqScratchesRequest setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

    public RegisterCdsqScratchesRequest setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
        return this;
    }
    public String getTransactionNo() {
        return this.transactionNo;
    }

    public RegisterCdsqScratchesRequest setUserid(String userid) {
        this.userid = userid;
        return this;
    }
    public String getUserid() {
        return this.userid;
    }

    public RegisterCdsqScratchesRequest setBuytime(String buytime) {
        this.buytime = buytime;
        return this;
    }
    public String getBuytime() {
        return this.buytime;
    }

    public RegisterCdsqScratchesRequest setCarNo(String carNo) {
        this.carNo = carNo;
        return this;
    }
    public String getCarNo() {
        return this.carNo;
    }

    public RegisterCdsqScratchesRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public RegisterCdsqScratchesRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
