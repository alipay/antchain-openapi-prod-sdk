<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class NotifyPoiCouponRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'openId' => 'open_id',
        'notifyTemplate' => 'notify_template',
        'data' => 'data',
    ];
    public function validate() {
        Model::validateRequired('openId', $this->openId, true);
        Model::validateRequired('notifyTemplate', $this->notifyTemplate, true);
        Model::validateRequired('data', $this->data, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->notifyTemplate) {
            $res['notify_template'] = $this->notifyTemplate;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return NotifyPoiCouponRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['open_id'])){
            $model->openId = $map['open_id'];
        }
        if(isset($map['notify_template'])){
            $model->notifyTemplate = $map['notify_template'];
        }
        if(isset($map['data'])){
            $model->data = $map['data'];
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

    // 支付宝小程序用户唯一ID
    /**
     * @var string
     */
    public $openId;

    // 通知模版枚举值：
    // COUPON_RECEIVE_REMIND-优惠券领取提醒（用户接收频次：2周1次）；COUPON_EXPIRE_REMIND-优惠券到期提醒（用户接收频次：1周1次）。
    /**
     * @var string
     */
    public $notifyTemplate;

    // 通知模版内容（JSON格式）
    /**
     * @var string
     */
    public $data;

}
