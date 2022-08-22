<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class SyncOrderDataRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 接入方的订单号
    /**
     * @var string
     */
    public $externalOrderNo;

    // 目前支持两种状态 PAID、PAY_CANCEL
    /**
     * @var string
     */
    public $externalOrderStatus;

    // 鲸探开放平台订单号
    /**
     * @var string
     */
    public $openOrderNo;

    // 鲸探授权的用户加密的uid
    /**
     * @var string
     */
    public $openUserId;

    // 同步改状态时的事件毫秒时间戳
    /**
     * @var int
     */
    public $updateTime;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'externalOrderNo'     => 'external_order_no',
        'externalOrderStatus' => 'external_order_status',
        'openOrderNo'         => 'open_order_no',
        'openUserId'          => 'open_user_id',
        'updateTime'          => 'update_time',
    ];

    public function validate()
    {
        Model::validateRequired('externalOrderNo', $this->externalOrderNo, true);
        Model::validateRequired('externalOrderStatus', $this->externalOrderStatus, true);
        Model::validateRequired('openUserId', $this->openUserId, true);
        Model::validateRequired('updateTime', $this->updateTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->externalOrderNo) {
            $res['external_order_no'] = $this->externalOrderNo;
        }
        if (null !== $this->externalOrderStatus) {
            $res['external_order_status'] = $this->externalOrderStatus;
        }
        if (null !== $this->openOrderNo) {
            $res['open_order_no'] = $this->openOrderNo;
        }
        if (null !== $this->openUserId) {
            $res['open_user_id'] = $this->openUserId;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncOrderDataRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['external_order_no'])) {
            $model->externalOrderNo = $map['external_order_no'];
        }
        if (isset($map['external_order_status'])) {
            $model->externalOrderStatus = $map['external_order_status'];
        }
        if (isset($map['open_order_no'])) {
            $model->openOrderNo = $map['open_order_no'];
        }
        if (isset($map['open_user_id'])) {
            $model->openUserId = $map['open_user_id'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }

        return $model;
    }
}
