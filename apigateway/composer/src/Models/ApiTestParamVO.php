<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiTestParamVO extends Model
{
    // location
    /**
     * @example HEADER/QUERY
     *
     * @var string
     */
    public $location;

    // key
    /**
     * @example key1
     *
     * @var string
     */
    public $key;

    // value
    /**
     * @example value1
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'location' => 'location',
        'key'      => 'key',
        'value'    => 'value',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->location) {
            $res['location'] = $this->location;
        }
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiTestParamVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['location'])) {
            $model->location = $map['location'];
        }
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
