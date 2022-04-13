<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class DeploymentStatus extends Model
{
    // Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.
    //
    /**
     * @example
     *
     * @var int
     */
    public $availableReplicas;

    // Represents the latest available observations of a deployment_s current state.
    //
    /**
     * @example
     *
     * @var DeploymentCondition[]
     */
    public $conditions;

    // The generation observed by the deployment controller.
    //
    /**
     * @example 1
     *
     * @var int
     */
    public $observedGeneration;

    // Total number of ready pods targeted by this deployment.
    //
    /**
     * @example
     *
     * @var int
     */
    public $readyReplicas;

    // Total number of non-terminated pods targeted by this deployment (their labels match the selector).
    //
    /**
     * @example
     *
     * @var int
     */
    public $replicas;

    // Total number of unavailable pods targeted by this deployment.
    /**
     * @example
     *
     * @var int
     */
    public $unavailableReplicas;

    // Total number of non-terminated pods targeted by this deployment that have the desired template spec.
    /**
     * @example
     *
     * @var int
     */
    public $updatedReplicas;
    protected $_name = [
        'availableReplicas'   => 'available_replicas',
        'conditions'          => 'conditions',
        'observedGeneration'  => 'observed_generation',
        'readyReplicas'       => 'ready_replicas',
        'replicas'            => 'replicas',
        'unavailableReplicas' => 'unavailable_replicas',
        'updatedReplicas'     => 'updated_replicas',
    ];

    public function validate()
    {
        Model::validateRequired('availableReplicas', $this->availableReplicas, true);
        Model::validateRequired('conditions', $this->conditions, true);
        Model::validateRequired('readyReplicas', $this->readyReplicas, true);
        Model::validateRequired('replicas', $this->replicas, true);
        Model::validateRequired('unavailableReplicas', $this->unavailableReplicas, true);
        Model::validateRequired('updatedReplicas', $this->updatedReplicas, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->availableReplicas) {
            $res['available_replicas'] = $this->availableReplicas;
        }
        if (null !== $this->conditions) {
            $res['conditions'] = [];
            if (null !== $this->conditions && \is_array($this->conditions)) {
                $n = 0;
                foreach ($this->conditions as $item) {
                    $res['conditions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->observedGeneration) {
            $res['observed_generation'] = $this->observedGeneration;
        }
        if (null !== $this->readyReplicas) {
            $res['ready_replicas'] = $this->readyReplicas;
        }
        if (null !== $this->replicas) {
            $res['replicas'] = $this->replicas;
        }
        if (null !== $this->unavailableReplicas) {
            $res['unavailable_replicas'] = $this->unavailableReplicas;
        }
        if (null !== $this->updatedReplicas) {
            $res['updated_replicas'] = $this->updatedReplicas;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeploymentStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['available_replicas'])) {
            $model->availableReplicas = $map['available_replicas'];
        }
        if (isset($map['conditions'])) {
            if (!empty($map['conditions'])) {
                $model->conditions = [];
                $n                 = 0;
                foreach ($map['conditions'] as $item) {
                    $model->conditions[$n++] = null !== $item ? DeploymentCondition::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['observed_generation'])) {
            $model->observedGeneration = $map['observed_generation'];
        }
        if (isset($map['ready_replicas'])) {
            $model->readyReplicas = $map['ready_replicas'];
        }
        if (isset($map['replicas'])) {
            $model->replicas = $map['replicas'];
        }
        if (isset($map['unavailable_replicas'])) {
            $model->unavailableReplicas = $map['unavailable_replicas'];
        }
        if (isset($map['updated_replicas'])) {
            $model->updatedReplicas = $map['updated_replicas'];
        }

        return $model;
    }
}
