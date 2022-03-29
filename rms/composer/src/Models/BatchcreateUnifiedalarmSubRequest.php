<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateUnifiedalarmSubRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 通知对象 可能有多个
    /**
     * @var UnifiedAlarmSubDTO[]
     */
    public $alarmSubs;

    // 告警规则id集合
    /**
     * @var int[]
     */
    public $alarmRuleIds;

    // 是否全部订阅
    /**
     * @var bool
     */
    public $subAll;

    // 工作区名
    /**
     * @var string
     */
    public $workspaceName;

    // 订阅成员是新增吗？新增时，不做旧的订阅关系做覆盖
    /**
     * @var bool
     */
    public $isAppend;
    protected $_name = [
        'authToken'     => 'auth_token',
        'alarmSubs'     => 'alarm_subs',
        'alarmRuleIds'  => 'alarm_rule_ids',
        'subAll'        => 'sub_all',
        'workspaceName' => 'workspace_name',
        'isAppend'      => 'is_append',
    ];

    public function validate()
    {
        Model::validateRequired('alarmSubs', $this->alarmSubs, true);
        Model::validateRequired('workspaceName', $this->workspaceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->alarmSubs) {
            $res['alarm_subs'] = [];
            if (null !== $this->alarmSubs && \is_array($this->alarmSubs)) {
                $n = 0;
                foreach ($this->alarmSubs as $item) {
                    $res['alarm_subs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->alarmRuleIds) {
            $res['alarm_rule_ids'] = $this->alarmRuleIds;
        }
        if (null !== $this->subAll) {
            $res['sub_all'] = $this->subAll;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->isAppend) {
            $res['is_append'] = $this->isAppend;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateUnifiedalarmSubRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['alarm_subs'])) {
            if (!empty($map['alarm_subs'])) {
                $model->alarmSubs = [];
                $n                = 0;
                foreach ($map['alarm_subs'] as $item) {
                    $model->alarmSubs[$n++] = null !== $item ? UnifiedAlarmSubDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['alarm_rule_ids'])) {
            if (!empty($map['alarm_rule_ids'])) {
                $model->alarmRuleIds = $map['alarm_rule_ids'];
            }
        }
        if (isset($map['sub_all'])) {
            $model->subAll = $map['sub_all'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['is_append'])) {
            $model->isAppend = $map['is_append'];
        }

        return $model;
    }
}
