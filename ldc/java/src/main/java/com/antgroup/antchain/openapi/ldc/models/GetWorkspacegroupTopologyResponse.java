// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetWorkspacegroupTopologyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 环境逻辑单元信息。
    @NameInMap("cell_groups")
    public java.util.List<CellGroup> cellGroups;

    // 环境(WorkspaceGroup)名称。
    @NameInMap("name")
    public String name;

    // 环境机房信息。
    @NameInMap("zones")
    public java.util.List<ZoneInfo> zones;

    public static GetWorkspacegroupTopologyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspacegroupTopologyResponse self = new GetWorkspacegroupTopologyResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkspacegroupTopologyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetWorkspacegroupTopologyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetWorkspacegroupTopologyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetWorkspacegroupTopologyResponse setCellGroups(java.util.List<CellGroup> cellGroups) {
        this.cellGroups = cellGroups;
        return this;
    }
    public java.util.List<CellGroup> getCellGroups() {
        return this.cellGroups;
    }

    public GetWorkspacegroupTopologyResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetWorkspacegroupTopologyResponse setZones(java.util.List<ZoneInfo> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<ZoneInfo> getZones() {
        return this.zones;
    }

}
