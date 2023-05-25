<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class RiskTask extends Model
{
    // ID
    /**
     * @example 1000000000001
     *
     * @var string
     */
    public $id;

    // 风险名称
    /**
     * @example aks的cve-xxx代码漏洞
     *
     * @var string
     */
    public $displayName;

    // 优先级
    /**
     * @example low
     *
     * @var string
     */
    public $priority;

    // 当前状态
    /**
     * @example FIXED
     *
     * @var string
     */
    public $state;

    // 风险类型
    /**
     * @example IMAGE
     *
     * @var string
     */
    public $riskType;

    // 负责人
    /**
     * @example 张三
     *
     * @var string
     */
    public $owner;

    // 到期时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $deadlineTime;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createdTime;

    // 响应阶段
    /**
     * @example daily
     *
     * @var string
     */
    public $respondPhase;

    // 风险关注者
    /**
     * @example
     *
     * @var string[]
     */
    public $followers;

    // 安全工程师
    /**
     * @example 李四
     *
     * @var string
     */
    public $secOwner;

    // 到期天数
    /**
     * @example 3
     *
     * @var int
     */
    public $daysLeft;

    // 风险ID
    /**
     * @example 1000000000001
     *
     * @var string
     */
    public $riskId;
    protected $_name = [
        'id'           => 'id',
        'displayName'  => 'display_name',
        'priority'     => 'priority',
        'state'        => 'state',
        'riskType'     => 'risk_type',
        'owner'        => 'owner',
        'deadlineTime' => 'deadline_time',
        'createdTime'  => 'created_time',
        'respondPhase' => 'respond_phase',
        'followers'    => 'followers',
        'secOwner'     => 'sec_owner',
        'daysLeft'     => 'days_left',
        'riskId'       => 'risk_id',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('priority', $this->priority, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('riskType', $this->riskType, true);
        Model::validateRequired('owner', $this->owner, true);
        Model::validateRequired('deadlineTime', $this->deadlineTime, true);
        Model::validateRequired('createdTime', $this->createdTime, true);
        Model::validateRequired('respondPhase', $this->respondPhase, true);
        Model::validateRequired('followers', $this->followers, true);
        Model::validateRequired('secOwner', $this->secOwner, true);
        Model::validateRequired('daysLeft', $this->daysLeft, true);
        Model::validateRequired('riskId', $this->riskId, true);
        Model::validatePattern('deadlineTime', $this->deadlineTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->riskType) {
            $res['risk_type'] = $this->riskType;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->deadlineTime) {
            $res['deadline_time'] = $this->deadlineTime;
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->respondPhase) {
            $res['respond_phase'] = $this->respondPhase;
        }
        if (null !== $this->followers) {
            $res['followers'] = $this->followers;
        }
        if (null !== $this->secOwner) {
            $res['sec_owner'] = $this->secOwner;
        }
        if (null !== $this->daysLeft) {
            $res['days_left'] = $this->daysLeft;
        }
        if (null !== $this->riskId) {
            $res['risk_id'] = $this->riskId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskTask
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['priority'])) {
            $model->priority = $map['priority'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['risk_type'])) {
            $model->riskType = $map['risk_type'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }
        if (isset($map['deadline_time'])) {
            $model->deadlineTime = $map['deadline_time'];
        }
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }
        if (isset($map['respond_phase'])) {
            $model->respondPhase = $map['respond_phase'];
        }
        if (isset($map['followers'])) {
            if (!empty($map['followers'])) {
                $model->followers = $map['followers'];
            }
        }
        if (isset($map['sec_owner'])) {
            $model->secOwner = $map['sec_owner'];
        }
        if (isset($map['days_left'])) {
            $model->daysLeft = $map['days_left'];
        }
        if (isset($map['risk_id'])) {
            $model->riskId = $map['risk_id'];
        }

        return $model;
    }
}
