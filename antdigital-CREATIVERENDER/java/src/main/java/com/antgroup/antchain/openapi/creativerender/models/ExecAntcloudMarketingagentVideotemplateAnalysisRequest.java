// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class ExecAntcloudMarketingagentVideotemplateAnalysisRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 本次操作幂等键，最多64字符
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 原视频
    @NameInMap("origin_video")
    @Validation(required = true)
    public CreativeVideoAssetRef originVideo;

    public static ExecAntcloudMarketingagentVideotemplateAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudMarketingagentVideotemplateAnalysisRequest self = new ExecAntcloudMarketingagentVideotemplateAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudMarketingagentVideotemplateAnalysisRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAntcloudMarketingagentVideotemplateAnalysisRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecAntcloudMarketingagentVideotemplateAnalysisRequest setOriginVideo(CreativeVideoAssetRef originVideo) {
        this.originVideo = originVideo;
        return this;
    }
    public CreativeVideoAssetRef getOriginVideo() {
        return this.originVideo;
    }

}
