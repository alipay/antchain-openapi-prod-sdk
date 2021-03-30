// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBizPayinvoicefileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除，INSERT为新增
    @NameInMap("action")
    public String action;

    // 发票文件hash [业务必填]
    @NameInMap("file_hash")
    public String fileHash;

    // 发票文件ID [业务必填]
    @NameInMap("file_id")
    public String fileId;

    // 货代DID
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 应付发票code
    @NameInMap("invoice_code")
    @Validation(required = true)
    public String invoiceCode;

    public static SaveBizPayinvoicefileRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBizPayinvoicefileRequest self = new SaveBizPayinvoicefileRequest();
        return TeaModel.build(map, self);
    }

    public SaveBizPayinvoicefileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBizPayinvoicefileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBizPayinvoicefileRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public SaveBizPayinvoicefileRequest setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

    public SaveBizPayinvoicefileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public SaveBizPayinvoicefileRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBizPayinvoicefileRequest setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
        return this;
    }
    public String getInvoiceCode() {
        return this.invoiceCode;
    }

}
