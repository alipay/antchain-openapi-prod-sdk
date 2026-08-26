<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\OmsDataComponentDeductDetailResultVO;

class ApplyAntcloudBillingRespackageCountResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'outBizId' => 'out_biz_id',
        'deductAmount' => 'deduct_amount',
        'omsComponentKey' => 'oms_component_key',
        'leftAmount' => 'left_amount',
        'omsDataComponentDeductDetailResultvos' => 'oms_data_component_deduct_detail_resultvos',
        'deductAmountStr' => 'deduct_amount_str',
        'leftAmountStr' => 'left_amount_str',
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
        if (null !== $this->outBizId) {
            $res['out_biz_id'] = $this->outBizId;
        }
        if (null !== $this->deductAmount) {
            $res['deduct_amount'] = $this->deductAmount;
        }
        if (null !== $this->omsComponentKey) {
            $res['oms_component_key'] = $this->omsComponentKey;
        }
        if (null !== $this->leftAmount) {
            $res['left_amount'] = $this->leftAmount;
        }
        if (null !== $this->omsDataComponentDeductDetailResultvos) {
            $res['oms_data_component_deduct_detail_resultvos'] = [];
            if(null !== $this->omsDataComponentDeductDetailResultvos && is_array($this->omsDataComponentDeductDetailResultvos)){
                $n = 0;
                foreach($this->omsDataComponentDeductDetailResultvos as $item){
                    $res['oms_data_component_deduct_detail_resultvos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->deductAmountStr) {
            $res['deduct_amount_str'] = $this->deductAmountStr;
        }
        if (null !== $this->leftAmountStr) {
            $res['left_amount_str'] = $this->leftAmountStr;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyAntcloudBillingRespackageCountResponse
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
        if(isset($map['out_biz_id'])){
            $model->outBizId = $map['out_biz_id'];
        }
        if(isset($map['deduct_amount'])){
            $model->deductAmount = $map['deduct_amount'];
        }
        if(isset($map['oms_component_key'])){
            $model->omsComponentKey = $map['oms_component_key'];
        }
        if(isset($map['left_amount'])){
            $model->leftAmount = $map['left_amount'];
        }
        if(isset($map['oms_data_component_deduct_detail_resultvos'])){
            if(!empty($map['oms_data_component_deduct_detail_resultvos'])){
                $model->omsDataComponentDeductDetailResultvos = [];
                $n = 0;
                foreach($map['oms_data_component_deduct_detail_resultvos'] as $item) {
                    $model->omsDataComponentDeductDetailResultvos[$n++] = null !== $item ? OmsDataComponentDeductDetailResultVO::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['deduct_amount_str'])){
            $model->deductAmountStr = $map['deduct_amount_str'];
        }
        if(isset($map['left_amount_str'])){
            $model->leftAmountStr = $map['left_amount_str'];
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 外部唯一单据号 不超过64位
    /**
     * @var string
     */
    public $outBizId;

    // 本次抵扣总量
    /**
     * @var int
     */
    public $deductAmount;

    // 抵扣的oms component key
    /**
     * @var string
     */
    public $omsComponentKey;

    // 抵扣后剩余计量值
    /**
     * @var int
     */
    public $leftAmount;

    // 资源包抵扣详细信息
    /**
     * @var OmsDataComponentDeductDetailResultVO[]
     */
    public $omsDataComponentDeductDetailResultvos;

    // 高精度本次抵扣总量，支持小数
    /**
     * @var string
     */
    public $deductAmountStr;

    // 高精度抵扣剩余量值，支持小数
    /**
     * @var string
     */
    public $leftAmountStr;

}
