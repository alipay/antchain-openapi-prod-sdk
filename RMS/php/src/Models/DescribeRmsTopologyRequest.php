<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class DescribeRmsTopologyRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'endTime' => 'end_time',
        'startTime' => 'start_time',
        'workspaceId' => 'workspace_id',
        'workspaceName' => 'workspace_name',
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
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DescribeRmsTopologyRequest
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
        if(isset($map['workspace_id'])){
            $model->workspaceId = $map['workspace_id'];
        }
        if(isset($map['workspace_name'])){
            $model->workspaceName = $map['workspace_name'];
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

    // workspace_id或workspace_name二选一
    /**
     * @var int
     */
    public $workspaceId;

    // workspace_id或workspace_name二选一
    /**
     * @var string
     */
    public $workspaceName;

}
