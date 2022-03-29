<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryTraceMetricsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // sum或none
    /**
     * @var string
     */
    public $aggregator;

    // 结束毫秒时间戳
    /**
     * @var int
     */
    public $endTime;

    // 开始毫秒时间戳
    /**
     * @var int
     */
    public $startTime;

    // metrics字段名称
    /**
     * @var string[]
     */
    public $metrics;

    // 扩展字段tags
    /**
     * @var KeyValuePair[]
     */
    public $tags;

    // metrics类型
    /**
     * @var string
     */
    public $type;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;
    protected $_name = [
        'authToken'     => 'auth_token',
        'aggregator'    => 'aggregator',
        'endTime'       => 'end_time',
        'startTime'     => 'start_time',
        'metrics'       => 'metrics',
        'tags'          => 'tags',
        'type'          => 'type',
        'workspaceName' => 'workspace_name',
    ];

    public function validate()
    {
        Model::validateRequired('aggregator', $this->aggregator, true);
        Model::validateRequired('endTime', $this->endTime, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('metrics', $this->metrics, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('workspaceName', $this->workspaceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->aggregator) {
            $res['aggregator'] = $this->aggregator;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->metrics) {
            $res['metrics'] = $this->metrics;
        }
        if (null !== $this->tags) {
            $res['tags'] = [];
            if (null !== $this->tags && \is_array($this->tags)) {
                $n = 0;
                foreach ($this->tags as $item) {
                    $res['tags'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTraceMetricsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['aggregator'])) {
            $model->aggregator = $map['aggregator'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['metrics'])) {
            if (!empty($map['metrics'])) {
                $model->metrics = $map['metrics'];
            }
        }
        if (isset($map['tags'])) {
            if (!empty($map['tags'])) {
                $model->tags = [];
                $n           = 0;
                foreach ($map['tags'] as $item) {
                    $model->tags[$n++] = null !== $item ? KeyValuePair::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }

        return $model;
    }
}
