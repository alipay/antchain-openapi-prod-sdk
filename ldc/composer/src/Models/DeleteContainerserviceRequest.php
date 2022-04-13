<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class DeleteContainerserviceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 最近一次草稿版本。
    /**
     * @var string
     */
    public $draftedRevision;

    // 最近一次草稿时间
    /**
     * @var string
     */
    public $draftedTime;

    // 容器应用服务名称。
    /**
     * @var string
     */
    public $name;

    // 当前命名空间名称。
    /**
     * @var string
     */
    public $namespace;

    // 提交人。
    /**
     * @var string
     */
    public $operator;

    // 所属工作空间组名称
    /**
     * @var string
     */
    public $workspaceGroup;
    protected $_name = [
        'authToken'       => 'auth_token',
        'draftedRevision' => 'drafted_revision',
        'draftedTime'     => 'drafted_time',
        'name'            => 'name',
        'namespace'       => 'namespace',
        'operator'        => 'operator',
        'workspaceGroup'  => 'workspace_group',
    ];

    public function validate()
    {
        Model::validatePattern('draftedTime', $this->draftedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->draftedRevision) {
            $res['drafted_revision'] = $this->draftedRevision;
        }
        if (null !== $this->draftedTime) {
            $res['drafted_time'] = $this->draftedTime;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteContainerserviceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['drafted_revision'])) {
            $model->draftedRevision = $map['drafted_revision'];
        }
        if (isset($map['drafted_time'])) {
            $model->draftedTime = $map['drafted_time'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }

        return $model;
    }
}
