<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class SaveDataauthorizationDepositDataRequest extends Model
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

    // 存证内容
    /**
     * @var string
     */
    public $txData;

    // 发送数据上链的DID
    /**
     * @var string
     */
    public $senderId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'txData'            => 'tx_data',
        'senderId'          => 'sender_id',
    ];

    public function validate()
    {
        Model::validateRequired('txData', $this->txData, true);
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
        if (null !== $this->txData) {
            $res['tx_data'] = $this->txData;
        }
        if (null !== $this->senderId) {
            $res['sender_id'] = $this->senderId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveDataauthorizationDepositDataRequest
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
        if (isset($map['tx_data'])) {
            $model->txData = $map['tx_data'];
        }
        if (isset($map['sender_id'])) {
            $model->senderId = $map['sender_id'];
        }

        return $model;
    }
}
