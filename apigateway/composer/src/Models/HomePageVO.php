<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class HomePageVO extends Model
{
    // api分组数量
    /**
     * @example
     *
     * @var int
     */
    public $apiGroupCount;

    // api数量
    /**
     * @example api_count
     *
     * @var int
     */
    public $apiCount;

    // app数量
    /**
     * @example
     *
     * @var int
     */
    public $appCount;
    protected $_name = [
        'apiGroupCount' => 'api_group_count',
        'apiCount'      => 'api_count',
        'appCount'      => 'app_count',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiGroupCount) {
            $res['api_group_count'] = $this->apiGroupCount;
        }
        if (null !== $this->apiCount) {
            $res['api_count'] = $this->apiCount;
        }
        if (null !== $this->appCount) {
            $res['app_count'] = $this->appCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return HomePageVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_group_count'])) {
            $model->apiGroupCount = $map['api_group_count'];
        }
        if (isset($map['api_count'])) {
            $model->apiCount = $map['api_count'];
        }
        if (isset($map['app_count'])) {
            $model->appCount = $map['app_count'];
        }

        return $model;
    }
}
