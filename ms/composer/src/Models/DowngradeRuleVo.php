<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class DowngradeRuleVo extends Model
{
    // 主键
    /**
     * @example 100000
     *
     * @var int
     */
    public $id;

    // 租户实例id
    /**
     * @example 999999
     *
     * @var string
     */
    public $instanceId;

    // 降级规则组id
    /**
     * @example 1000000
     *
     * @var int
     */
    public $groupId;

    // 降级服务
    /**
     * @example com.alipay.test.TestFacade
     *
     * @var string
     */
    public $downgradeService;

    // 降级方法
    /**
     * @example add
     *
     * @var string
     */
    public $downgradeMethod;

    // 规则描述
    /**
     * @example 规则名一
     *
     * @var string
     */
    public $ruleName;

    // 降级开关(0: 关闭 1: 开启)
    /**
     * @example 0
     *
     * @var int
     */
    public $enabled;

    // 运行模式
    /**
     * @example intercept
     *
     * @var string
     */
    public $mode;

    // 降级行为
    /**
     * @example RETURN_NULL
     *
     * @var string
     */
    public $downgradeAction;

    // 更新时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;
    protected $_name = [
        'id'               => 'id',
        'instanceId'       => 'instance_id',
        'groupId'          => 'group_id',
        'downgradeService' => 'downgrade_service',
        'downgradeMethod'  => 'downgrade_method',
        'ruleName'         => 'rule_name',
        'enabled'          => 'enabled',
        'mode'             => 'mode',
        'downgradeAction'  => 'downgrade_action',
        'gmtModified'      => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('downgradeService', $this->downgradeService, true);
        Model::validateRequired('downgradeMethod', $this->downgradeMethod, true);
        Model::validateRequired('ruleName', $this->ruleName, true);
        Model::validateRequired('enabled', $this->enabled, true);
        Model::validateRequired('mode', $this->mode, true);
        Model::validateRequired('downgradeAction', $this->downgradeAction, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->downgradeService) {
            $res['downgrade_service'] = $this->downgradeService;
        }
        if (null !== $this->downgradeMethod) {
            $res['downgrade_method'] = $this->downgradeMethod;
        }
        if (null !== $this->ruleName) {
            $res['rule_name'] = $this->ruleName;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->mode) {
            $res['mode'] = $this->mode;
        }
        if (null !== $this->downgradeAction) {
            $res['downgrade_action'] = $this->downgradeAction;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DowngradeRuleVo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['downgrade_service'])) {
            $model->downgradeService = $map['downgrade_service'];
        }
        if (isset($map['downgrade_method'])) {
            $model->downgradeMethod = $map['downgrade_method'];
        }
        if (isset($map['rule_name'])) {
            $model->ruleName = $map['rule_name'];
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['mode'])) {
            $model->mode = $map['mode'];
        }
        if (isset($map['downgrade_action'])) {
            $model->downgradeAction = $map['downgrade_action'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }

        return $model;
    }
}
