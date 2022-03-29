<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryUnifiedalarmSubRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 通知人
    /**
     * @var string
     */
    public $subscriber;

    // 通知人的类型
    /**
     * @var string
     */
    public $subscriberType;

    // 是否包含我
    /**
     * @var bool
     */
    public $onlyMe;

    // 工作区名
    /**
     * @var string
     */
    public $workspaceName;

    // 规则id
    /**
     * @var int
     */
    public $alarmRuleId;

    // 模板id
    /**
     * @var int
     */
    public $alarmTplId;

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

    // 订阅人来源
    /**
     * @var string
     */
    public $subscriberSource;
    protected $_name = [
        'authToken'        => 'auth_token',
        'subscriber'       => 'subscriber',
        'subscriberType'   => 'subscriber_type',
        'onlyMe'           => 'only_me',
        'workspaceName'    => 'workspace_name',
        'alarmRuleId'      => 'alarm_rule_id',
        'alarmTplId'       => 'alarm_tpl_id',
        'currentPage'      => 'current_page',
        'pageSize'         => 'page_size',
        'subscriberSource' => 'subscriber_source',
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
        if (null !== $this->subscriber) {
            $res['subscriber'] = $this->subscriber;
        }
        if (null !== $this->subscriberType) {
            $res['subscriber_type'] = $this->subscriberType;
        }
        if (null !== $this->onlyMe) {
            $res['only_me'] = $this->onlyMe;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->alarmRuleId) {
            $res['alarm_rule_id'] = $this->alarmRuleId;
        }
        if (null !== $this->alarmTplId) {
            $res['alarm_tpl_id'] = $this->alarmTplId;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->subscriberSource) {
            $res['subscriber_source'] = $this->subscriberSource;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUnifiedalarmSubRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['subscriber'])) {
            $model->subscriber = $map['subscriber'];
        }
        if (isset($map['subscriber_type'])) {
            $model->subscriberType = $map['subscriber_type'];
        }
        if (isset($map['only_me'])) {
            $model->onlyMe = $map['only_me'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['alarm_rule_id'])) {
            $model->alarmRuleId = $map['alarm_rule_id'];
        }
        if (isset($map['alarm_tpl_id'])) {
            $model->alarmTplId = $map['alarm_tpl_id'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['subscriber_source'])) {
            $model->subscriberSource = $map['subscriber_source'];
        }

        return $model;
    }
}
