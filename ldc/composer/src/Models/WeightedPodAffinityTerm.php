<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class WeightedPodAffinityTerm extends Model
{
    // Pod Affinity Term
    /**
     * @example
     *
     * @var PodAffinityTerm
     */
    public $podAffinityTerm;

    // weight
    /**
     * @example
     *
     * @var int
     */
    public $weight;
    protected $_name = [
        'podAffinityTerm' => 'pod_affinity_term',
        'weight'          => 'weight',
    ];

    public function validate()
    {
        Model::validateRequired('podAffinityTerm', $this->podAffinityTerm, true);
        Model::validateRequired('weight', $this->weight, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->podAffinityTerm) {
            $res['pod_affinity_term'] = null !== $this->podAffinityTerm ? $this->podAffinityTerm->toMap() : null;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WeightedPodAffinityTerm
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pod_affinity_term'])) {
            $model->podAffinityTerm = PodAffinityTerm::fromMap($map['pod_affinity_term']);
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }

        return $model;
    }
}
