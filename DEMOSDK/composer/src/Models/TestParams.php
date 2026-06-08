<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

class TestParams extends Model
{
    // a
    /**
     * @example undefined
     *
     * @var TestParamA
     */
    public $parameter;

    // string
    /**
     * @example string
     *
     * @var string
     */
    public $string;
    protected $_name = [
        'parameter' => 'parameter',
        'string'    => 'string',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->parameter) {
            $res['parameter'] = null !== $this->parameter ? $this->parameter->toMap() : null;
        }
        if (null !== $this->string) {
            $res['string'] = $this->string;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TestParams
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['parameter'])) {
            $model->parameter = TestParamA::fromMap($map['parameter']);
        }
        if (isset($map['string'])) {
            $model->string = $map['string'];
        }

        return $model;
    }
}
