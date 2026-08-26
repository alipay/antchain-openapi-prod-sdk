<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class CancelAntcloudTradeComboRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'comboOrderId' => 'combo_order_id',
        'tenantId' => 'tenant_id',
    ];
    public function validate() {
        Model::validateRequired('comboOrderId', $this->comboOrderId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->comboOrderId) {
            $res['combo_order_id'] = $this->comboOrderId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CancelAntcloudTradeComboRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['combo_order_id'])){
            $model->comboOrderId = $map['combo_order_id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 套餐订单ID
    /**
     * @var string
     */
    public $comboOrderId;

    // 租户ID，用于校验订单归属和操作权限
    /**
     * @var string
     */
    public $tenantId;

}
