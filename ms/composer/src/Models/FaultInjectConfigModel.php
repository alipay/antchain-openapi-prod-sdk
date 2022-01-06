<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class FaultInjectConfigModel extends Model
{
    // 故障百分比
    /**
     * @example 20.0
     *
     * @var string
     */
    public $faultPercent;

    // 故障错误码
    /**
     * @example 200
     *
     * @var string
     */
    public $code;

    // 故障延迟时间（ms）
    /**
     * @example 2000
     *
     * @var string
     */
    public $fixedDelay;
    protected $_name = [
        'faultPercent' => 'fault_percent',
        'code'         => 'code',
        'fixedDelay'   => 'fixed_delay',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->faultPercent) {
            $res['fault_percent'] = $this->faultPercent;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->fixedDelay) {
            $res['fixed_delay'] = $this->fixedDelay;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FaultInjectConfigModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['fault_percent'])) {
            $model->faultPercent = $map['fault_percent'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['fixed_delay'])) {
            $model->fixedDelay = $map['fixed_delay'];
        }

        return $model;
    }
}
