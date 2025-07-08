// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class EtcTripInfo extends TeaModel {
    // 发行方扣款订单号
    /**
     * <strong>example:</strong>
     * <p>56789123456</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    // 行程开始时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("trip_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String tripStartTime;

    // 行程结束时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("trip_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String tripEndTime;

    // 1、收费站入口名称 2、格式为省份+收费站名，比如“黑龙江瓦盆窑西站”
    /**
     * <strong>example:</strong>
     * <p>黑龙江瓦盆窑西站</p>
     */
    @NameInMap("start_station_name")
    public String startStationName;

    // 1、收费站出口名称 2、格式为省份+收费站名，比如“黑龙江瓦盆窑西站”
    /**
     * <strong>example:</strong>
     * <p>黑龙江瓦盆窑西站</p>
     */
    @NameInMap("end_station_name")
    public String endStationName;

    // HIGHWAY_TYPE：高速交易场景类型，对应具体交易场景[ETC_HIGHWAY,ETC_HIGHWAY_OPEN] EXPAND_TYPE：拓展消费交易类型，对应具体交易场景 [ETC_PARKING,ETC_GAS,ETC_SERVICE_AREA,ETC_MUNICIPAL_SERVICE]
    /**
     * <strong>example:</strong>
     * <p>HIGHWAY_TYPE</p>
     */
    @NameInMap("sub_type")
    public String subType;

    // ETC_HIGHWAY：ETC封闭式高速公路； ETC_HIGHWAY_OPEN：ETC开放式高速公路； ETC_PARKING：ETC停车场； ETC_GAS：ETC加油站； ETC_SERVICE_AREA：ETC服务区； ETC_MUNICIPAL_SERVICE：ETC市政服务
    /**
     * <strong>example:</strong>
     * <p>ETC_HIGHWAY</p>
     */
    @NameInMap("sub_scene")
    public String subScene;

    // 商户扣费的总金额：单位为元，精确到小数点后两位
    /**
     * <strong>example:</strong>
     * <p>4.50</p>
     */
    @NameInMap("total_amount")
    public String totalAmount;

    // 行程id
    /**
     * <strong>example:</strong>
     * <p>230390390303</p>
     */
    @NameInMap("trip_id")
    public String tripId;

    // 交易单号
    /**
     * <strong>example:</strong>
     * <p>20230916988938938393</p>
     */
    @NameInMap("trade_no")
    public String tradeNo;

    public static EtcTripInfo build(java.util.Map<String, ?> map) throws Exception {
        EtcTripInfo self = new EtcTripInfo();
        return TeaModel.build(map, self);
    }

    public EtcTripInfo setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public EtcTripInfo setTripStartTime(String tripStartTime) {
        this.tripStartTime = tripStartTime;
        return this;
    }
    public String getTripStartTime() {
        return this.tripStartTime;
    }

    public EtcTripInfo setTripEndTime(String tripEndTime) {
        this.tripEndTime = tripEndTime;
        return this;
    }
    public String getTripEndTime() {
        return this.tripEndTime;
    }

    public EtcTripInfo setStartStationName(String startStationName) {
        this.startStationName = startStationName;
        return this;
    }
    public String getStartStationName() {
        return this.startStationName;
    }

    public EtcTripInfo setEndStationName(String endStationName) {
        this.endStationName = endStationName;
        return this;
    }
    public String getEndStationName() {
        return this.endStationName;
    }

    public EtcTripInfo setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public EtcTripInfo setSubScene(String subScene) {
        this.subScene = subScene;
        return this;
    }
    public String getSubScene() {
        return this.subScene;
    }

    public EtcTripInfo setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

    public EtcTripInfo setTripId(String tripId) {
        this.tripId = tripId;
        return this;
    }
    public String getTripId() {
        return this.tripId;
    }

    public EtcTripInfo setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

}
