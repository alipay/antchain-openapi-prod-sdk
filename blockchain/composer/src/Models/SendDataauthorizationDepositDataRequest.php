<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class SendDataauthorizationDepositDataRequest extends Model
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

    // 通知人列表
    /**
     * @var string[]
     */
    public $notificationIds;

    // 数据发送人
    /**
     * @var string
     */
    public $senderId;

    // 存证交易内容
    /**
     * @var string
     */
    public $txData;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'notificationIds'   => 'notification_ids',
        'senderId'          => 'sender_id',
        'txData'            => 'tx_data',
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
        if (null !== $this->notificationIds) {
            $res['notification_ids'] = $this->notificationIds;
        }
        if (null !== $this->senderId) {
            $res['sender_id'] = $this->senderId;
        }
        if (null !== $this->txData) {
            $res['tx_data'] = $this->txData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendDataauthorizationDepositDataRequest
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
        if (isset($map['notification_ids'])) {
            if (!empty($map['notification_ids'])) {
                $model->notificationIds = $map['notification_ids'];
            }
        }
        if (isset($map['sender_id'])) {
            $model->senderId = $map['sender_id'];
        }
        if (isset($map['tx_data'])) {
            $model->txData = $map['tx_data'];
        }

        return $model;
    }
}
