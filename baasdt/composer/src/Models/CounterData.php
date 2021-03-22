<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CounterData extends Model
{
    // 成交总额
    /**
     * @example 1000000.00
     *
     * @var string
     */
    public $gmv;

    // 公认标准收入
    /**
     * @example 10000.00
     *
     * @var string
     */
    public $gaap;

    // 笔数
    /**
     * @example 10000
     *
     * @var string
     */
    public $counter;
    protected $_name = [
        'gmv'     => 'gmv',
        'gaap'    => 'gaap',
        'counter' => 'counter',
    ];

    public function validate()
    {
        Model::validateRequired('gmv', $this->gmv, true);
        Model::validateRequired('gaap', $this->gaap, true);
        Model::validateRequired('counter', $this->counter, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->gmv) {
            $res['gmv'] = $this->gmv;
        }
        if (null !== $this->gaap) {
            $res['gaap'] = $this->gaap;
        }
        if (null !== $this->counter) {
            $res['counter'] = $this->counter;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CounterData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['gmv'])) {
            $model->gmv = $map['gmv'];
        }
        if (isset($map['gaap'])) {
            $model->gaap = $map['gaap'];
        }
        if (isset($map['counter'])) {
            $model->counter = $map['counter'];
        }

        return $model;
    }
}
