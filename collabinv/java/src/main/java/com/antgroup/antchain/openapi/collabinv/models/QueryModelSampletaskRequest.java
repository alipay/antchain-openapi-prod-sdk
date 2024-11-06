// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class QueryModelSampletaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 事件查询序号编码，在有loop_code接口返回值的异步接口的值
    // 如：antchain.zkcollabinv.model.samplefile.push、antchain.zkcollabinv.model.sampletask.exec
    @NameInMap("loop_code")
    @Validation(required = true)
    public String loopCode;

    // 阶段：poc_050 样本提交阶段，poc_500 任务跑批阶段
    @NameInMap("phase")
    @Validation(required = true)
    public String phase;

    public static QueryModelSampletaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryModelSampletaskRequest self = new QueryModelSampletaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryModelSampletaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryModelSampletaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryModelSampletaskRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public QueryModelSampletaskRequest setLoopCode(String loopCode) {
        this.loopCode = loopCode;
        return this;
    }
    public String getLoopCode() {
        return this.loopCode;
    }

    public QueryModelSampletaskRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

}
