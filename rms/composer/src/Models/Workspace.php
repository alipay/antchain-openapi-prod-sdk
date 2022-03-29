<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class Workspace extends Model
{
    // ID
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 名称
    /**
     * @example FIN-DEV-AKE2.0
     *
     * @var string
     */
    public $name;

    // 展示名称
    /**
     * @example FIN-DEV-AKE2.0
     *
     * @var string
     */
    public $displayName;

    // 租户ID
    /**
     * @example 1
     *
     * @var int
     */
    public $tenantId;

    // outsideWsId
    /**
     * @example 73080000000058
     *
     * @var string
     */
    public $outsideWsId;

    // outsideTenantId
    /**
     * @example 0000000004
     *
     * @var string
     */
    public $outsideTenantId;
    protected $_name = [
        'id'              => 'id',
        'name'            => 'name',
        'displayName'     => 'display_name',
        'tenantId'        => 'tenant_id',
        'outsideWsId'     => 'outside_ws_id',
        'outsideTenantId' => 'outside_tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('outsideWsId', $this->outsideWsId, true);
        Model::validateRequired('outsideTenantId', $this->outsideTenantId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->outsideWsId) {
            $res['outside_ws_id'] = $this->outsideWsId;
        }
        if (null !== $this->outsideTenantId) {
            $res['outside_tenant_id'] = $this->outsideTenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Workspace
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['outside_ws_id'])) {
            $model->outsideWsId = $map['outside_ws_id'];
        }
        if (isset($map['outside_tenant_id'])) {
            $model->outsideTenantId = $map['outside_tenant_id'];
        }

        return $model;
    }
}
