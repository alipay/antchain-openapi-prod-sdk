<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PullConsumerDatasourceRequest extends Model
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

    // 消费者id
    /**
     * @var string
     */
    public $consumerId;

    // 分页游标
    /**
     * @var string
     */
    public $cursor;

    // 获取的时间范围
    /**
     * @var string[]
     */
    public $timeSpan;

    // 类型：DEVICE、PERIPHERAL、ALL 默认为 ALL
    /**
     * @var string
     */
    public $deviceType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'consumerId'        => 'consumer_id',
        'cursor'            => 'cursor',
        'timeSpan'          => 'time_span',
        'deviceType'        => 'device_type',
    ];

    public function validate()
    {
        Model::validateRequired('consumerId', $this->consumerId, true);
        Model::validateRequired('cursor', $this->cursor, true);
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
        if (null !== $this->consumerId) {
            $res['consumer_id'] = $this->consumerId;
        }
        if (null !== $this->cursor) {
            $res['cursor'] = $this->cursor;
        }
        if (null !== $this->timeSpan) {
            $res['time_span'] = $this->timeSpan;
        }
        if (null !== $this->deviceType) {
            $res['device_type'] = $this->deviceType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PullConsumerDatasourceRequest
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
        if (isset($map['consumer_id'])) {
            $model->consumerId = $map['consumer_id'];
        }
        if (isset($map['cursor'])) {
            $model->cursor = $map['cursor'];
        }
        if (isset($map['time_span'])) {
            if (!empty($map['time_span'])) {
                $model->timeSpan = $map['time_span'];
            }
        }
        if (isset($map['device_type'])) {
            $model->deviceType = $map['device_type'];
        }

        return $model;
    }
}
