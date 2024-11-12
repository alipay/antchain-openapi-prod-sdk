<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Antdigital_DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

/**
 * @internal
 * @coversNothing
 */
class ResultTest extends Model
{
    // 姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;
    protected $_name = [
        'name' => 'name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResultTest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
