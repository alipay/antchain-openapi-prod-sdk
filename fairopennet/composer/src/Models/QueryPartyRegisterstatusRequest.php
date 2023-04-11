<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class QueryPartyRegisterstatusRequest extends Model
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

    // 节点的nodeId
    /**
     * @var string
     */
    public $nodeId;

    // 用户的partyId
    /**
     * @var string
     */
    public $partyId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'nodeId'            => 'node_id',
        'partyId'           => 'party_id',
    ];

    public function validate()
    {
        Model::validateRequired('nodeId', $this->nodeId, true);
        Model::validateRequired('partyId', $this->partyId, true);
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
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->partyId) {
            $res['party_id'] = $this->partyId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPartyRegisterstatusRequest
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
        if (isset($map['node_id'])) {
            $model->nodeId = $map['node_id'];
        }
        if (isset($map['party_id'])) {
            $model->partyId = $map['party_id'];
        }

        return $model;
    }
}
