<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UnifiedAlarmRuleBindingVO extends Model
{
    // 租户 ID
    /**
     * @example 12
     *
     * @var int
     */
    public $tenantId;

    // 工作空间 ID
    /**
     * @example 123
     *
     * @var int
     */
    public $workspaceId;

    // 监控对象类型
    /**
     * @example APP
     *
     * @var string
     */
    public $alarmTargetType;

    // 监控对象名称
    /**
     * @example monitorprod
     *
     * @var string
     */
    public $alarmTargetIdentity;

    // 告警规则 ID
    /**
     * @example 12345
     *
     * @var int
     */
    public $alarmRuleId;

    // 数据源类型
    /**
     * @example CUSTOM
     *
     * @var string
     */
    public $datasourceType;

    // 数据源 ID
    /**
     * @example SPM@@625
     *
     * @var string
     */
    public $datasource;

    // 告警规则详情
    /**
     * @example
     *
     * @var UnifiedAlarmRuleVO
     */
    public $alarmRule;
    protected $_name = [
        'tenantId'            => 'tenant_id',
        'workspaceId'         => 'workspace_id',
        'alarmTargetType'     => 'alarm_target_type',
        'alarmTargetIdentity' => 'alarm_target_identity',
        'alarmRuleId'         => 'alarm_rule_id',
        'datasourceType'      => 'datasource_type',
        'datasource'          => 'datasource',
        'alarmRule'           => 'alarm_rule',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('alarmTargetType', $this->alarmTargetType, true);
        Model::validateRequired('alarmRuleId', $this->alarmRuleId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->alarmTargetType) {
            $res['alarm_target_type'] = $this->alarmTargetType;
        }
        if (null !== $this->alarmTargetIdentity) {
            $res['alarm_target_identity'] = $this->alarmTargetIdentity;
        }
        if (null !== $this->alarmRuleId) {
            $res['alarm_rule_id'] = $this->alarmRuleId;
        }
        if (null !== $this->datasourceType) {
            $res['datasource_type'] = $this->datasourceType;
        }
        if (null !== $this->datasource) {
            $res['datasource'] = $this->datasource;
        }
        if (null !== $this->alarmRule) {
            $res['alarm_rule'] = null !== $this->alarmRule ? $this->alarmRule->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnifiedAlarmRuleBindingVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['alarm_target_type'])) {
            $model->alarmTargetType = $map['alarm_target_type'];
        }
        if (isset($map['alarm_target_identity'])) {
            $model->alarmTargetIdentity = $map['alarm_target_identity'];
        }
        if (isset($map['alarm_rule_id'])) {
            $model->alarmRuleId = $map['alarm_rule_id'];
        }
        if (isset($map['datasource_type'])) {
            $model->datasourceType = $map['datasource_type'];
        }
        if (isset($map['datasource'])) {
            $model->datasource = $map['datasource'];
        }
        if (isset($map['alarm_rule'])) {
            $model->alarmRule = UnifiedAlarmRuleVO::fromMap($map['alarm_rule']);
        }

        return $model;
    }
}
