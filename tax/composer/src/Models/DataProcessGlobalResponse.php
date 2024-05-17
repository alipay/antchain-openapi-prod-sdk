<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class DataProcessGlobalResponse extends Model
{
    // 处理结果数据
    /**
     * @example {"aa":"aa"}
     *
     * @var string
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
            $res['data'] = $this->data;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataProcessGlobalResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }

        return $model;
    }
}
