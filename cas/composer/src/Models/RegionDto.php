<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class RegionDto extends Model
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

    // displayName
    /**
     * @example shanghai
     *
     * @var string
     */
    public $displayName;

    // iaasProviderId
    /**
     * @example 001
     *
     * @var string
     */
    public $iaasProviderId;

    // id
    /**
     * @example 001
     *
     * @var string
     */
    public $id;

    // identity
    /**
     * @example shanghai
     *
     * @var string
     */
    public $identity;

    // networkType
    /**
     * @example vpc
     *
     * @var string
     */
    public $networkType;

    // state
    /**
     * @example state
     *
     * @var string
     */
    public $state;

    // utcCreate
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // utcModified
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcModified;

    // zoneDtos
    /**
     * @example
     *
     * @var ZoneDto[]
     */
    public $zoneDtos;
    protected $_name = [
        'availableNetworkTypes' => 'available_network_types',
        'description'           => 'description',
        'displayName'           => 'display_name',
        'iaasProviderId'        => 'iaas_provider_id',
        'id'                    => 'id',
        'identity'              => 'identity',
        'networkType'           => 'network_type',
        'state'                 => 'state',
        'utcCreate'             => 'utc_create',
        'utcModified'           => 'utc_modified',
        'zoneDtos'              => 'zone_dtos',
    ];

    public function validate()
    {
        Model::validateRequired('availableNetworkTypes', $this->availableNetworkTypes, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('iaasProviderId', $this->iaasProviderId, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('networkType', $this->networkType, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('utcCreate', $this->utcCreate, true);
        Model::validateRequired('utcModified', $this->utcModified, true);
        Model::validateRequired('zoneDtos', $this->zoneDtos, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->iaasProviderId) {
            $res['iaas_provider_id'] = $this->iaasProviderId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->networkType) {
            $res['network_type'] = $this->networkType;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        if (null !== $this->zoneDtos) {
            $res['zone_dtos'] = [];
            if (null !== $this->zoneDtos && \is_array($this->zoneDtos)) {
                $n = 0;
                foreach ($this->zoneDtos as $item) {
                    $res['zone_dtos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegionDto
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
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['iaas_provider_id'])) {
            $model->iaasProviderId = $map['iaas_provider_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['network_type'])) {
            $model->networkType = $map['network_type'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }
        if (isset($map['zone_dtos'])) {
            if (!empty($map['zone_dtos'])) {
                $model->zoneDtos = [];
                $n               = 0;
                foreach ($map['zone_dtos'] as $item) {
                    $model->zoneDtos[$n++] = null !== $item ? ZoneDto::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
