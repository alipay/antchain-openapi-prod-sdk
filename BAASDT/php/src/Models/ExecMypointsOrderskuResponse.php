<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecMypointsOrderskuResponse extends Model {
    protected $_name = [
        'cardId' => 'card_id',
        'cardValue' => 'card_value',
        'orderNo' => 'order_no',
        'url' => 'url',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->cardId) {
            $res['card_id'] = $this->cardId;
        }
        if (null !== $this->cardValue) {
            $res['card_value'] = $this->cardValue;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecMypointsOrderskuResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['card_id'])){
            $model->cardId = $map['card_id'];
        }
        if(isset($map['card_value'])){
            $model->cardValue = $map['card_value'];
        }
        if(isset($map['order_no'])){
            $model->orderNo = $map['order_no'];
        }
        if(isset($map['url'])){
            $model->url = $map['url'];
        }
        return $model;
    }
    /**
     * @description 卡密ID
     * @example eb18cb6bfcb5eeb1b004d6885f76d5576a1b94649c766e498e83db88504cd5e1
     * @var string
     */
    public $cardId;

    /**
     * @description 集分宝卡密的面值(单位:个)
     * @example 100
     * @var integer
     */
    public $cardValue;

    /**
     * @description 业务幂等ID
     * @example S20200707123456
     * @var string
     */
    public $orderNo;

    /**
     * @description 短链接
     * @example https://render.alipay.com/p/c/jfb_gif?
     * @var string
     */
    public $url;

}
