<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class HealthCheckConfig extends Model
{
    // liveness 检查
    //
    /**
     * @example
     *
     * @var HealthCheckProbe
     */
    public $livenessProbe;

    // readiness 检查
    //
    /**
     * @example
     *
     * @var HealthCheckProbe
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
     * @return HealthCheckConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['liveness_probe'])) {
            $model->livenessProbe = HealthCheckProbe::fromMap($map['liveness_probe']);
        }
        if (isset($map['readiness_probe'])) {
            $model->readinessProbe = HealthCheckProbe::fromMap($map['readiness_probe']);
        }

        return $model;
    }
}
