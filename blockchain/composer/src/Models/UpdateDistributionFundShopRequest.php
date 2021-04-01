<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateDistributionFundShopRequest extends Model
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

    // 审批中额度
    /**
     * @var string
     */
    public $approveQuota;

    // 可提现余额
    /**
     * @var string
     */
    public $balance;

    // 已到账额度
    /**
     * @var string
     */
    public $finishQuota;

    // 商户id
    /**
     * @var string
     */
    public $shopId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'approveQuota'      => 'approve_quota',
        'balance'           => 'balance',
        'finishQuota'       => 'finish_quota',
        'shopId'            => 'shop_id',
    ];

    public function validate()
    {
        Model::validateRequired('approveQuota', $this->approveQuota, true);
        Model::validateRequired('balance', $this->balance, true);
        Model::validateRequired('finishQuota', $this->finishQuota, true);
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
        if (null !== $this->approveQuota) {
            $res['approve_quota'] = $this->approveQuota;
        }
        if (null !== $this->balance) {
            $res['balance'] = $this->balance;
        }
        if (null !== $this->finishQuota) {
            $res['finish_quota'] = $this->finishQuota;
        }
        if (null !== $this->shopId) {
            $res['shop_id'] = $this->shopId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDistributionFundShopRequest
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
        if (isset($map['approve_quota'])) {
            $model->approveQuota = $map['approve_quota'];
        }
        if (isset($map['balance'])) {
            $model->balance = $map['balance'];
        }
        if (isset($map['finish_quota'])) {
            $model->finishQuota = $map['finish_quota'];
        }
        if (isset($map['shop_id'])) {
            $model->shopId = $map['shop_id'];
        }

        return $model;
    }
}
