<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UpdateTraasmetaAppgroupRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // uuid
    /**
     * @var string
     */
    public $uuid;

    // name
    /**
     * @var string
     */
    public $name;

    // display_name
    /**
     * @var string
     */
    public $displayName;

    // outside_id
    /**
     * @var string
     */
    public $outsideId;

    // source_from
    /**
     * @var string
     */
    public $sourceFrom;

    // extension
    /**
     * @var string
     */
    public $extension;

    // tenant_uuid
    /**
     * @var string
     */
    public $tenantUuid;

    // tenant_name
    /**
     * @var string
     */
    public $tenantName;

    // parent_uuid
    /**
     * @var string
     */
    public $parentUuid;

    // layer
    /**
     * @var int
     */
    public $layer;

    // outside_parent_id
    /**
     * @var string
     */
    public $outsideParentId;
    protected $_name = [
        'authToken'       => 'auth_token',
        'uuid'            => 'uuid',
        'name'            => 'name',
        'displayName'     => 'display_name',
        'outsideId'       => 'outside_id',
        'sourceFrom'      => 'source_from',
        'extension'       => 'extension',
        'tenantUuid'      => 'tenant_uuid',
        'tenantName'      => 'tenant_name',
        'parentUuid'      => 'parent_uuid',
        'layer'           => 'layer',
        'outsideParentId' => 'outside_parent_id',
    ];

    public function validate()
    {
        Model::validateRequired('uuid', $this->uuid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->uuid) {
            $res['uuid'] = $this->uuid;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->outsideId) {
            $res['outside_id'] = $this->outsideId;
        }
        if (null !== $this->sourceFrom) {
            $res['source_from'] = $this->sourceFrom;
        }
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }
        if (null !== $this->tenantUuid) {
            $res['tenant_uuid'] = $this->tenantUuid;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->parentUuid) {
            $res['parent_uuid'] = $this->parentUuid;
        }
        if (null !== $this->layer) {
            $res['layer'] = $this->layer;
        }
        if (null !== $this->outsideParentId) {
            $res['outside_parent_id'] = $this->outsideParentId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateTraasmetaAppgroupRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['uuid'])) {
            $model->uuid = $map['uuid'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['outside_id'])) {
            $model->outsideId = $map['outside_id'];
        }
        if (isset($map['source_from'])) {
            $model->sourceFrom = $map['source_from'];
        }
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }
        if (isset($map['tenant_uuid'])) {
            $model->tenantUuid = $map['tenant_uuid'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['parent_uuid'])) {
            $model->parentUuid = $map['parent_uuid'];
        }
        if (isset($map['layer'])) {
            $model->layer = $map['layer'];
        }
        if (isset($map['outside_parent_id'])) {
            $model->outsideParentId = $map['outside_parent_id'];
        }

        return $model;
    }
}
