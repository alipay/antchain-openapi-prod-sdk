// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion.models;

import com.aliyun.tea.*;

public class RentalSignInitiateResp extends TeaModel {
    // 受理后的签约单状态,首次受理为 SIGNING
    /**
     * <strong>example:</strong>
     * <p>SIGNING</p>
     */
    @NameInMap("sign_status")
    public String signStatus;

    // 本次受理返回的拉起参数列表，一个能力一条；空列表表示本次受理没有可返回的拉起参数（如重复受理）
    /**
     * <strong>example:</strong>
     * <p>[{&quot;capability&quot;:&quot;PREAUTH&quot;,&quot;actionUrl&quot;:&quot;orderStr=2026111200012345PREAUTH&quot;,&quot;initiateResult&quot;:&quot;PENDING&quot;},{&quot;capability&quot;:&quot;WITHHOLD&quot;,&quot;actionUrl&quot;:&quot;signStr=2026111200012345WITHHOLD&quot;,&quot;initiateResult&quot;:&quot;PENDING&quot;}]</p>
     */
    @NameInMap("actions")
    public java.util.List<SignActionInfo> actions;

    public static RentalSignInitiateResp build(java.util.Map<String, ?> map) throws Exception {
        RentalSignInitiateResp self = new RentalSignInitiateResp();
        return TeaModel.build(map, self);
    }

    public RentalSignInitiateResp setSignStatus(String signStatus) {
        this.signStatus = signStatus;
        return this;
    }
    public String getSignStatus() {
        return this.signStatus;
    }

    public RentalSignInitiateResp setActions(java.util.List<SignActionInfo> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<SignActionInfo> getActions() {
        return this.actions;
    }

}
