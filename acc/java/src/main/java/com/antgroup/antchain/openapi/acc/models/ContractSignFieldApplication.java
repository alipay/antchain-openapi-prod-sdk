// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class ContractSignFieldApplication extends TeaModel {
    // add_sign_time
    @NameInMap("add_sign_time")
    public Boolean addSignTime;

    // authorized_account_id
    @NameInMap("authorized_account_id")
    @Validation(required = true)
    public String authorizedAccountId;

    // file_id
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // order
    @NameInMap("order")
    public String order;

    // pos_page
    @NameInMap("pos_page")
    @Validation(required = true)
    public String posPage;

    // pos_x
    @NameInMap("pos_x")
    @Validation(required = true)
    public String posX;

    // seal_id
    @NameInMap("seal_id")
    public String sealId;

    // third_order_no
    @NameInMap("third_order_no")
    public String thirdOrderNo;

    // pos_y
    @NameInMap("pos_y")
    @Validation(required = true)
    public String posY;

    // width
    @NameInMap("width")
    public String width;

    // signType
    @NameInMap("sign_type")
    public Long signType;

    public static ContractSignFieldApplication build(java.util.Map<String, ?> map) throws Exception {
        ContractSignFieldApplication self = new ContractSignFieldApplication();
        return TeaModel.build(map, self);
    }

    public ContractSignFieldApplication setAddSignTime(Boolean addSignTime) {
        this.addSignTime = addSignTime;
        return this;
    }
    public Boolean getAddSignTime() {
        return this.addSignTime;
    }

    public ContractSignFieldApplication setAuthorizedAccountId(String authorizedAccountId) {
        this.authorizedAccountId = authorizedAccountId;
        return this;
    }
    public String getAuthorizedAccountId() {
        return this.authorizedAccountId;
    }

    public ContractSignFieldApplication setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ContractSignFieldApplication setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ContractSignFieldApplication setPosPage(String posPage) {
        this.posPage = posPage;
        return this;
    }
    public String getPosPage() {
        return this.posPage;
    }

    public ContractSignFieldApplication setPosX(String posX) {
        this.posX = posX;
        return this;
    }
    public String getPosX() {
        return this.posX;
    }

    public ContractSignFieldApplication setSealId(String sealId) {
        this.sealId = sealId;
        return this;
    }
    public String getSealId() {
        return this.sealId;
    }

    public ContractSignFieldApplication setThirdOrderNo(String thirdOrderNo) {
        this.thirdOrderNo = thirdOrderNo;
        return this;
    }
    public String getThirdOrderNo() {
        return this.thirdOrderNo;
    }

    public ContractSignFieldApplication setPosY(String posY) {
        this.posY = posY;
        return this;
    }
    public String getPosY() {
        return this.posY;
    }

    public ContractSignFieldApplication setWidth(String width) {
        this.width = width;
        return this;
    }
    public String getWidth() {
        return this.width;
    }

    public ContractSignFieldApplication setSignType(Long signType) {
        this.signType = signType;
        return this;
    }
    public Long getSignType() {
        return this.signType;
    }

}
