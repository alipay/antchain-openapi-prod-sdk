<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateDistributionFundPromoterRequest extends Model
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

    // 可提现余额
    /**
     * @var string
     */
    public $balance;

    // 推广人id
    /**
     * @var string
     */
    public $promoterId;

    // 待结算
    /**
     * @var string
     */
    public $settleQuota;

    // 商户id
    /**
     * @var string
     */
    public $shopId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'balance'           => 'balance',
        'promoterId'        => 'promoter_id',
        'settleQuota'       => 'settle_quota',
        'shopId'            => 'shop_id',
    ];

    public function validate()
    {
        Model::validateRequired('balance', $this->balance, true);
        Model::validateRequired('promoterId', $this->promoterId, true);
        Model::validateRequired('settleQuota', $this->settleQuota, true);
        Model::validateRequired('shopId', $this->shopId, true);
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
        if (null !== $this->balance) {
            $res['balance'] = $this->balance;
        }
        if (null !== $this->promoterId) {
            $res['promoter_id'] = $this->promoterId;
        }
        if (null !== $this->settleQuota) {
            $res['settle_quota'] = $this->settleQuota;
        }
        if (null !== $this->shopId) {
            $res['shop_id'] = $this->shopId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDistributionFundPromoterRequest
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
        if (isset($map['balance'])) {
            $model->balance = $map['balance'];
        }
        if (isset($map['promoter_id'])) {
            $model->promoterId = $map['promoter_id'];
        }
        if (isset($map['settle_quota'])) {
            $model->settleQuota = $map['settle_quota'];
        }
        if (isset($map['shop_id'])) {
            $model->shopId = $map['shop_id'];
        }

        return $model;
    }
}
