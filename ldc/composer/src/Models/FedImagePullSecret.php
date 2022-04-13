<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class FedImagePullSecret extends Model
{
    // annotations
    /**
     * @example
     *
     * @var string[]
     */
    public $annotations;

    // image pull secret registry account info
    /**
     * @example
     *
     * @var RegistryAccout
     */
    public $data;

    // labels
    /**
     * @example
     *
     * @var string[]
     */
    public $labels;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // namesapce
    /**
     * @example default
     *
     * @var string
     */
    public $namespace;

    // cell overrides
    /**
     * @example
     *
     * @var FedImagePullSecretOverrideList
     */
    public $overrides;

    // workspace group name
    /**
     * @example ANTCLOUD
     *
     * @var string
     */
    public $workspaceGroupName;

    // cell list
    /**
     * @example
     *
     * @var string[]
     */
    public $cells;
    protected $_name = [
        'annotations'        => 'annotations',
        'data'               => 'data',
        'labels'             => 'labels',
        'name'               => 'name',
        'namespace'          => 'namespace',
        'overrides'          => 'overrides',
        'workspaceGroupName' => 'workspace_group_name',
        'cells'              => 'cells',
    ];

    public function validate()
    {
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('overrides', $this->overrides, true);
        Model::validateRequired('workspaceGroupName', $this->workspaceGroupName, true);
        Model::validateRequired('cells', $this->cells, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->annotations) {
            $res['annotations'] = $this->annotations;
        }
        if (null !== $this->data) {
            $res['data'] = null !== $this->data ? $this->data->toMap() : null;
        }
        if (null !== $this->labels) {
            $res['labels'] = $this->labels;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->overrides) {
            $res['overrides'] = null !== $this->overrides ? $this->overrides->toMap() : null;
        }
        if (null !== $this->workspaceGroupName) {
            $res['workspace_group_name'] = $this->workspaceGroupName;
        }
        if (null !== $this->cells) {
            $res['cells'] = $this->cells;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FedImagePullSecret
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['annotations'])) {
            if (!empty($map['annotations'])) {
                $model->annotations = $map['annotations'];
            }
        }
        if (isset($map['data'])) {
            $model->data = RegistryAccout::fromMap($map['data']);
        }
        if (isset($map['labels'])) {
            if (!empty($map['labels'])) {
                $model->labels = $map['labels'];
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['overrides'])) {
            $model->overrides = FedImagePullSecretOverrideList::fromMap($map['overrides']);
        }
        if (isset($map['workspace_group_name'])) {
            $model->workspaceGroupName = $map['workspace_group_name'];
        }
        if (isset($map['cells'])) {
            if (!empty($map['cells'])) {
                $model->cells = $map['cells'];
            }
        }

        return $model;
    }
}
