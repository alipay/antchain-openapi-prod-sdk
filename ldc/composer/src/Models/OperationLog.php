<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class OperationLog extends Model
{
    // 工作空间组id
    /**
     * @example dev
     *
     * @var string
     */
    public $workspaceGroupId;

    // LDC_PLAN或者LDC_SERVICE
    /**
     * @example LDC_PLAN
     *
     * @var string
     */
    public $entity;

    // 操作。
    /**
     * @example CREATE
     *
     * @var string
     */
    public $action;

    // 发布单plan_id或者lks_service_id
    /**
     * @example targetid
     *
     * @var string
     */
    public $targetId;

    // operatorId
    /**
     * @example operatorId
     *
     * @var string
     */
    public $operatorId;

    // operatorName
    /**
     * @example operatorName
     *
     * @var string
     */
    public $operatorName;

    // sourceSystem
    /**
     * @example sourceSystem
     *
     * @var string
     */
    public $sourceSystem;

    // context
    /**
     * @example context
     *
     * @var string
     */
    public $context;

    // 集群id
    /**
     * @example 0000000000020006
     *
     * @var string
     */
    public $clusterId;

    // pod名称
    /**
     * @example passdev-lks-lhc-0
     *
     * @var string
     */
    public $podName;

    // 操作内容
    /**
     * @example test
     *
     * @var string
     */
    public $content;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createTime;
    protected $_name = [
        'workspaceGroupId' => 'workspace_group_id',
        'entity'           => 'entity',
        'action'           => 'action',
        'targetId'         => 'target_id',
        'operatorId'       => 'operator_id',
        'operatorName'     => 'operator_name',
        'sourceSystem'     => 'source_system',
        'context'          => 'context',
        'clusterId'        => 'cluster_id',
        'podName'          => 'pod_name',
        'content'          => 'content',
        'createTime'       => 'create_time',
    ];

    public function validate()
    {
        Model::validatePattern('createTime', $this->createTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->workspaceGroupId) {
            $res['workspace_group_id'] = $this->workspaceGroupId;
        }
        if (null !== $this->entity) {
            $res['entity'] = $this->entity;
        }
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->targetId) {
            $res['target_id'] = $this->targetId;
        }
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->operatorName) {
            $res['operator_name'] = $this->operatorName;
        }
        if (null !== $this->sourceSystem) {
            $res['source_system'] = $this->sourceSystem;
        }
        if (null !== $this->context) {
            $res['context'] = $this->context;
        }
        if (null !== $this->clusterId) {
            $res['cluster_id'] = $this->clusterId;
        }
        if (null !== $this->podName) {
            $res['pod_name'] = $this->podName;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperationLog
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['workspace_group_id'])) {
            $model->workspaceGroupId = $map['workspace_group_id'];
        }
        if (isset($map['entity'])) {
            $model->entity = $map['entity'];
        }
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['target_id'])) {
            $model->targetId = $map['target_id'];
        }
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }
        if (isset($map['operator_name'])) {
            $model->operatorName = $map['operator_name'];
        }
        if (isset($map['source_system'])) {
            $model->sourceSystem = $map['source_system'];
        }
        if (isset($map['context'])) {
            $model->context = $map['context'];
        }
        if (isset($map['cluster_id'])) {
            $model->clusterId = $map['cluster_id'];
        }
        if (isset($map['pod_name'])) {
            $model->podName = $map['pod_name'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }

        return $model;
    }
}
