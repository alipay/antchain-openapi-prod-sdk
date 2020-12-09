<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SHUZIWULIU\Models\HouseBlBookingParam;
use AntChain\SHUZIWULIU\Models\HouseBlContainerParam;
use AntChain\SHUZIWULIU\Models\HouseBlGoodsParam;

class SaveDigitalLogisticBizHouseblRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'action' => 'action',
        'blBookingParams' => 'bl_booking_params',
        'blIssuingAgency' => 'bl_issuing_agency',
        'blRequest' => 'bl_request',
        'blType' => 'bl_type',
        'carrier' => 'carrier',
        'consignee' => 'consignee',
        'containerParams' => 'container_params',
        'contract' => 'contract',
        'deliveryPlace' => 'delivery_place',
        'deliveryTerms' => 'delivery_terms',
        'dischargePort' => 'discharge_port',
        'forwarderDid' => 'forwarder_did',
        'freight' => 'freight',
        'goodsParams' => 'goods_params',
        'houseBlNo' => 'house_bl_no',
        'issueDate' => 'issue_date',
        'issuePlace' => 'issue_place',
        'loadingPort' => 'loading_port',
        'masterBlNo' => 'master_bl_no',
        'movement' => 'movement',
        'notifyParty' => 'notify_party',
        'onBoardDate' => 'on_board_date',
        'orderNo' => 'order_no',
        'paymentTerms' => 'payment_terms',
        'remark' => 'remark',
        'shipper' => 'shipper',
        'transportation' => 'transportation',
        'vessel' => 'vessel',
        'voyage' => 'voyage',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->blBookingParams) {
            $res['bl_booking_params'] = [];
            if(null !== $this->blBookingParams && is_array($this->blBookingParams)){
                $n = 0;
                foreach($this->blBookingParams as $item){
                    $res['bl_booking_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->blIssuingAgency) {
            $res['bl_issuing_agency'] = $this->blIssuingAgency;
        }
        if (null !== $this->blRequest) {
            $res['bl_request'] = $this->blRequest;
        }
        if (null !== $this->blType) {
            $res['bl_type'] = $this->blType;
        }
        if (null !== $this->carrier) {
            $res['carrier'] = $this->carrier;
        }
        if (null !== $this->consignee) {
            $res['consignee'] = $this->consignee;
        }
        if (null !== $this->containerParams) {
            $res['container_params'] = [];
            if(null !== $this->containerParams && is_array($this->containerParams)){
                $n = 0;
                foreach($this->containerParams as $item){
                    $res['container_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->contract) {
            $res['contract'] = $this->contract;
        }
        if (null !== $this->deliveryPlace) {
            $res['delivery_place'] = $this->deliveryPlace;
        }
        if (null !== $this->deliveryTerms) {
            $res['delivery_terms'] = $this->deliveryTerms;
        }
        if (null !== $this->dischargePort) {
            $res['discharge_port'] = $this->dischargePort;
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->freight) {
            $res['freight'] = $this->freight;
        }
        if (null !== $this->goodsParams) {
            $res['goods_params'] = [];
            if(null !== $this->goodsParams && is_array($this->goodsParams)){
                $n = 0;
                foreach($this->goodsParams as $item){
                    $res['goods_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->houseBlNo) {
            $res['house_bl_no'] = $this->houseBlNo;
        }
        if (null !== $this->issueDate) {
            $res['issue_date'] = $this->issueDate;
        }
        if (null !== $this->issuePlace) {
            $res['issue_place'] = $this->issuePlace;
        }
        if (null !== $this->loadingPort) {
            $res['loading_port'] = $this->loadingPort;
        }
        if (null !== $this->masterBlNo) {
            $res['master_bl_no'] = $this->masterBlNo;
        }
        if (null !== $this->movement) {
            $res['movement'] = $this->movement;
        }
        if (null !== $this->notifyParty) {
            $res['notify_party'] = $this->notifyParty;
        }
        if (null !== $this->onBoardDate) {
            $res['on_board_date'] = $this->onBoardDate;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->paymentTerms) {
            $res['payment_terms'] = $this->paymentTerms;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->shipper) {
            $res['shipper'] = $this->shipper;
        }
        if (null !== $this->transportation) {
            $res['transportation'] = $this->transportation;
        }
        if (null !== $this->vessel) {
            $res['vessel'] = $this->vessel;
        }
        if (null !== $this->voyage) {
            $res['voyage'] = $this->voyage;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SaveDigitalLogisticBizHouseblRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['action'])){
            $model->action = $map['action'];
        }
        if(isset($map['bl_booking_params'])){
            if(!empty($map['bl_booking_params'])){
                $model->blBookingParams = [];
                $n = 0;
                foreach($map['bl_booking_params'] as $item) {
                    $model->blBookingParams[$n++] = null !== $item ? HouseBlBookingParam::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['bl_issuing_agency'])){
            $model->blIssuingAgency = $map['bl_issuing_agency'];
        }
        if(isset($map['bl_request'])){
            $model->blRequest = $map['bl_request'];
        }
        if(isset($map['bl_type'])){
            $model->blType = $map['bl_type'];
        }
        if(isset($map['carrier'])){
            $model->carrier = $map['carrier'];
        }
        if(isset($map['consignee'])){
            $model->consignee = $map['consignee'];
        }
        if(isset($map['container_params'])){
            if(!empty($map['container_params'])){
                $model->containerParams = [];
                $n = 0;
                foreach($map['container_params'] as $item) {
                    $model->containerParams[$n++] = null !== $item ? HouseBlContainerParam::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['contract'])){
            $model->contract = $map['contract'];
        }
        if(isset($map['delivery_place'])){
            $model->deliveryPlace = $map['delivery_place'];
        }
        if(isset($map['delivery_terms'])){
            $model->deliveryTerms = $map['delivery_terms'];
        }
        if(isset($map['discharge_port'])){
            $model->dischargePort = $map['discharge_port'];
        }
        if(isset($map['forwarder_did'])){
            $model->forwarderDid = $map['forwarder_did'];
        }
        if(isset($map['freight'])){
            $model->freight = $map['freight'];
        }
        if(isset($map['goods_params'])){
            if(!empty($map['goods_params'])){
                $model->goodsParams = [];
                $n = 0;
                foreach($map['goods_params'] as $item) {
                    $model->goodsParams[$n++] = null !== $item ? HouseBlGoodsParam::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['house_bl_no'])){
            $model->houseBlNo = $map['house_bl_no'];
        }
        if(isset($map['issue_date'])){
            $model->issueDate = $map['issue_date'];
        }
        if(isset($map['issue_place'])){
            $model->issuePlace = $map['issue_place'];
        }
        if(isset($map['loading_port'])){
            $model->loadingPort = $map['loading_port'];
        }
        if(isset($map['master_bl_no'])){
            $model->masterBlNo = $map['master_bl_no'];
        }
        if(isset($map['movement'])){
            $model->movement = $map['movement'];
        }
        if(isset($map['notify_party'])){
            $model->notifyParty = $map['notify_party'];
        }
        if(isset($map['on_board_date'])){
            $model->onBoardDate = $map['on_board_date'];
        }
        if(isset($map['order_no'])){
            $model->orderNo = $map['order_no'];
        }
        if(isset($map['payment_terms'])){
            $model->paymentTerms = $map['payment_terms'];
        }
        if(isset($map['remark'])){
            $model->remark = $map['remark'];
        }
        if(isset($map['shipper'])){
            $model->shipper = $map['shipper'];
        }
        if(isset($map['transportation'])){
            $model->transportation = $map['transportation'];
        }
        if(isset($map['vessel'])){
            $model->vessel = $map['vessel'];
        }
        if(isset($map['voyage'])){
            $model->voyage = $map['voyage'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    /**
     * @var string
     */
    public $action;

    // 订舱单
    /**
     * @var HouseBlBookingParam[]
     */
    public $blBookingParams;

    // 提单签发单位
    /**
     * @var string
     */
    public $blIssuingAgency;

    // 提单要求
    /**
     * @var string
     */
    public $blRequest;

    // 提单类型
    /**
     * @var string
     */
    public $blType;

    // 船公司 业务必填
    /**
     * @var string
     */
    public $carrier;

    // 收货人 业务必填
    // 
    /**
     * @var string
     */
    public $consignee;

    // 集装箱列表 业务必填
    // 
    /**
     * @var HouseBlContainerParam[]
     */
    public $containerParams;

    // 约号
    /**
     * @var string
     */
    public $contract;

    // 目的地  业务必填
    // 
    /**
     * @var string
     */
    public $deliveryPlace;

    // 运输条款
    /**
     * @var string
     */
    public $deliveryTerms;

    // 卸货港 业务必填
    // 
    /**
     * @var string
     */
    public $dischargePort;

    // 货代did
    /**
     * @var string
     */
    public $forwarderDid;

    // 运费
    /**
     * @var string
     */
    public $freight;

    // 货物列表 业务必填
    // 
    /**
     * @var HouseBlGoodsParam[]
     */
    public $goodsParams;

    // house提单号
    /**
     * @var string
     */
    public $houseBlNo;

    // 出单日期
    /**
     * @var int
     */
    public $issueDate;

    // 放单地点
    /**
     * @var string
     */
    public $issuePlace;

    // 起运港 业务必填
    // 
    /**
     * @var string
     */
    public $loadingPort;

    // master提单号
    /**
     * @var string
     */
    public $masterBlNo;

    // 裝卸方式
    /**
     * @var string
     */
    public $movement;

    // 通知方
    /**
     * @var string
     */
    public $notifyParty;

    // 开船日期
    /**
     * @var int
     */
    public $onBoardDate;

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 付费方式 业务必填
    // 
    /**
     * @var string
     */
    public $paymentTerms;

    // 其他
    /**
     * @var string
     */
    public $remark;

    // 发货人 业务必填
    // 
    /**
     * @var string
     */
    public $shipper;

    // 运输方式
    /**
     * @var string
     */
    public $transportation;

    // 航名 业务必填
    /**
     * @var string
     */
    public $vessel;

    // 航次 业务必填
    /**
     * @var string
     */
    public $voyage;

}
