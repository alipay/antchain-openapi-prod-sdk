<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QueueLimitRulesDTO extends Model
{
    // 修改时间
    /**
     * @example gmt_modified
     *
     * @var string
     */
    public $gmtModified;

    // 限流规则id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 限流算法
    /**
     * @example { value:_1_, text: _令牌桶算法_ }
     *
     * @var string
     */
    public $lAlgorithm;

    // 限流后操作
    /**
     * @example { value:_1_, text: _抛出异常_ }
     *
     * @var string
     */
    public $lOperation;

    // 方法
    /**
     * @example meth
     *
     * @var string
     */
    public $meth;

    // 限流规则名称
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

    // 运行模式
    /**
     * @example { value:_1_, text: _观察模式_ }, { value: _bbb_, text:_拦截模式_}
     *
     * @var string
     */
    public $rMode;

    // 状态
    /**
     * @example 1
     *
     * @var int
     */
    public $status;

    // 应用名
    /**
     * @example appname
     *
     * @var string
     */
    public $app;
    protected $_name = [
        'gmtModified' => 'gmt_modified',
        'id'          => 'id',
        'lAlgorithm'  => 'l_algorithm',
        'lOperation'  => 'l_operation',
        'meth'        => 'meth',
        'name'        => 'name',
        'queueId'     => 'queue_id',
        'rMode'       => 'r_mode',
        'status'      => 'status',
        'app'         => 'app',
    ];

    public function validate()
    {
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('lAlgorithm', $this->lAlgorithm, true);
        Model::validateRequired('lOperation', $this->lOperation, true);
        Model::validateRequired('meth', $this->meth, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('queueId', $this->queueId, true);
        Model::validateRequired('rMode', $this->rMode, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('app', $this->app, true);
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->lAlgorithm) {
            $res['l_algorithm'] = $this->lAlgorithm;
        }
        if (null !== $this->lOperation) {
            $res['l_operation'] = $this->lOperation;
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
        if (null !== $this->rMode) {
            $res['r_mode'] = $this->rMode;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueueLimitRulesDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['l_algorithm'])) {
            $model->lAlgorithm = $map['l_algorithm'];
        }
        if (isset($map['l_operation'])) {
            $model->lOperation = $map['l_operation'];
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
        if (isset($map['r_mode'])) {
            $model->rMode = $map['r_mode'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }

        return $model;
    }
}
