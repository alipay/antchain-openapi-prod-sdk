<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class FederatedDeploymentStatus extends Model
{
    // Federated Deployment Conditions
    /**
     * @example
     *
     * @var DeploymentCondition[]
     */
    public $conditions;

    // V1FederatedDeploymentStatus Topologies
    /**
     * @example
     *
     * @var FederatedDeploymentStatusTopologies[]
     */
    public $topologies;
    protected $_name = [
        'conditions' => 'conditions',
        'topologies' => 'topologies',
    ];

    public function validate()
    {
        Model::validateRequired('conditions', $this->conditions, true);
        Model::validateRequired('topologies', $this->topologies, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->conditions) {
            $res['conditions'] = [];
            if (null !== $this->conditions && \is_array($this->conditions)) {
                $n = 0;
                foreach ($this->conditions as $item) {
                    $res['conditions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->topologies) {
            $res['topologies'] = [];
            if (null !== $this->topologies && \is_array($this->topologies)) {
                $n = 0;
                foreach ($this->topologies as $item) {
                    $res['topologies'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FederatedDeploymentStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['conditions'])) {
            if (!empty($map['conditions'])) {
                $model->conditions = [];
                $n                 = 0;
                foreach ($map['conditions'] as $item) {
                    $model->conditions[$n++] = null !== $item ? DeploymentCondition::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['topologies'])) {
            if (!empty($map['topologies'])) {
                $model->topologies = [];
                $n                 = 0;
                foreach ($map['topologies'] as $item) {
                    $model->topologies[$n++] = null !== $item ? FederatedDeploymentStatusTopologies::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
