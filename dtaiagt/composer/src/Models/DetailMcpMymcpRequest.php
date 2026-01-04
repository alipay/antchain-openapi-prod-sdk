<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class DetailMcpMymcpRequest extends Model
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

    // 空间id
    /**
     * @var string
     */
    public $spaceId;

    // 平台serverId
    /**
     * @var string
     */
    public $serverId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'spaceId'           => 'space_id',
        'serverId'          => 'server_id',
    ];

    public function validate()
    {
        Model::validateRequired('spaceId', $this->spaceId, true);
        Model::validateRequired('serverId', $this->serverId, true);
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
        if (null !== $this->spaceId) {
            $res['space_id'] = $this->spaceId;
        }
        if (null !== $this->serverId) {
            $res['server_id'] = $this->serverId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailMcpMymcpRequest
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
        if (isset($map['space_id'])) {
            $model->spaceId = $map['space_id'];
        }
        if (isset($map['server_id'])) {
            $model->serverId = $map['server_id'];
        }

        return $model;
    }
}
