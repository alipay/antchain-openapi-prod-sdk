<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\FAIROPENNET\Models;

use AlibabaCloud\Tea\Model;

class AddPartyToSpaceInput extends Model
{
    /**
     * @example
     *
     * @var string
     */
    public $networkId;

    /**
     * @example
     *
     * @var string
     */
    public $spaceId;

    /**
     * @example
     *
     * @var string
     */
    public $nodeId;

    /**
     * @example
     *
     * @var string
     */
    public $partyId;
    protected $_name = [
        'networkId' => 'network_id',
        'spaceId'   => 'space_id',
        'nodeId'    => 'node_id',
        'partyId'   => 'party_id',
    ];

    public function validate()
    {
        Model::validateRequired('networkId', $this->networkId, true);
        Model::validateRequired('spaceId', $this->spaceId, true);
        Model::validateRequired('nodeId', $this->nodeId, true);
        Model::validateRequired('partyId', $this->partyId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->networkId) {
            $res['network_id'] = $this->networkId;
        }
        if (null !== $this->spaceId) {
            $res['space_id'] = $this->spaceId;
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
     * @return AddPartyToSpaceInput
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['network_id'])) {
            $model->networkId = $map['network_id'];
        }
        if (isset($map['space_id'])) {
            $model->spaceId = $map['space_id'];
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
