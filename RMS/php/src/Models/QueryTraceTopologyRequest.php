<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryTraceTopologyRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'endTime' => 'end_time',
        'startTime' => 'start_time',
        'workspaceName' => 'workspace_name',
        'app' => 'app',
        'traceId' => 'trace_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryTraceTopologyRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['end_time'])){
            $model->endTime = $map['end_time'];
        }
        if(isset($map['start_time'])){
            $model->startTime = $map['start_time'];
        }
        if(isset($map['workspace_name'])){
            $model->workspaceName = $map['workspace_name'];
        }
        if(isset($map['app'])){
            $model->app = $map['app'];
        }
        if(isset($map['trace_id'])){
            $model->traceId = $map['trace_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

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

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;

    // app
    /**
     * @var string
     */
    public $app;

    // trace_id
    /**
     * @var string
     */
    public $traceId;

}
