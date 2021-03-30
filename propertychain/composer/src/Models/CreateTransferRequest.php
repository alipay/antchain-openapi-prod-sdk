<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateTransferRequest extends Model
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

    // 资产id
    /**
     * @var string
     */
    public $assetId;

    // 被转让的对象
    /**
     * @var string
     */
    public $transferee;

    // 转让金额
    /**
     * @var string
     */
    public $monetaryAmount;

    // 用户的标识
    /**
     * @var string
     */
    public $userId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'assetId'           => 'asset_id',
        'transferee'        => 'transferee',
        'monetaryAmount'    => 'monetary_amount',
        'userId'            => 'user_id',
    ];

    public function validate()
    {
        Model::validateRequired('assetId', $this->assetId, true);
        Model::validateRequired('transferee', $this->transferee, true);
        Model::validateRequired('monetaryAmount', $this->monetaryAmount, true);
        Model::validateRequired('userId', $this->userId, true);
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
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->transferee) {
            $res['transferee'] = $this->transferee;
        }
        if (null !== $this->monetaryAmount) {
            $res['monetary_amount'] = $this->monetaryAmount;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateTransferRequest
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
        if (isset($map['asset_id'])) {
            $model->assetId = $map['asset_id'];
        }
        if (isset($map['transferee'])) {
            $model->transferee = $map['transferee'];
        }
        if (isset($map['monetary_amount'])) {
            $model->monetaryAmount = $map['monetary_amount'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }

        return $model;
    }
}
