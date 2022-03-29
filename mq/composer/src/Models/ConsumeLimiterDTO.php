<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ConsumeLimiterDTO extends Model
{
    // 实例ID
    //
    /**
     * @example 000001
     *
     * @var string
     */
    public $instanceId;

    // 限流类型
    // - UNIT：单元限流，指定单元/CELL限流
    //
    /**
     * @example UNIT
     *
     * @var string
     */
    public $limiterType;

    // 限流资源名，由 GROUP@TOPIC 组成
    //
    /**
     * @example GID_XXX@TP_XXX
     *
     * @var string
     */
    public $name;

    // 限流值配置，BASE 为基准限流值。
    /**
     * @example BASE:1000;CZ20D:500;RZ00B:400
     *
     * @var string
     */
    public $tps;
    protected $_name = [
        'instanceId'  => 'instance_id',
        'limiterType' => 'limiter_type',
        'name'        => 'name',
        'tps'         => 'tps',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('limiterType', $this->limiterType, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('tps', $this->tps, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->limiterType) {
            $res['limiter_type'] = $this->limiterType;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->tps) {
            $res['tps'] = $this->tps;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConsumeLimiterDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['limiter_type'])) {
            $model->limiterType = $map['limiter_type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['tps'])) {
            $model->tps = $map['tps'];
        }

        return $model;
    }
}
