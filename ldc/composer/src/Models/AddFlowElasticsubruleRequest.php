<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class AddFlowElasticsubruleRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 消息eventCode, MSGBROKER必填
    /**
     * @var string
     */
    public $eventCode;

    // 操作人
    /**
     * @var string
     */
    public $operator;

    // 父规则ID
    /**
     * @var int
     */
    public $parentId;

    // 规则值, RPC必填
    /**
     * @var string
     */
    public $rpcMethod;

    // 所属规则类型，可选值：RPC, MSGBROKER, ANTQ, APP
    /**
     * @var string
     */
    public $ruleType;

    // VALID("线上生效"), PRESS("仅压测生效"), INVALID("无效状态");
    /**
     * @var string
     */
    public $status;

    // 消息topic, MSGBROKER和ANTQ必填
    /**
     * @var string
     */
    public $topic;

    // 是否使用默认eid, RPC必填
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
        'eventCode'      => 'event_code',
        'operator'       => 'operator',
        'parentId'       => 'parent_id',
        'rpcMethod'      => 'rpc_method',
        'ruleType'       => 'rule_type',
        'status'         => 'status',
        'topic'          => 'topic',
        'useDefaultEid'  => 'use_default_eid',
        'workspaceGroup' => 'workspace_group',
    ];

    public function validate()
    {
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('parentId', $this->parentId, true);
        Model::validateRequired('ruleType', $this->ruleType, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->eventCode) {
            $res['event_code'] = $this->eventCode;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }
        if (null !== $this->rpcMethod) {
            $res['rpc_method'] = $this->rpcMethod;
        }
        if (null !== $this->ruleType) {
            $res['rule_type'] = $this->ruleType;
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
     * @return AddFlowElasticsubruleRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['event_code'])) {
            $model->eventCode = $map['event_code'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['parent_id'])) {
            $model->parentId = $map['parent_id'];
        }
        if (isset($map['rpc_method'])) {
            $model->rpcMethod = $map['rpc_method'];
        }
        if (isset($map['rule_type'])) {
            $model->ruleType = $map['rule_type'];
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
