<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class NamespaceDO extends Model
{
    // gmt_create
    /**
     * @example gmt_create
     *
     * @var string
     */
    public $gmtCreate;

    // gmt_modified
    /**
     * @example gmt_modified
     *
     * @var string
     */
    public $gmtModified;

    // id
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // instance type
    /**
     * @example instance type
     *
     * @var string
     */
    public $instanceType;

    // namespace name
    /**
     * @example namespace name
     *
     * @var string
     */
    public $namespaceName;

    // workspace
    /**
     * @example workspace
     *
     * @var string
     */
    public $workspace;

    // workspace group
    /**
     * @example workspace group
     *
     * @var string
     */
    public $workspaceGroup;

    // ldcMode
    /**
     * @example
     *
     * @var int
     */
    public $ldcMode;
    protected $_name = [
        'gmtCreate'      => 'gmt_create',
        'gmtModified'    => 'gmt_modified',
        'id'             => 'id',
        'instanceType'   => 'instance_type',
        'namespaceName'  => 'namespace_name',
        'workspace'      => 'workspace',
        'workspaceGroup' => 'workspace_group',
        'ldcMode'        => 'ldc_mode',
    ];

    public function validate()
    {
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('namespaceName', $this->namespaceName, true);
        Model::validateRequired('ldcMode', $this->ldcMode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceType) {
            $res['instance_type'] = $this->instanceType;
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
     * @return NamespaceDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_type'])) {
            $model->instanceType = $map['instance_type'];
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
