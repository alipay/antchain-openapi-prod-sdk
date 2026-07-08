<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class DetailPdcpDepositRequest extends Model
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

    // 数据类型名称，用户标识记录的数据类型。
    /**
     * @var string
     */
    public $dataType;

    // 存证数据ID，存证数据唯一标识ID。
    /**
     * @var string
     */
    public $dataId;

    // 数据存证区块链交易ID，对应数据版本号。 若未指定，返回最近的版本。
    /**
     * @var string
     */
    public $txId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataType'          => 'data_type',
        'dataId'            => 'data_id',
        'txId'              => 'tx_id',
    ];

    public function validate()
    {
        Model::validateRequired('dataType', $this->dataType, true);
        Model::validateRequired('dataId', $this->dataId, true);
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
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->txId) {
            $res['tx_id'] = $this->txId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailPdcpDepositRequest
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
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['tx_id'])) {
            $model->txId = $map['tx_id'];
        }

        return $model;
    }
}
