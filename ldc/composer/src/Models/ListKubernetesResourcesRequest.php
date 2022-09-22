<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ListKubernetesResourcesRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 所属工作空间组名称。
    /**
     * @var string
     */
    public $workspaceGroup;

    // 标签选择器。
    /**
     * @var string
     */
    public $labelSelector;

    // kubernetes资源路径。
    /**
     * @var string
     */
    public $path;

    // 命名空间名称。
    /**
     * @var string
     */
    public $namespace;

    // cell名称列表，只查指定cell的集群
    /**
     * @var string[]
     */
    public $cells;
    protected $_name = [
        'authToken'      => 'auth_token',
        'workspaceGroup' => 'workspace_group',
        'labelSelector'  => 'label_selector',
        'path'           => 'path',
        'namespace'      => 'namespace',
        'cells'          => 'cells',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('path', $this->path, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->labelSelector) {
            $res['label_selector'] = $this->labelSelector;
        }
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->cells) {
            $res['cells'] = $this->cells;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListKubernetesResourcesRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['label_selector'])) {
            $model->labelSelector = $map['label_selector'];
        }
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['cells'])) {
            if (!empty($map['cells'])) {
                $model->cells = $map['cells'];
            }
        }

        return $model;
    }
}
