// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class PluginModelDO extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // parent_folder_id
    @NameInMap("parent_folder_id")
    @Validation(required = true)
    public Long parentFolderId;

    // plugin_id
    @NameInMap("plugin_id")
    @Validation(required = true)
    public Long pluginId;

    // plugin_type
    @NameInMap("plugin_type")
    @Validation(required = true)
    public String pluginType;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // xflush_apps
    @NameInMap("xflush_apps")
    @Validation(required = true)
    public String xflushApps;

    // stack_expression
    @NameInMap("stack_expression")
    @Validation(required = true)
    public StackExpression stackExpression;

    // cal_conf
    @NameInMap("cal_conf")
    @Validation(required = true)
    public String calConf;

    // opsmeta_schema
    @NameInMap("opsmeta_schema")
    @Validation(required = true)
    public OpsmetaSchema opsmetaSchema;

    // save_schema
    @NameInMap("save_schema")
    @Validation(required = true)
    public SaveSchema saveSchema;

    // status
    @NameInMap("status")
    @Validation(required = true)
    public StatusDO status;

    // outside_domain_id
    @NameInMap("outside_domain_id")
    @Validation(required = true)
    public Long outsideDomainId;

    // old_folder_id
    @NameInMap("old_folder_id")
    @Validation(required = true)
    public Long oldFolderId;

    // tenant_id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public Long tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public Long workspaceId;

    // biz_domain_id
    @NameInMap("biz_domain_id")
    @Validation(required = true)
    public Long bizDomainId;

    // creater
    @NameInMap("creater")
    @Validation(required = true)
    public String creater;

    // gmt_create
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // modifier
    @NameInMap("modifier")
    @Validation(required = true)
    public String modifier;

    // gmt_modified
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    // alarm_pkgs
    @NameInMap("alarm_pkgs")
    @Validation(required = true)
    public java.util.List<AlarmPkgDO> alarmPkgs;

    // noc
    @NameInMap("noc")
    @Validation(required = true)
    public String noc;

    // position
    @NameInMap("position")
    @Validation(required = true)
    public String position;

    // alarmed
    @NameInMap("alarmed")
    @Validation(required = true)
    public Boolean alarmed;

    // recent_alarm_history_id
    @NameInMap("recent_alarm_history_id")
    @Validation(required = true)
    public String recentAlarmHistoryId;

    // recent_alarm
    @NameInMap("recent_alarm")
    @Validation(required = true)
    public Long recentAlarm;

    // key_cms
    @NameInMap("key_cms")
    @Validation(required = true)
    public Boolean keyCms;

    // key_cms_sort
    @NameInMap("key_cms_sort")
    @Validation(required = true)
    public Long keyCmsSort;

    // status_desc
    @NameInMap("status_desc")
    @Validation(required = true)
    public String statusDesc;

    // data_from
    @NameInMap("data_from")
    @Validation(required = true)
    public Long dataFrom;

    // data_to
    @NameInMap("data_to")
    @Validation(required = true)
    public Long dataTo;

    // from_source
    @NameInMap("from_source")
    @Validation(required = true)
    public String fromSource;

    public static PluginModelDO build(java.util.Map<String, ?> map) throws Exception {
        PluginModelDO self = new PluginModelDO();
        return TeaModel.build(map, self);
    }

    public PluginModelDO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PluginModelDO setParentFolderId(Long parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public Long getParentFolderId() {
        return this.parentFolderId;
    }

    public PluginModelDO setPluginId(Long pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public Long getPluginId() {
        return this.pluginId;
    }

    public PluginModelDO setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

    public PluginModelDO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PluginModelDO setXflushApps(String xflushApps) {
        this.xflushApps = xflushApps;
        return this;
    }
    public String getXflushApps() {
        return this.xflushApps;
    }

    public PluginModelDO setStackExpression(StackExpression stackExpression) {
        this.stackExpression = stackExpression;
        return this;
    }
    public StackExpression getStackExpression() {
        return this.stackExpression;
    }

    public PluginModelDO setCalConf(String calConf) {
        this.calConf = calConf;
        return this;
    }
    public String getCalConf() {
        return this.calConf;
    }

    public PluginModelDO setOpsmetaSchema(OpsmetaSchema opsmetaSchema) {
        this.opsmetaSchema = opsmetaSchema;
        return this;
    }
    public OpsmetaSchema getOpsmetaSchema() {
        return this.opsmetaSchema;
    }

    public PluginModelDO setSaveSchema(SaveSchema saveSchema) {
        this.saveSchema = saveSchema;
        return this;
    }
    public SaveSchema getSaveSchema() {
        return this.saveSchema;
    }

    public PluginModelDO setStatus(StatusDO status) {
        this.status = status;
        return this;
    }
    public StatusDO getStatus() {
        return this.status;
    }

    public PluginModelDO setOutsideDomainId(Long outsideDomainId) {
        this.outsideDomainId = outsideDomainId;
        return this;
    }
    public Long getOutsideDomainId() {
        return this.outsideDomainId;
    }

    public PluginModelDO setOldFolderId(Long oldFolderId) {
        this.oldFolderId = oldFolderId;
        return this;
    }
    public Long getOldFolderId() {
        return this.oldFolderId;
    }

    public PluginModelDO setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public PluginModelDO setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public PluginModelDO setBizDomainId(Long bizDomainId) {
        this.bizDomainId = bizDomainId;
        return this;
    }
    public Long getBizDomainId() {
        return this.bizDomainId;
    }

    public PluginModelDO setCreater(String creater) {
        this.creater = creater;
        return this;
    }
    public String getCreater() {
        return this.creater;
    }

    public PluginModelDO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public PluginModelDO setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public PluginModelDO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public PluginModelDO setAlarmPkgs(java.util.List<AlarmPkgDO> alarmPkgs) {
        this.alarmPkgs = alarmPkgs;
        return this;
    }
    public java.util.List<AlarmPkgDO> getAlarmPkgs() {
        return this.alarmPkgs;
    }

    public PluginModelDO setNoc(String noc) {
        this.noc = noc;
        return this;
    }
    public String getNoc() {
        return this.noc;
    }

    public PluginModelDO setPosition(String position) {
        this.position = position;
        return this;
    }
    public String getPosition() {
        return this.position;
    }

    public PluginModelDO setAlarmed(Boolean alarmed) {
        this.alarmed = alarmed;
        return this;
    }
    public Boolean getAlarmed() {
        return this.alarmed;
    }

    public PluginModelDO setRecentAlarmHistoryId(String recentAlarmHistoryId) {
        this.recentAlarmHistoryId = recentAlarmHistoryId;
        return this;
    }
    public String getRecentAlarmHistoryId() {
        return this.recentAlarmHistoryId;
    }

    public PluginModelDO setRecentAlarm(Long recentAlarm) {
        this.recentAlarm = recentAlarm;
        return this;
    }
    public Long getRecentAlarm() {
        return this.recentAlarm;
    }

    public PluginModelDO setKeyCms(Boolean keyCms) {
        this.keyCms = keyCms;
        return this;
    }
    public Boolean getKeyCms() {
        return this.keyCms;
    }

    public PluginModelDO setKeyCmsSort(Long keyCmsSort) {
        this.keyCmsSort = keyCmsSort;
        return this;
    }
    public Long getKeyCmsSort() {
        return this.keyCmsSort;
    }

    public PluginModelDO setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }
    public String getStatusDesc() {
        return this.statusDesc;
    }

    public PluginModelDO setDataFrom(Long dataFrom) {
        this.dataFrom = dataFrom;
        return this;
    }
    public Long getDataFrom() {
        return this.dataFrom;
    }

    public PluginModelDO setDataTo(Long dataTo) {
        this.dataTo = dataTo;
        return this;
    }
    public Long getDataTo() {
        return this.dataTo;
    }

    public PluginModelDO setFromSource(String fromSource) {
        this.fromSource = fromSource;
        return this;
    }
    public String getFromSource() {
        return this.fromSource;
    }

}
