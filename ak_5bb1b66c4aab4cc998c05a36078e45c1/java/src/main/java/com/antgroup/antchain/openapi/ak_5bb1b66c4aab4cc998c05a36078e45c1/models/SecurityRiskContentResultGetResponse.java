// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5bb1b66c4aab4cc998c05a36078e45c1.models;

import com.aliyun.tea.*;

public class SecurityRiskContentResultGetResponse extends TeaModel {
    // 命中次数
    @NameInMap("hit_detect_items")
    public java.util.List<InfoSecHitDetectItem> hitDetectItems;

    // 返回结果
    @NameInMap("result_action")
    public String resultAction;

    public static SecurityRiskContentResultGetResponse build(java.util.Map<String, ?> map) throws Exception {
        SecurityRiskContentResultGetResponse self = new SecurityRiskContentResultGetResponse();
        return TeaModel.build(map, self);
    }

    public SecurityRiskContentResultGetResponse setHitDetectItems(java.util.List<InfoSecHitDetectItem> hitDetectItems) {
        this.hitDetectItems = hitDetectItems;
        return this;
    }
    public java.util.List<InfoSecHitDetectItem> getHitDetectItems() {
        return this.hitDetectItems;
    }

    public SecurityRiskContentResultGetResponse setResultAction(String resultAction) {
        this.resultAction = resultAction;
        return this;
    }
    public String getResultAction() {
        return this.resultAction;
    }

}
