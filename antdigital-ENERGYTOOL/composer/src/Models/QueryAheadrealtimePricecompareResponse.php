<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

use AntChain\ENERGYTOOL\Models\AheadRealtimePriceCompareData;

class QueryAheadrealtimePricecompareResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'priceCompare' => 'price_compare',
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
        if (null !== $this->priceCompare) {
            $res['price_compare'] = [];
            if(null !== $this->priceCompare && is_array($this->priceCompare)){
                $n = 0;
                foreach($this->priceCompare as $item){
                    $res['price_compare'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAheadrealtimePricecompareResponse
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
        if(isset($map['price_compare'])){
            if(!empty($map['price_compare'])){
                $model->priceCompare = [];
                $n = 0;
                foreach($map['price_compare'] as $item) {
                    $model->priceCompare[$n++] = null !== $item ? AheadRealtimePriceCompareData::fromMap($item) : $item;
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

    // 电价对比点位
    /**
     * @var AheadRealtimePriceCompareData[]
     */
    public $priceCompare;

}
