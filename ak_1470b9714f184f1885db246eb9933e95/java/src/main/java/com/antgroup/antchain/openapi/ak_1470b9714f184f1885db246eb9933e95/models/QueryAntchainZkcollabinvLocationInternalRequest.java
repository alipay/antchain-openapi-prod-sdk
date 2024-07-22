// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_1470b9714f184f1885db246eb9933e95.models;

import com.aliyun.tea.*;

public class QueryAntchainZkcollabinvLocationInternalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // md5加密的身份证号
    @NameInMap("id_number")
    public String idNumber;

    // md5加密的手机号
    @NameInMap("phone_no")
    public String phoneNo;

    // 定位时间范围开始时间
    @NameInMap("start_time")
    @Validation(required = true)
    public String startTime;

    // 定位时间范围结束时间
    @NameInMap("end_time")
    @Validation(required = true)
    public String endTime;

    // 核查中心位置（经度,纬度）
    @NameInMap("center_position")
    public String centerPosition;

    // 核查省市区县范围
    @NameInMap("distinct_county")
    public String distinctCounty;

    // 协查类型：
    // 0: 为经纬度精准定位协查 (默认)
    // 1:  为区县定位 (省-市-区/县) 协查
    @NameInMap("inv_type")
    public Long invType;

    // 服务级别与结果值定义
    @NameInMap("api_service_level")
    @Validation(required = true)
    public String apiServiceLevel;

    public static QueryAntchainZkcollabinvLocationInternalRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainZkcollabinvLocationInternalRequest self = new QueryAntchainZkcollabinvLocationInternalRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainZkcollabinvLocationInternalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainZkcollabinvLocationInternalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainZkcollabinvLocationInternalRequest setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public QueryAntchainZkcollabinvLocationInternalRequest setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public QueryAntchainZkcollabinvLocationInternalRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryAntchainZkcollabinvLocationInternalRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryAntchainZkcollabinvLocationInternalRequest setCenterPosition(String centerPosition) {
        this.centerPosition = centerPosition;
        return this;
    }
    public String getCenterPosition() {
        return this.centerPosition;
    }

    public QueryAntchainZkcollabinvLocationInternalRequest setDistinctCounty(String distinctCounty) {
        this.distinctCounty = distinctCounty;
        return this;
    }
    public String getDistinctCounty() {
        return this.distinctCounty;
    }

    public QueryAntchainZkcollabinvLocationInternalRequest setInvType(Long invType) {
        this.invType = invType;
        return this;
    }
    public Long getInvType() {
        return this.invType;
    }

    public QueryAntchainZkcollabinvLocationInternalRequest setApiServiceLevel(String apiServiceLevel) {
        this.apiServiceLevel = apiServiceLevel;
        return this;
    }
    public String getApiServiceLevel() {
        return this.apiServiceLevel;
    }

}
