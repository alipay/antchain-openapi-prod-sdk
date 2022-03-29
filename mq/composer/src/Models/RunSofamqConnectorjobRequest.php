<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class RunSofamqConnectorjobRequest extends Model
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

    // 期望任务执行时间的unix 时间戳，精度是毫秒
    /**
     * @var int
     */
    public $executionTime;

    // 任务名
    /**
     * @var string
     */
    public $job;

    // 分区描述
    /**
     * @var string
     */
    public $partition;

    // 租户实例id
    /**
     * @var string
     */
    public $instanceId;

    // Sink开发分组
    /**
     * @var string
     */
    public $sinkDevGroup;

    // dt=20210910
    /**
     * @var string
     */
    public $sourcePartition;

    // 目标分组
    /**
     * @var string
     */
    public $sinkPartition;

    // Source开发分组
    /**
     * @var string
     */
    public $sourceDevGroup;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'executionTime'     => 'execution_time',
        'job'               => 'job',
        'partition'         => 'partition',
        'instanceId'        => 'instance_id',
        'sinkDevGroup'      => 'sink_dev_group',
        'sourcePartition'   => 'source_partition',
        'sinkPartition'     => 'sink_partition',
        'sourceDevGroup'    => 'source_dev_group',
    ];

    public function validate()
    {
        Model::validateRequired('job', $this->job, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
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
        if (null !== $this->executionTime) {
            $res['execution_time'] = $this->executionTime;
        }
        if (null !== $this->job) {
            $res['job'] = $this->job;
        }
        if (null !== $this->partition) {
            $res['partition'] = $this->partition;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->sinkDevGroup) {
            $res['sink_dev_group'] = $this->sinkDevGroup;
        }
        if (null !== $this->sourcePartition) {
            $res['source_partition'] = $this->sourcePartition;
        }
        if (null !== $this->sinkPartition) {
            $res['sink_partition'] = $this->sinkPartition;
        }
        if (null !== $this->sourceDevGroup) {
            $res['source_dev_group'] = $this->sourceDevGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RunSofamqConnectorjobRequest
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
        if (isset($map['execution_time'])) {
            $model->executionTime = $map['execution_time'];
        }
        if (isset($map['job'])) {
            $model->job = $map['job'];
        }
        if (isset($map['partition'])) {
            $model->partition = $map['partition'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['sink_dev_group'])) {
            $model->sinkDevGroup = $map['sink_dev_group'];
        }
        if (isset($map['source_partition'])) {
            $model->sourcePartition = $map['source_partition'];
        }
        if (isset($map['sink_partition'])) {
            $model->sinkPartition = $map['sink_partition'];
        }
        if (isset($map['source_dev_group'])) {
            $model->sourceDevGroup = $map['source_dev_group'];
        }

        return $model;
    }
}
