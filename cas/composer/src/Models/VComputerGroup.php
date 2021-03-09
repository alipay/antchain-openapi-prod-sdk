<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class VComputerGroup extends Model
{
    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // workspace_id
    /**
     * @example workspace_id
     *
     * @var string
     */
    public $workspaceId;

    // load_balancer
    /**
     * @example
     *
     * @var LoadBalancer
     */
    public $loadBalancer;

    // status
    /**
     * @example status
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'name'         => 'name',
        'id'           => 'id',
        'workspaceId'  => 'workspace_id',
        'loadBalancer' => 'load_balancer',
        'status'       => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('loadBalancer', $this->loadBalancer, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->loadBalancer) {
            $res['load_balancer'] = null !== $this->loadBalancer ? $this->loadBalancer->toMap() : null;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VComputerGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['load_balancer'])) {
            $model->loadBalancer = LoadBalancer::fromMap($map['load_balancer']);
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
