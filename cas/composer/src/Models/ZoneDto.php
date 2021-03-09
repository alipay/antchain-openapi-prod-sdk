<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ZoneDto extends Model
{
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

    // iaasProviderId
    /**
     * @example 001
     *
     * @var string
     */
    public $iaasProviderId;

    // displayName
    /**
     * @example shanghai
     *
     * @var string
     */
    public $displayName;

    // state
    /**
     * @example state
     *
     * @var string
     */
    public $state;

    // regionId
    /**
     * @example 001
     *
     * @var string
     */
    public $regionId;

    // no
    /**
     * @example
     *
     * @var int
     */
    public $no;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

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
    protected $_name = [
        'id'             => 'id',
        'identity'       => 'identity',
        'iaasProviderId' => 'iaas_provider_id',
        'displayName'    => 'display_name',
        'state'          => 'state',
        'regionId'       => 'region_id',
        'no'             => 'no',
        'name'           => 'name',
        'description'    => 'description',
        'utcCreate'      => 'utc_create',
        'utcModified'    => 'utc_modified',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('iaasProviderId', $this->iaasProviderId, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('no', $this->no, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('utcCreate', $this->utcCreate, true);
        Model::validateRequired('utcModified', $this->utcModified, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
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
        if (null !== $this->iaasProviderId) {
            $res['iaas_provider_id'] = $this->iaasProviderId;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->no) {
            $res['no'] = $this->no;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ZoneDto
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
        if (isset($map['iaas_provider_id'])) {
            $model->iaasProviderId = $map['iaas_provider_id'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['no'])) {
            $model->no = $map['no'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }

        return $model;
    }
}
