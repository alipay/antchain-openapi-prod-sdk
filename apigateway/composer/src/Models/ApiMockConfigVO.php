<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiMockConfigVO extends Model
{
    // mock_data
    /**
     * @example mock_data
     *
     * @var string
     */
    public $mockData;
    protected $_name = [
        'mockData' => 'mock_data',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->mockData) {
            $res['mock_data'] = $this->mockData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiMockConfigVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['mock_data'])) {
            $model->mockData = $map['mock_data'];
        }

        return $model;
    }
}
