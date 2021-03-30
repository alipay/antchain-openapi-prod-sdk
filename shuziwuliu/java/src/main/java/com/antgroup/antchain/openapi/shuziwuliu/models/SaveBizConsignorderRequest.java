// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBizConsignorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    @NameInMap("action")
    public String action;

    // 托单code
    @NameInMap("consign_order_code")
    @Validation(required = true)
    public String consignOrderCode;

    // 托单文件hash  业务必填
    @NameInMap("file_hash")
    public String fileHash;

    // 托单文件id  业务必填
    @NameInMap("file_id")
    public String fileId;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    public static SaveBizConsignorderRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBizConsignorderRequest self = new SaveBizConsignorderRequest();
        return TeaModel.build(map, self);
    }

    public SaveBizConsignorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBizConsignorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBizConsignorderRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public SaveBizConsignorderRequest setConsignOrderCode(String consignOrderCode) {
        this.consignOrderCode = consignOrderCode;
        return this;
    }
    public String getConsignOrderCode() {
        return this.consignOrderCode;
    }

    public SaveBizConsignorderRequest setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

    public SaveBizConsignorderRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public SaveBizConsignorderRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBizConsignorderRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

}
