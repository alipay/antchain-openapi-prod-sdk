// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadTransportReceiptRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 货主did，一般为合同甲方的链上数字身份
    @NameInMap("consignor_did")
    @Validation(required = true)
    public String consignorDid;

    // 请求蚂蚁影像上传接口上传文件获取的文件id和文件hash信息。影像文件格式：bmp,jpg,jpeg,gif,psd,png,tiff,tga,eps,pdf
    @NameInMap("file_info")
    @Validation(required = true)
    public UploadFileInfo fileInfo;

    // 回单id，客户编辑的唯一回单编码
    @NameInMap("receipt_id")
    @Validation(required = true)
    public String receiptId;

    // 客户系统内运单编号
    @NameInMap("tax_waybill_id")
    @Validation(required = true)
    public String taxWaybillId;

    // 3plDid，一般为合同乙方的链上数字身份
    @NameInMap("third_party_logistics_did")
    @Validation(required = true)
    public String thirdPartyLogisticsDid;

    public static UploadTransportReceiptRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadTransportReceiptRequest self = new UploadTransportReceiptRequest();
        return TeaModel.build(map, self);
    }

    public UploadTransportReceiptRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadTransportReceiptRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadTransportReceiptRequest setConsignorDid(String consignorDid) {
        this.consignorDid = consignorDid;
        return this;
    }
    public String getConsignorDid() {
        return this.consignorDid;
    }

    public UploadTransportReceiptRequest setFileInfo(UploadFileInfo fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }
    public UploadFileInfo getFileInfo() {
        return this.fileInfo;
    }

    public UploadTransportReceiptRequest setReceiptId(String receiptId) {
        this.receiptId = receiptId;
        return this;
    }
    public String getReceiptId() {
        return this.receiptId;
    }

    public UploadTransportReceiptRequest setTaxWaybillId(String taxWaybillId) {
        this.taxWaybillId = taxWaybillId;
        return this;
    }
    public String getTaxWaybillId() {
        return this.taxWaybillId;
    }

    public UploadTransportReceiptRequest setThirdPartyLogisticsDid(String thirdPartyLogisticsDid) {
        this.thirdPartyLogisticsDid = thirdPartyLogisticsDid;
        return this;
    }
    public String getThirdPartyLogisticsDid() {
        return this.thirdPartyLogisticsDid;
    }

}
