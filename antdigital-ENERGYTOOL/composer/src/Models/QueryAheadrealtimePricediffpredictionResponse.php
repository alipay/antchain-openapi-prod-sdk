<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

use AntChain\ENERGYTOOL\Models\AheadRealtimePriceDiffPredictionData;

class QueryAheadrealtimePricediffpredictionResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'preAccuracy' => 'pre_accuracy',
        'pvPreAccuracy' => 'pv_pre_accuracy',
        'priceDiffPredictionList' => 'price_diff_prediction_list',
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
        if (null !== $this->preAccuracy) {
            $res['pre_accuracy'] = $this->preAccuracy;
        }
        if (null !== $this->pvPreAccuracy) {
            $res['pv_pre_accuracy'] = $this->pvPreAccuracy;
        }
        if (null !== $this->priceDiffPredictionList) {
            $res['price_diff_prediction_list'] = [];
            if(null !== $this->priceDiffPredictionList && is_array($this->priceDiffPredictionList)){
                $n = 0;
                foreach($this->priceDiffPredictionList as $item){
                    $res['price_diff_prediction_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAheadrealtimePricediffpredictionResponse
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
        if(isset($map['pre_accuracy'])){
            $model->preAccuracy = $map['pre_accuracy'];
        }
        if(isset($map['pv_pre_accuracy'])){
            $model->pvPreAccuracy = $map['pv_pre_accuracy'];
        }
        if(isset($map['price_diff_prediction_list'])){
            if(!empty($map['price_diff_prediction_list'])){
                $model->priceDiffPredictionList = [];
                $n = 0;
                foreach($map['price_diff_prediction_list'] as $item) {
                    $model->priceDiffPredictionList[$n++] = null !== $item ? AheadRealtimePriceDiffPredictionData::fromMap($item) : $item;
                }
            }
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

    // 全天价差方向预测准确率
    /**
     * @var string
     */
    public $preAccuracy;

    // 光伏价差方向预测准确率
    /**
     * @var string
     */
    public $pvPreAccuracy;

    // 价差预测列表
    /**
     * @var AheadRealtimePriceDiffPredictionData[]
     */
    public $priceDiffPredictionList;

}
