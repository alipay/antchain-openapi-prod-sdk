<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

use AntChain\SHUZIWULIU\Models\MasterBlGoodsDto;

class QueryDigitalLogisticBizMasterblResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'carrier' => 'carrier',
        'consignee' => 'consignee',
        'deliveryPlace' => 'delivery_place',
        'dischargePort' => 'discharge_port',
        'forwarderDid' => 'forwarder_did',
        'freight' => 'freight',
        'goodsDtos' => 'goods_dtos',
        'loadingPort' => 'loading_port',
        'masterBlNo' => 'master_bl_no',
        'notifyParty' => 'notify_party',
        'prCarriage' => 'pr_carriage',
        'shipper' => 'shipper',
        'vessel' => 'vessel',
        'voyage' => 'voyage',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->carrier) {
            $res['carrier'] = $this->carrier;
        }
        if (null !== $this->consignee) {
            $res['consignee'] = $this->consignee;
        }
        if (null !== $this->deliveryPlace) {
            $res['delivery_place'] = $this->deliveryPlace;
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
        if (null !== $this->goodsDtos) {
            $res['goods_dtos'] = [];
            if(null !== $this->goodsDtos && is_array($this->goodsDtos)){
                $n = 0;
                foreach($this->goodsDtos as $item){
                    $res['goods_dtos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->loadingPort) {
            $res['loading_port'] = $this->loadingPort;
        }
        if (null !== $this->masterBlNo) {
            $res['master_bl_no'] = $this->masterBlNo;
        }
        if (null !== $this->notifyParty) {
            $res['notify_party'] = $this->notifyParty;
        }
        if (null !== $this->prCarriage) {
            $res['pr_carriage'] = $this->prCarriage;
        }
        if (null !== $this->shipper) {
            $res['shipper'] = $this->shipper;
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
     * @return QueryDigitalLogisticBizMasterblResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['carrier'])){
            $model->carrier = $map['carrier'];
        }
        if(isset($map['consignee'])){
            $model->consignee = $map['consignee'];
        }
        if(isset($map['delivery_place'])){
            $model->deliveryPlace = $map['delivery_place'];
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
        if(isset($map['goods_dtos'])){
            if(!empty($map['goods_dtos'])){
                $model->goodsDtos = [];
                $n = 0;
                foreach($map['goods_dtos'] as $item) {
                    $model->goodsDtos[$n++] = null !== $item ? MasterBlGoodsDto::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['loading_port'])){
            $model->loadingPort = $map['loading_port'];
        }
        if(isset($map['master_bl_no'])){
            $model->masterBlNo = $map['master_bl_no'];
        }
        if(isset($map['notify_party'])){
            $model->notifyParty = $map['notify_party'];
        }
        if(isset($map['pr_carriage'])){
            $model->prCarriage = $map['pr_carriage'];
        }
        if(isset($map['shipper'])){
            $model->shipper = $map['shipper'];
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
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 船公司
    /**
     * @var string
     */
    public $carrier;

    // 收货人
    /**
     * @var string
     */
    public $consignee;

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

    // 提单货物数据列表
    /**
     * @var MasterBlGoodsDto[]
     */
    public $goodsDtos;

    // 起运港
    /**
     * @var string
     */
    public $loadingPort;

    // master提单号
    /**
     * @var string
     */
    public $masterBlNo;

    // 通知方
    /**
     * @var string
     */
    public $notifyParty;

    // 前程运输
    /**
     * @var string
     */
    public $prCarriage;

    // 发货人
    /**
     * @var string
     */
    public $shipper;

    // 航名
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
