// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.finmaterial.models;

import com.aliyun.tea.*;

public class ResponseMetadata extends TeaModel {
    // 请求关联标识；优先回显合法 X-Request-Id，缺失或非法时由服务端生成；不用于幂等或去重
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 接口版本
    /**
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    // 服务区域
    /**
     * <strong>example:</strong>
     * <p>cn-xx</p>
     */
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // 请求处理耗时，单位为毫秒
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("time_cost")
    @Validation(required = true)
    public Long timeCost;

    public static ResponseMetadata build(java.util.Map<String, ?> map) throws Exception {
        ResponseMetadata self = new ResponseMetadata();
        return TeaModel.build(map, self);
    }

    public ResponseMetadata setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResponseMetadata setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ResponseMetadata setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ResponseMetadata setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

}
