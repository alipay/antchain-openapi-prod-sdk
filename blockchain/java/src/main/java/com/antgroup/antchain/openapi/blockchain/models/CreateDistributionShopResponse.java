// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDistributionShopResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商户管理员唯一标识
    @NameInMap("admin_user_id")
    public String adminUserId;

    // 商户创建时间
    @NameInMap("create_time")
    public String createTime;

    // 商户唯一标识
    @NameInMap("shop_id")
    public String shopId;

    public static CreateDistributionShopResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributionShopResponse self = new CreateDistributionShopResponse();
        return TeaModel.build(map, self);
    }

    public CreateDistributionShopResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateDistributionShopResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDistributionShopResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateDistributionShopResponse setAdminUserId(String adminUserId) {
        this.adminUserId = adminUserId;
        return this;
    }
    public String getAdminUserId() {
        return this.adminUserId;
    }

    public CreateDistributionShopResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CreateDistributionShopResponse setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

}
