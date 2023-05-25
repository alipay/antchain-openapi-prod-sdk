<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class CreateRiskTaskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 风险任务名称
    /**
     * @var string
     */
    public $name;

    // 风险来源，image/benchmark/runtime
    /**
     * @var string
     */
    public $source;

    // 风险唯一标识
    /**
     * @var string
     */
    public $identity;

    // 风险等级
    /**
     * @var string
     */
    public $priority;

    // 风险任务显示名称
    /**
     * @var string
     */
    public $displayName;

    // 响应阶段，默认是日常阶段
    /**
     * @var string
     */
    public $respondPhase;

    // 风险责任人
    /**
     * @var string
     */
    public $owner;

    // 安全责任人
    /**
     * @var string
     */
    public $secOwner;

    // 风险关注者
    /**
     * @var string[]
     */
    public $followers;

    // 到期时间
    /**
     * @var string
     */
    public $deadlineTime;

    // 环境标识ID
    /**
     * @var string
     */
    public $envId;
    protected $_name = [
        'authToken'    => 'auth_token',
        'name'         => 'name',
        'source'       => 'source',
        'identity'     => 'identity',
        'priority'     => 'priority',
        'displayName'  => 'display_name',
        'respondPhase' => 'respond_phase',
        'owner'        => 'owner',
        'secOwner'     => 'sec_owner',
        'followers'    => 'followers',
        'deadlineTime' => 'deadline_time',
        'envId'        => 'env_id',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('owner', $this->owner, true);
        Model::validateRequired('secOwner', $this->secOwner, true);
        Model::validateRequired('followers', $this->followers, true);
        Model::validateRequired('deadlineTime', $this->deadlineTime, true);
        Model::validateRequired('envId', $this->envId, true);
        Model::validatePattern('deadlineTime', $this->deadlineTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->respondPhase) {
            $res['respond_phase'] = $this->respondPhase;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->secOwner) {
            $res['sec_owner'] = $this->secOwner;
        }
        if (null !== $this->followers) {
            $res['followers'] = $this->followers;
        }
        if (null !== $this->deadlineTime) {
            $res['deadline_time'] = $this->deadlineTime;
        }
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateRiskTaskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['priority'])) {
            $model->priority = $map['priority'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['respond_phase'])) {
            $model->respondPhase = $map['respond_phase'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }
        if (isset($map['sec_owner'])) {
            $model->secOwner = $map['sec_owner'];
        }
        if (isset($map['followers'])) {
            if (!empty($map['followers'])) {
                $model->followers = $map['followers'];
            }
        }
        if (isset($map['deadline_time'])) {
            $model->deadlineTime = $map['deadline_time'];
        }
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }

        return $model;
    }
}
