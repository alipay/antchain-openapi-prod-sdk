// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class LimitConfigVO extends TeaModel {
    // 是否需要限制
    @NameInMap("need_limit")
    public Boolean needLimit;

    // 限制阈值
    @NameInMap("limit")
    public Long limit;

    // 限制响应类型
    @NameInMap("limit_rsp_type")
    public String limitRspType;

    // 响应信息
    @NameInMap("rsp_msg")
    public String rspMsg;

    public static LimitConfigVO build(java.util.Map<String, ?> map) throws Exception {
        LimitConfigVO self = new LimitConfigVO();
        return TeaModel.build(map, self);
    }

    public LimitConfigVO setNeedLimit(Boolean needLimit) {
        this.needLimit = needLimit;
        return this;
    }
    public Boolean getNeedLimit() {
        return this.needLimit;
    }

    public LimitConfigVO setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public LimitConfigVO setLimitRspType(String limitRspType) {
        this.limitRspType = limitRspType;
        return this;
    }
    public String getLimitRspType() {
        return this.limitRspType;
    }

    public LimitConfigVO setRspMsg(String rspMsg) {
        this.rspMsg = rspMsg;
        return this;
    }
    public String getRspMsg() {
        return this.rspMsg;
    }

}
