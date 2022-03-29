<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UpdateUsergroupRequest extends Model
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

    // 通知组 ID
    /**
     * @var int
     */
    public $id;

    // 通知组名称
    /**
     * @var string
     */
    public $name;

    // 钉钉机器人token数组
    /**
     * @var string[]
     */
    public $dingtalkWebhooks;

    // 联系人登录名称数组
    /**
     * @var string[]
     */
    public $userLoginNames;

    // 全局订阅
    /**
     * @var bool
     */
    public $scopeGlobal;

    // 0、当前workspace有效；
    // 1、租户有效；
    /**
     * @var int
     */
    public $validScope;

    // 钉钉机器人
    /**
     * @var string[]
     */
    public $dingDingRobots;
    protected $_name = [
        'authToken'        => 'auth_token',
        'workspaceName'    => 'workspace_name',
        'id'               => 'id',
        'name'             => 'name',
        'dingtalkWebhooks' => 'dingtalk_webhooks',
        'userLoginNames'   => 'user_login_names',
        'scopeGlobal'      => 'scope_global',
        'validScope'       => 'valid_scope',
        'dingDingRobots'   => 'ding_ding_robots',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->dingtalkWebhooks) {
            $res['dingtalk_webhooks'] = $this->dingtalkWebhooks;
        }
        if (null !== $this->userLoginNames) {
            $res['user_login_names'] = $this->userLoginNames;
        }
        if (null !== $this->scopeGlobal) {
            $res['scope_global'] = $this->scopeGlobal;
        }
        if (null !== $this->validScope) {
            $res['valid_scope'] = $this->validScope;
        }
        if (null !== $this->dingDingRobots) {
            $res['ding_ding_robots'] = $this->dingDingRobots;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateUsergroupRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['dingtalk_webhooks'])) {
            if (!empty($map['dingtalk_webhooks'])) {
                $model->dingtalkWebhooks = $map['dingtalk_webhooks'];
            }
        }
        if (isset($map['user_login_names'])) {
            if (!empty($map['user_login_names'])) {
                $model->userLoginNames = $map['user_login_names'];
            }
        }
        if (isset($map['scope_global'])) {
            $model->scopeGlobal = $map['scope_global'];
        }
        if (isset($map['valid_scope'])) {
            $model->validScope = $map['valid_scope'];
        }
        if (isset($map['ding_ding_robots'])) {
            if (!empty($map['ding_ding_robots'])) {
                $model->dingDingRobots = $map['ding_ding_robots'];
            }
        }

        return $model;
    }
}
