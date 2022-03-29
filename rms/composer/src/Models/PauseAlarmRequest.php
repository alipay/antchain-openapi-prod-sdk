<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class PauseAlarmRequest extends Model
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

    // 告警暂停开始时间
    /**
     * @var int
     */
    public $start;

    // 告警暂停结束时间
    /**
     * @var int
     */
    public $end;

    // 告警关闭原因
    /**
     * @var string
     */
    public $reason;

    // 资源类型（取值范围：CUSTOM_PLUGIN(自定义监控)、FOLDER(文件夹)、UNIVERSAL_TABLE(用户应用)）
    /**
     * @var string
     */
    public $resourceType;

    // 资源 ID
    /**
     * @var string
     */
    public $resourceId;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'start'         => 'start',
        'end'           => 'end',
        'reason'        => 'reason',
        'resourceType'  => 'resource_type',
        'resourceId'    => 'resource_id',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('start', $this->start, true);
        Model::validateRequired('end', $this->end, true);
        Model::validateRequired('reason', $this->reason, true);
        Model::validateRequired('resourceType', $this->resourceType, true);
        Model::validateRequired('resourceId', $this->resourceId, true);
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
        if (null !== $this->start) {
            $res['start'] = $this->start;
        }
        if (null !== $this->end) {
            $res['end'] = $this->end;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PauseAlarmRequest
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
        if (isset($map['start'])) {
            $model->start = $map['start'];
        }
        if (isset($map['end'])) {
            $model->end = $map['end'];
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }

        return $model;
    }
}
