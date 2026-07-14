// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class QueryApplyRecordRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 预览记录号
    @NameInMap("preview_log_no")
    @Validation(required = true)
    public String previewLogNo;

    // 系统来源
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    public static QueryApplyRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApplyRecordRequest self = new QueryApplyRecordRequest();
        return TeaModel.build(map, self);
    }

    public QueryApplyRecordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApplyRecordRequest setPreviewLogNo(String previewLogNo) {
        this.previewLogNo = previewLogNo;
        return this;
    }
    public String getPreviewLogNo() {
        return this.previewLogNo;
    }

    public QueryApplyRecordRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
