<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ConfirmContractMerchantRequest extends Model
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

    // 商户入驻查询订单id
    /**
     * @var string
     */
    public $orderId;

    // 代理商户账户ID，此参数不填默认平台机构账户入驻
    /**
     * @var string
     */
    public $agentAccountId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'agentAccountId'    => 'agent_account_id',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->agentAccountId) {
            $res['agent_account_id'] = $this->agentAccountId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmContractMerchantRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['agent_account_id'])) {
            $model->agentAccountId = $map['agent_account_id'];
        }

        return $model;
    }
}
