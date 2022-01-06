<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class RouterRuleGroupModel extends Model
{
    // 应用名
    /**
     * @example consumer-demo
     *
     * @var string
     */
    public $appName;

    // 服务id
    /**
     * @example com.antfin.demo.endpoint.facade.SampleRestFacade
     *
     * @var string
     */
    public $dataId;

    // 是否生效，1 生效，0 未生效。默认未生效
    /**
     * @example 1
     *
     * @var int
     */
    public $enabled;

    // 更新日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 实例id
    /**
     * @example 00001
     *
     * @var string
     */
    public $instanceId;

    // 编辑人
    /**
     * @example luoyon
     *
     * @var string
     */
    public $operator;

    // 路由规则
    /**
     * @example json:{}
     *
     * @var RouterRuleModel[]
     */
    public $rules;

    // service 表示服务
    /**
     * @example service
     *
     * @var string
     */
    public $type;

    // 版本号
    /**
     * @example 1
     *
     * @var int
     */
    public $dispatchVersion;
    protected $_name = [
        'appName'         => 'app_name',
        'dataId'          => 'data_id',
        'enabled'         => 'enabled',
        'gmtModified'     => 'gmt_modified',
        'id'              => 'id',
        'instanceId'      => 'instance_id',
        'operator'        => 'operator',
        'rules'           => 'rules',
        'type'            => 'type',
        'dispatchVersion' => 'dispatch_version',
    ];

    public function validate()
    {
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
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
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->dispatchVersion) {
            $res['dispatch_version'] = $this->dispatchVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RouterRuleGroupModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
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
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['dispatch_version'])) {
            $model->dispatchVersion = $map['dispatch_version'];
        }

        return $model;
    }
}
