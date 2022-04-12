<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAM\Models;

use AlibabaCloud\Tea\Model;

class ResultData extends Model
{
    // data
    /**
     * @example data
     *
     * @var ResultMap
     */
    public $data;
    protected $_name = [
        'data' => 'data',
    ];

    public function validate()
    {
        Model::validateRequired('data', $this->data, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->data) {
            $res['data'] = null !== $this->data ? $this->data->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResultData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data'])) {
            $model->data = ResultMap::fromMap($map['data']);
        }

        return $model;
    }
}
