<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

class InitPark extends Model
{
    // 1
    /**
     * @example 1
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
     * @return InitPark
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
