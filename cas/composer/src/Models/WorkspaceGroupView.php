<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class WorkspaceGroupView extends Model
{
    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // displayName
    /**
     * @example displayName
     *
     * @var string
     */
    public $displayName;

    // tenantId
    /**
     * @example tenantId
     *
     * @var string
     */
    public $tenantId;

    // properties
    /**
     * @example properties
     *
     * @var string
     */
    public $properties;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // workspaces
    /**
     * @example workspaces
     *
     * @var WorkspaceView[]
     */
    public $workspaces;
    protected $_name = [
        'id'          => 'id',
        'name'        => 'name',
        'displayName' => 'display_name',
        'tenantId'    => 'tenant_id',
        'properties'  => 'properties',
        'status'      => 'status',
        'workspaces'  => 'workspaces',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('properties', $this->properties, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('workspaces', $this->workspaces, true);
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
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
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
     * @return WorkspaceGroupView
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
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['workspaces'])) {
            if (!empty($map['workspaces'])) {
                $model->workspaces = [];
                $n                 = 0;
                foreach ($map['workspaces'] as $item) {
                    $model->workspaces[$n++] = null !== $item ? WorkspaceView::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
