<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class FreezeMallPointRequest extends Model
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

    // 支付宝小程序用户唯一ID
    /**
     * @var string
     */
    public $openId;

    // 门店ID
    /**
     * @var string
     */
    public $storeId;

    // 账户ID
    /**
     * @var string
     */
    public $accountId;

    // 收货信息
    /**
     * @var PointReceiverInfo
     */
    public $receiverInfo;

    // 订单信息（子）
    /**
     * @var PointOrderInfo[]
     */
    public $orderInfoList;

    // 扩展字段
    /**
     * @var string
     */
    public $extraInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'openId'            => 'open_id',
        'storeId'           => 'store_id',
        'accountId'         => 'account_id',
        'receiverInfo'      => 'receiver_info',
        'orderInfoList'     => 'order_info_list',
        'extraInfo'         => 'extra_info',
    ];

    public function validate()
    {
        Model::validateRequired('openId', $this->openId, true);
        Model::validateRequired('storeId', $this->storeId, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('receiverInfo', $this->receiverInfo, true);
        Model::validateRequired('orderInfoList', $this->orderInfoList, true);
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
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->storeId) {
            $res['store_id'] = $this->storeId;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->receiverInfo) {
            $res['receiver_info'] = null !== $this->receiverInfo ? $this->receiverInfo->toMap() : null;
        }
        if (null !== $this->orderInfoList) {
            $res['order_info_list'] = [];
            if (null !== $this->orderInfoList && \is_array($this->orderInfoList)) {
                $n = 0;
                foreach ($this->orderInfoList as $item) {
                    $res['order_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FreezeMallPointRequest
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
        if (isset($map['open_id'])) {
            $model->openId = $map['open_id'];
        }
        if (isset($map['store_id'])) {
            $model->storeId = $map['store_id'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['receiver_info'])) {
            $model->receiverInfo = PointReceiverInfo::fromMap($map['receiver_info']);
        }
        if (isset($map['order_info_list'])) {
            if (!empty($map['order_info_list'])) {
                $model->orderInfoList = [];
                $n                    = 0;
                foreach ($map['order_info_list'] as $item) {
                    $model->orderInfoList[$n++] = null !== $item ? PointOrderInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }

        return $model;
    }
}
