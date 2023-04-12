// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UpdateJusticeRightsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 案件维权记录编号
    @NameInMap("record_id")
    @Validation(required = true)
    public Long recordId;

    // 案件状态(枚举)
    @NameInMap("case_status")
    @Validation(required = true)
    public String caseStatus;

    // 状态扩展信息示例查看对接文档
    @NameInMap("status_ext")
    public String statusExt;

    // 文件信息,示例查看对接文档
    @NameInMap("status_file_infos")
    public java.util.List<FileInfo> statusFileInfos;

    public static UpdateJusticeRightsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJusticeRightsRequest self = new UpdateJusticeRightsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJusticeRightsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateJusticeRightsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateJusticeRightsRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public UpdateJusticeRightsRequest setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
        return this;
    }
    public String getCaseStatus() {
        return this.caseStatus;
    }

    public UpdateJusticeRightsRequest setStatusExt(String statusExt) {
        this.statusExt = statusExt;
        return this;
    }
    public String getStatusExt() {
        return this.statusExt;
    }

    public UpdateJusticeRightsRequest setStatusFileInfos(java.util.List<FileInfo> statusFileInfos) {
        this.statusFileInfos = statusFileInfos;
        return this;
    }
    public java.util.List<FileInfo> getStatusFileInfos() {
        return this.statusFileInfos;
    }

}
