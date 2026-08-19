// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mreach.models;

import com.aliyun.tea.*;

public class QueryAntfinMpaasfaceverifyDigitalcredentialVpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // mPaaS数字凭证查询单据号，由Token查询接口返回
    @NameInMap("certify_no")
    @Validation(required = true)
    public String certifyNo;

    // 扩展信息，建议使用JSON字符串，用于接口快速扩展
    @NameInMap("extern_info")
    public String externInfo;

    public static QueryAntfinMpaasfaceverifyDigitalcredentialVpRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntfinMpaasfaceverifyDigitalcredentialVpRequest self = new QueryAntfinMpaasfaceverifyDigitalcredentialVpRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialVpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialVpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialVpRequest setCertifyNo(String certifyNo) {
        this.certifyNo = certifyNo;
        return this;
    }
    public String getCertifyNo() {
        return this.certifyNo;
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialVpRequest setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
