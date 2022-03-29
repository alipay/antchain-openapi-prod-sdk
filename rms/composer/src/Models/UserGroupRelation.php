<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UserGroupRelation extends Model
{
    // ID
    /**
     * @example 15
     *
     * @var int
     */
    public $id;

    // 用户组 ID
    /**
     * @example 18
     *
     * @var int
     */
    public $userGroupId;

    // 钉钉机器人webhook
    /**
     * @example https://oapi.dingtalk.com/robot/send?access_token=530f2dcb1fd16797f06f27698a982cf558e2e664521b793506fe05245cbab553
     *
     * @var string
     */
    public $dingtalkWebhook;

    // 联系人登录名
    /**
     * @example yangjian.yangjian
     *
     * @var string
     */
    public $userLoginName;

    // 用户展示名
    /**
     * @example test
     *
     * @var string
     */
    public $userDisplayName;

    // 钉钉机器人
    /**
     * @example 奥特曼
     *
     * @var string
     */
    public $dingDingRobot;
    protected $_name = [
        'id'              => 'id',
        'userGroupId'     => 'user_group_id',
        'dingtalkWebhook' => 'dingtalk_webhook',
        'userLoginName'   => 'user_login_name',
        'userDisplayName' => 'user_display_name',
        'dingDingRobot'   => 'ding_ding_robot',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('userGroupId', $this->userGroupId, true);
        Model::validateRequired('dingtalkWebhook', $this->dingtalkWebhook, true);
        Model::validateRequired('userLoginName', $this->userLoginName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->userGroupId) {
            $res['user_group_id'] = $this->userGroupId;
        }
        if (null !== $this->dingtalkWebhook) {
            $res['dingtalk_webhook'] = $this->dingtalkWebhook;
        }
        if (null !== $this->userLoginName) {
            $res['user_login_name'] = $this->userLoginName;
        }
        if (null !== $this->userDisplayName) {
            $res['user_display_name'] = $this->userDisplayName;
        }
        if (null !== $this->dingDingRobot) {
            $res['ding_ding_robot'] = $this->dingDingRobot;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserGroupRelation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['user_group_id'])) {
            $model->userGroupId = $map['user_group_id'];
        }
        if (isset($map['dingtalk_webhook'])) {
            $model->dingtalkWebhook = $map['dingtalk_webhook'];
        }
        if (isset($map['user_login_name'])) {
            $model->userLoginName = $map['user_login_name'];
        }
        if (isset($map['user_display_name'])) {
            $model->userDisplayName = $map['user_display_name'];
        }
        if (isset($map['ding_ding_robot'])) {
            $model->dingDingRobot = $map['ding_ding_robot'];
        }

        return $model;
    }
}
