<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class IaasConnMetadata extends Model
{
    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // iaas_provider_id
    /**
     * @example iaas_provider_id
     *
     * @var string
     */
    public $iaasProviderId;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // iaas_conn_type
    /**
     * @example iaas_conn_type
     *
     * @var string
     */
    public $iaasConnType;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // available_features
    /**
     * @example
     *
     * @var string[]
     */
    public $availableFeatures;

    // endpoint
    /**
     * @example endpoint
     *
     * @var string
     */
    public $endpoint;

    // region_ids
    /**
     * @example
     *
     * @var string[]
     */
    public $regionIds;

    // is_default
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isDefault;

    // utc_create
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;
    protected $_name = [
        'id'                => 'id',
        'iaasProviderId'    => 'iaas_provider_id',
        'name'              => 'name',
        'iaasConnType'      => 'iaas_conn_type',
        'description'       => 'description',
        'availableFeatures' => 'available_features',
        'endpoint'          => 'endpoint',
        'regionIds'         => 'region_ids',
        'isDefault'         => 'is_default',
        'utcCreate'         => 'utc_create',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('iaasProviderId', $this->iaasProviderId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('iaasConnType', $this->iaasConnType, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('endpoint', $this->endpoint, true);
        Model::validateRequired('regionIds', $this->regionIds, true);
        Model::validateRequired('isDefault', $this->isDefault, true);
        Model::validateRequired('utcCreate', $this->utcCreate, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->iaasProviderId) {
            $res['iaas_provider_id'] = $this->iaasProviderId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->iaasConnType) {
            $res['iaas_conn_type'] = $this->iaasConnType;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->availableFeatures) {
            $res['available_features'] = $this->availableFeatures;
        }
        if (null !== $this->endpoint) {
            $res['endpoint'] = $this->endpoint;
        }
        if (null !== $this->regionIds) {
            $res['region_ids'] = $this->regionIds;
        }
        if (null !== $this->isDefault) {
            $res['is_default'] = $this->isDefault;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IaasConnMetadata
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['iaas_provider_id'])) {
            $model->iaasProviderId = $map['iaas_provider_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['iaas_conn_type'])) {
            $model->iaasConnType = $map['iaas_conn_type'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['available_features'])) {
            if (!empty($map['available_features'])) {
                $model->availableFeatures = $map['available_features'];
            }
        }
        if (isset($map['endpoint'])) {
            $model->endpoint = $map['endpoint'];
        }
        if (isset($map['region_ids'])) {
            if (!empty($map['region_ids'])) {
                $model->regionIds = $map['region_ids'];
            }
        }
        if (isset($map['is_default'])) {
            $model->isDefault = $map['is_default'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }

        return $model;
    }
}
