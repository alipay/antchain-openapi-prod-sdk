<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QueueRouteRulesDTO extends Model
{
    // 应用
    /**
     * @example app
     *
     * @var string
     */
    public $app;

    // 修改时间
    /**
     * @example gmt_modified
     *
     * @var string
     */
    public $gmtModified;

    // 队列路由规则id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 方法
    /**
     * @example { value:_1_, text: _get_ }
     *
     * @var string
     */
    public $meth;

    // 路由规则名称
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // 队列id
    /**
     * @example 1
     *
     * @var int
     */
    public $queueId;

    // 状态
    /**
     * @example 1
     *
     * @var int
     */
    public $status;

    // 分流开关
    /**
     * @example switch_status
     *
     * @var int
     */
    public $switchStatus;

    // 路由类型
    /**
     * @example { value:_1_, text: _按版本路由_ }
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'app'          => 'app',
        'gmtModified'  => 'gmt_modified',
        'id'           => 'id',
        'meth'         => 'meth',
        'name'         => 'name',
        'queueId'      => 'queue_id',
        'status'       => 'status',
        'switchStatus' => 'switch_status',
        'type'         => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('app', $this->app, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('meth', $this->meth, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('queueId', $this->queueId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('switchStatus', $this->switchStatus, true);
        Model::validateRequired('type', $this->type, true);
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->meth) {
            $res['meth'] = $this->meth;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->queueId) {
            $res['queue_id'] = $this->queueId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->switchStatus) {
            $res['switch_status'] = $this->switchStatus;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueueRouteRulesDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['meth'])) {
            $model->meth = $map['meth'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['queue_id'])) {
            $model->queueId = $map['queue_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['switch_status'])) {
            $model->switchStatus = $map['switch_status'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
