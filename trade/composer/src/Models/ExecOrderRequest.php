<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class ExecOrderRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 订单号
    /**
     * @var string
     */
    public $orderId;

    // 租户标识
    /**
     * @var string
     */
    public $tenantId;

    // 开通参数
    /**
     * @var ProvisionOption
     */
    public $provisionOptions;
    protected $_name = [
        'authToken'        => 'auth_token',
        'orderId'          => 'order_id',
        'tenantId'         => 'tenant_id',
        'provisionOptions' => 'provision_options',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->provisionOptions) {
            $res['provision_options'] = null !== $this->provisionOptions ? $this->provisionOptions->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecOrderRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['provision_options'])) {
            $model->provisionOptions = ProvisionOption::fromMap($map['provision_options']);
        }

        return $model;
    }
}
