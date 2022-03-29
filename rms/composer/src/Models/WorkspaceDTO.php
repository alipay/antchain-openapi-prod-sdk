<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class WorkspaceDTO extends Model
{
    // id
    /**
     * @example id
     *
     * @var int
     */
    public $id;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // display_name
    /**
     * @example display_name
     *
     * @var string
     */
    public $displayName;

    // outside_ws_id
    /**
     * @example outside_ws_id
     *
     * @var string
     */
    public $outsideWsId;

    // tenant_id
    /**
     * @example tenant_id
     *
     * @var int
     */
    public $tenantId;

    // outside_tenant_id
    /**
     * @example outside_tenant_id
     *
     * @var string
     */
    public $outsideTenantId;

    // stack_view
    /**
     * @example stack_view
     *
     * @var bool
     */
    public $stackView;
    protected $_name = [
        'id'              => 'id',
        'name'            => 'name',
        'displayName'     => 'display_name',
        'outsideWsId'     => 'outside_ws_id',
        'tenantId'        => 'tenant_id',
        'outsideTenantId' => 'outside_tenant_id',
        'stackView'       => 'stack_view',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('outsideWsId', $this->outsideWsId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('outsideTenantId', $this->outsideTenantId, true);
        Model::validateRequired('stackView', $this->stackView, true);
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
        if (null !== $this->outsideWsId) {
            $res['outside_ws_id'] = $this->outsideWsId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->outsideTenantId) {
            $res['outside_tenant_id'] = $this->outsideTenantId;
        }
        if (null !== $this->stackView) {
            $res['stack_view'] = $this->stackView;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WorkspaceDTO
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
        if (isset($map['outside_ws_id'])) {
            $model->outsideWsId = $map['outside_ws_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['outside_tenant_id'])) {
            $model->outsideTenantId = $map['outside_tenant_id'];
        }
        if (isset($map['stack_view'])) {
            $model->stackView = $map['stack_view'];
        }

        return $model;
    }
}
