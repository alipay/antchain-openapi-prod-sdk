<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SHUZIWULIU\Models\CustomsOrderBookingParam;

class SaveDigitalLogisticBizCustomsorderRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'action' => 'action',
        'bookingParams' => 'booking_params',
        'broker' => 'broker',
        'containerId' => 'container_id',
        'containerNo' => 'container_no',
        'customsCode' => 'customs_code',
        'exporter' => 'exporter',
        'forwarderDid' => 'forwarder_did',
        'goods' => 'goods',
        'grossWeight' => 'gross_weight',
        'orderNo' => 'order_no',
        'packagesNo' => 'packages_no',
        'status' => 'status',
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
        if (null !== $this->bookingParams) {
            $res['booking_params'] = [];
            if(null !== $this->bookingParams && is_array($this->bookingParams)){
                $n = 0;
                foreach($this->bookingParams as $item){
                    $res['booking_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->broker) {
            $res['broker'] = $this->broker;
        }
        if (null !== $this->containerId) {
            $res['container_id'] = $this->containerId;
        }
        if (null !== $this->containerNo) {
            $res['container_no'] = $this->containerNo;
        }
        if (null !== $this->customsCode) {
            $res['customs_code'] = $this->customsCode;
        }
        if (null !== $this->exporter) {
            $res['exporter'] = $this->exporter;
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->goods) {
            $res['goods'] = $this->goods;
        }
        if (null !== $this->grossWeight) {
            $res['gross_weight'] = $this->grossWeight;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->packagesNo) {
            $res['packages_no'] = $this->packagesNo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
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
     * @return SaveDigitalLogisticBizCustomsorderRequest
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
        if(isset($map['booking_params'])){
            if(!empty($map['booking_params'])){
                $model->bookingParams = [];
                $n = 0;
                foreach($map['booking_params'] as $item) {
                    $model->bookingParams[$n++] = null !== $item ? CustomsOrderBookingParam::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['broker'])){
            $model->broker = $map['broker'];
        }
        if(isset($map['container_id'])){
            $model->containerId = $map['container_id'];
        }
        if(isset($map['container_no'])){
            $model->containerNo = $map['container_no'];
        }
        if(isset($map['customs_code'])){
            $model->customsCode = $map['customs_code'];
        }
        if(isset($map['exporter'])){
            $model->exporter = $map['exporter'];
        }
        if(isset($map['forwarder_did'])){
            $model->forwarderDid = $map['forwarder_did'];
        }
        if(isset($map['goods'])){
            $model->goods = $map['goods'];
        }
        if(isset($map['gross_weight'])){
            $model->grossWeight = $map['gross_weight'];
        }
        if(isset($map['order_no'])){
            $model->orderNo = $map['order_no'];
        }
        if(isset($map['packages_no'])){
            $model->packagesNo = $map['packages_no'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
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

    // 订舱单号
    /**
     * @var CustomsOrderBookingParam[]
     */
    public $bookingParams;

    // 报关代理
    /**
     * @var string
     */
    public $broker;

    // 集装箱ID
    /**
     * @var string
     */
    public $containerId;

    // 箱号
    /**
     * @var string
     */
    public $containerNo;

    // 报关单号
    /**
     * @var string
     */
    public $customsCode;

    // 出口人
    /**
     * @var string
     */
    public $exporter;

    // 货代did
    // 
    /**
     * @var string
     */
    public $forwarderDid;

    // 货物名称
    /**
     * @var string
     */
    public $goods;

    // 毛重
    /**
     * @var string
     */
    public $grossWeight;

    // 订单号
    // 
    /**
     * @var string
     */
    public $orderNo;

    // 件数
    /**
     * @var string
     */
    public $packagesNo;

    // 报关状态  APPROVED--通关，UNAPPROVED-未通关
    /**
     * @var string
     */
    public $status;

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
