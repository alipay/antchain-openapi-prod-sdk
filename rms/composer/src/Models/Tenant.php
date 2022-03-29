<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class Tenant extends Model
{
    // ID
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 租户名称
    /**
     * @example ANTCLOUD
     *
     * @var string
     */
    public $name;

    // 展示名称
    /**
     * @example 金融云租户
     *
     * @var string
     */
    public $displayName;

    // outsideTenantId
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $outsideTenantId;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;

    // config
    /**
     * @example config
     *
     * @var string
     */
    public $config;

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
        'outsideTenantId' => 'outside_tenant_id',
        'status'          => 'status',
        'config'          => 'config',
        'stackView'       => 'stack_view',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('outsideTenantId', $this->outsideTenantId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('config', $this->config, true);
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
        if (null !== $this->outsideTenantId) {
            $res['outside_tenant_id'] = $this->outsideTenantId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->config) {
            $res['config'] = $this->config;
        }
        if (null !== $this->stackView) {
            $res['stack_view'] = $this->stackView;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Tenant
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
        if (isset($map['outside_tenant_id'])) {
            $model->outsideTenantId = $map['outside_tenant_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['config'])) {
            $model->config = $map['config'];
        }
        if (isset($map['stack_view'])) {
            $model->stackView = $map['stack_view'];
        }

        return $model;
    }
}
