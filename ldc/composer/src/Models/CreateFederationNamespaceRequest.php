<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CreateFederationNamespaceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // k8s resource labels
    /**
     * @var Label[]
     */
    public $labels;

    // FedNamespace名称
    /**
     * @var string
     */
    public $name;

    // workspaceGroup名称
    /**
     * @var string
     */
    public $workspaceGroupName;

    // annotation,可以用来存放description等其他字段
    /**
     * @var Annotation[]
     */
    public $annotations;
    protected $_name = [
        'authToken'          => 'auth_token',
        'labels'             => 'labels',
        'name'               => 'name',
        'workspaceGroupName' => 'workspace_group_name',
        'annotations'        => 'annotations',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('workspaceGroupName', $this->workspaceGroupName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->labels) {
            $res['labels'] = [];
            if (null !== $this->labels && \is_array($this->labels)) {
                $n = 0;
                foreach ($this->labels as $item) {
                    $res['labels'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->workspaceGroupName) {
            $res['workspace_group_name'] = $this->workspaceGroupName;
        }
        if (null !== $this->annotations) {
            $res['annotations'] = [];
            if (null !== $this->annotations && \is_array($this->annotations)) {
                $n = 0;
                foreach ($this->annotations as $item) {
                    $res['annotations'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateFederationNamespaceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['labels'])) {
            if (!empty($map['labels'])) {
                $model->labels = [];
                $n             = 0;
                foreach ($map['labels'] as $item) {
                    $model->labels[$n++] = null !== $item ? Label::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['workspace_group_name'])) {
            $model->workspaceGroupName = $map['workspace_group_name'];
        }
        if (isset($map['annotations'])) {
            if (!empty($map['annotations'])) {
                $model->annotations = [];
                $n                  = 0;
                foreach ($map['annotations'] as $item) {
                    $model->annotations[$n++] = null !== $item ? Annotation::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
