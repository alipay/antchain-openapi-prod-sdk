// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiVersionVO extends TeaModel {
    // API标识
    @NameInMap("api_id")
    public String apiId;

    // editOperator
    @NameInMap("edit_operator")
    public String editOperator;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 编辑时间
    @NameInMap("gmt_edit")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtEdit;

    // 更改时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // gmtOffline
    @NameInMap("gmt_offline")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtOffline;

    // gmtOnline
    @NameInMap("gmt_online")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtOnline;

    // offlineDesc
    @NameInMap("offline_desc")
    public String offlineDesc;

    // offlineOperator
    @NameInMap("offline_operator")
    public String offlineOperator;

    // onlineDesc
    @NameInMap("online_desc")
    public String onlineDesc;

    // onlineOperator
    @NameInMap("online_operator")
    public String onlineOperator;

    // versionId
    @NameInMap("version_id")
    public String versionId;

    // 版本号
    @NameInMap("version_no")
    public String versionNo;

    // versionStatus
    @NameInMap("version_status")
    public String versionStatus;

    // 能否发布
    @NameInMap("can_online")
    public Boolean canOnline;

    public static ApiVersionVO build(java.util.Map<String, ?> map) throws Exception {
        ApiVersionVO self = new ApiVersionVO();
        return TeaModel.build(map, self);
    }

    public ApiVersionVO setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public ApiVersionVO setEditOperator(String editOperator) {
        this.editOperator = editOperator;
        return this;
    }
    public String getEditOperator() {
        return this.editOperator;
    }

    public ApiVersionVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ApiVersionVO setGmtEdit(String gmtEdit) {
        this.gmtEdit = gmtEdit;
        return this;
    }
    public String getGmtEdit() {
        return this.gmtEdit;
    }

    public ApiVersionVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ApiVersionVO setGmtOffline(String gmtOffline) {
        this.gmtOffline = gmtOffline;
        return this;
    }
    public String getGmtOffline() {
        return this.gmtOffline;
    }

    public ApiVersionVO setGmtOnline(String gmtOnline) {
        this.gmtOnline = gmtOnline;
        return this;
    }
    public String getGmtOnline() {
        return this.gmtOnline;
    }

    public ApiVersionVO setOfflineDesc(String offlineDesc) {
        this.offlineDesc = offlineDesc;
        return this;
    }
    public String getOfflineDesc() {
        return this.offlineDesc;
    }

    public ApiVersionVO setOfflineOperator(String offlineOperator) {
        this.offlineOperator = offlineOperator;
        return this;
    }
    public String getOfflineOperator() {
        return this.offlineOperator;
    }

    public ApiVersionVO setOnlineDesc(String onlineDesc) {
        this.onlineDesc = onlineDesc;
        return this;
    }
    public String getOnlineDesc() {
        return this.onlineDesc;
    }

    public ApiVersionVO setOnlineOperator(String onlineOperator) {
        this.onlineOperator = onlineOperator;
        return this;
    }
    public String getOnlineOperator() {
        return this.onlineOperator;
    }

    public ApiVersionVO setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public ApiVersionVO setVersionNo(String versionNo) {
        this.versionNo = versionNo;
        return this;
    }
    public String getVersionNo() {
        return this.versionNo;
    }

    public ApiVersionVO setVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
        return this;
    }
    public String getVersionStatus() {
        return this.versionStatus;
    }

    public ApiVersionVO setCanOnline(Boolean canOnline) {
        this.canOnline = canOnline;
        return this;
    }
    public Boolean getCanOnline() {
        return this.canOnline;
    }

}
