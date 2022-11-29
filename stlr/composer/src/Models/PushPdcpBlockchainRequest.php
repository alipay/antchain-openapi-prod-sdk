<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class PushPdcpBlockchainRequest extends Model
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

    // 消息ID
    /**
     * @var string
     */
    public $txMsgId;

    // 用户ID
    /**
     * @var string
     */
    public $userId;

    // 数据类型，枚举定义
    /**
     * @var string
     */
    public $dataType;

    // 密文类型
    /**
     * @var string
     */
    public $encryptType;

    // 待存证数据，根据数据类型序列化为json。并加密传输
    /**
     * @var string
     */
    public $depositData;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'txMsgId'           => 'tx_msg_id',
        'userId'            => 'user_id',
        'dataType'          => 'data_type',
        'encryptType'       => 'encrypt_type',
        'depositData'       => 'deposit_data',
    ];

    public function validate()
    {
        Model::validateRequired('txMsgId', $this->txMsgId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('dataType', $this->dataType, true);
        Model::validateRequired('encryptType', $this->encryptType, true);
        Model::validateRequired('depositData', $this->depositData, true);
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
        if (null !== $this->txMsgId) {
            $res['tx_msg_id'] = $this->txMsgId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->encryptType) {
            $res['encrypt_type'] = $this->encryptType;
        }
        if (null !== $this->depositData) {
            $res['deposit_data'] = $this->depositData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushPdcpBlockchainRequest
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
        if (isset($map['tx_msg_id'])) {
            $model->txMsgId = $map['tx_msg_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }
        if (isset($map['encrypt_type'])) {
            $model->encryptType = $map['encrypt_type'];
        }
        if (isset($map['deposit_data'])) {
            $model->depositData = $map['deposit_data'];
        }

        return $model;
    }
}
