<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class ListRuntimePoliciesRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $clusterId;

    // 命名空间
    /**
     * @var string
     */
    public $namespace;

    // 标签选择
    /**
     * @var Label[]
     */
    public $labelSelectors;
    protected $_name = [
        'authToken'      => 'auth_token',
        'clusterId'      => 'cluster_id',
        'namespace'      => 'namespace',
        'labelSelectors' => 'label_selectors',
    ];

    public function validate()
    {
        Model::validateRequired('clusterId', $this->clusterId, true);
        Model::validateRequired('namespace', $this->namespace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->clusterId) {
            $res['cluster_id'] = $this->clusterId;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->labelSelectors) {
            $res['label_selectors'] = [];
            if (null !== $this->labelSelectors && \is_array($this->labelSelectors)) {
                $n = 0;
                foreach ($this->labelSelectors as $item) {
                    $res['label_selectors'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListRuntimePoliciesRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['cluster_id'])) {
            $model->clusterId = $map['cluster_id'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['label_selectors'])) {
            if (!empty($map['label_selectors'])) {
                $model->labelSelectors = [];
                $n                     = 0;
                foreach ($map['label_selectors'] as $item) {
                    $model->labelSelectors[$n++] = null !== $item ? Label::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
