<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ConsumptionStatusDTO extends Model
{
    // 实例id
    /**
     * @example 00001
     *
     * @var string
     */
    public $instanceId;

    // 消费端groupId
    /**
     * @example GID_001
     *
     * @var string
     */
    public $groupId;

    // 单元化cell
    /**
     * @example gzone1
     *
     * @var string
     */
    public $cell;

    // 消费端是否在线
    /**
     * @example true, false
     *
     * @var bool
     */
    public $online;

    // 总的位点差
    /**
     * @example 123
     *
     * @var int
     */
    public $totalDiff;

    // 所有订阅关系
    /**
     * @example
     *
     * @var SubscriptionDTO[]
     */
    public $subscriptions;

    // 消费者-队列状态
    /**
     * @example
     *
     * @var ConsumeQueueOffset[]
     */
    public $consumptionStatus;

    // 消费者客户端状态
    /**
     * @example
     *
     * @var ClientInfoDTO[]
     */
    public $clients;
    protected $_name = [
        'instanceId'        => 'instance_id',
        'groupId'           => 'group_id',
        'cell'              => 'cell',
        'online'            => 'online',
        'totalDiff'         => 'total_diff',
        'subscriptions'     => 'subscriptions',
        'consumptionStatus' => 'consumption_status',
        'clients'           => 'clients',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('cell', $this->cell, true);
        Model::validateRequired('online', $this->online, true);
        Model::validateRequired('totalDiff', $this->totalDiff, true);
        Model::validateRequired('subscriptions', $this->subscriptions, true);
        Model::validateRequired('consumptionStatus', $this->consumptionStatus, true);
        Model::validateRequired('clients', $this->clients, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->online) {
            $res['online'] = $this->online;
        }
        if (null !== $this->totalDiff) {
            $res['total_diff'] = $this->totalDiff;
        }
        if (null !== $this->subscriptions) {
            $res['subscriptions'] = [];
            if (null !== $this->subscriptions && \is_array($this->subscriptions)) {
                $n = 0;
                foreach ($this->subscriptions as $item) {
                    $res['subscriptions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->consumptionStatus) {
            $res['consumption_status'] = [];
            if (null !== $this->consumptionStatus && \is_array($this->consumptionStatus)) {
                $n = 0;
                foreach ($this->consumptionStatus as $item) {
                    $res['consumption_status'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->clients) {
            $res['clients'] = [];
            if (null !== $this->clients && \is_array($this->clients)) {
                $n = 0;
                foreach ($this->clients as $item) {
                    $res['clients'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConsumptionStatusDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['online'])) {
            $model->online = $map['online'];
        }
        if (isset($map['total_diff'])) {
            $model->totalDiff = $map['total_diff'];
        }
        if (isset($map['subscriptions'])) {
            if (!empty($map['subscriptions'])) {
                $model->subscriptions = [];
                $n                    = 0;
                foreach ($map['subscriptions'] as $item) {
                    $model->subscriptions[$n++] = null !== $item ? SubscriptionDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['consumption_status'])) {
            if (!empty($map['consumption_status'])) {
                $model->consumptionStatus = [];
                $n                        = 0;
                foreach ($map['consumption_status'] as $item) {
                    $model->consumptionStatus[$n++] = null !== $item ? ConsumeQueueOffset::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['clients'])) {
            if (!empty($map['clients'])) {
                $model->clients = [];
                $n              = 0;
                foreach ($map['clients'] as $item) {
                    $model->clients[$n++] = null !== $item ? ClientInfoDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
