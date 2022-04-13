<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PodAntiAffinity extends Model
{
    // The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions.
    /**
     * @example
     *
     * @var WeightedPodAffinityTerm[]
     */
    public $preferredDuringSchedulingIgnoredDuringExecution;

    // If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node
    /**
     * @example
     *
     * @var PodAffinityTerm[]
     */
    public $requiredDuringSchedulingIgnoredDuringExecution;
    protected $_name = [
        'preferredDuringSchedulingIgnoredDuringExecution' => 'preferred_during_scheduling_ignored_during_execution',
        'requiredDuringSchedulingIgnoredDuringExecution'  => 'required_during_scheduling_ignored_during_execution',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->preferredDuringSchedulingIgnoredDuringExecution) {
            $res['preferred_during_scheduling_ignored_during_execution'] = [];
            if (null !== $this->preferredDuringSchedulingIgnoredDuringExecution && \is_array($this->preferredDuringSchedulingIgnoredDuringExecution)) {
                $n = 0;
                foreach ($this->preferredDuringSchedulingIgnoredDuringExecution as $item) {
                    $res['preferred_during_scheduling_ignored_during_execution'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->requiredDuringSchedulingIgnoredDuringExecution) {
            $res['required_during_scheduling_ignored_during_execution'] = [];
            if (null !== $this->requiredDuringSchedulingIgnoredDuringExecution && \is_array($this->requiredDuringSchedulingIgnoredDuringExecution)) {
                $n = 0;
                foreach ($this->requiredDuringSchedulingIgnoredDuringExecution as $item) {
                    $res['required_during_scheduling_ignored_during_execution'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PodAntiAffinity
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['preferred_during_scheduling_ignored_during_execution'])) {
            if (!empty($map['preferred_during_scheduling_ignored_during_execution'])) {
                $model->preferredDuringSchedulingIgnoredDuringExecution = [];
                $n                                                      = 0;
                foreach ($map['preferred_during_scheduling_ignored_during_execution'] as $item) {
                    $model->preferredDuringSchedulingIgnoredDuringExecution[$n++] = null !== $item ? WeightedPodAffinityTerm::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['required_during_scheduling_ignored_during_execution'])) {
            if (!empty($map['required_during_scheduling_ignored_during_execution'])) {
                $model->requiredDuringSchedulingIgnoredDuringExecution = [];
                $n                                                     = 0;
                foreach ($map['required_during_scheduling_ignored_during_execution'] as $item) {
                    $model->requiredDuringSchedulingIgnoredDuringExecution[$n++] = null !== $item ? PodAffinityTerm::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
