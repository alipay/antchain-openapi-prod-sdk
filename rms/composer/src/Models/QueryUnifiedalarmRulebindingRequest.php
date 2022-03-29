<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryUnifiedalarmRulebindingRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间名称
    /**
     * @var string
     */
    public $workspaceName;

    // 告警对象类型：APP应用，HOST主机
    /**
     * @var string
     */
    public $alarmTargetType;

    // 告警对象名称
    /**
     * @var string
     */
    public $alarmTargetIdentity;

    // 告警规则ID
    /**
     * @var int
     */
    public $alarmRuleId;

    // 数据源 ID
    /**
     * @var string
     */
    public $datasource;

    // 数据源类型：CUSTOM自定义监控，STACK技术栈监控
    /**
     * @var string
     */
    public $datasourceType;

    // 监控指标 URL
    /**
     * @var string
     */
    public $url;
    protected $_name = [
        'authToken'           => 'auth_token',
        'workspaceName'       => 'workspace_name',
        'alarmTargetType'     => 'alarm_target_type',
        'alarmTargetIdentity' => 'alarm_target_identity',
        'alarmRuleId'         => 'alarm_rule_id',
        'datasource'          => 'datasource',
        'datasourceType'      => 'datasource_type',
        'url'                 => 'url',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
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
        if (null !== $this->alarmTargetType) {
            $res['alarm_target_type'] = $this->alarmTargetType;
        }
        if (null !== $this->alarmTargetIdentity) {
            $res['alarm_target_identity'] = $this->alarmTargetIdentity;
        }
        if (null !== $this->alarmRuleId) {
            $res['alarm_rule_id'] = $this->alarmRuleId;
        }
        if (null !== $this->datasource) {
            $res['datasource'] = $this->datasource;
        }
        if (null !== $this->datasourceType) {
            $res['datasource_type'] = $this->datasourceType;
        }
        if (null !== $this->url) {
            $res['url'] = $this->url;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUnifiedalarmRulebindingRequest
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
        if (isset($map['alarm_target_type'])) {
            $model->alarmTargetType = $map['alarm_target_type'];
        }
        if (isset($map['alarm_target_identity'])) {
            $model->alarmTargetIdentity = $map['alarm_target_identity'];
        }
        if (isset($map['alarm_rule_id'])) {
            $model->alarmRuleId = $map['alarm_rule_id'];
        }
        if (isset($map['datasource'])) {
            $model->datasource = $map['datasource'];
        }
        if (isset($map['datasource_type'])) {
            $model->datasourceType = $map['datasource_type'];
        }
        if (isset($map['url'])) {
            $model->url = $map['url'];
        }

        return $model;
    }
}
