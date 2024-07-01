// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_1470b9714f184f1885db246eb9933e95.models;

import com.aliyun.tea.*;

public class QueryAntchainZkcollabinvLocationTradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // md5加密的身份证号
    @NameInMap("id_numer")
    @Validation(maxLength = 32)
    public String idNumer;

    // md5加密的手机号
    @NameInMap("phone_no")
    @Validation(maxLength = 32)
    public String phoneNo;

    // 调用者用户ID（或外部系统业务ID）
    @NameInMap("caller_id")
    @Validation(required = true, maxLength = 128)
    public String callerId;

    // 定位时间范围开始时间
    @NameInMap("start_time")
    @Validation(required = true, maxLength = 19)
    public String startTime;

    // 定位时间范围结束时间
    @NameInMap("end_time")
    @Validation(required = true, maxLength = 19)
    public String endTime;

    // 核查中心位置（经度,纬度）
    @NameInMap("center_position")
    @Validation(maxLength = 64)
    public String centerPosition;

    // 核查省市区县范围
    @NameInMap("distinct_county")
    @Validation(maxLength = 128)
    public String distinctCounty;

    // 协查类型：
    // 0: 为经纬度精准定位协查 (默认)
    // 1:  为区县定位 (省-市-区/县) 协查
    @NameInMap("inv_type")
    @Validation(maxLength = 2)
    public String invType;

    public static QueryAntchainZkcollabinvLocationTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainZkcollabinvLocationTradeRequest self = new QueryAntchainZkcollabinvLocationTradeRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainZkcollabinvLocationTradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainZkcollabinvLocationTradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainZkcollabinvLocationTradeRequest setIdNumer(String idNumer) {
        this.idNumer = idNumer;
        return this;
    }
    public String getIdNumer() {
        return this.idNumer;
    }

    public QueryAntchainZkcollabinvLocationTradeRequest setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public QueryAntchainZkcollabinvLocationTradeRequest setCallerId(String callerId) {
        this.callerId = callerId;
        return this;
    }
    public String getCallerId() {
        return this.callerId;
    }

    public QueryAntchainZkcollabinvLocationTradeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryAntchainZkcollabinvLocationTradeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryAntchainZkcollabinvLocationTradeRequest setCenterPosition(String centerPosition) {
        this.centerPosition = centerPosition;
        return this;
    }
    public String getCenterPosition() {
        return this.centerPosition;
    }

    public QueryAntchainZkcollabinvLocationTradeRequest setDistinctCounty(String distinctCounty) {
        this.distinctCounty = distinctCounty;
        return this;
    }
    public String getDistinctCounty() {
        return this.distinctCounty;
    }

    public QueryAntchainZkcollabinvLocationTradeRequest setInvType(String invType) {
        this.invType = invType;
        return this;
    }
    public String getInvType() {
        return this.invType;
    }

}
