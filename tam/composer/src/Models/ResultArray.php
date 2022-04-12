<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAM\Models;

use AlibabaCloud\Tea\Model;

class ResultArray extends Model
{
    // 数组
    /**
     * @example [1,2,3]
     *
     * @var string[]
     */
    public $resultArray;
    protected $_name = [
        'resultArray' => 'result_array',
    ];

    public function validate()
    {
        Model::validateRequired('resultArray', $this->resultArray, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->resultArray) {
            $res['result_array'] = $this->resultArray;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResultArray
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['result_array'])) {
            if (!empty($map['result_array'])) {
                $model->resultArray = $map['result_array'];
            }
        }

        return $model;
    }
}
