<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PodAffinity extends Model
{
    // The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions.
    /**
     * @example
     *
     * @var WeightedPodAffinityTerm[]
     */
    public $preferredDuringSchedulingIgnoredDuringExecution;

    // f the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node.
    /**
     * @example
     *
     * @var PodAffinityTerm[]
     */
    public $requiredDuringDchedulingIgnoredDuringExecution;
    protected $_name = [
        'preferredDuringSchedulingIgnoredDuringExecution' => 'preferred_during_scheduling_ignored_during_execution',
        'requiredDuringDchedulingIgnoredDuringExecution'  => 'required_during_dcheduling_ignored_during_execution',
    ];

    public function validate()
    {
        Model::validateRequired('requiredDuringDchedulingIgnoredDuringExecution', $this->requiredDuringDchedulingIgnoredDuringExecution, true);
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
        if (null !== $this->requiredDuringDchedulingIgnoredDuringExecution) {
            $res['required_during_dcheduling_ignored_during_execution'] = [];
            if (null !== $this->requiredDuringDchedulingIgnoredDuringExecution && \is_array($this->requiredDuringDchedulingIgnoredDuringExecution)) {
                $n = 0;
                foreach ($this->requiredDuringDchedulingIgnoredDuringExecution as $item) {
                    $res['required_during_dcheduling_ignored_during_execution'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PodAffinity
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
        if (isset($map['required_during_dcheduling_ignored_during_execution'])) {
            if (!empty($map['required_during_dcheduling_ignored_during_execution'])) {
                $model->requiredDuringDchedulingIgnoredDuringExecution = [];
                $n                                                     = 0;
                foreach ($map['required_during_dcheduling_ignored_during_execution'] as $item) {
                    $model->requiredDuringDchedulingIgnoredDuringExecution[$n++] = null !== $item ? PodAffinityTerm::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
