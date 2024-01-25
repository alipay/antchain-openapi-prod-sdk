<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class TestClass extends Model
{
    // 1
    /**
     * @example testclass
     *
     * @var string
     */
    public $test;

    // 2
    /**
     * @example testclass
     *
     * @var string
     */
    public $demo;

    // 3
    /**
     * @example id2
     *
     * @var string
     */
    public $demo1;

    // 22
    /**
     * @example 12
     *
     * @var string
     */
    public $demo2;
    protected $_name = [
        'test'  => 'test',
        'demo'  => 'demo',
        'demo1' => 'demo1',
        'demo2' => 'demo2',
    ];

    public function validate()
    {
        Model::validateRequired('test', $this->test, true);
        Model::validateRequired('demo', $this->demo, true);
        Model::validateRequired('demo1', $this->demo1, true);
        Model::validateRequired('demo2', $this->demo2, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->test) {
            $res['test'] = $this->test;
        }
        if (null !== $this->demo) {
            $res['demo'] = $this->demo;
        }
        if (null !== $this->demo1) {
            $res['demo1'] = $this->demo1;
        }
        if (null !== $this->demo2) {
            $res['demo2'] = $this->demo2;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TestClass
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['test'])) {
            $model->test = $map['test'];
        }
        if (isset($map['demo'])) {
            $model->demo = $map['demo'];
        }
        if (isset($map['demo1'])) {
            $model->demo1 = $map['demo1'];
        }
        if (isset($map['demo2'])) {
            $model->demo2 = $map['demo2'];
        }

        return $model;
    }
}
