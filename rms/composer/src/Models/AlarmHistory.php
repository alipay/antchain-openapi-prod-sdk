<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AlarmHistory extends Model
{
    // alarm_level
    /**
     * @example alarm_level
     *
     * @var int
     */
    public $alarmLevel;

    // alarmPkgId
    /**
     * @example alarmPkgId
     *
     * @var int
     */
    public $alarmPkgId;

    // alarm_rule_name
    /**
     * @example alarm_rule_name
     *
     * @var string
     */
    public $alarmRuleName;

    // alarmSourceType
    /**
     * @example alarmSourceType
     *
     * @var string
     */
    public $alarmSourceType;

    // alarm_time
    /**
     * @example alarm_time
     *
     * @var int
     */
    public $alarmTime;

    // biz_domain_id
    /**
     * @example biz_domain_id
     *
     * @var int
     */
    public $bizDomainId;

    // context
    /**
     * @example context
     *
     * @var string
     */
    public $context;

    // custom_plugin_id
    /**
     * @example custom_plugin_id
     *
     * @var int
     */
    public $customPluginId;

    // id
    /**
     * @example id
     *
     * @var int
     */
    public $id;

    // meta_group_id
    /**
     * @example meta_group_id
     *
     * @var int
     */
    public $metaGroupId;

    // msg
    /**
     * @example msg
     *
     * @var string
     */
    public $msg;

    // stack_entity_id
    /**
     * @example stack_entity_id
     *
     * @var int
     */
    public $stackEntityId;

    // stack_id
    /**
     * @example stack_id
     *
     * @var int
     */
    public $stackId;

    // stack_monitor_item_name
    /**
     * @example stack_monitor_item_name
     *
     * @var string
     */
    public $stackMonitorItemName;

    // stack_universal_table_id
    /**
     * @example stack_universal_table_id
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
    protected $_name = [
        'alarmLevel'            => 'alarm_level',
        'alarmPkgId'            => 'alarm_pkg_id',
        'alarmRuleName'         => 'alarm_rule_name',
        'alarmSourceType'       => 'alarm_source_type',
        'alarmTime'             => 'alarm_time',
        'bizDomainId'           => 'biz_domain_id',
        'context'               => 'context',
        'customPluginId'        => 'custom_plugin_id',
        'id'                    => 'id',
        'metaGroupId'           => 'meta_group_id',
        'msg'                   => 'msg',
        'stackEntityId'         => 'stack_entity_id',
        'stackId'               => 'stack_id',
        'stackMonitorItemName'  => 'stack_monitor_item_name',
        'stackUniversalTableId' => 'stack_universal_table_id',
        'tagValueId'            => 'tag_value_id',
        'tenantId'              => 'tenant_id',
        'workspaceId'           => 'workspace_id',
    ];

    public function validate()
    {
        Model::validateRequired('alarmLevel', $this->alarmLevel, true);
        Model::validateRequired('alarmPkgId', $this->alarmPkgId, true);
        Model::validateRequired('alarmRuleName', $this->alarmRuleName, true);
        Model::validateRequired('alarmSourceType', $this->alarmSourceType, true);
        Model::validateRequired('alarmTime', $this->alarmTime, true);
        Model::validateRequired('bizDomainId', $this->bizDomainId, true);
        Model::validateRequired('context', $this->context, true);
        Model::validateRequired('customPluginId', $this->customPluginId, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('metaGroupId', $this->metaGroupId, true);
        Model::validateRequired('msg', $this->msg, true);
        Model::validateRequired('stackEntityId', $this->stackEntityId, true);
        Model::validateRequired('stackId', $this->stackId, true);
        Model::validateRequired('stackMonitorItemName', $this->stackMonitorItemName, true);
        Model::validateRequired('stackUniversalTableId', $this->stackUniversalTableId, true);
        Model::validateRequired('tagValueId', $this->tagValueId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->alarmLevel) {
            $res['alarm_level'] = $this->alarmLevel;
        }
        if (null !== $this->alarmPkgId) {
            $res['alarm_pkg_id'] = $this->alarmPkgId;
        }
        if (null !== $this->alarmRuleName) {
            $res['alarm_rule_name'] = $this->alarmRuleName;
        }
        if (null !== $this->alarmSourceType) {
            $res['alarm_source_type'] = $this->alarmSourceType;
        }
        if (null !== $this->alarmTime) {
            $res['alarm_time'] = $this->alarmTime;
        }
        if (null !== $this->bizDomainId) {
            $res['biz_domain_id'] = $this->bizDomainId;
        }
        if (null !== $this->context) {
            $res['context'] = $this->context;
        }
        if (null !== $this->customPluginId) {
            $res['custom_plugin_id'] = $this->customPluginId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->metaGroupId) {
            $res['meta_group_id'] = $this->metaGroupId;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->stackEntityId) {
            $res['stack_entity_id'] = $this->stackEntityId;
        }
        if (null !== $this->stackId) {
            $res['stack_id'] = $this->stackId;
        }
        if (null !== $this->stackMonitorItemName) {
            $res['stack_monitor_item_name'] = $this->stackMonitorItemName;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AlarmHistory
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['alarm_level'])) {
            $model->alarmLevel = $map['alarm_level'];
        }
        if (isset($map['alarm_pkg_id'])) {
            $model->alarmPkgId = $map['alarm_pkg_id'];
        }
        if (isset($map['alarm_rule_name'])) {
            $model->alarmRuleName = $map['alarm_rule_name'];
        }
        if (isset($map['alarm_source_type'])) {
            $model->alarmSourceType = $map['alarm_source_type'];
        }
        if (isset($map['alarm_time'])) {
            $model->alarmTime = $map['alarm_time'];
        }
        if (isset($map['biz_domain_id'])) {
            $model->bizDomainId = $map['biz_domain_id'];
        }
        if (isset($map['context'])) {
            $model->context = $map['context'];
        }
        if (isset($map['custom_plugin_id'])) {
            $model->customPluginId = $map['custom_plugin_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['meta_group_id'])) {
            $model->metaGroupId = $map['meta_group_id'];
        }
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }
        if (isset($map['stack_entity_id'])) {
            $model->stackEntityId = $map['stack_entity_id'];
        }
        if (isset($map['stack_id'])) {
            $model->stackId = $map['stack_id'];
        }
        if (isset($map['stack_monitor_item_name'])) {
            $model->stackMonitorItemName = $map['stack_monitor_item_name'];
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

        return $model;
    }
}
