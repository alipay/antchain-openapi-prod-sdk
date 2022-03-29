<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryTraceTopologyRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;

    // 开始毫秒时间戳
    /**
     * @var int
     */
    public $startTime;

    // 结束毫秒时间戳
    /**
     * @var int
     */
    public $endTime;

    // trace_id
    /**
     * @var string
     */
    public $traceId;

    // app
    /**
     * @var string
     */
    public $app;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'startTime'     => 'start_time',
        'endTime'       => 'end_time',
        'traceId'       => 'trace_id',
        'app'           => 'app',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTraceTopologyRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }

        return $model;
    }
}
