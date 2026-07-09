<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class AlertStrategy extends Model
{
    // 主键ID
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

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

    // 租户
    /**
     * @example alipay
     *
     * @var string
     */
    public $tenantName;

    // 场景码
    //
    /**
     * @example alipay-0101
     *
     * @var string
     */
    public $scene;

    // 策略类型：DEBUG（技术联调）；MONITOR（生产监控）
    /**
     * @example MONITOR
     *
     * @var string
     */
    public $strategyType;

    // 策略详情，json格式
    /**
     * @example [{  "alert_method": "DING_TALK",   "addresses": "",  "alert_strategy": "",   "params": {     "fail_days" : 10   } }, {  "alert_method": "EMAIL",   "addresses": "",  "alert_strategy": "",  "params": {       } }]
     *
     * @var string
     */
    public $strategyDetail;

    // 是否启用，默认false
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enabled;

    // 备注
    /**
     * @example 这是一条测试数据
     *
     * @var string
     */
    public $remark;
    protected $_name = [
        'id'             => 'id',
        'gmtCreate'      => 'gmt_create',
        'gmtModified'    => 'gmt_modified',
        'tenantName'     => 'tenant_name',
        'scene'          => 'scene',
        'strategyType'   => 'strategy_type',
        'strategyDetail' => 'strategy_detail',
        'enabled'        => 'enabled',
        'remark'         => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('tenantName', $this->tenantName, true);
        Model::validateRequired('strategyType', $this->strategyType, true);
        Model::validateRequired('strategyDetail', $this->strategyDetail, true);
        Model::validateRequired('enabled', $this->enabled, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->strategyType) {
            $res['strategy_type'] = $this->strategyType;
        }
        if (null !== $this->strategyDetail) {
            $res['strategy_detail'] = $this->strategyDetail;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AlertStrategy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['strategy_type'])) {
            $model->strategyType = $map['strategy_type'];
        }
        if (isset($map['strategy_detail'])) {
            $model->strategyDetail = $map['strategy_detail'];
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }

        return $model;
    }
}
