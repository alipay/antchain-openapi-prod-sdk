<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ORG\Models;

use AlibabaCloud\Tea\Model;

class ProcessConversionMetricData extends Model
{
    // 发放数
    /**
     * @example 24765874
     *
     * @var int
     */
    public $send;

    // 核销数
    /**
     * @example 140302
     *
     * @var int
     */
    public $used;

    // 核销转化率
    /**
     * @example 0.005665
     *
     * @var string
     */
    public $rate;
    protected $_name = [
        'send' => 'send',
        'used' => 'used',
        'rate' => 'rate',
    ];

    public function validate()
    {
        Model::validateRequired('send', $this->send, true);
        Model::validateRequired('used', $this->used, true);
        Model::validateRequired('rate', $this->rate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->send) {
            $res['send'] = $this->send;
        }
        if (null !== $this->used) {
            $res['used'] = $this->used;
        }
        if (null !== $this->rate) {
            $res['rate'] = $this->rate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProcessConversionMetricData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['send'])) {
            $model->send = $map['send'];
        }
        if (isset($map['used'])) {
            $model->used = $map['used'];
        }
        if (isset($map['rate'])) {
            $model->rate = $map['rate'];
        }

        return $model;
    }
}
