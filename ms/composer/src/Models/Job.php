<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class Job extends Model
{
    // 数据库ID
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 所属租户实例ID
    /**
     * @example asddffd
     *
     * @var string
     */
    public $instanceId;

    // 任务所属APP
    /**
     * @example app
     *
     * @var string
     */
    public $app;

    // 任务名字
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // 任务CRON表达式
    /**
     * @example 0 0 * * * ?
     *
     * @var string
     */
    public $cron;

    // 任务分片数量
    /**
     * @example 1
     *
     * @var int
     */
    public $shardingCount;

    // 任务自定义参数
    /**
     * @example
     *
     * @var string[]
     */
    public $customParams;

    // 任务状态
    /**
     * @example RUNNING
     *
     * @var string
     */
    public $status;

    // 任务描述信息
    /**
     * @example asdsaf
     *
     * @var string
     */
    public $des;

    // 任务创建时间
    /**
     * @example 2018-04-16 00:01:59
     *
     * @var string
     */
    public $creationTime;

    // 任务修改时间
    /**
     * @example 2018-04-16 00:01:59
     *
     * @var string
     */
    public $updateTime;
    protected $_name = [
        'id'            => 'id',
        'instanceId'    => 'instance_id',
        'app'           => 'app',
        'name'          => 'name',
        'cron'          => 'cron',
        'shardingCount' => 'sharding_count',
        'customParams'  => 'custom_params',
        'status'        => 'status',
        'des'           => 'des',
        'creationTime'  => 'creation_time',
        'updateTime'    => 'update_time',
    ];

    public function validate()
    {
        Model::validatePattern('creationTime', $this->creationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('updateTime', $this->updateTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->cron) {
            $res['cron'] = $this->cron;
        }
        if (null !== $this->shardingCount) {
            $res['sharding_count'] = $this->shardingCount;
        }
        if (null !== $this->customParams) {
            $res['custom_params'] = $this->customParams;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->des) {
            $res['des'] = $this->des;
        }
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Job
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cron'])) {
            $model->cron = $map['cron'];
        }
        if (isset($map['sharding_count'])) {
            $model->shardingCount = $map['sharding_count'];
        }
        if (isset($map['custom_params'])) {
            if (!empty($map['custom_params'])) {
                $model->customParams = $map['custom_params'];
            }
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['des'])) {
            $model->des = $map['des'];
        }
        if (isset($map['creation_time'])) {
            $model->creationTime = $map['creation_time'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }

        return $model;
    }
}
