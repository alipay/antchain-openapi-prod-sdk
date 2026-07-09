<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class UpdateAlertStrategyRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 主键ID，更新依据
    /**
     * @var int
     */
    public $id;

    // 租户
    /**
     * @var string
     */
    public $tenantName;

    // 场景码
    //
    /**
     * @var string
     */
    public $scene;

    // 策略类型：DEBUG（技术联调）；MONITOR（生产监控）
    /**
     * @var string
     */
    public $strategyType;

    // 策略详情，json格式
    /**
     * @var string
     */
    public $strategyDetail;

    // 是否启用，默认false
    /**
     * @var bool
     */
    public $enabled;

    // 备注
    //
    /**
     * @var string
     */
    public $remark;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'tenantName'        => 'tenant_name',
        'scene'             => 'scene',
        'strategyType'      => 'strategy_type',
        'strategyDetail'    => 'strategy_detail',
        'enabled'           => 'enabled',
        'remark'            => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('enabled', $this->enabled, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
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
     * @return UpdateAlertStrategyRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
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
