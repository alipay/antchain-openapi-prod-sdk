<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateUnifiedalarmRuleRequest extends Model
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

    // 模板 ID
    /**
     * @var int
     */
    public $tplId;

    // 监控对象名称列表
    /**
     * @var AlarmTarget[]
     */
    public $alarmTargets;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'tplId'         => 'tpl_id',
        'alarmTargets'  => 'alarm_targets',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
        Model::validateRequired('tplId', $this->tplId, true);
        Model::validateRequired('alarmTargets', $this->alarmTargets, true);
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
        if (null !== $this->tplId) {
            $res['tpl_id'] = $this->tplId;
        }
        if (null !== $this->alarmTargets) {
            $res['alarm_targets'] = [];
            if (null !== $this->alarmTargets && \is_array($this->alarmTargets)) {
                $n = 0;
                foreach ($this->alarmTargets as $item) {
                    $res['alarm_targets'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateUnifiedalarmRuleRequest
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
        if (isset($map['tpl_id'])) {
            $model->tplId = $map['tpl_id'];
        }
        if (isset($map['alarm_targets'])) {
            if (!empty($map['alarm_targets'])) {
                $model->alarmTargets = [];
                $n                   = 0;
                foreach ($map['alarm_targets'] as $item) {
                    $model->alarmTargets[$n++] = null !== $item ? AlarmTarget::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
