<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class HealthCheckConfigInfo extends Model
{
    // 容器健康检查配置liveness probe。
    /**
     * @example {}
     *
     * @var LivenessProbe
     */
    public $livenessProbe;

    // 容器健康检查配置readiness probe。
    /**
     * @example {}
     *
     * @var ReadinessProbe
     */
    public $readinessProbe;
    protected $_name = [
        'livenessProbe'  => 'liveness_probe',
        'readinessProbe' => 'readiness_probe',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->livenessProbe) {
            $res['liveness_probe'] = null !== $this->livenessProbe ? $this->livenessProbe->toMap() : null;
        }
        if (null !== $this->readinessProbe) {
            $res['readiness_probe'] = null !== $this->readinessProbe ? $this->readinessProbe->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HealthCheckConfigInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['liveness_probe'])) {
            $model->livenessProbe = LivenessProbe::fromMap($map['liveness_probe']);
        }
        if (isset($map['readiness_probe'])) {
            $model->readinessProbe = ReadinessProbe::fromMap($map['readiness_probe']);
        }

        return $model;
    }
}
