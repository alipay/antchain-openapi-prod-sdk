<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ABC\Models;

use AlibabaCloud\Tea\Model;

class APreCreateApiRequest extends Model
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

    // 请求时间
    /**
     * @var string
     */
    public $time;

    // 请求发起人
    /**
     * @var string
     */
    public $operator;

    // 请求编号
    /**
     * @var int
     */
    public $count;

    // 原始信息
    /**
     * @var string
     */
    public $originInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'time'              => 'time',
        'operator'          => 'operator',
        'count'             => 'count',
        'originInfo'        => 'origin_info',
    ];

    public function validate()
    {
        Model::validateRequired('time', $this->time, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('count', $this->count, true);
        Model::validateRequired('originInfo', $this->originInfo, true);
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
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->originInfo) {
            $res['origin_info'] = $this->originInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return APreCreateApiRequest
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
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }
        if (isset($map['origin_info'])) {
            $model->originInfo = $map['origin_info'];
        }

        return $model;
    }
}
