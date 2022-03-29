<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AlarmSub extends Model
{
    // 主键 ID
    /**
     * @example 15
     *
     * @var int
     */
    public $id;

    // 用户登录名
    /**
     * @example the userLoginName
     *
     * @var string
     */
    public $userLoginName;

    // 告警组 ID
    /**
     * @example 3
     *
     * @var int
     */
    public $userGroupId;

    // the notifyChannel
    /**
     * @example the notifyChannel
     *
     * @var string
     */
    public $notifyChannel;

    // 告警套餐 ID
    /**
     * @example
     *
     * @var int
     */
    public $alarmPkgId;

    // 自定义监控 ID
    /**
     * @example
     *
     * @var int
     */
    public $customPluginId;

    // the stackAlarmRuleId
    /**
     * @example the stackAlarmRuleId
     *
     * @var int
     */
    public $stackAlarmRuleId;

    // 文件夹 ID
    /**
     * @example
     *
     * @var int
     */
    public $folderId;

    // the metaGroupId
    /**
     * @example
     *
     * @var int
     */
    public $metaGroupId;

    // 技术栈实体
    /**
     * @example sofacloud*sofa_app*1*3*RMS-rmsalarm
     *
     * @var string
     */
    public $stackUniversalTableId;

    // 创建时间
    /**
     * @example
     *
     * @var int
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example
     *
     * @var int
     */
    public $gmtModified;

    // 创建者
    /**
     * @example creator
     *
     * @var string
     */
    public $creater;

    // 修改人
    /**
     * @example modifier
     *
     * @var string
     */
    public $modifier;

    // 告警级别
    /**
     * @example
     *
     * @var int
     */
    public $alarmLevel;

    // 降频通知开关
    /**
     * @example
     *
     * @var int
     */
    public $notifyReduceSwitch;

    // web hook id
    /**
     * @example
     *
     * @var int
     */
    public $alarmHttpWebHookId;
    protected $_name = [
        'id'                    => 'id',
        'userLoginName'         => 'user_login_name',
        'userGroupId'           => 'user_group_id',
        'notifyChannel'         => 'notify_channel',
        'alarmPkgId'            => 'alarm_pkg_id',
        'customPluginId'        => 'custom_plugin_id',
        'stackAlarmRuleId'      => 'stack_alarm_rule_id',
        'folderId'              => 'folder_id',
        'metaGroupId'           => 'meta_group_id',
        'stackUniversalTableId' => 'stack_universal_table_id',
        'gmtCreate'             => 'gmt_create',
        'gmtModified'           => 'gmt_modified',
        'creater'               => 'creater',
        'modifier'              => 'modifier',
        'alarmLevel'            => 'alarm_level',
        'notifyReduceSwitch'    => 'notify_reduce_switch',
        'alarmHttpWebHookId'    => 'alarm_http_web_hook_id',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('creater', $this->creater, true);
        Model::validateRequired('alarmLevel', $this->alarmLevel, true);
        Model::validateRequired('notifyReduceSwitch', $this->notifyReduceSwitch, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->userLoginName) {
            $res['user_login_name'] = $this->userLoginName;
        }
        if (null !== $this->userGroupId) {
            $res['user_group_id'] = $this->userGroupId;
        }
        if (null !== $this->notifyChannel) {
            $res['notify_channel'] = $this->notifyChannel;
        }
        if (null !== $this->alarmPkgId) {
            $res['alarm_pkg_id'] = $this->alarmPkgId;
        }
        if (null !== $this->customPluginId) {
            $res['custom_plugin_id'] = $this->customPluginId;
        }
        if (null !== $this->stackAlarmRuleId) {
            $res['stack_alarm_rule_id'] = $this->stackAlarmRuleId;
        }
        if (null !== $this->folderId) {
            $res['folder_id'] = $this->folderId;
        }
        if (null !== $this->metaGroupId) {
            $res['meta_group_id'] = $this->metaGroupId;
        }
        if (null !== $this->stackUniversalTableId) {
            $res['stack_universal_table_id'] = $this->stackUniversalTableId;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->creater) {
            $res['creater'] = $this->creater;
        }
        if (null !== $this->modifier) {
            $res['modifier'] = $this->modifier;
        }
        if (null !== $this->alarmLevel) {
            $res['alarm_level'] = $this->alarmLevel;
        }
        if (null !== $this->notifyReduceSwitch) {
            $res['notify_reduce_switch'] = $this->notifyReduceSwitch;
        }
        if (null !== $this->alarmHttpWebHookId) {
            $res['alarm_http_web_hook_id'] = $this->alarmHttpWebHookId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AlarmSub
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['user_login_name'])) {
            $model->userLoginName = $map['user_login_name'];
        }
        if (isset($map['user_group_id'])) {
            $model->userGroupId = $map['user_group_id'];
        }
        if (isset($map['notify_channel'])) {
            $model->notifyChannel = $map['notify_channel'];
        }
        if (isset($map['alarm_pkg_id'])) {
            $model->alarmPkgId = $map['alarm_pkg_id'];
        }
        if (isset($map['custom_plugin_id'])) {
            $model->customPluginId = $map['custom_plugin_id'];
        }
        if (isset($map['stack_alarm_rule_id'])) {
            $model->stackAlarmRuleId = $map['stack_alarm_rule_id'];
        }
        if (isset($map['folder_id'])) {
            $model->folderId = $map['folder_id'];
        }
        if (isset($map['meta_group_id'])) {
            $model->metaGroupId = $map['meta_group_id'];
        }
        if (isset($map['stack_universal_table_id'])) {
            $model->stackUniversalTableId = $map['stack_universal_table_id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['creater'])) {
            $model->creater = $map['creater'];
        }
        if (isset($map['modifier'])) {
            $model->modifier = $map['modifier'];
        }
        if (isset($map['alarm_level'])) {
            $model->alarmLevel = $map['alarm_level'];
        }
        if (isset($map['notify_reduce_switch'])) {
            $model->notifyReduceSwitch = $map['notify_reduce_switch'];
        }
        if (isset($map['alarm_http_web_hook_id'])) {
            $model->alarmHttpWebHookId = $map['alarm_http_web_hook_id'];
        }

        return $model;
    }
}
