<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class ZolozAlertTaskBO extends Model
{
    // request_id
    /**
     * @example 6728d09e2113b33b6cc7e47a361c3a5a
     *
     * @var string
     */
    public $requestId;

    // decision
    /**
     * @example REJECT
     *
     * @var string
     */
    public $decision;

    // status
    /**
     * @example CLOSED
     *
     * @var string
     */
    public $status;

    // taskId
    /**
     * @example A2022112130307183A
     *
     * @var string
     */
    public $taskId;

    // type
    /**
     * @example SANCTION
     *
     * @var string
     */
    public $type;

    // userId
    /**
     * @example 20880000001
     *
     * @var string
     */
    public $userId;

    // source
    /**
     * @example REALTIME
     *
     * @var string
     */
    public $source;

    // crrRiskLevel
    /**
     * @example ""
     *
     * @var string
     */
    public $crrRiskLevel;

    // createTime
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createTime;

    // updateTime
    /**
     * @example 1693221462732
     *
     * @var string
     */
    public $updateTime;

    // modifier
    /**
     * @example 12345678@163.com
     *
     * @var string
     */
    public $modifier;
    protected $_name = [
        'requestId'    => 'request_id',
        'decision'     => 'decision',
        'status'       => 'status',
        'taskId'       => 'task_id',
        'type'         => 'type',
        'userId'       => 'user_id',
        'source'       => 'source',
        'crrRiskLevel' => 'crr_risk_level',
        'createTime'   => 'create_time',
        'updateTime'   => 'update_time',
        'modifier'     => 'modifier',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('decision', $this->decision, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('crrRiskLevel', $this->crrRiskLevel, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('updateTime', $this->updateTime, true);
        Model::validateRequired('modifier', $this->modifier, true);
        Model::validatePattern('createTime', $this->createTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('updateTime', $this->updateTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->decision) {
            $res['decision'] = $this->decision;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->crrRiskLevel) {
            $res['crr_risk_level'] = $this->crrRiskLevel;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->modifier) {
            $res['modifier'] = $this->modifier;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ZolozAlertTaskBO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['decision'])) {
            $model->decision = $map['decision'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['crr_risk_level'])) {
            $model->crrRiskLevel = $map['crr_risk_level'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }
        if (isset($map['modifier'])) {
            $model->modifier = $map['modifier'];
        }

        return $model;
    }
}
