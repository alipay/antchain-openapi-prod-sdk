<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class RegisterPartyRequest extends Model
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

    // 参与方的partyId
    /**
     * @var string
     */
    public $partyId;

    // 描述party
    /**
     * @var string
     */
    public $partyDesc;

    // 节点的nodeId
    /**
     * @var string
     */
    public $nodeId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'partyId'           => 'party_id',
        'partyDesc'         => 'party_desc',
        'nodeId'            => 'node_id',
    ];

    public function validate()
    {
        Model::validateRequired('partyId', $this->partyId, true);
        Model::validateRequired('partyDesc', $this->partyDesc, true);
        Model::validateRequired('nodeId', $this->nodeId, true);
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
        if (null !== $this->partyId) {
            $res['party_id'] = $this->partyId;
        }
        if (null !== $this->partyDesc) {
            $res['party_desc'] = $this->partyDesc;
        }
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterPartyRequest
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
        if (isset($map['party_id'])) {
            $model->partyId = $map['party_id'];
        }
        if (isset($map['party_desc'])) {
            $model->partyDesc = $map['party_desc'];
        }
        if (isset($map['node_id'])) {
            $model->nodeId = $map['node_id'];
        }

        return $model;
    }
}
