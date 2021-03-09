<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DatabaseSecurityIp extends Model
{
    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // resource_id
    /**
     * @example resource_id
     *
     * @var string
     */
    public $resourceId;

    // resource_type
    /**
     * @example resource_type
     *
     * @var string
     */
    public $resourceType;

    // ip
    /**
     * @example ip
     *
     * @var string
     */
    public $ip;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // type
    /**
     * @example type
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'id'           => 'id',
        'resourceId'   => 'resource_id',
        'resourceType' => 'resource_type',
        'ip'           => 'ip',
        'status'       => 'status',
        'type'         => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DatabaseSecurityIp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
