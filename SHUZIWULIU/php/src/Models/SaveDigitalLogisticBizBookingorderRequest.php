<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SaveDigitalLogisticBizBookingorderRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'action' => 'action',
        'bookingNo' => 'booking_no',
        'carrier' => 'carrier',
        'customsClearance' => 'customs_clearance',
        'cy' => 'cy',
        'cyClosing' => 'cy_closing',
        'deliveryPlace' => 'delivery_place',
        'dischargePort' => 'discharge_port',
        'etd' => 'etd',
        'forwarderDid' => 'forwarder_did',
        'loadingPort' => 'loading_port',
        'orderNo' => 'order_no',
        'siClosing' => 'si_closing',
        'source' => 'source',
        'vessel' => 'vessel',
        'voyage' => 'voyage',
        'bkgNo' => 'bkg_no',
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
        if (null !== $this->bookingNo) {
            $res['booking_no'] = $this->bookingNo;
        }
        if (null !== $this->carrier) {
            $res['carrier'] = $this->carrier;
        }
        if (null !== $this->customsClearance) {
            $res['customs_clearance'] = $this->customsClearance;
        }
        if (null !== $this->cy) {
            $res['cy'] = $this->cy;
        }
        if (null !== $this->cyClosing) {
            $res['cy_closing'] = $this->cyClosing;
        }
        if (null !== $this->deliveryPlace) {
            $res['delivery_place'] = $this->deliveryPlace;
        }
        if (null !== $this->dischargePort) {
            $res['discharge_port'] = $this->dischargePort;
        }
        if (null !== $this->etd) {
            $res['etd'] = $this->etd;
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->loadingPort) {
            $res['loading_port'] = $this->loadingPort;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->siClosing) {
            $res['si_closing'] = $this->siClosing;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->vessel) {
            $res['vessel'] = $this->vessel;
        }
        if (null !== $this->voyage) {
            $res['voyage'] = $this->voyage;
        }
        if (null !== $this->bkgNo) {
            $res['bkg_no'] = $this->bkgNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SaveDigitalLogisticBizBookingorderRequest
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
        if(isset($map['booking_no'])){
            $model->bookingNo = $map['booking_no'];
        }
        if(isset($map['carrier'])){
            $model->carrier = $map['carrier'];
        }
        if(isset($map['customs_clearance'])){
            $model->customsClearance = $map['customs_clearance'];
        }
        if(isset($map['cy'])){
            $model->cy = $map['cy'];
        }
        if(isset($map['cy_closing'])){
            $model->cyClosing = $map['cy_closing'];
        }
        if(isset($map['delivery_place'])){
            $model->deliveryPlace = $map['delivery_place'];
        }
        if(isset($map['discharge_port'])){
            $model->dischargePort = $map['discharge_port'];
        }
        if(isset($map['etd'])){
            $model->etd = $map['etd'];
        }
        if(isset($map['forwarder_did'])){
            $model->forwarderDid = $map['forwarder_did'];
        }
        if(isset($map['loading_port'])){
            $model->loadingPort = $map['loading_port'];
        }
        if(isset($map['order_no'])){
            $model->orderNo = $map['order_no'];
        }
        if(isset($map['si_closing'])){
            $model->siClosing = $map['si_closing'];
        }
        if(isset($map['source'])){
            $model->source = $map['source'];
        }
        if(isset($map['vessel'])){
            $model->vessel = $map['vessel'];
        }
        if(isset($map['voyage'])){
            $model->voyage = $map['voyage'];
        }
        if(isset($map['bkg_no'])){
            $model->bkgNo = $map['bkg_no'];
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
     * @var string
     */
    public $bookingNo;

    // 船公司 业务必填
    /**
     * @var string
     */
    public $carrier;

    // 截关时间
    /**
     * @var int
     */
    public $customsClearance;

    // 场站 业务必填
    /**
     * @var string
     */
    public $cy;

    // 截港时间 毫秒值单位
    /**
     * @var int
     */
    public $cyClosing;

    // 目的地
    /**
     * @var string
     */
    public $deliveryPlace;

    // 卸货港
    /**
     * @var string
     */
    public $dischargePort;

    // 预计船期 毫秒值单位
    /**
     * @var int
     */
    public $etd;

    // 货代did
    /**
     * @var string
     */
    public $forwarderDid;

    // 起运港
    /**
     * @var string
     */
    public $loadingPort;

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 截单时间  毫秒值单位
    /**
     * @var int
     */
    public $siClosing;

    // 特殊字段无要求非必填
    /**
     * @var string
     */
    public $source;

    // 船名 业务必填
    /**
     * @var string
     */
    public $vessel;

    // 航次 业务必填
    /**
     * @var string
     */
    public $voyage;

    // 订舱号
    /**
     * @var string
     */
    public $bkgNo;

}
