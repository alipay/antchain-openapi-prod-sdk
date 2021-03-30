<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateAssetpledgeRequest extends Model
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

    // 物权id
    /**
     * @var string
     */
    public $assetId;

    // 资金方的id
    /**
     * @var string
     */
    public $lenderId;

    // 申请方的id
    /**
     * @var string
     */
    public $userId;

    // 融资协议
    /**
     * @var string
     */
    public $financialProtocolId;

    // 质押金额
    /**
     * @var int
     */
    public $value;

    // 质押时长
    /**
     * @var int
     */
    public $duration;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'assetId'             => 'asset_id',
        'lenderId'            => 'lender_id',
        'userId'              => 'user_id',
        'financialProtocolId' => 'financial_protocol_id',
        'value'               => 'value',
        'duration'            => 'duration',
    ];

    public function validate()
    {
        Model::validateRequired('assetId', $this->assetId, true);
        Model::validateRequired('lenderId', $this->lenderId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('duration', $this->duration, true);
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
        if (null !== $this->lenderId) {
            $res['lender_id'] = $this->lenderId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->financialProtocolId) {
            $res['financial_protocol_id'] = $this->financialProtocolId;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->duration) {
            $res['duration'] = $this->duration;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAssetpledgeRequest
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
        if (isset($map['lender_id'])) {
            $model->lenderId = $map['lender_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['financial_protocol_id'])) {
            $model->financialProtocolId = $map['financial_protocol_id'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['duration'])) {
            $model->duration = $map['duration'];
        }

        return $model;
    }
}
