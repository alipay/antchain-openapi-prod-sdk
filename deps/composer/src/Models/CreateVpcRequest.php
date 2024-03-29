<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CreateVpcRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // VPC所在的地域
    /**
     * @var string
     */
    public $regionId;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 创建的VPC的ID
    /**
     * @var string
     */
    public $vpcId;

    //
    // 所属环境id
    /**
     * @var string
     */
    public $workspaceId;

    // vpc名称
    /**
     * @var string
     */
    public $name;
    protected $_name = [
        'authToken'   => 'auth_token',
        'tenant'      => 'tenant',
        'regionId'    => 'region_id',
        'tenantId'    => 'tenant_id',
        'vpcId'       => 'vpc_id',
        'workspaceId' => 'workspace_id',
        'name'        => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('vpcId', $this->vpcId, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->vpcId) {
            $res['vpc_id'] = $this->vpcId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateVpcRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['vpc_id'])) {
            $model->vpcId = $map['vpc_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
