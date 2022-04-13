<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class Affinity extends Model
{
    // Describes node affinity scheduling rules for the pod.
    //
    /**
     * @example
     *
     * @var NodeAffinity
     */
    public $nodeAffinity;

    // Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
    /**
     * @example
     *
     * @var PodAffinity
     */
    public $podAffinity;

    // Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
    //
    /**
     * @example
     *
     * @var PodAntiAffinity
     */
    public $podAntiAffinity;
    protected $_name = [
        'nodeAffinity'    => 'node_affinity',
        'podAffinity'     => 'pod_affinity',
        'podAntiAffinity' => 'pod_anti_affinity',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->nodeAffinity) {
            $res['node_affinity'] = null !== $this->nodeAffinity ? $this->nodeAffinity->toMap() : null;
        }
        if (null !== $this->podAffinity) {
            $res['pod_affinity'] = null !== $this->podAffinity ? $this->podAffinity->toMap() : null;
        }
        if (null !== $this->podAntiAffinity) {
            $res['pod_anti_affinity'] = null !== $this->podAntiAffinity ? $this->podAntiAffinity->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Affinity
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['node_affinity'])) {
            $model->nodeAffinity = NodeAffinity::fromMap($map['node_affinity']);
        }
        if (isset($map['pod_affinity'])) {
            $model->podAffinity = PodAffinity::fromMap($map['pod_affinity']);
        }
        if (isset($map['pod_anti_affinity'])) {
            $model->podAntiAffinity = PodAntiAffinity::fromMap($map['pod_anti_affinity']);
        }

        return $model;
    }
}
