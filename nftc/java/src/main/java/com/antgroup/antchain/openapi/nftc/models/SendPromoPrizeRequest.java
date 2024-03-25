// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class SendPromoPrizeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 鲸探用户唯一标识
    @NameInMap("open_user_id")
    @Validation(required = true)
    public String openUserId;

    // 海豚活动ID，鲸探运营在海豚创建的活动ID
    @NameInMap("camp_id")
    @Validation(required = true)
    public String campId;

    // 海豚奖品ID，鲸探运营在海豚创建的奖品ID
    @NameInMap("prize_id")
    @Validation(required = true)
    public String prizeId;

    // 调用方唯一幂等号
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    public static SendPromoPrizeRequest build(java.util.Map<String, ?> map) throws Exception {
        SendPromoPrizeRequest self = new SendPromoPrizeRequest();
        return TeaModel.build(map, self);
    }

    public SendPromoPrizeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendPromoPrizeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendPromoPrizeRequest setOpenUserId(String openUserId) {
        this.openUserId = openUserId;
        return this;
    }
    public String getOpenUserId() {
        return this.openUserId;
    }

    public SendPromoPrizeRequest setCampId(String campId) {
        this.campId = campId;
        return this;
    }
    public String getCampId() {
        return this.campId;
    }

    public SendPromoPrizeRequest setPrizeId(String prizeId) {
        this.prizeId = prizeId;
        return this;
    }
    public String getPrizeId() {
        return this.prizeId;
    }

    public SendPromoPrizeRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

}
