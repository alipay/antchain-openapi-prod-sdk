<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PodAffinityConfig extends Model
{
    // anti_affinity
    /**
     * @example true, false
     *
     * @var bool
     */
    public $antiAffinity;

    // pod_affinity_term
    /**
     * @example
     *
     * @var PodAffinityTermEntity
     */
    public $podAffinityTerm;

    // requested
    /**
     * @example true, false
     *
     * @var bool
     */
    public $requested;

    // weight
    /**
     * @example
     *
     * @var int
     */
    public $weight;
    protected $_name = [
        'antiAffinity'    => 'anti_affinity',
        'podAffinityTerm' => 'pod_affinity_term',
        'requested'       => 'requested',
        'weight'          => 'weight',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->antiAffinity) {
            $res['anti_affinity'] = $this->antiAffinity;
        }
        if (null !== $this->podAffinityTerm) {
            $res['pod_affinity_term'] = null !== $this->podAffinityTerm ? $this->podAffinityTerm->toMap() : null;
        }
        if (null !== $this->requested) {
            $res['requested'] = $this->requested;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PodAffinityConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['anti_affinity'])) {
            $model->antiAffinity = $map['anti_affinity'];
        }
        if (isset($map['pod_affinity_term'])) {
            $model->podAffinityTerm = PodAffinityTermEntity::fromMap($map['pod_affinity_term']);
        }
        if (isset($map['requested'])) {
            $model->requested = $map['requested'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }

        return $model;
    }
}
