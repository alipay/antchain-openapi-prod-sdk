<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class QueryDrmDrmpushlogsRequest extends Model
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

    // 资源标识
    /**
     * @var string
     */
    public $dataId;

    // 时间结束
    /**
     * @var int
     */
    public $endTime;

    // 实例id
    /**
     * @var string
     */
    public $instanceId;

    // 操作人
    /**
     * @var string
     */
    public $operator;

    // 页大小
    /**
     * @var int
     */
    public $pageSize;

    // 推送结果
    /**
     * @var string
     */
    public $pushResult;

    // 起始索引
    /**
     * @var int
     */
    public $start;

    // 开始时间
    /**
     * @var int
     */
    public $startTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataId'            => 'data_id',
        'endTime'           => 'end_time',
        'instanceId'        => 'instance_id',
        'operator'          => 'operator',
        'pageSize'          => 'page_size',
        'pushResult'        => 'push_result',
        'start'             => 'start',
        'startTime'         => 'start_time',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('start', $this->start, true);
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
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pushResult) {
            $res['push_result'] = $this->pushResult;
        }
        if (null !== $this->start) {
            $res['start'] = $this->start;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDrmDrmpushlogsRequest
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
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['push_result'])) {
            $model->pushResult = $map['push_result'];
        }
        if (isset($map['start'])) {
            $model->start = $map['start'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }

        return $model;
    }
}
