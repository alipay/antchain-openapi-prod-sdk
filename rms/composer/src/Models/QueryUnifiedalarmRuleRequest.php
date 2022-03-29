<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryUnifiedalarmRuleRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 告警规则名称模糊搜索
    /**
     * @var string
     */
    public $keyword;

    // 告警等级
    /**
     * @var int
     */
    public $level;

    // 告警对象
    /**
     * @var AlarmTarget
     */
    public $alarmTarget;

    // 启停状态
    /**
     * @var int
     */
    public $ruleStatus;

    // 告警状态
    /**
     * @var int
     */
    public $alarmStatus;

    // 只看我
    /**
     * @var bool
     */
    public $onlyMe;

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

    // 页面尺寸
    /**
     * @var int
     */
    public $pageSize;

    // 工作区名
    /**
     * @var string
     */
    public $workspaceName;

    // 告警规则id
    /**
     * @var int
     */
    public $ruleId;

    // 告警唯一标识
    /**
     * @var string
     */
    public $ruleUniqueIdentity;

    // 标识符 区分规则是自定义规则还是pql规则
    /**
     * @var string
     */
    public $category;

    /**
     * @var string
     */
    public $refDatasourceType;

    // 根据用户组过滤
    /**
     * @var int
     */
    public $filterUserGroup;

    // 根据webhook过滤
    /**
     * @var int
     */
    public $filterWebhook;

    // 钉钉机器人过滤
    /**
     * @var int
     */
    public $filterDingRobot;

    // 根据应栈信息对告警规则做过滤
    /**
     * @var AlarmStackInfo
     */
    public $alarmStackInfo;

    // CUSTOM,STACK,HOST
    /**
     * @var string
     */
    public $dataSourceType;

    // 过滤的告警级别
    /**
     * @var int[]
     */
    public $levels;

    // 告警事件id
    /**
     * @var string
     */
    public $alarmEventId;
    protected $_name = [
        'authToken'          => 'auth_token',
        'keyword'            => 'keyword',
        'level'              => 'level',
        'alarmTarget'        => 'alarm_target',
        'ruleStatus'         => 'rule_status',
        'alarmStatus'        => 'alarm_status',
        'onlyMe'             => 'only_me',
        'currentPage'        => 'current_page',
        'pageSize'           => 'page_size',
        'workspaceName'      => 'workspace_name',
        'ruleId'             => 'rule_id',
        'ruleUniqueIdentity' => 'rule_unique_identity',
        'category'           => 'category',
        'refDatasourceType'  => 'ref_datasource_type',
        'filterUserGroup'    => 'filter_user_group',
        'filterWebhook'      => 'filter_webhook',
        'filterDingRobot'    => 'filter_ding_robot',
        'alarmStackInfo'     => 'alarm_stack_info',
        'dataSourceType'     => 'data_source_type',
        'levels'             => 'levels',
        'alarmEventId'       => 'alarm_event_id',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('category', $this->category, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->keyword) {
            $res['keyword'] = $this->keyword;
        }
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }
        if (null !== $this->alarmTarget) {
            $res['alarm_target'] = null !== $this->alarmTarget ? $this->alarmTarget->toMap() : null;
        }
        if (null !== $this->ruleStatus) {
            $res['rule_status'] = $this->ruleStatus;
        }
        if (null !== $this->alarmStatus) {
            $res['alarm_status'] = $this->alarmStatus;
        }
        if (null !== $this->onlyMe) {
            $res['only_me'] = $this->onlyMe;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->ruleId) {
            $res['rule_id'] = $this->ruleId;
        }
        if (null !== $this->ruleUniqueIdentity) {
            $res['rule_unique_identity'] = $this->ruleUniqueIdentity;
        }
        if (null !== $this->category) {
            $res['category'] = $this->category;
        }
        if (null !== $this->refDatasourceType) {
            $res['ref_datasource_type'] = $this->refDatasourceType;
        }
        if (null !== $this->filterUserGroup) {
            $res['filter_user_group'] = $this->filterUserGroup;
        }
        if (null !== $this->filterWebhook) {
            $res['filter_webhook'] = $this->filterWebhook;
        }
        if (null !== $this->filterDingRobot) {
            $res['filter_ding_robot'] = $this->filterDingRobot;
        }
        if (null !== $this->alarmStackInfo) {
            $res['alarm_stack_info'] = null !== $this->alarmStackInfo ? $this->alarmStackInfo->toMap() : null;
        }
        if (null !== $this->dataSourceType) {
            $res['data_source_type'] = $this->dataSourceType;
        }
        if (null !== $this->levels) {
            $res['levels'] = $this->levels;
        }
        if (null !== $this->alarmEventId) {
            $res['alarm_event_id'] = $this->alarmEventId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUnifiedalarmRuleRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['keyword'])) {
            $model->keyword = $map['keyword'];
        }
        if (isset($map['level'])) {
            $model->level = $map['level'];
        }
        if (isset($map['alarm_target'])) {
            $model->alarmTarget = AlarmTarget::fromMap($map['alarm_target']);
        }
        if (isset($map['rule_status'])) {
            $model->ruleStatus = $map['rule_status'];
        }
        if (isset($map['alarm_status'])) {
            $model->alarmStatus = $map['alarm_status'];
        }
        if (isset($map['only_me'])) {
            $model->onlyMe = $map['only_me'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['rule_id'])) {
            $model->ruleId = $map['rule_id'];
        }
        if (isset($map['rule_unique_identity'])) {
            $model->ruleUniqueIdentity = $map['rule_unique_identity'];
        }
        if (isset($map['category'])) {
            $model->category = $map['category'];
        }
        if (isset($map['ref_datasource_type'])) {
            $model->refDatasourceType = $map['ref_datasource_type'];
        }
        if (isset($map['filter_user_group'])) {
            $model->filterUserGroup = $map['filter_user_group'];
        }
        if (isset($map['filter_webhook'])) {
            $model->filterWebhook = $map['filter_webhook'];
        }
        if (isset($map['filter_ding_robot'])) {
            $model->filterDingRobot = $map['filter_ding_robot'];
        }
        if (isset($map['alarm_stack_info'])) {
            $model->alarmStackInfo = AlarmStackInfo::fromMap($map['alarm_stack_info']);
        }
        if (isset($map['data_source_type'])) {
            $model->dataSourceType = $map['data_source_type'];
        }
        if (isset($map['levels'])) {
            if (!empty($map['levels'])) {
                $model->levels = $map['levels'];
            }
        }
        if (isset($map['alarm_event_id'])) {
            $model->alarmEventId = $map['alarm_event_id'];
        }

        return $model;
    }
}
