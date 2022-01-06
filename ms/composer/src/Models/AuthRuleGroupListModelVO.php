<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AuthRuleGroupListModelVO extends Model
{
    // 应用名称, 多个应用逗号分隔
    /**
     * @example app1,app2
     *
     * @var string
     */
    public $appName;

    // 黑名单组id
    /**
     * @example 100
     *
     * @var int
     */
    public $blackGroupId;

    // 黑名单状态（1开启/0关闭）
    /**
     * @example 1
     *
     * @var int
     */
    public $blackState;

    // 鉴权源
    /**
     * @example com.alipy.test.SampleFacade
     *
     * @var string
     */
    public $dataId;

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

    // 主键
    /**
     * @example 100
     *
     * @var int
     */
    public $id;

    // 租户实例id
    /**
     * @example NY24NMCS0M9A
     *
     * @var string
     */
    public $instanceId;

    // 操作人
    /**
     * @example icanner
     *
     * @var string
     */
    public $operator;

    // 鉴权规则列表
    /**
     * @example [{"name": "新的鉴权规则"...}]
     *
     * @var AuthRuleModelVO[]
     */
    public $rules;

    // 生效状态（0 失败, 1 成功, 2 部分失败）
    /**
     * @example 1
     *
     * @var int
     */
    public $status;

    // 白名单组id
    /**
     * @example 100
     *
     * @var int
     */
    public $whiteGroupId;

    // 白名单状态（1开启/0关闭）
    /**
     * @example 0
     *
     * @var int
     */
    public $whiteState;

    // 变更状态
    /**
     * @example NORMAL
     *
     * @var string
     */
    public $changeStatus;
    protected $_name = [
        'appName'      => 'app_name',
        'blackGroupId' => 'black_group_id',
        'blackState'   => 'black_state',
        'dataId'       => 'data_id',
        'gmtCreate'    => 'gmt_create',
        'gmtModified'  => 'gmt_modified',
        'id'           => 'id',
        'instanceId'   => 'instance_id',
        'operator'     => 'operator',
        'rules'        => 'rules',
        'status'       => 'status',
        'whiteGroupId' => 'white_group_id',
        'whiteState'   => 'white_state',
        'changeStatus' => 'change_status',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->blackGroupId) {
            $res['black_group_id'] = $this->blackGroupId;
        }
        if (null !== $this->blackState) {
            $res['black_state'] = $this->blackState;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->whiteGroupId) {
            $res['white_group_id'] = $this->whiteGroupId;
        }
        if (null !== $this->whiteState) {
            $res['white_state'] = $this->whiteState;
        }
        if (null !== $this->changeStatus) {
            $res['change_status'] = $this->changeStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthRuleGroupListModelVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['black_group_id'])) {
            $model->blackGroupId = $map['black_group_id'];
        }
        if (isset($map['black_state'])) {
            $model->blackState = $map['black_state'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
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
                    $model->rules[$n++] = null !== $item ? AuthRuleModelVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['white_group_id'])) {
            $model->whiteGroupId = $map['white_group_id'];
        }
        if (isset($map['white_state'])) {
            $model->whiteState = $map['white_state'];
        }
        if (isset($map['change_status'])) {
            $model->changeStatus = $map['change_status'];
        }

        return $model;
    }
}
