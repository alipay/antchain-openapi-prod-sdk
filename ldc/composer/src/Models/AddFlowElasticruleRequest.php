<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class AddFlowElasticruleRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 所属应用名称
    /**
     * @var string
     */
    public $appName;

    // MSGBROKER 需要填写。
    // 弹性规则消息类型事件码。
    // 如果包含所有eventCode，可以用英文星号"*"表示。
    /**
     * @var string[]
     */
    public $eventCodes;

    // 弹性规则方法名称，RPC类型需要填写。
    // 如果包含所有方法，则填写英文星号"*"
    /**
     * @var string[]
     */
    public $methods;

    // 操作人
    /**
     * @var string
     */
    public $operator;

    // 弹性规则类型，包括：APP、RPC、MSGBROKER，ANTQ
    /**
     * @var string
     */
    public $ruleType;

    // 适用的弹性场景名称
    /**
     * @var string
     */
    public $sceneName;

    // 弹性规则服务名称。
    // RPC：对应接口名，例如：com.alipay.cif.facade.AckCodeService:1.0:cif。
    // APP：对应应用名，例如：cif。
    // MSG或ANTQ：对应消息groupId，例如：S-UNIQUERY-SYNC。
    /**
     * @var string
     */
    public $serviceName;

    // 弹性规则状态，有效值：VALID（线上生效）、PRESS（仅压测生效）、INVALID（无效状态）
    /**
     * @var string
     */
    public $status;

    // MSGBROKER 和 ANTQ 需要填写。
    // 弹性规则消息类型topic。
    // 如果包含所有topic，可以用英文星号"*"表示。
    /**
     * @var string
     */
    public $topic;

    // 是否使用默认EID（默认 false）
    /**
     * @var bool
     */
    public $useDefaultEid;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;
    protected $_name = [
        'authToken'      => 'auth_token',
        'appName'        => 'app_name',
        'eventCodes'     => 'event_codes',
        'methods'        => 'methods',
        'operator'       => 'operator',
        'ruleType'       => 'rule_type',
        'sceneName'      => 'scene_name',
        'serviceName'    => 'service_name',
        'status'         => 'status',
        'topic'          => 'topic',
        'useDefaultEid'  => 'use_default_eid',
        'workspaceGroup' => 'workspace_group',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('ruleType', $this->ruleType, true);
        Model::validateRequired('sceneName', $this->sceneName, true);
        Model::validateRequired('serviceName', $this->serviceName, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->eventCodes) {
            $res['event_codes'] = $this->eventCodes;
        }
        if (null !== $this->methods) {
            $res['methods'] = $this->methods;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->ruleType) {
            $res['rule_type'] = $this->ruleType;
        }
        if (null !== $this->sceneName) {
            $res['scene_name'] = $this->sceneName;
        }
        if (null !== $this->serviceName) {
            $res['service_name'] = $this->serviceName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->useDefaultEid) {
            $res['use_default_eid'] = $this->useDefaultEid;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddFlowElasticruleRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['event_codes'])) {
            if (!empty($map['event_codes'])) {
                $model->eventCodes = $map['event_codes'];
            }
        }
        if (isset($map['methods'])) {
            if (!empty($map['methods'])) {
                $model->methods = $map['methods'];
            }
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['rule_type'])) {
            $model->ruleType = $map['rule_type'];
        }
        if (isset($map['scene_name'])) {
            $model->sceneName = $map['scene_name'];
        }
        if (isset($map['service_name'])) {
            $model->serviceName = $map['service_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['use_default_eid'])) {
            $model->useDefaultEid = $map['use_default_eid'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }

        return $model;
    }
}
