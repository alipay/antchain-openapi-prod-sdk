<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class ListEcarEnterprisememberRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 会员注册开始时间
    /**
     * @var string
     */
    public $registerStartTime;

    // 会员注册结束时间
    /**
     * @var string
     */
    public $registerEndTime;

    // 当前查询页码，默认值为1
    /**
     * @var int
     */
    public $current;

    // 每页记录条数，默认为20，取值范围为[10,200]
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'registerStartTime' => 'register_start_time',
        'registerEndTime'   => 'register_end_time',
        'current'           => 'current',
        'pageSize'          => 'page_size',
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
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->registerStartTime) {
            $res['register_start_time'] = $this->registerStartTime;
        }
        if (null !== $this->registerEndTime) {
            $res['register_end_time'] = $this->registerEndTime;
        }
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListEcarEnterprisememberRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['register_start_time'])) {
            $model->registerStartTime = $map['register_start_time'];
        }
        if (isset($map['register_end_time'])) {
            $model->registerEndTime = $map['register_end_time'];
        }
        if (isset($map['current'])) {
            $model->current = $map['current'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
