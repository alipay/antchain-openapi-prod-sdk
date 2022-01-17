<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiCacheKeyVO extends Model
{
    // key
    /**
     * @example key1
     *
     * @var string
     */
    public $key;

    // location
    /**
     * @example HEADER/QUERY/BODY
     *
     * @var string
     */
    public $location;
    protected $_name = [
        'key'      => 'key',
        'location' => 'location',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->key) {
            $res['key'] = $this->key;
        }
        if (null !== $this->location) {
            $res['location'] = $this->location;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiCacheKeyVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['key'])) {
            $model->key = $map['key'];
        }
        if (isset($map['location'])) {
            $model->location = $map['location'];
        }

        return $model;
    }
}
