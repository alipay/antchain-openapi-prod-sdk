<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateTransferRequest extends Model
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

    // 资产id列表
    /**
     * @var string[]
     */
    public $assetIdList;

    // 接收人id
    /**
     * @var string
     */
    public $transferee;

    // 转让金额
    /**
     * @var string
     */
    public $monetaryAmount;

    // 用户id
    /**
     * @var string
     */
    public $userId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'assetIdList'       => 'asset_id_list',
        'transferee'        => 'transferee',
        'monetaryAmount'    => 'monetary_amount',
        'userId'            => 'user_id',
    ];

    public function validate()
    {
        Model::validateRequired('assetIdList', $this->assetIdList, true);
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
        if (null !== $this->assetIdList) {
            $res['asset_id_list'] = $this->assetIdList;
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
     * @return BatchcreateTransferRequest
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
        if (isset($map['asset_id_list'])) {
            if (!empty($map['asset_id_list'])) {
                $model->assetIdList = $map['asset_id_list'];
            }
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
