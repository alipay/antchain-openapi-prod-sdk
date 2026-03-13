// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SettleInfo extends TeaModel {
    // 结算详细信息
    @NameInMap("settle_detail_infos")
    @Validation(required = true)
    public java.util.List<SettleDetailInfo> settleDetailInfos;

    public static SettleInfo build(java.util.Map<String, ?> map) throws Exception {
        SettleInfo self = new SettleInfo();
        return TeaModel.build(map, self);
    }

    public SettleInfo setSettleDetailInfos(java.util.List<SettleDetailInfo> settleDetailInfos) {
        this.settleDetailInfos = settleDetailInfos;
        return this;
    }
    public java.util.List<SettleDetailInfo> getSettleDetailInfos() {
        return this.settleDetailInfos;
    }

}
