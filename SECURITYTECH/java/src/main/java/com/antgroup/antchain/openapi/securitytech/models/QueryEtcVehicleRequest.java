// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryEtcVehicleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 企业侧车辆编号
    @NameInMap("corp_vehicle_id")
    @Validation(required = true)
    public String corpVehicleId;

    // 车牌号码
    @NameInMap("plate_no")
    @Validation(required = true)
    public String plateNo;

    // 车牌颜色，枚举值
    // 蓝: BLUE
    // 黄: YELLOW
    // 黑: BLACK
    // 白: WHITE
    // 绿: GREEN
    @NameInMap("plate_color")
    @Validation(required = true)
    public String plateColor;

    // 企业运单号，唯一值
    @NameInMap("waybill_no")
    public String waybillNo;

    public static QueryEtcVehicleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEtcVehicleRequest self = new QueryEtcVehicleRequest();
        return TeaModel.build(map, self);
    }

    public QueryEtcVehicleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEtcVehicleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEtcVehicleRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryEtcVehicleRequest setCorpVehicleId(String corpVehicleId) {
        this.corpVehicleId = corpVehicleId;
        return this;
    }
    public String getCorpVehicleId() {
        return this.corpVehicleId;
    }

    public QueryEtcVehicleRequest setPlateNo(String plateNo) {
        this.plateNo = plateNo;
        return this;
    }
    public String getPlateNo() {
        return this.plateNo;
    }

    public QueryEtcVehicleRequest setPlateColor(String plateColor) {
        this.plateColor = plateColor;
        return this;
    }
    public String getPlateColor() {
        return this.plateColor;
    }

    public QueryEtcVehicleRequest setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
        return this;
    }
    public String getWaybillNo() {
        return this.waybillNo;
    }

}
