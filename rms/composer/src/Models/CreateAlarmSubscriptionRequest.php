<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class CreateAlarmSubscriptionRequest extends Model
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

    // 告警等级 (-1表示全部订阅)
    /**
     * @var int
     */
    public $alarmLevel;

    // 是否开启通知降频 (0 - 关闭，1 - 开启)
    /**
     * @var int
     */
    public $notifyReduceSwitch;

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

    // 用户登录名列表
    /**
     * @var string[]
     */
    public $userLoginNames;

    // 用户组 ID列表
    /**
     * @var int[]
     */
    public $userGroupIds;

    // http web hook id列表
    /**
     * @var int[]
     */
    public $alarmWebHookIds;
    protected $_name = [
        'authToken'          => 'auth_token',
        'workspaceName'      => 'workspace_name',
        'alarmLevel'         => 'alarm_level',
        'notifyReduceSwitch' => 'notify_reduce_switch',
        'resourceType'       => 'resource_type',
        'resourceId'         => 'resource_id',
        'userLoginNames'     => 'user_login_names',
        'userGroupIds'       => 'user_group_ids',
        'alarmWebHookIds'    => 'alarm_web_hook_ids',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('alarmLevel', $this->alarmLevel, true);
        Model::validateRequired('notifyReduceSwitch', $this->notifyReduceSwitch, true);
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
        if (null !== $this->alarmLevel) {
            $res['alarm_level'] = $this->alarmLevel;
        }
        if (null !== $this->notifyReduceSwitch) {
            $res['notify_reduce_switch'] = $this->notifyReduceSwitch;
        }
        if (null !== $this->resourceType) {
            $res['resource_type'] = $this->resourceType;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->userLoginNames) {
            $res['user_login_names'] = $this->userLoginNames;
        }
        if (null !== $this->userGroupIds) {
            $res['user_group_ids'] = $this->userGroupIds;
        }
        if (null !== $this->alarmWebHookIds) {
            $res['alarm_web_hook_ids'] = $this->alarmWebHookIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAlarmSubscriptionRequest
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
        if (isset($map['alarm_level'])) {
            $model->alarmLevel = $map['alarm_level'];
        }
        if (isset($map['notify_reduce_switch'])) {
            $model->notifyReduceSwitch = $map['notify_reduce_switch'];
        }
        if (isset($map['resource_type'])) {
            $model->resourceType = $map['resource_type'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['user_login_names'])) {
            if (!empty($map['user_login_names'])) {
                $model->userLoginNames = $map['user_login_names'];
            }
        }
        if (isset($map['user_group_ids'])) {
            if (!empty($map['user_group_ids'])) {
                $model->userGroupIds = $map['user_group_ids'];
            }
        }
        if (isset($map['alarm_web_hook_ids'])) {
            if (!empty($map['alarm_web_hook_ids'])) {
                $model->alarmWebHookIds = $map['alarm_web_hook_ids'];
            }
        }

        return $model;
    }
}
