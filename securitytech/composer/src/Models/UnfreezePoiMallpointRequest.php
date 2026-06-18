<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class UnfreezePoiMallpointRequest extends Model
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

    // 订单号列表
    /**
     * @var string[]
     */
    public $orderIdList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'openId'            => 'open_id',
        'storeId'           => 'store_id',
        'accountId'         => 'account_id',
        'orderIdList'       => 'order_id_list',
    ];

    public function validate()
    {
        Model::validateRequired('openId', $this->openId, true);
        Model::validateRequired('storeId', $this->storeId, true);
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('orderIdList', $this->orderIdList, true);
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
        if (null !== $this->orderIdList) {
            $res['order_id_list'] = $this->orderIdList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnfreezePoiMallpointRequest
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
        if (isset($map['order_id_list'])) {
            if (!empty($map['order_id_list'])) {
                $model->orderIdList = $map['order_id_list'];
            }
        }

        return $model;
    }
}
