<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class RegionView extends Model
{
    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // identity
    /**
     * @example identity
     *
     * @var string
     */
    public $identity;

    // providerId
    /**
     * @example providerId
     *
     * @var string
     */
    public $providerId;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // state
    /**
     * @example state
     *
     * @var string
     */
    public $state;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // networkType
    /**
     * @example networkType
     *
     * @var string
     */
    public $networkType;

    // availableNetworkTypes
    /**
     * @example availableNetworkTypes
     *
     * @var string[]
     */
    public $availableNetworkTypes;
    protected $_name = [
        'id'                    => 'id',
        'identity'              => 'identity',
        'providerId'            => 'provider_id',
        'name'                  => 'name',
        'state'                 => 'state',
        'description'           => 'description',
        'networkType'           => 'network_type',
        'availableNetworkTypes' => 'available_network_types',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('providerId', $this->providerId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('networkType', $this->networkType, true);
        Model::validateRequired('availableNetworkTypes', $this->availableNetworkTypes, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->networkType) {
            $res['network_type'] = $this->networkType;
        }
        if (null !== $this->availableNetworkTypes) {
            $res['available_network_types'] = $this->availableNetworkTypes;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegionView
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['network_type'])) {
            $model->networkType = $map['network_type'];
        }
        if (isset($map['available_network_types'])) {
            if (!empty($map['available_network_types'])) {
                $model->availableNetworkTypes = $map['available_network_types'];
            }
        }

        return $model;
    }
}
