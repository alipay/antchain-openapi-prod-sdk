// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class ContractSignResponse extends TeaModel {
    // 流程id
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    // 签署链接数组
    @NameInMap("sign_url_list")
    @Validation(required = true)
    public java.util.List<SignUrlResp> signUrlList;

    public static ContractSignResponse build(java.util.Map<String, ?> map) throws Exception {
        ContractSignResponse self = new ContractSignResponse();
        return TeaModel.build(map, self);
    }

    public ContractSignResponse setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ContractSignResponse setSignUrlList(java.util.List<SignUrlResp> signUrlList) {
        this.signUrlList = signUrlList;
        return this;
    }
    public java.util.List<SignUrlResp> getSignUrlList() {
        return this.signUrlList;
    }

}
