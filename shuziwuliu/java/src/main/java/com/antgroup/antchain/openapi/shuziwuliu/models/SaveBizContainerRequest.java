// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBizContainerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    @NameInMap("action")
    public String action;

    // 订舱单号
    // 
    @NameInMap("booking_no")
    @Validation(required = true)
    public String bookingNo;

    // 集装箱ID
    @NameInMap("container_id")
    @Validation(required = true)
    public String containerId;

    // 箱号 业务必填
    @NameInMap("container_no")
    public String containerNo;

    //  箱型  业务必填
    @NameInMap("container_type")
    public String containerType;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 货物列表
    @NameInMap("goods_list")
    public java.util.List<ContainerGoodsParam> goodsList;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 备注
    @NameInMap("remark")
    public String remark;

    // 封铅号
    @NameInMap("seal_no")
    public String sealNo;

    // 是否SOC
    @NameInMap("soc_flag")
    public String socFlag;

    // 特殊字段无要求非必填
    @NameInMap("source")
    public String source;

    public static SaveBizContainerRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBizContainerRequest self = new SaveBizContainerRequest();
        return TeaModel.build(map, self);
    }

    public SaveBizContainerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBizContainerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBizContainerRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public SaveBizContainerRequest setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
        return this;
    }
    public String getBookingNo() {
        return this.bookingNo;
    }

    public SaveBizContainerRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public SaveBizContainerRequest setContainerNo(String containerNo) {
        this.containerNo = containerNo;
        return this;
    }
    public String getContainerNo() {
        return this.containerNo;
    }

    public SaveBizContainerRequest setContainerType(String containerType) {
        this.containerType = containerType;
        return this;
    }
    public String getContainerType() {
        return this.containerType;
    }

    public SaveBizContainerRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBizContainerRequest setGoodsList(java.util.List<ContainerGoodsParam> goodsList) {
        this.goodsList = goodsList;
        return this;
    }
    public java.util.List<ContainerGoodsParam> getGoodsList() {
        return this.goodsList;
    }

    public SaveBizContainerRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SaveBizContainerRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public SaveBizContainerRequest setSealNo(String sealNo) {
        this.sealNo = sealNo;
        return this;
    }
    public String getSealNo() {
        return this.sealNo;
    }

    public SaveBizContainerRequest setSocFlag(String socFlag) {
        this.socFlag = socFlag;
        return this;
    }
    public String getSocFlag() {
        return this.socFlag;
    }

    public SaveBizContainerRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
