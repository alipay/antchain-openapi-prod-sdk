<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class DowngradeRuleGroupVo extends Model
{
    // 主键
    /**
     * @example 1000000
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

    // foo
    /**
     * @example 应用名称
     *
     * @var string
     */
    public $appName;

    // 类型
    /**
     * @example SOFA
     *
     * @var string
     */
    public $type;

    // 降级全局开关(0:关闭 1:开启)
    /**
     * @example 1
     *
     * @var int
     */
    public $enabled;

    // 降级规则
    /**
     * @example {}
     *
     * @var DowngradeRuleVo[]
     */
    public $downgradeRules;
    protected $_name = [
        'id'             => 'id',
        'instanceId'     => 'instance_id',
        'appName'        => 'app_name',
        'type'           => 'type',
        'enabled'        => 'enabled',
        'downgradeRules' => 'downgrade_rules',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('enabled', $this->enabled, true);
        Model::validateRequired('downgradeRules', $this->downgradeRules, true);
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->downgradeRules) {
            $res['downgrade_rules'] = [];
            if (null !== $this->downgradeRules && \is_array($this->downgradeRules)) {
                $n = 0;
                foreach ($this->downgradeRules as $item) {
                    $res['downgrade_rules'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DowngradeRuleGroupVo
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['downgrade_rules'])) {
            if (!empty($map['downgrade_rules'])) {
                $model->downgradeRules = [];
                $n                     = 0;
                foreach ($map['downgrade_rules'] as $item) {
                    $model->downgradeRules[$n++] = null !== $item ? DowngradeRuleVo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
