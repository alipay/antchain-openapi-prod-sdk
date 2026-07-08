<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class GetPdcpBlockchainRequest extends Model
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

    // 请求ID
    /**
     * @var string
     */
    public $txMsgId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'txMsgId'           => 'tx_msg_id',
    ];

    public function validate()
    {
        Model::validateRequired('txMsgId', $this->txMsgId, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetPdcpBlockchainRequest
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

        return $model;
    }
}
