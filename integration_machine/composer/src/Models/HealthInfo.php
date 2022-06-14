<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTEGRATION_MACHINE\Models;

use AlibabaCloud\Tea\Model;

class HealthInfo extends Model
{
    // 健康码编码：
    // 1:绿色 ，
    // 2:黄色 ，
    // 3:红色 ，
    // 4.灰码 。
    /**
     * @example 1
     *
     * @var string
     */
    public $healthCode;

    // 健康码红色原因
    /**
     * @example 123
     *
     * @var string
     */
    public $healthFactor;
    protected $_name = [
        'healthCode'   => 'health_code',
        'healthFactor' => 'health_factor',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->healthCode) {
            $res['health_code'] = $this->healthCode;
        }
        if (null !== $this->healthFactor) {
            $res['health_factor'] = $this->healthFactor;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HealthInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['health_code'])) {
            $model->healthCode = $map['health_code'];
        }
        if (isset($map['health_factor'])) {
            $model->healthFactor = $map['health_factor'];
        }

        return $model;
    }
}
