// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadShippingEblRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 船公司名称
    @NameInMap("carrier_name")
    @Validation(required = true)
    public String carrierName;

    // 收货人did
    @NameInMap("consignee_did")
    @Validation(required = true)
    public String consigneeDid;

    // 电子提单类型
    @NameInMap("ebl_category")
    @Validation(required = true)
    public String eblCategory;

    // 电子提单copy文件hash
    @NameInMap("ebl_copy_pdf_file_hash")
    @Validation(required = true)
    public String eblCopyPdfFileHash;

    // copy电子提单pdf文件id
    @NameInMap("ebl_copy_pdf_file_id")
    @Validation(required = true)
    public String eblCopyPdfFileId;

    // 电子提单编号
    @NameInMap("ebl_no")
    @Validation(required = true)
    public String eblNo;

    // 电子甜的原文件hash
    @NameInMap("ebl_original_pdf_file_hash")
    public String eblOriginalPdfFileHash;

    // 原电子提单pdf文件id
    @NameInMap("ebl_original_pdf_file_id")
    public String eblOriginalPdfFileId;

    // 议付行did
    @NameInMap("negotiating_bank_did")
    @Validation(required = true)
    public String negotiatingBankDid;

    // 托运人did
    @NameInMap("shipper_did")
    @Validation(required = true)
    public String shipperDid;

    public static UploadShippingEblRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadShippingEblRequest self = new UploadShippingEblRequest();
        return TeaModel.build(map, self);
    }

    public UploadShippingEblRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadShippingEblRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadShippingEblRequest setCarrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }
    public String getCarrierName() {
        return this.carrierName;
    }

    public UploadShippingEblRequest setConsigneeDid(String consigneeDid) {
        this.consigneeDid = consigneeDid;
        return this;
    }
    public String getConsigneeDid() {
        return this.consigneeDid;
    }

    public UploadShippingEblRequest setEblCategory(String eblCategory) {
        this.eblCategory = eblCategory;
        return this;
    }
    public String getEblCategory() {
        return this.eblCategory;
    }

    public UploadShippingEblRequest setEblCopyPdfFileHash(String eblCopyPdfFileHash) {
        this.eblCopyPdfFileHash = eblCopyPdfFileHash;
        return this;
    }
    public String getEblCopyPdfFileHash() {
        return this.eblCopyPdfFileHash;
    }

    public UploadShippingEblRequest setEblCopyPdfFileId(String eblCopyPdfFileId) {
        this.eblCopyPdfFileId = eblCopyPdfFileId;
        return this;
    }
    public String getEblCopyPdfFileId() {
        return this.eblCopyPdfFileId;
    }

    public UploadShippingEblRequest setEblNo(String eblNo) {
        this.eblNo = eblNo;
        return this;
    }
    public String getEblNo() {
        return this.eblNo;
    }

    public UploadShippingEblRequest setEblOriginalPdfFileHash(String eblOriginalPdfFileHash) {
        this.eblOriginalPdfFileHash = eblOriginalPdfFileHash;
        return this;
    }
    public String getEblOriginalPdfFileHash() {
        return this.eblOriginalPdfFileHash;
    }

    public UploadShippingEblRequest setEblOriginalPdfFileId(String eblOriginalPdfFileId) {
        this.eblOriginalPdfFileId = eblOriginalPdfFileId;
        return this;
    }
    public String getEblOriginalPdfFileId() {
        return this.eblOriginalPdfFileId;
    }

    public UploadShippingEblRequest setNegotiatingBankDid(String negotiatingBankDid) {
        this.negotiatingBankDid = negotiatingBankDid;
        return this;
    }
    public String getNegotiatingBankDid() {
        return this.negotiatingBankDid;
    }

    public UploadShippingEblRequest setShipperDid(String shipperDid) {
        this.shipperDid = shipperDid;
        return this;
    }
    public String getShipperDid() {
        return this.shipperDid;
    }

}
