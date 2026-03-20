// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class FillDubbridgeEccreditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务场景码
    @NameInMap("business_scene")
    @Validation(required = true)
    public String businessScene;

    // 外部申请编号 合作方调用时，生成唯一流水号
    @NameInMap("third_apply_no")
    @Validation(required = true)
    public String thirdApplyNo;

    // biz_content
    @NameInMap("biz_content")
    @Validation(required = true)
    public EcBizContend bizContent;

    public static FillDubbridgeEccreditRequest build(java.util.Map<String, ?> map) throws Exception {
        FillDubbridgeEccreditRequest self = new FillDubbridgeEccreditRequest();
        return TeaModel.build(map, self);
    }

    public FillDubbridgeEccreditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public FillDubbridgeEccreditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public FillDubbridgeEccreditRequest setBusinessScene(String businessScene) {
        this.businessScene = businessScene;
        return this;
    }
    public String getBusinessScene() {
        return this.businessScene;
    }

    public FillDubbridgeEccreditRequest setThirdApplyNo(String thirdApplyNo) {
        this.thirdApplyNo = thirdApplyNo;
        return this;
    }
    public String getThirdApplyNo() {
        return this.thirdApplyNo;
    }

    public FillDubbridgeEccreditRequest setBizContent(EcBizContend bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public EcBizContend getBizContent() {
        return this.bizContent;
    }

}
