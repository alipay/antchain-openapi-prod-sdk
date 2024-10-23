<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\UNITYCS\Models;

use AlibabaCloud\Tea\Model;

class GetDepositRequest extends Model
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

    // 元数据编码
    /**
     * @var string
     */
    public $metadataCode;

    // 交易hash，与identify两者必须至少传入一个，两者都输入时，以tx_hash为准
    /**
     * @var string
     */
    public $txHash;

    // 数据标识，与交易hash（tx_hash）两者必须至少传入一个，两者都输入时，以tx_hash为准
    /**
     * @var string
     */
    public $identify;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'metadataCode'      => 'metadata_code',
        'txHash'            => 'tx_hash',
        'identify'          => 'identify',
    ];

    public function validate()
    {
        Model::validateRequired('metadataCode', $this->metadataCode, true);
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
        if (null !== $this->metadataCode) {
            $res['metadata_code'] = $this->metadataCode;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->identify) {
            $res['identify'] = $this->identify;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDepositRequest
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
        if (isset($map['metadata_code'])) {
            $model->metadataCode = $map['metadata_code'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['identify'])) {
            $model->identify = $map['identify'];
        }

        return $model;
    }
}
