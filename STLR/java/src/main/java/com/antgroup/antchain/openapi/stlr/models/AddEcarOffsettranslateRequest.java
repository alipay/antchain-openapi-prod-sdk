// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class AddEcarOffsettranslateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 转移业务流水单号
    @NameInMap("translation_item_no")
    @Validation(required = true)
    public String translationItemNo;

    // 碳补偿项目编号
    @NameInMap("project_no")
    @Validation(required = true)
    public String projectNo;

    // 出账账户DID
    @NameInMap("drawing_account_did")
    @Validation(required = true)
    public String drawingAccountDid;

    // 转移入账账户DID
    @NameInMap("receipt_account_did")
    @Validation(required = true)
    public String receiptAccountDid;

    // 转移减碳量额度，最多六位小数
    @NameInMap("translation_ammount")
    @Validation(required = true)
    public String translationAmmount;

    // 业务类型包括，默认不需要传入，默认值为Translation
    @NameInMap("translation_type")
    public String translationType;

    // 发生时间，格式为yyyy-MM-DD HH:MM:SS
    @NameInMap("occurrent_time")
    @Validation(required = true)
    public String occurrentTime;

    public static AddEcarOffsettranslateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEcarOffsettranslateRequest self = new AddEcarOffsettranslateRequest();
        return TeaModel.build(map, self);
    }

    public AddEcarOffsettranslateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddEcarOffsettranslateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddEcarOffsettranslateRequest setTranslationItemNo(String translationItemNo) {
        this.translationItemNo = translationItemNo;
        return this;
    }
    public String getTranslationItemNo() {
        return this.translationItemNo;
    }

    public AddEcarOffsettranslateRequest setProjectNo(String projectNo) {
        this.projectNo = projectNo;
        return this;
    }
    public String getProjectNo() {
        return this.projectNo;
    }

    public AddEcarOffsettranslateRequest setDrawingAccountDid(String drawingAccountDid) {
        this.drawingAccountDid = drawingAccountDid;
        return this;
    }
    public String getDrawingAccountDid() {
        return this.drawingAccountDid;
    }

    public AddEcarOffsettranslateRequest setReceiptAccountDid(String receiptAccountDid) {
        this.receiptAccountDid = receiptAccountDid;
        return this;
    }
    public String getReceiptAccountDid() {
        return this.receiptAccountDid;
    }

    public AddEcarOffsettranslateRequest setTranslationAmmount(String translationAmmount) {
        this.translationAmmount = translationAmmount;
        return this;
    }
    public String getTranslationAmmount() {
        return this.translationAmmount;
    }

    public AddEcarOffsettranslateRequest setTranslationType(String translationType) {
        this.translationType = translationType;
        return this;
    }
    public String getTranslationType() {
        return this.translationType;
    }

    public AddEcarOffsettranslateRequest setOccurrentTime(String occurrentTime) {
        this.occurrentTime = occurrentTime;
        return this;
    }
    public String getOccurrentTime() {
        return this.occurrentTime;
    }

}
