<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class AffinityEntity extends Model
{
    // NodeAffinityConfig list
    /**
     * @example
     *
     * @var NodeAffinityConfig[]
     */
    public $nodeAffinity;

    // pod_affinity list
    /**
     * @example
     *
     * @var PodAffinityConfig[]
     */
    public $podAffinity;
    protected $_name = [
        'nodeAffinity' => 'node_affinity',
        'podAffinity'  => 'pod_affinity',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->nodeAffinity) {
            $res['node_affinity'] = [];
            if (null !== $this->nodeAffinity && \is_array($this->nodeAffinity)) {
                $n = 0;
                foreach ($this->nodeAffinity as $item) {
                    $res['node_affinity'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->podAffinity) {
            $res['pod_affinity'] = [];
            if (null !== $this->podAffinity && \is_array($this->podAffinity)) {
                $n = 0;
                foreach ($this->podAffinity as $item) {
                    $res['pod_affinity'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AffinityEntity
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['node_affinity'])) {
            if (!empty($map['node_affinity'])) {
                $model->nodeAffinity = [];
                $n                   = 0;
                foreach ($map['node_affinity'] as $item) {
                    $model->nodeAffinity[$n++] = null !== $item ? NodeAffinityConfig::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['pod_affinity'])) {
            if (!empty($map['pod_affinity'])) {
                $model->podAffinity = [];
                $n                  = 0;
                foreach ($map['pod_affinity'] as $item) {
                    $model->podAffinity[$n++] = null !== $item ? PodAffinityConfig::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
