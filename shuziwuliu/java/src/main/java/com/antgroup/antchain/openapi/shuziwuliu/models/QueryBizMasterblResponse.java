// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryBizMasterblResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 船公司
    @NameInMap("carrier")
    public String carrier;

    // 收货人
    @NameInMap("consignee")
    public String consignee;

    // 目的地
    @NameInMap("delivery_place")
    public String deliveryPlace;

    // 卸货港
    @NameInMap("discharge_port")
    public String dischargePort;

    // 货代did
    @NameInMap("forwarder_did")
    public String forwarderDid;

    // 运费
    @NameInMap("freight")
    public String freight;

    // 提单货物数据列表
    @NameInMap("goods_dtos")
    public java.util.List<MasterBlGoodsDto> goodsDtos;

    // 起运港
    @NameInMap("loading_port")
    public String loadingPort;

    // master提单号
    @NameInMap("master_bl_no")
    public String masterBlNo;

    // 通知方
    @NameInMap("notify_party")
    public String notifyParty;

    // 前程运输
    @NameInMap("pr_carriage")
    public String prCarriage;

    // 发货人
    @NameInMap("shipper")
    public String shipper;

    // 航名
    @NameInMap("vessel")
    public String vessel;

    // 航次
    @NameInMap("voyage")
    public String voyage;

    public static QueryBizMasterblResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBizMasterblResponse self = new QueryBizMasterblResponse();
        return TeaModel.build(map, self);
    }

    public QueryBizMasterblResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBizMasterblResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBizMasterblResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBizMasterblResponse setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public QueryBizMasterblResponse setConsignee(String consignee) {
        this.consignee = consignee;
        return this;
    }
    public String getConsignee() {
        return this.consignee;
    }

    public QueryBizMasterblResponse setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
        return this;
    }
    public String getDeliveryPlace() {
        return this.deliveryPlace;
    }

    public QueryBizMasterblResponse setDischargePort(String dischargePort) {
        this.dischargePort = dischargePort;
        return this;
    }
    public String getDischargePort() {
        return this.dischargePort;
    }

    public QueryBizMasterblResponse setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public QueryBizMasterblResponse setFreight(String freight) {
        this.freight = freight;
        return this;
    }
    public String getFreight() {
        return this.freight;
    }

    public QueryBizMasterblResponse setGoodsDtos(java.util.List<MasterBlGoodsDto> goodsDtos) {
        this.goodsDtos = goodsDtos;
        return this;
    }
    public java.util.List<MasterBlGoodsDto> getGoodsDtos() {
        return this.goodsDtos;
    }

    public QueryBizMasterblResponse setLoadingPort(String loadingPort) {
        this.loadingPort = loadingPort;
        return this;
    }
    public String getLoadingPort() {
        return this.loadingPort;
    }

    public QueryBizMasterblResponse setMasterBlNo(String masterBlNo) {
        this.masterBlNo = masterBlNo;
        return this;
    }
    public String getMasterBlNo() {
        return this.masterBlNo;
    }

    public QueryBizMasterblResponse setNotifyParty(String notifyParty) {
        this.notifyParty = notifyParty;
        return this;
    }
    public String getNotifyParty() {
        return this.notifyParty;
    }

    public QueryBizMasterblResponse setPrCarriage(String prCarriage) {
        this.prCarriage = prCarriage;
        return this;
    }
    public String getPrCarriage() {
        return this.prCarriage;
    }

    public QueryBizMasterblResponse setShipper(String shipper) {
        this.shipper = shipper;
        return this;
    }
    public String getShipper() {
        return this.shipper;
    }

    public QueryBizMasterblResponse setVessel(String vessel) {
        this.vessel = vessel;
        return this;
    }
    public String getVessel() {
        return this.vessel;
    }

    public QueryBizMasterblResponse setVoyage(String voyage) {
        this.voyage = voyage;
        return this;
    }
    public String getVoyage() {
        return this.voyage;
    }

}
