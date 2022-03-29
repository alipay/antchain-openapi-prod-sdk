<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class CreateSofamqNamespaceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // instance id
    /**
     * @var string
     */
    public $instanceId;

    // instance_type
    /**
     * @var string
     */
    public $instanceType;

    // nsid
    /**
     * @var string
     */
    public $namespaceId;

    // namespace_name
    /**
     * @var string
     */
    public $namespaceName;

    // workspace
    /**
     * @var string
     */
    public $workspace;

    // workspace_group
    /**
     * @var string
     */
    public $workspaceGroup;

    // ldcMode
    /**
     * @var int
     */
    public $ldcMode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'instanceType'      => 'instance_type',
        'namespaceId'       => 'namespace_id',
        'namespaceName'     => 'namespace_name',
        'workspace'         => 'workspace',
        'workspaceGroup'    => 'workspace_group',
        'ldcMode'           => 'ldc_mode',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('namespaceId', $this->namespaceId, true);
        Model::validateRequired('namespaceName', $this->namespaceName, true);
        Model::validateRequired('ldcMode', $this->ldcMode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->instanceType) {
            $res['instance_type'] = $this->instanceType;
        }
        if (null !== $this->namespaceId) {
            $res['namespace_id'] = $this->namespaceId;
        }
        if (null !== $this->namespaceName) {
            $res['namespace_name'] = $this->namespaceName;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->ldcMode) {
            $res['ldc_mode'] = $this->ldcMode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSofamqNamespaceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['instance_type'])) {
            $model->instanceType = $map['instance_type'];
        }
        if (isset($map['namespace_id'])) {
            $model->namespaceId = $map['namespace_id'];
        }
        if (isset($map['namespace_name'])) {
            $model->namespaceName = $map['namespace_name'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['ldc_mode'])) {
            $model->ldcMode = $map['ldc_mode'];
        }

        return $model;
    }
}
