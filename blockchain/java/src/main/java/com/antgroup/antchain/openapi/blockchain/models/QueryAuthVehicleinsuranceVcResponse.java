// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthVehicleinsuranceVcResponse extends TeaModel {
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

    // 可验证声明id
    @NameInMap("vc_id")
    public String vcId;

    // 业务提供方代码
    @NameInMap("isp_type")
    public Long ispType;

    public static QueryAuthVehicleinsuranceVcResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthVehicleinsuranceVcResponse self = new QueryAuthVehicleinsuranceVcResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthVehicleinsuranceVcResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAuthVehicleinsuranceVcResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAuthVehicleinsuranceVcResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAuthVehicleinsuranceVcResponse setLastInsuranceDate(String lastInsuranceDate) {
        this.lastInsuranceDate = lastInsuranceDate;
        return this;
    }
    public String getLastInsuranceDate() {
        return this.lastInsuranceDate;
    }

    public QueryAuthVehicleinsuranceVcResponse setFirstInsuranceDate(String firstInsuranceDate) {
        this.firstInsuranceDate = firstInsuranceDate;
        return this;
    }
    public String getFirstInsuranceDate() {
        return this.firstInsuranceDate;
    }

    public QueryAuthVehicleinsuranceVcResponse setLatestInsuranceDate(String latestInsuranceDate) {
        this.latestInsuranceDate = latestInsuranceDate;
        return this;
    }
    public String getLatestInsuranceDate() {
        return this.latestInsuranceDate;
    }

    public QueryAuthVehicleinsuranceVcResponse setVehicleDid(String vehicleDid) {
        this.vehicleDid = vehicleDid;
        return this;
    }
    public String getVehicleDid() {
        return this.vehicleDid;
    }

    public QueryAuthVehicleinsuranceVcResponse setOwnerUserDid(String ownerUserDid) {
        this.ownerUserDid = ownerUserDid;
        return this;
    }
    public String getOwnerUserDid() {
        return this.ownerUserDid;
    }

    public QueryAuthVehicleinsuranceVcResponse setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public QueryAuthVehicleinsuranceVcResponse setIspType(Long ispType) {
        this.ispType = ispType;
        return this;
    }
    public Long getIspType() {
        return this.ispType;
    }

}
