<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SaveDigitalLogisticBizOrderRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'action' => 'action',
        'blRequest' => 'bl_request',
        'bookingNo' => 'booking_no',
        'carrier' => 'carrier',
        'clientDid' => 'client_did',
        'consignee' => 'consignee',
        'contract' => 'contract',
        'customsClearance' => 'customs_clearance',
        'deliveryPlace' => 'delivery_place',
        'deliveryTerms' => 'delivery_terms',
        'dischargePort' => 'discharge_port',
        'forwarderDid' => 'forwarder_did',
        'freight' => 'freight',
        'insurance' => 'insurance',
        'issuePlace' => 'issue_place',
        'loadingPort' => 'loading_port',
        'movement' => 'movement',
        'notifyParty' => 'notify_party',
        'orderNo' => 'order_no',
        'paymentTerms' => 'payment_terms',
        'pickUp' => 'pick_up',
        'receiptPlace' => 'receipt_place',
        'remark' => 'remark',
        'shipper' => 'shipper',
        'taskOrder' => 'task_order',
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
        if (null !== $this->blRequest) {
            $res['bl_request'] = $this->blRequest;
        }
        if (null !== $this->bookingNo) {
            $res['booking_no'] = $this->bookingNo;
        }
        if (null !== $this->carrier) {
            $res['carrier'] = $this->carrier;
        }
        if (null !== $this->clientDid) {
            $res['client_did'] = $this->clientDid;
        }
        if (null !== $this->consignee) {
            $res['consignee'] = $this->consignee;
        }
        if (null !== $this->contract) {
            $res['contract'] = $this->contract;
        }
        if (null !== $this->customsClearance) {
            $res['customs_clearance'] = $this->customsClearance;
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
        if (null !== $this->insurance) {
            $res['insurance'] = $this->insurance;
        }
        if (null !== $this->issuePlace) {
            $res['issue_place'] = $this->issuePlace;
        }
        if (null !== $this->loadingPort) {
            $res['loading_port'] = $this->loadingPort;
        }
        if (null !== $this->movement) {
            $res['movement'] = $this->movement;
        }
        if (null !== $this->notifyParty) {
            $res['notify_party'] = $this->notifyParty;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->paymentTerms) {
            $res['payment_terms'] = $this->paymentTerms;
        }
        if (null !== $this->pickUp) {
            $res['pick_up'] = $this->pickUp;
        }
        if (null !== $this->receiptPlace) {
            $res['receipt_place'] = $this->receiptPlace;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->shipper) {
            $res['shipper'] = $this->shipper;
        }
        if (null !== $this->taskOrder) {
            $res['task_order'] = $this->taskOrder;
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
     * @return SaveDigitalLogisticBizOrderRequest
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
        if(isset($map['bl_request'])){
            $model->blRequest = $map['bl_request'];
        }
        if(isset($map['booking_no'])){
            $model->bookingNo = $map['booking_no'];
        }
        if(isset($map['carrier'])){
            $model->carrier = $map['carrier'];
        }
        if(isset($map['client_did'])){
            $model->clientDid = $map['client_did'];
        }
        if(isset($map['consignee'])){
            $model->consignee = $map['consignee'];
        }
        if(isset($map['contract'])){
            $model->contract = $map['contract'];
        }
        if(isset($map['customs_clearance'])){
            $model->customsClearance = $map['customs_clearance'];
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
        if(isset($map['insurance'])){
            $model->insurance = $map['insurance'];
        }
        if(isset($map['issue_place'])){
            $model->issuePlace = $map['issue_place'];
        }
        if(isset($map['loading_port'])){
            $model->loadingPort = $map['loading_port'];
        }
        if(isset($map['movement'])){
            $model->movement = $map['movement'];
        }
        if(isset($map['notify_party'])){
            $model->notifyParty = $map['notify_party'];
        }
        if(isset($map['order_no'])){
            $model->orderNo = $map['order_no'];
        }
        if(isset($map['payment_terms'])){
            $model->paymentTerms = $map['payment_terms'];
        }
        if(isset($map['pick_up'])){
            $model->pickUp = $map['pick_up'];
        }
        if(isset($map['receipt_place'])){
            $model->receiptPlace = $map['receipt_place'];
        }
        if(isset($map['remark'])){
            $model->remark = $map['remark'];
        }
        if(isset($map['shipper'])){
            $model->shipper = $map['shipper'];
        }
        if(isset($map['task_order'])){
            $model->taskOrder = $map['task_order'];
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

    // 提单要求
    /**
     * @var string
     */
    public $blRequest;

    // 订舱单号
    /**
     * @var string
     */
    public $bookingNo;

    // 船公司
    /**
     * @var string
     */
    public $carrier;

    // 客户did  业务必填
    /**
     * @var string
     */
    public $clientDid;

    // 收货人
    /**
     * @var string
     */
    public $consignee;

    // 约号
    /**
     * @var string
     */
    public $contract;

    // 报关
    /**
     * @var string
     */
    public $customsClearance;

    // 目的地 业务必填
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

    // 卸货港. 业务必填
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

    // 保险
    /**
     * @var string
     */
    public $insurance;

    // 放单地点
    /**
     * @var string
     */
    public $issuePlace;

    // 起运港. 业务必填
    // 
    /**
     * @var string
     */
    public $loadingPort;

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

    // 拖车
    /**
     * @var string
     */
    public $pickUp;

    // 收货地点
    /**
     * @var string
     */
    public $receiptPlace;

    // 备注
    /**
     * @var string
     */
    public $remark;

    // 发货人
    /**
     * @var string
     */
    public $shipper;

    // 任务单号
    /**
     * @var string
     */
    public $taskOrder;

    // 运输方式
    /**
     * @var string
     */
    public $transportation;

    // 船名
    /**
     * @var string
     */
    public $vessel;

    // 航次
    /**
     * @var string
     */
    public $voyage;

}
