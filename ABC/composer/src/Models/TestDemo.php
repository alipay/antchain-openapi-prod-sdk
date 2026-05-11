<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ABC\Models;

use AlibabaCloud\Tea\Model;

class TestDemo extends Model
{
    // id
    /**
     * @example id
     *
     * @var string
     */
    public $demo;
    protected $_name = [
        'demo' => 'demo',
    ];

    public function validate()
    {
        Model::validateRequired('demo', $this->demo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->demo) {
            $res['demo'] = $this->demo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TestDemo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['demo'])) {
            $model->demo = $map['demo'];
        }

        return $model;
    }
}
