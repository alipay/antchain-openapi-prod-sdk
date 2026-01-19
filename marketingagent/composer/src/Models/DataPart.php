<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETINGAGENT\Models;

use AlibabaCloud\Tea\Model;

class DataPart extends Model
{
    // A JSON object containing arbitrary data.
    /**
     * @example data
     *
     * @var string
     */
    public $data;
    protected $_name = [
        'data' => 'data',
    ];

    public function validate()
    {
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
     * @return DataPart
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
