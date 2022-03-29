<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class SubClientInfoDTO extends Model
{
    // 消费客户端的客户端地址
    /**
     * @example 30.5.**.**
     *
     * @var string
     */
    public $clientHost;

    // 本次消费耗时，单位毫秒
    /**
     * @example 43
     *
     * @var int
     */
    public $costTime;

    // 本次消费的投递轮次
    /**
     * @example 1
     *
     * @var int
     */
    public $reconsumeTimes;

    // 消费状态。取值说明如下：
    //
    // CONSUME_FAILED：消费失败
    // CONSUME_SUCCESS：消费成功
    // CONSUME_NOT_RETURN：消费未返回结果
    // SEND_UNKNOWN：事务消息未提交
    // SEND_DELAY：定时(延时)消息定时中
    /**
     * @example CONSUME_SUCCESS
     *
     * @var string
     */
    public $status;

    // 该客户端所属的 Group ID
    /**
     * @example GID_test
     *
     * @var string
     */
    public $subGroupName;

    // 消费开始时间戳
    /**
     * @example 1570851590511
     *
     * @var int
     */
    public $subTime;
    protected $_name = [
        'clientHost'     => 'client_host',
        'costTime'       => 'cost_time',
        'reconsumeTimes' => 'reconsume_times',
        'status'         => 'status',
        'subGroupName'   => 'sub_group_name',
        'subTime'        => 'sub_time',
    ];

    public function validate()
    {
        Model::validateRequired('clientHost', $this->clientHost, true);
        Model::validateRequired('costTime', $this->costTime, true);
        Model::validateRequired('reconsumeTimes', $this->reconsumeTimes, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('subGroupName', $this->subGroupName, true);
        Model::validateRequired('subTime', $this->subTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clientHost) {
            $res['client_host'] = $this->clientHost;
        }
        if (null !== $this->costTime) {
            $res['cost_time'] = $this->costTime;
        }
        if (null !== $this->reconsumeTimes) {
            $res['reconsume_times'] = $this->reconsumeTimes;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->subGroupName) {
            $res['sub_group_name'] = $this->subGroupName;
        }
        if (null !== $this->subTime) {
            $res['sub_time'] = $this->subTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubClientInfoDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['client_host'])) {
            $model->clientHost = $map['client_host'];
        }
        if (isset($map['cost_time'])) {
            $model->costTime = $map['cost_time'];
        }
        if (isset($map['reconsume_times'])) {
            $model->reconsumeTimes = $map['reconsume_times'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['sub_group_name'])) {
            $model->subGroupName = $map['sub_group_name'];
        }
        if (isset($map['sub_time'])) {
            $model->subTime = $map['sub_time'];
        }

        return $model;
    }
}
