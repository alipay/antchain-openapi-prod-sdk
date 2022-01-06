<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class RouterRuleGroupVO extends Model
{
    // 主键
    /**
     * @example 1000
     *
     * @var int
     */
    public $id;

    // 租户实例id
    /**
     * @example 000001
     *
     * @var string
     */
    public $instanceId;

    // 应用名
    /**
     * @example testApp
     *
     * @var string
     */
    public $appName;

    // 服务id
    /**
     * @example com.alipay.test.FooFacade:1.0@DEFAULT
     *
     * @var string
     */
    public $dataId;

    // 规则名称
    /**
     * @example 新规则
     *
     * @var string
     */
    public $ruleName;

    // 版本号
    /**
     * @example 8
     *
     * @var int
     */
    public $version;

    // 1 开启/ 0 关闭
    /**
     * @example 1
     *
     * @var int
     */
    public $enabled;

    // 优先级
    /**
     * @example 1
     *
     * @var int
     */
    public $priority;

    // 灰度条件
    /**
     * @example {}
     *
     * @var string
     */
    public $grayCondition;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 更新时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 操作人
    /**
     * @example kele
     *
     * @var string
     */
    public $operator;

    // 路由规则
    /**
     * @example [{}]
     *
     * @var RouterRuleModel[]
     */
    public $rules;
    protected $_name = [
        'id'            => 'id',
        'instanceId'    => 'instance_id',
        'appName'       => 'app_name',
        'dataId'        => 'data_id',
        'ruleName'      => 'rule_name',
        'version'       => 'version',
        'enabled'       => 'enabled',
        'priority'      => 'priority',
        'grayCondition' => 'gray_condition',
        'gmtCreate'     => 'gmt_create',
        'gmtModified'   => 'gmt_modified',
        'operator'      => 'operator',
        'rules'         => 'rules',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->ruleName) {
            $res['rule_name'] = $this->ruleName;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }
        if (null !== $this->grayCondition) {
            $res['gray_condition'] = $this->grayCondition;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->rules) {
            $res['rules'] = [];
            if (null !== $this->rules && \is_array($this->rules)) {
                $n = 0;
                foreach ($this->rules as $item) {
                    $res['rules'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RouterRuleGroupVO
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
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['rule_name'])) {
            $model->ruleName = $map['rule_name'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['priority'])) {
            $model->priority = $map['priority'];
        }
        if (isset($map['gray_condition'])) {
            $model->grayCondition = $map['gray_condition'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['rules'])) {
            if (!empty($map['rules'])) {
                $model->rules = [];
                $n            = 0;
                foreach ($map['rules'] as $item) {
                    $model->rules[$n++] = null !== $item ? RouterRuleModel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
