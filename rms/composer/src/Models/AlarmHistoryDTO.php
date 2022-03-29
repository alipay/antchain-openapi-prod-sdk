<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AlarmHistoryDTO extends Model
{
    // id
    /**
     * @example id
     *
     * @var int
     */
    public $id;

    // alarm_rule_name
    /**
     * @example alarm_rule_name
     *
     * @var string
     */
    public $alarmRuleName;

    // msg
    /**
     * @example msg
     *
     * @var string
     */
    public $msg;

    // alarm_pkg_id
    /**
     * @example alarm_pkg_id
     *
     * @var int
     */
    public $alarmPkgId;

    // custom_plugin_id
    /**
     * @example custom_plugin_id
     *
     * @var int
     */
    public $customPluginId;

    // meta_group_id
    /**
     * @example meta_group_id
     *
     * @var int
     */
    public $metaGroupId;

    // stack_universal_tableId
    /**
     * @example stack_universal_tableId
     *
     * @var string
     */
    public $stackUniversalTableId;

    // tag_value_id
    /**
     * @example tag_value_id
     *
     * @var int
     */
    public $tagValueId;

    // tenant_id
    /**
     * @example tenant_id
     *
     * @var int
     */
    public $tenantId;

    // workspace_id
    /**
     * @example workspace_id
     *
     * @var int
     */
    public $workspaceId;

    // biz_domain_id
    /**
     * @example biz_domain_id
     *
     * @var int
     */
    public $bizDomainId;

    // alarm_time
    /**
     * @example alarm_time
     *
     * @var int
     */
    public $alarmTime;

    // alarm_level
    /**
     * @example alarm_level
     *
     * @var int
     */
    public $alarmLevel;

    // stack_id
    /**
     * @example stack_id
     *
     * @var int
     */
    public $stackId;

    // stack_entity_id
    /**
     * @example stack_entity_id
     *
     * @var int
     */
    public $stackEntityId;

    // stack_monitor_item_name
    /**
     * @example stack_monitor_item_name
     *
     * @var string
     */
    public $stackMonitorItemName;

    // alarm_source_type
    /**
     * @example alarm_source_type
     *
     * @var string
     */
    public $alarmSourceType;

    // biz_id
    /**
     * @example biz_id
     *
     * @var int
     */
    public $bizId;

    // biz_groupby_name
    /**
     * @example biz_groupby_name
     *
     * @var string
     */
    public $bizGroupbyName;

    // multi_alarm_id
    /**
     * @example multi_alarm_id
     *
     * @var int
     */
    public $multiAlarmId;

    // context
    /**
     * @example context
     *
     * @var KeySet[]
     */
    public $context;
    protected $_name = [
        'id'                    => 'id',
        'alarmRuleName'         => 'alarm_rule_name',
        'msg'                   => 'msg',
        'alarmPkgId'            => 'alarm_pkg_id',
        'customPluginId'        => 'custom_plugin_id',
        'metaGroupId'           => 'meta_group_id',
        'stackUniversalTableId' => 'stack_universal_table_id',
        'tagValueId'            => 'tag_value_id',
        'tenantId'              => 'tenant_id',
        'workspaceId'           => 'workspace_id',
        'bizDomainId'           => 'biz_domain_id',
        'alarmTime'             => 'alarm_time',
        'alarmLevel'            => 'alarm_level',
        'stackId'               => 'stack_id',
        'stackEntityId'         => 'stack_entity_id',
        'stackMonitorItemName'  => 'stack_monitor_item_name',
        'alarmSourceType'       => 'alarm_source_type',
        'bizId'                 => 'biz_id',
        'bizGroupbyName'        => 'biz_groupby_name',
        'multiAlarmId'          => 'multi_alarm_id',
        'context'               => 'context',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('alarmRuleName', $this->alarmRuleName, true);
        Model::validateRequired('msg', $this->msg, true);
        Model::validateRequired('alarmPkgId', $this->alarmPkgId, true);
        Model::validateRequired('customPluginId', $this->customPluginId, true);
        Model::validateRequired('metaGroupId', $this->metaGroupId, true);
        Model::validateRequired('stackUniversalTableId', $this->stackUniversalTableId, true);
        Model::validateRequired('tagValueId', $this->tagValueId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('bizDomainId', $this->bizDomainId, true);
        Model::validateRequired('alarmTime', $this->alarmTime, true);
        Model::validateRequired('alarmLevel', $this->alarmLevel, true);
        Model::validateRequired('stackId', $this->stackId, true);
        Model::validateRequired('stackEntityId', $this->stackEntityId, true);
        Model::validateRequired('stackMonitorItemName', $this->stackMonitorItemName, true);
        Model::validateRequired('alarmSourceType', $this->alarmSourceType, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('bizGroupbyName', $this->bizGroupbyName, true);
        Model::validateRequired('multiAlarmId', $this->multiAlarmId, true);
        Model::validateRequired('context', $this->context, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->alarmRuleName) {
            $res['alarm_rule_name'] = $this->alarmRuleName;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->alarmPkgId) {
            $res['alarm_pkg_id'] = $this->alarmPkgId;
        }
        if (null !== $this->customPluginId) {
            $res['custom_plugin_id'] = $this->customPluginId;
        }
        if (null !== $this->metaGroupId) {
            $res['meta_group_id'] = $this->metaGroupId;
        }
        if (null !== $this->stackUniversalTableId) {
            $res['stack_universal_table_id'] = $this->stackUniversalTableId;
        }
        if (null !== $this->tagValueId) {
            $res['tag_value_id'] = $this->tagValueId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->bizDomainId) {
            $res['biz_domain_id'] = $this->bizDomainId;
        }
        if (null !== $this->alarmTime) {
            $res['alarm_time'] = $this->alarmTime;
        }
        if (null !== $this->alarmLevel) {
            $res['alarm_level'] = $this->alarmLevel;
        }
        if (null !== $this->stackId) {
            $res['stack_id'] = $this->stackId;
        }
        if (null !== $this->stackEntityId) {
            $res['stack_entity_id'] = $this->stackEntityId;
        }
        if (null !== $this->stackMonitorItemName) {
            $res['stack_monitor_item_name'] = $this->stackMonitorItemName;
        }
        if (null !== $this->alarmSourceType) {
            $res['alarm_source_type'] = $this->alarmSourceType;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->bizGroupbyName) {
            $res['biz_groupby_name'] = $this->bizGroupbyName;
        }
        if (null !== $this->multiAlarmId) {
            $res['multi_alarm_id'] = $this->multiAlarmId;
        }
        if (null !== $this->context) {
            $res['context'] = [];
            if (null !== $this->context && \is_array($this->context)) {
                $n = 0;
                foreach ($this->context as $item) {
                    $res['context'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AlarmHistoryDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['alarm_rule_name'])) {
            $model->alarmRuleName = $map['alarm_rule_name'];
        }
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }
        if (isset($map['alarm_pkg_id'])) {
            $model->alarmPkgId = $map['alarm_pkg_id'];
        }
        if (isset($map['custom_plugin_id'])) {
            $model->customPluginId = $map['custom_plugin_id'];
        }
        if (isset($map['meta_group_id'])) {
            $model->metaGroupId = $map['meta_group_id'];
        }
        if (isset($map['stack_universal_table_id'])) {
            $model->stackUniversalTableId = $map['stack_universal_table_id'];
        }
        if (isset($map['tag_value_id'])) {
            $model->tagValueId = $map['tag_value_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['biz_domain_id'])) {
            $model->bizDomainId = $map['biz_domain_id'];
        }
        if (isset($map['alarm_time'])) {
            $model->alarmTime = $map['alarm_time'];
        }
        if (isset($map['alarm_level'])) {
            $model->alarmLevel = $map['alarm_level'];
        }
        if (isset($map['stack_id'])) {
            $model->stackId = $map['stack_id'];
        }
        if (isset($map['stack_entity_id'])) {
            $model->stackEntityId = $map['stack_entity_id'];
        }
        if (isset($map['stack_monitor_item_name'])) {
            $model->stackMonitorItemName = $map['stack_monitor_item_name'];
        }
        if (isset($map['alarm_source_type'])) {
            $model->alarmSourceType = $map['alarm_source_type'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['biz_groupby_name'])) {
            $model->bizGroupbyName = $map['biz_groupby_name'];
        }
        if (isset($map['multi_alarm_id'])) {
            $model->multiAlarmId = $map['multi_alarm_id'];
        }
        if (isset($map['context'])) {
            if (!empty($map['context'])) {
                $model->context = [];
                $n              = 0;
                foreach ($map['context'] as $item) {
                    $model->context[$n++] = null !== $item ? KeySet::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
