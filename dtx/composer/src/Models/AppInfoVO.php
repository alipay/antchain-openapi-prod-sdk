<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class AppInfoVO extends Model
{
    // 参与者数组
    /**
     * @example
     *
     * @var Participator[]
     */
    public $actionArray;

    // 10
    /**
     * @example 10
     *
     * @var int
     */
    public $actionCount;

    // 10
    /**
     * @example 10
     *
     * @var int
     */
    public $activityCount;

    // 1 同库 2 异库
    /**
     * @example 1
     *
     * @var int
     */
    public $activityMode;

    // app
    /**
     * @example app
     *
     * @var string
     */
    public $appName;

    // 分库规则
    /**
     * @example hash
     *
     * @var string
     */
    public $dbRuleName;

    // 分库规则
    /**
     * @example temp
     *
     * @var string
     */
    public $dbRuleTemplate;

    // 一句话描述
    /**
     * @example 一句话描述
     *
     * @var string
     */
    public $desc;

    // 唯一id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 1
    /**
     * @example
     *
     * @var AppRecoveryVO[]
     */
    public $recoveryArray;

    // 分表类型
    /**
     * @example hash
     *
     * @var string
     */
    public $tableRuleName;

    // 分表规则
    /**
     * @example temp
     *
     * @var string
     */
    public $tableRuleTemplate;

    // 是否被使用
    /**
     * @example true, false
     *
     * @var bool
     */
    public $used;

    // 1 单库单表 2 分库分表
    /**
     * @example 1
     *
     * @var int
     */
    public $spliteMode;
    protected $_name = [
        'actionArray'       => 'action_array',
        'actionCount'       => 'action_count',
        'activityCount'     => 'activity_count',
        'activityMode'      => 'activity_mode',
        'appName'           => 'app_name',
        'dbRuleName'        => 'db_rule_name',
        'dbRuleTemplate'    => 'db_rule_template',
        'desc'              => 'desc',
        'id'                => 'id',
        'recoveryArray'     => 'recovery_array',
        'tableRuleName'     => 'table_rule_name',
        'tableRuleTemplate' => 'table_rule_template',
        'used'              => 'used',
        'spliteMode'        => 'splite_mode',
    ];

    public function validate()
    {
        Model::validateRequired('actionArray', $this->actionArray, true);
        Model::validateRequired('actionCount', $this->actionCount, true);
        Model::validateRequired('activityCount', $this->activityCount, true);
        Model::validateRequired('activityMode', $this->activityMode, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('dbRuleName', $this->dbRuleName, true);
        Model::validateRequired('dbRuleTemplate', $this->dbRuleTemplate, true);
        Model::validateRequired('desc', $this->desc, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('recoveryArray', $this->recoveryArray, true);
        Model::validateRequired('tableRuleName', $this->tableRuleName, true);
        Model::validateRequired('tableRuleTemplate', $this->tableRuleTemplate, true);
        Model::validateRequired('used', $this->used, true);
        Model::validateRequired('spliteMode', $this->spliteMode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->actionArray) {
            $res['action_array'] = [];
            if (null !== $this->actionArray && \is_array($this->actionArray)) {
                $n = 0;
                foreach ($this->actionArray as $item) {
                    $res['action_array'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->actionCount) {
            $res['action_count'] = $this->actionCount;
        }
        if (null !== $this->activityCount) {
            $res['activity_count'] = $this->activityCount;
        }
        if (null !== $this->activityMode) {
            $res['activity_mode'] = $this->activityMode;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->dbRuleName) {
            $res['db_rule_name'] = $this->dbRuleName;
        }
        if (null !== $this->dbRuleTemplate) {
            $res['db_rule_template'] = $this->dbRuleTemplate;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->recoveryArray) {
            $res['recovery_array'] = [];
            if (null !== $this->recoveryArray && \is_array($this->recoveryArray)) {
                $n = 0;
                foreach ($this->recoveryArray as $item) {
                    $res['recovery_array'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->tableRuleName) {
            $res['table_rule_name'] = $this->tableRuleName;
        }
        if (null !== $this->tableRuleTemplate) {
            $res['table_rule_template'] = $this->tableRuleTemplate;
        }
        if (null !== $this->used) {
            $res['used'] = $this->used;
        }
        if (null !== $this->spliteMode) {
            $res['splite_mode'] = $this->spliteMode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppInfoVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['action_array'])) {
            if (!empty($map['action_array'])) {
                $model->actionArray = [];
                $n                  = 0;
                foreach ($map['action_array'] as $item) {
                    $model->actionArray[$n++] = null !== $item ? Participator::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['action_count'])) {
            $model->actionCount = $map['action_count'];
        }
        if (isset($map['activity_count'])) {
            $model->activityCount = $map['activity_count'];
        }
        if (isset($map['activity_mode'])) {
            $model->activityMode = $map['activity_mode'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['db_rule_name'])) {
            $model->dbRuleName = $map['db_rule_name'];
        }
        if (isset($map['db_rule_template'])) {
            $model->dbRuleTemplate = $map['db_rule_template'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['recovery_array'])) {
            if (!empty($map['recovery_array'])) {
                $model->recoveryArray = [];
                $n                    = 0;
                foreach ($map['recovery_array'] as $item) {
                    $model->recoveryArray[$n++] = null !== $item ? AppRecoveryVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['table_rule_name'])) {
            $model->tableRuleName = $map['table_rule_name'];
        }
        if (isset($map['table_rule_template'])) {
            $model->tableRuleTemplate = $map['table_rule_template'];
        }
        if (isset($map['used'])) {
            $model->used = $map['used'];
        }
        if (isset($map['splite_mode'])) {
            $model->spliteMode = $map['splite_mode'];
        }

        return $model;
    }
}
