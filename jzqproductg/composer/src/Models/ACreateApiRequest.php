<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\JZQPRODUCTG\Models;

use AlibabaCloud\Tea\Model;

class ACreateApiRequest extends Model
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

    // 编号
    /**
     * @var int
     */
    public $count;

    // 请求时间
    /**
     * @var string
     */
    public $time;

    // 描述
    /**
     * @var string
     */
    public $desc;

    // 请求人
    /**
     * @var string
     */
    public $operate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'count'             => 'count',
        'time'              => 'time',
        'desc'              => 'desc',
        'operate'           => 'operate',
    ];

    public function validate()
    {
        Model::validateRequired('count', $this->count, true);
        Model::validateRequired('time', $this->time, true);
        Model::validateRequired('operate', $this->operate, true);
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
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->operate) {
            $res['operate'] = $this->operate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ACreateApiRequest
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
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['operate'])) {
            $model->operate = $map['operate'];
        }

        return $model;
    }
}
