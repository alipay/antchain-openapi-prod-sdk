// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetCustompluginResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // ID
    @NameInMap("id")
    public Long id;

    // 自定义监控名称
    @NameInMap("name")
    public String name;

    // 是否有报警
    @NameInMap("alarmed")
    public Boolean alarmed;

    // 监控类型id
    @NameInMap("plugin_id")
    public Long pluginId;

    // 监控类型
    @NameInMap("plugin_type")
    public String pluginType;

    // 创建者
    @NameInMap("creator")
    public String creator;

    // 最后修改者
    @NameInMap("modifier")
    public String modifier;

    // 创建时间戳
    @NameInMap("gmt_create")
    public Long gmtCreate;

    // 最后修改时间 - 时间戳
    @NameInMap("gmt_modified")
    public Long gmtModified;

    // 告警套餐列表
    @NameInMap("alarm_pkgs")
    public java.util.List<AlarmPkgDO> alarmPkgs;

    public static GetCustompluginResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustompluginResponse self = new GetCustompluginResponse();
        return TeaModel.build(map, self);
    }

    public GetCustompluginResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetCustompluginResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetCustompluginResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetCustompluginResponse setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetCustompluginResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetCustompluginResponse setAlarmed(Boolean alarmed) {
        this.alarmed = alarmed;
        return this;
    }
    public Boolean getAlarmed() {
        return this.alarmed;
    }

    public GetCustompluginResponse setPluginId(Long pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public Long getPluginId() {
        return this.pluginId;
    }

    public GetCustompluginResponse setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

    public GetCustompluginResponse setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetCustompluginResponse setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public GetCustompluginResponse setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public GetCustompluginResponse setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public GetCustompluginResponse setAlarmPkgs(java.util.List<AlarmPkgDO> alarmPkgs) {
        this.alarmPkgs = alarmPkgs;
        return this;
    }
    public java.util.List<AlarmPkgDO> getAlarmPkgs() {
        return this.alarmPkgs;
    }

}
