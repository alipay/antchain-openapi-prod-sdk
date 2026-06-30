// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryEtcTripRequest extends TeaModel {
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

    // 车牌颜色，蓝: BLUE 黄: YELLOW 黑: BLACK 白: WHITE 绿: GREEN
    @NameInMap("plate_color")
    @Validation(required = true)
    public String plateColor;

    // 企业运单号，唯一值
    @NameInMap("waybill_no")
    @Validation(required = true)
    public String waybillNo;

    // 当前页码
    // 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
    @NameInMap("page_num")
    public Long pageNum;

    // 每页数据条数
    // 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
    @NameInMap("page_size")
    public Long pageSize;

    // 行程查询开始时间
    // 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
    @NameInMap("start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 行程查询结束时间
    // 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
    // 
    @NameInMap("end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    public static QueryEtcTripRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEtcTripRequest self = new QueryEtcTripRequest();
        return TeaModel.build(map, self);
    }

    public QueryEtcTripRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEtcTripRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEtcTripRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryEtcTripRequest setCorpVehicleId(String corpVehicleId) {
        this.corpVehicleId = corpVehicleId;
        return this;
    }
    public String getCorpVehicleId() {
        return this.corpVehicleId;
    }

    public QueryEtcTripRequest setPlateNo(String plateNo) {
        this.plateNo = plateNo;
        return this;
    }
    public String getPlateNo() {
        return this.plateNo;
    }

    public QueryEtcTripRequest setPlateColor(String plateColor) {
        this.plateColor = plateColor;
        return this;
    }
    public String getPlateColor() {
        return this.plateColor;
    }

    public QueryEtcTripRequest setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
        return this;
    }
    public String getWaybillNo() {
        return this.waybillNo;
    }

    public QueryEtcTripRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryEtcTripRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryEtcTripRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryEtcTripRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
