<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class ListAppFavouriteRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // 排序规则数组，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
    /**
     * @var string[]
     */
    public $orders;
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant'    => 'tenant',
        'orders'    => 'orders',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->orders) {
            $res['orders'] = $this->orders;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListAppFavouriteRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['orders'])) {
            if (!empty($map['orders'])) {
                $model->orders = $map['orders'];
            }
        }

        return $model;
    }
}
