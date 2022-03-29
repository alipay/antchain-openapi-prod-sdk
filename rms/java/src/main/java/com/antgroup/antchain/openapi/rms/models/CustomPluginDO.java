// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CustomPluginDO extends TeaModel {
    // ID
    @NameInMap("id")
    public Long id;

    // 自定义监控名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 监控类型id
    @NameInMap("plugin_id")
    @Validation(required = true)
    public Long pluginId;

    // 监控类型
    @NameInMap("plugin_type")
    @Validation(required = true)
    public String pluginType;

    // 父级文件夹 ID
    @NameInMap("parent_folder_id")
    @Validation(required = true)
    public Long parentFolderId;

    // 创建者
    @NameInMap("creater")
    public String creater;

    // 最后修改者
    @NameInMap("modifier")
    public String modifier;

    // 创建时间 - 时间戳
    @NameInMap("gmt_create")
    public Long gmtCreate;

    // 最后修改时间 - 时间戳
    @NameInMap("gmt_modified")
    public Long gmtModified;

    // 是否有报警
    @NameInMap("alarmed")
    public Boolean alarmed;

    // 日志
    @NameInMap("log")
    public Log log;

    // 存储信息
    @NameInMap("save_schema")
    public SaveSchema saveSchema;

    // 采集元数据过滤项
    @NameInMap("opsmeta_schema")
    public OpsmetaSchema opsmetaSchema;

    // 属性扩展包
    @NameInMap("spm")
    public Spm spm;

    // 告警套餐列表
    @NameInMap("alarm_pkgs")
    public java.util.List<AlarmPkgDO> alarmPkgs;

    // 日志筛选黑名单
    @NameInMap("black_filters")
    public java.util.List<Filter> blackFilters;

    // 日志筛选白名单
    @NameInMap("white_filters")
    public java.util.List<Filter> whiteFilters;

    // OPS分组方式
    @NameInMap("ops_group_by")
    public OpsGroupBy opsGroupBy;

    // 统计方式
    @NameInMap("cal")
    public Cal cal;

    // 配置状态
    @NameInMap("status")
    public StatusDO status;

    // top预警
    @NameInMap("top_alarm")
    public TopAlarmDO topAlarm;

    // 分组规则
    @NameInMap("group_by")
    public java.util.List<Filter> groupBy;

    // 状态描述信息
    @NameInMap("status_desc")
    public String statusDesc;

    // 是否需要动态key
    @NameInMap("dk_need")
    public Boolean dkNeed;

    // 推荐的动态key列表, 分号间隔
    @NameInMap("dks")
    public String dks;

    // 是否需要大盘显示基线
    @NameInMap("baseline_need")
    public Boolean baselineNeed;

    // 是否需要快速刷入实时缓存
    @NameInMap("flush_basin")
    public Boolean flushBasin;

    // 所属应用
    @NameInMap("xflush_apps")
    public String xflushApps;

    // script (JSON String格式)
    @NameInMap("script_new")
    public String scriptNew;

    // 是否开启
    @NameInMap("is_open")
    public Boolean isOpen;

    // 插件类型别名
    @NameInMap("plugin_type_alias")
    @Validation(required = true)
    public String pluginTypeAlias;

    public static CustomPluginDO build(java.util.Map<String, ?> map) throws Exception {
        CustomPluginDO self = new CustomPluginDO();
        return TeaModel.build(map, self);
    }

    public CustomPluginDO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CustomPluginDO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CustomPluginDO setPluginId(Long pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public Long getPluginId() {
        return this.pluginId;
    }

    public CustomPluginDO setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

    public CustomPluginDO setParentFolderId(Long parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public Long getParentFolderId() {
        return this.parentFolderId;
    }

    public CustomPluginDO setCreater(String creater) {
        this.creater = creater;
        return this;
    }
    public String getCreater() {
        return this.creater;
    }

    public CustomPluginDO setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public CustomPluginDO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public CustomPluginDO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public CustomPluginDO setAlarmed(Boolean alarmed) {
        this.alarmed = alarmed;
        return this;
    }
    public Boolean getAlarmed() {
        return this.alarmed;
    }

    public CustomPluginDO setLog(Log log) {
        this.log = log;
        return this;
    }
    public Log getLog() {
        return this.log;
    }

    public CustomPluginDO setSaveSchema(SaveSchema saveSchema) {
        this.saveSchema = saveSchema;
        return this;
    }
    public SaveSchema getSaveSchema() {
        return this.saveSchema;
    }

    public CustomPluginDO setOpsmetaSchema(OpsmetaSchema opsmetaSchema) {
        this.opsmetaSchema = opsmetaSchema;
        return this;
    }
    public OpsmetaSchema getOpsmetaSchema() {
        return this.opsmetaSchema;
    }

    public CustomPluginDO setSpm(Spm spm) {
        this.spm = spm;
        return this;
    }
    public Spm getSpm() {
        return this.spm;
    }

    public CustomPluginDO setAlarmPkgs(java.util.List<AlarmPkgDO> alarmPkgs) {
        this.alarmPkgs = alarmPkgs;
        return this;
    }
    public java.util.List<AlarmPkgDO> getAlarmPkgs() {
        return this.alarmPkgs;
    }

    public CustomPluginDO setBlackFilters(java.util.List<Filter> blackFilters) {
        this.blackFilters = blackFilters;
        return this;
    }
    public java.util.List<Filter> getBlackFilters() {
        return this.blackFilters;
    }

    public CustomPluginDO setWhiteFilters(java.util.List<Filter> whiteFilters) {
        this.whiteFilters = whiteFilters;
        return this;
    }
    public java.util.List<Filter> getWhiteFilters() {
        return this.whiteFilters;
    }

    public CustomPluginDO setOpsGroupBy(OpsGroupBy opsGroupBy) {
        this.opsGroupBy = opsGroupBy;
        return this;
    }
    public OpsGroupBy getOpsGroupBy() {
        return this.opsGroupBy;
    }

    public CustomPluginDO setCal(Cal cal) {
        this.cal = cal;
        return this;
    }
    public Cal getCal() {
        return this.cal;
    }

    public CustomPluginDO setStatus(StatusDO status) {
        this.status = status;
        return this;
    }
    public StatusDO getStatus() {
        return this.status;
    }

    public CustomPluginDO setTopAlarm(TopAlarmDO topAlarm) {
        this.topAlarm = topAlarm;
        return this;
    }
    public TopAlarmDO getTopAlarm() {
        return this.topAlarm;
    }

    public CustomPluginDO setGroupBy(java.util.List<Filter> groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public java.util.List<Filter> getGroupBy() {
        return this.groupBy;
    }

    public CustomPluginDO setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }
    public String getStatusDesc() {
        return this.statusDesc;
    }

    public CustomPluginDO setDkNeed(Boolean dkNeed) {
        this.dkNeed = dkNeed;
        return this;
    }
    public Boolean getDkNeed() {
        return this.dkNeed;
    }

    public CustomPluginDO setDks(String dks) {
        this.dks = dks;
        return this;
    }
    public String getDks() {
        return this.dks;
    }

    public CustomPluginDO setBaselineNeed(Boolean baselineNeed) {
        this.baselineNeed = baselineNeed;
        return this;
    }
    public Boolean getBaselineNeed() {
        return this.baselineNeed;
    }

    public CustomPluginDO setFlushBasin(Boolean flushBasin) {
        this.flushBasin = flushBasin;
        return this;
    }
    public Boolean getFlushBasin() {
        return this.flushBasin;
    }

    public CustomPluginDO setXflushApps(String xflushApps) {
        this.xflushApps = xflushApps;
        return this;
    }
    public String getXflushApps() {
        return this.xflushApps;
    }

    public CustomPluginDO setScriptNew(String scriptNew) {
        this.scriptNew = scriptNew;
        return this;
    }
    public String getScriptNew() {
        return this.scriptNew;
    }

    public CustomPluginDO setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
        return this;
    }
    public Boolean getIsOpen() {
        return this.isOpen;
    }

    public CustomPluginDO setPluginTypeAlias(String pluginTypeAlias) {
        this.pluginTypeAlias = pluginTypeAlias;
        return this;
    }
    public String getPluginTypeAlias() {
        return this.pluginTypeAlias;
    }

}
