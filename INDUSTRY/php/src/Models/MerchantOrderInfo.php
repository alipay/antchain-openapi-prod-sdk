<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\INDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class MerchantOrderInfo extends Model {
    protected $_name = [
        'orderId' => 'order_id',
        'merchantUserId' => 'merchant_user_id',
        'status' => 'status',
    ];
    public function validate() {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantUserId', $this->merchantUserId, true);
        Model::validateRequired('status', $this->status, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->merchantUserId) {
            $res['merchant_user_id'] = $this->merchantUserId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MerchantOrderInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['merchant_user_id'])){
            $model->merchantUserId = $map['merchant_user_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        return $model;
    }
    // 申请单id
    /**
     * @example 2021012000502000000005130266
     * @var string
     */
    public $orderId;

    // 平台方的用户id, 保持唯一
    /**
     * @example 208812345678
     * @var string
     */
    public $merchantUserId;

    // 申请状态 99-已完结;-1-失败;031-审核中
    /**
     * @example 99
     * @var string
     */
    public $status;

}
