<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDataauthorizationSyncDataRequest extends Model
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

    // 枚举值：
    // DATAENTITY：数据目录
    // PARTICIPANT：参与方
    /**
     * @var string
     */
    public $type;

    // 接收同步数据的DID
    /**
     * @var string
     */
    public $receiverId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'type'              => 'type',
        'receiverId'        => 'receiver_id',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('receiverId', $this->receiverId, true);
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
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->receiverId) {
            $res['receiver_id'] = $this->receiverId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDataauthorizationSyncDataRequest
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
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['receiver_id'])) {
            $model->receiverId = $map['receiver_id'];
        }

        return $model;
    }
}
