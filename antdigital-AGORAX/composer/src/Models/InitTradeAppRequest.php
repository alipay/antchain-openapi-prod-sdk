<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class InitTradeAppRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outTradeNo' => 'out_trade_no',
        'totalAmount' => 'total_amount',
        'subject' => 'subject',
        'registeredMobile' => 'registered_mobile',
        'openId' => 'open_id',
        'tierId' => 'tier_id',
    ];
    public function validate() {
        Model::validateRequired('outTradeNo', $this->outTradeNo, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('subject', $this->subject, true);
        Model::validateRequired('openId', $this->openId, true);
        Model::validateRequired('tierId', $this->tierId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->outTradeNo) {
            $res['out_trade_no'] = $this->outTradeNo;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->subject) {
            $res['subject'] = $this->subject;
        }
        if (null !== $this->registeredMobile) {
            $res['registered_mobile'] = $this->registeredMobile;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->tierId) {
            $res['tier_id'] = $this->tierId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return InitTradeAppRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['out_trade_no'])){
            $model->outTradeNo = $map['out_trade_no'];
        }
        if(isset($map['total_amount'])){
            $model->totalAmount = $map['total_amount'];
        }
        if(isset($map['subject'])){
            $model->subject = $map['subject'];
        }
        if(isset($map['registered_mobile'])){
            $model->registeredMobile = $map['registered_mobile'];
        }
        if(isset($map['open_id'])){
            $model->openId = $map['open_id'];
        }
        if(isset($map['tier_id'])){
            $model->tierId = $map['tier_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 接入方 外部业务订单号，接入方 内唯一，创建后不可变
    /**
     * @var string
     */
    public $outTradeNo;

    // 支付金额，单位：元，大于 0，最多两位小数
    /**
     * @var string
     */
    public $totalAmount;

    // 商品或权益卡标题
    /**
     * @var string
     */
    public $subject;

    // 用户登记手机号，中国大陆 11 位手机号
    /**
     * @var string
     */
    public $registeredMobile;

    // 用户登录接口返回的用户唯一标识
    /**
     * @var string
     */
    public $openId;

    // 权益档位 ID
    /**
     * @var string
     */
    public $tierId;

}
