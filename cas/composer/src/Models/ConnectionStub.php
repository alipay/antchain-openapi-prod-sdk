<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ConnectionStub extends Model
{
    // cloud
    /**
     * @example
     *
     * @var Cloud
     */
    public $cloud;

    // id
    /**
     * @example id
     *
     * @var int
     */
    public $id;

    // tenant_id
    /**
     * @example tenant_id
     *
     * @var string
     */
    public $tenantId;

    // tenant_name
    /**
     * @example tenant_name
     *
     * @var string
     */
    public $tenantName;

    // type
    /**
     * @example PLUG, SOCKET
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'cloud'      => 'cloud',
        'id'         => 'id',
        'tenantId'   => 'tenant_id',
        'tenantName' => 'tenant_name',
        'type'       => 'type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cloud) {
            $res['cloud'] = null !== $this->cloud ? $this->cloud->toMap() : null;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConnectionStub
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cloud'])) {
            $model->cloud = Cloud::fromMap($map['cloud']);
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
