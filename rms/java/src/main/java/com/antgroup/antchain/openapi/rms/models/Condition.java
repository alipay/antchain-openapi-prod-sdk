// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class Condition extends TeaModel {
    // plugin
    @NameInMap("plugin")
    @Validation(required = true)
    public String plugin;

    // content_type
    @NameInMap("content_type")
    @Validation(required = true)
    public String contentType;

    // tag
    @NameInMap("tag")
    @Validation(required = true)
    public String tag;

    // ds_id
    @NameInMap("ds_id")
    @Validation(required = true)
    public String dsId;

    // new_cp_id
    @NameInMap("new_cp_id")
    @Validation(required = true)
    public String newCpId;

    // start
    @NameInMap("start")
    @Validation(required = true)
    public Long start;

    // end
    @NameInMap("end")
    @Validation(required = true)
    public Long end;

    // tick_interval
    @NameInMap("tick_interval")
    @Validation(required = true)
    public Long tickInterval;

    // use_new
    @NameInMap("use_new")
    @Validation(required = true)
    public Boolean useNew;

    // groupby
    @NameInMap("groupby")
    @Validation(required = true)
    public java.util.List<String> groupby;

    // values
    @NameInMap("values")
    @Validation(required = true)
    public java.util.List<KeySet> values;

    // tenant_id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public Long tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public Long workspaceId;

    // am_old_data_struct
    @NameInMap("am_old_data_struct")
    @Validation(required = true)
    public Boolean amOldDataStruct;

    // am_is_spm
    @NameInMap("am_is_spm")
    @Validation(required = true)
    public Boolean amIsSpm;

    // old_ds_id
    @NameInMap("old_ds_id")
    @Validation(required = true)
    public String oldDsId;

    public static Condition build(java.util.Map<String, ?> map) throws Exception {
        Condition self = new Condition();
        return TeaModel.build(map, self);
    }

    public Condition setPlugin(String plugin) {
        this.plugin = plugin;
        return this;
    }
    public String getPlugin() {
        return this.plugin;
    }

    public Condition setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public Condition setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public Condition setDsId(String dsId) {
        this.dsId = dsId;
        return this;
    }
    public String getDsId() {
        return this.dsId;
    }

    public Condition setNewCpId(String newCpId) {
        this.newCpId = newCpId;
        return this;
    }
    public String getNewCpId() {
        return this.newCpId;
    }

    public Condition setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public Condition setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public Condition setTickInterval(Long tickInterval) {
        this.tickInterval = tickInterval;
        return this;
    }
    public Long getTickInterval() {
        return this.tickInterval;
    }

    public Condition setUseNew(Boolean useNew) {
        this.useNew = useNew;
        return this;
    }
    public Boolean getUseNew() {
        return this.useNew;
    }

    public Condition setGroupby(java.util.List<String> groupby) {
        this.groupby = groupby;
        return this;
    }
    public java.util.List<String> getGroupby() {
        return this.groupby;
    }

    public Condition setValues(java.util.List<KeySet> values) {
        this.values = values;
        return this;
    }
    public java.util.List<KeySet> getValues() {
        return this.values;
    }

    public Condition setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public Condition setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public Condition setAmOldDataStruct(Boolean amOldDataStruct) {
        this.amOldDataStruct = amOldDataStruct;
        return this;
    }
    public Boolean getAmOldDataStruct() {
        return this.amOldDataStruct;
    }

    public Condition setAmIsSpm(Boolean amIsSpm) {
        this.amIsSpm = amIsSpm;
        return this;
    }
    public Boolean getAmIsSpm() {
        return this.amIsSpm;
    }

    public Condition setOldDsId(String oldDsId) {
        this.oldDsId = oldDsId;
        return this;
    }
    public String getOldDsId() {
        return this.oldDsId;
    }

}
