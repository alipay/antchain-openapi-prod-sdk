// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion.models;

import com.aliyun.tea.*;

public class SignActionInfo extends TeaModel {
    // 能力：WITHHOLD 代扣签约 / PREAUTH 预授权冻结 / CONTRACT 合同签署
    /**
     * <strong>example:</strong>
     * <p>WITHHOLD</p>
     */
    @NameInMap("capability")
    public String capability;

    // 拉起参数：代扣为支付宝签约串、预授权为 orderStr、合同为签署链接。须原样传给淘宝小程序唤起对应页面；仅代表可拉起，不代表签约成功
    /**
     * <strong>example:</strong>
     * <p>orderStr</p>
     */
    @NameInMap("action_url")
    public String actionUrl;

    // PENDING 已受理且已返回拉起参数；FAIL 项不再重复返回拉起参数，须重新下单
    /**
     * <strong>example:</strong>
     * <p>PENDING</p>
     */
    @NameInMap("initiate_result")
    public String initiateResult;

    public static SignActionInfo build(java.util.Map<String, ?> map) throws Exception {
        SignActionInfo self = new SignActionInfo();
        return TeaModel.build(map, self);
    }

    public SignActionInfo setCapability(String capability) {
        this.capability = capability;
        return this;
    }
    public String getCapability() {
        return this.capability;
    }

    public SignActionInfo setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
        return this;
    }
    public String getActionUrl() {
        return this.actionUrl;
    }

    public SignActionInfo setInitiateResult(String initiateResult) {
        this.initiateResult = initiateResult;
        return this;
    }
    public String getInitiateResult() {
        return this.initiateResult;
    }

}
