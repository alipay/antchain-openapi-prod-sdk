// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetClusterBasicinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // cell infos
    @NameInMap("cell_infos")
    public java.util.List<CellInfo> cellInfos;

    // created time
    @NameInMap("created_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTime;

    // cluster display name
    @NameInMap("display_name")
    public String displayName;

    // network info
    @NameInMap("network_info")
    public NetworkInfo networkInfo;

    // region info
    @NameInMap("region_info")
    public RegionInfo regionInfo;

    // secured group infos
    @NameInMap("secured_group_infos")
    public java.util.List<SecuredGroupInfo> securedGroupInfos;

    // cluster status
    // 
    @NameInMap("status")
    public String status;

    // zone info
    @NameInMap("zone_info")
    public ZoneInfo zoneInfo;

    public static GetClusterBasicinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterBasicinfoResponse self = new GetClusterBasicinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterBasicinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetClusterBasicinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetClusterBasicinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetClusterBasicinfoResponse setCellInfos(java.util.List<CellInfo> cellInfos) {
        this.cellInfos = cellInfos;
        return this;
    }
    public java.util.List<CellInfo> getCellInfos() {
        return this.cellInfos;
    }

    public GetClusterBasicinfoResponse setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public GetClusterBasicinfoResponse setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetClusterBasicinfoResponse setNetworkInfo(NetworkInfo networkInfo) {
        this.networkInfo = networkInfo;
        return this;
    }
    public NetworkInfo getNetworkInfo() {
        return this.networkInfo;
    }

    public GetClusterBasicinfoResponse setRegionInfo(RegionInfo regionInfo) {
        this.regionInfo = regionInfo;
        return this;
    }
    public RegionInfo getRegionInfo() {
        return this.regionInfo;
    }

    public GetClusterBasicinfoResponse setSecuredGroupInfos(java.util.List<SecuredGroupInfo> securedGroupInfos) {
        this.securedGroupInfos = securedGroupInfos;
        return this;
    }
    public java.util.List<SecuredGroupInfo> getSecuredGroupInfos() {
        return this.securedGroupInfos;
    }

    public GetClusterBasicinfoResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetClusterBasicinfoResponse setZoneInfo(ZoneInfo zoneInfo) {
        this.zoneInfo = zoneInfo;
        return this;
    }
    public ZoneInfo getZoneInfo() {
        return this.zoneInfo;
    }

}
