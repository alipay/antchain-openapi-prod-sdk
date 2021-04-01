// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthVehicleinsuranceVcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 车牌号
    @NameInMap("vehicle_no")
    @Validation(required = true)
    public String vehicleNo;

    // 车型代码. 可选, 02 普通小客车(默认); 52 新能源小客车
    @NameInMap("vehicle_type")
    public String vehicleType;

    // 车辆识别码
    @NameInMap("vin")
    @Validation(required = true)
    public String vin;

    // 车主认证信息
    @NameInMap("owner_meta_info")
    @Validation(required = true)
    public UserMetaInfo ownerMetaInfo;

    // 业务类型
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 业务id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    public static QueryAuthVehicleinsuranceVcRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthVehicleinsuranceVcRequest self = new QueryAuthVehicleinsuranceVcRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuthVehicleinsuranceVcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAuthVehicleinsuranceVcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAuthVehicleinsuranceVcRequest setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
        return this;
    }
    public String getVehicleNo() {
        return this.vehicleNo;
    }

    public QueryAuthVehicleinsuranceVcRequest setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }
    public String getVehicleType() {
        return this.vehicleType;
    }

    public QueryAuthVehicleinsuranceVcRequest setVin(String vin) {
        this.vin = vin;
        return this;
    }
    public String getVin() {
        return this.vin;
    }

    public QueryAuthVehicleinsuranceVcRequest setOwnerMetaInfo(UserMetaInfo ownerMetaInfo) {
        this.ownerMetaInfo = ownerMetaInfo;
        return this;
    }
    public UserMetaInfo getOwnerMetaInfo() {
        return this.ownerMetaInfo;
    }

    public QueryAuthVehicleinsuranceVcRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryAuthVehicleinsuranceVcRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
