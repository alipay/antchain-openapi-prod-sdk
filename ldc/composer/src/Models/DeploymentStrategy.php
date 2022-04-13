<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class DeploymentStrategy extends Model
{
    // Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
    /**
     * @example
     *
     * @var RollingUpdateDeployment
     */
    public $rollingUpdate;

    // Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
    /**
     * @example Recreate
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'rollingUpdate' => 'rolling_update',
        'type'          => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->rollingUpdate) {
            $res['rolling_update'] = null !== $this->rollingUpdate ? $this->rollingUpdate->toMap() : null;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeploymentStrategy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['rolling_update'])) {
            $model->rollingUpdate = RollingUpdateDeployment::fromMap($map['rolling_update']);
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
