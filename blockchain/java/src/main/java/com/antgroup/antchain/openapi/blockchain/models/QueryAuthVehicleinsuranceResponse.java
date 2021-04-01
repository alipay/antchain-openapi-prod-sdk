// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthVehicleinsuranceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 上次交强险投保年月
    @NameInMap("last_insurance_date")
    public String lastInsuranceDate;

    // 初次投保日期
    @NameInMap("first_insurance_date")
    public String firstInsuranceDate;

    // 最近交强险投保期止
    @NameInMap("latest_insurance_date")
    public String latestInsuranceDate;

    // 车辆did
    @NameInMap("vehicle_did")
    public String vehicleDid;

    // 车主did
    @NameInMap("owner_user_did")
    public String ownerUserDid;

    // 服务提供方代码
    @NameInMap("isp_type")
    public Long ispType;

    public static QueryAuthVehicleinsuranceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthVehicleinsuranceResponse self = new QueryAuthVehicleinsuranceResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthVehicleinsuranceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAuthVehicleinsuranceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAuthVehicleinsuranceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAuthVehicleinsuranceResponse setLastInsuranceDate(String lastInsuranceDate) {
        this.lastInsuranceDate = lastInsuranceDate;
        return this;
    }
    public String getLastInsuranceDate() {
        return this.lastInsuranceDate;
    }

    public QueryAuthVehicleinsuranceResponse setFirstInsuranceDate(String firstInsuranceDate) {
        this.firstInsuranceDate = firstInsuranceDate;
        return this;
    }
    public String getFirstInsuranceDate() {
        return this.firstInsuranceDate;
    }

    public QueryAuthVehicleinsuranceResponse setLatestInsuranceDate(String latestInsuranceDate) {
        this.latestInsuranceDate = latestInsuranceDate;
        return this;
    }
    public String getLatestInsuranceDate() {
        return this.latestInsuranceDate;
    }

    public QueryAuthVehicleinsuranceResponse setVehicleDid(String vehicleDid) {
        this.vehicleDid = vehicleDid;
        return this;
    }
    public String getVehicleDid() {
        return this.vehicleDid;
    }

    public QueryAuthVehicleinsuranceResponse setOwnerUserDid(String ownerUserDid) {
        this.ownerUserDid = ownerUserDid;
        return this;
    }
    public String getOwnerUserDid() {
        return this.ownerUserDid;
    }

    public QueryAuthVehicleinsuranceResponse setIspType(Long ispType) {
        this.ispType = ispType;
        return this;
    }
    public Long getIspType() {
        return this.ispType;
    }

}
