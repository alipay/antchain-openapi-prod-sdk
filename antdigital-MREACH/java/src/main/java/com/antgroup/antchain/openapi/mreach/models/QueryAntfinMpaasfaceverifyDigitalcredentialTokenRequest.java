// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mreach.models;

import com.aliyun.tea.*;

public class QueryAntfinMpaasfaceverifyDigitalcredentialTokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // IIFAA可信身份认证业务标识，用于轮询查询数字凭证生成状态
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 扩展信息，建议使用JSON字符串，用于接口快速扩展
    @NameInMap("extern_info")
    public String externInfo;

    public static QueryAntfinMpaasfaceverifyDigitalcredentialTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntfinMpaasfaceverifyDigitalcredentialTokenRequest self = new QueryAntfinMpaasfaceverifyDigitalcredentialTokenRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialTokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialTokenRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialTokenRequest setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
