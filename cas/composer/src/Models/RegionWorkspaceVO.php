<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class RegionWorkspaceVO extends Model
{
    // availableNetworkTypes
    /**
     * @example
     *
     * @var string[]
     */
    public $availableNetworkTypes;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

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

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // networkType
    /**
     * @example networkType
     *
     * @var string
     */
    public $networkType;

    // providerId
    /**
     * @example providerId
     *
     * @var string
     */
    public $providerId;

    // state
    /**
     * @example state
     *
     * @var string
     */
    public $state;

    // workspaces
    /**
     * @example
     *
     * @var WorkspaceWithGroupView[]
     */
    public $workspaces;
    protected $_name = [
        'availableNetworkTypes' => 'available_network_types',
        'description'           => 'description',
        'id'                    => 'id',
        'identity'              => 'identity',
        'name'                  => 'name',
        'networkType'           => 'network_type',
        'providerId'            => 'provider_id',
        'state'                 => 'state',
        'workspaces'            => 'workspaces',
    ];

    public function validate()
    {
        Model::validateRequired('availableNetworkTypes', $this->availableNetworkTypes, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('networkType', $this->networkType, true);
        Model::validateRequired('providerId', $this->providerId, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('workspaces', $this->workspaces, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->availableNetworkTypes) {
            $res['available_network_types'] = $this->availableNetworkTypes;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->networkType) {
            $res['network_type'] = $this->networkType;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->workspaces) {
            $res['workspaces'] = [];
            if (null !== $this->workspaces && \is_array($this->workspaces)) {
                $n = 0;
                foreach ($this->workspaces as $item) {
                    $res['workspaces'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegionWorkspaceVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['available_network_types'])) {
            if (!empty($map['available_network_types'])) {
                $model->availableNetworkTypes = $map['available_network_types'];
            }
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['network_type'])) {
            $model->networkType = $map['network_type'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['workspaces'])) {
            if (!empty($map['workspaces'])) {
                $model->workspaces = [];
                $n                 = 0;
                foreach ($map['workspaces'] as $item) {
                    $model->workspaces[$n++] = null !== $item ? WorkspaceWithGroupView::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
