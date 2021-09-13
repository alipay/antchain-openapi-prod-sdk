<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class CreateComboOrderRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 场景接入码，中台分配
    /**
     * @var string
     */
    public $sceneCode;

    // 业务流水号，用于幂等
    /**
     * @var string
     */
    public $bizNo;

    // 套餐编码
    /**
     * @var string
     */
    public $comboCode;

    // 租户ID，和租户名二选一必填
    //
    /**
     * @var string
     */
    public $tenantId;

    // 8位租户名，和租户ID二选一必填
    //
    /**
     * @var string
     */
    public $tenantName;

    // 操作人ID，为空则等于当前租户ID
    /**
     * @var string
     */
    public $operatorId;

    // 订购周期，当套餐中包含包周期型的商品，必填
    /**
     * @var OrderDuration
     */
    public $duration;

    // 优惠券ID
    /**
     * @var string
     */
    public $couponId;

    // [{"instance_key":"isvId","instance_value":"邀请码},{"instance_key":"policyId","instance_value":"政策id}]
    /**
     * @var InstanceLabel[]
     */
    public $instanceLabels;
    protected $_name = [
        'authToken'      => 'auth_token',
        'sceneCode'      => 'scene_code',
        'bizNo'          => 'biz_no',
        'comboCode'      => 'combo_code',
        'tenantId'       => 'tenant_id',
        'tenantName'     => 'tenant_name',
        'operatorId'     => 'operator_id',
        'duration'       => 'duration',
        'couponId'       => 'coupon_id',
        'instanceLabels' => 'instance_labels',
    ];

    public function validate()
    {
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('bizNo', $this->bizNo, true);
        Model::validateRequired('comboCode', $this->comboCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->comboCode) {
            $res['combo_code'] = $this->comboCode;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->duration) {
            $res['duration'] = null !== $this->duration ? $this->duration->toMap() : null;
        }
        if (null !== $this->couponId) {
            $res['coupon_id'] = $this->couponId;
        }
        if (null !== $this->instanceLabels) {
            $res['instance_labels'] = [];
            if (null !== $this->instanceLabels && \is_array($this->instanceLabels)) {
                $n = 0;
                foreach ($this->instanceLabels as $item) {
                    $res['instance_labels'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateComboOrderRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['combo_code'])) {
            $model->comboCode = $map['combo_code'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }
        if (isset($map['duration'])) {
            $model->duration = OrderDuration::fromMap($map['duration']);
        }
        if (isset($map['coupon_id'])) {
            $model->couponId = $map['coupon_id'];
        }
        if (isset($map['instance_labels'])) {
            if (!empty($map['instance_labels'])) {
                $model->instanceLabels = [];
                $n                     = 0;
                foreach ($map['instance_labels'] as $item) {
                    $model->instanceLabels[$n++] = null !== $item ? InstanceLabel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
