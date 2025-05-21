<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DOG\Models;

use AlibabaCloud\Tea\Model;

class ResultList extends Model
{
    // 返回结果
    /**
     * @example {"name":"value"}
     *
     * @var DogHome
     */
    public $result;
    protected $_name = [
        'result' => 'result',
    ];

    public function validate()
    {
        Model::validateRequired('result', $this->result, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->result) {
            $res['result'] = null !== $this->result ? $this->result->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResultList
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['result'])) {
            $model->result = DogHome::fromMap($map['result']);
        }

        return $model;
    }
}
