// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class QueryLocationTradeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // md5加密的身份证号
    @NameInMap("id_number")
    @Validation(maxLength = 32)
    public String idNumber;

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

    public static QueryLocationTradeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLocationTradeRequest self = new QueryLocationTradeRequest();
        return TeaModel.build(map, self);
    }

    public QueryLocationTradeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLocationTradeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryLocationTradeRequest setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public QueryLocationTradeRequest setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public QueryLocationTradeRequest setCallerId(String callerId) {
        this.callerId = callerId;
        return this;
    }
    public String getCallerId() {
        return this.callerId;
    }

    public QueryLocationTradeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryLocationTradeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryLocationTradeRequest setCenterPosition(String centerPosition) {
        this.centerPosition = centerPosition;
        return this;
    }
    public String getCenterPosition() {
        return this.centerPosition;
    }

    public QueryLocationTradeRequest setDistinctCounty(String distinctCounty) {
        this.distinctCounty = distinctCounty;
        return this;
    }
    public String getDistinctCounty() {
        return this.distinctCounty;
    }

    public QueryLocationTradeRequest setInvType(String invType) {
        this.invType = invType;
        return this;
    }
    public String getInvType() {
        return this.invType;
    }

}
