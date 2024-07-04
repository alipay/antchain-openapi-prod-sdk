<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class RetryInnerOrdermsgRequest extends Model
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

    // 租户ID
    /**
     * @var string
     */
    public $tenantId;

    // SANDBOX 沙箱 PROD 生产
    /**
     * @var string
     */
    public $env;

    // 订单id
    //
    /**
     * @var string
     */
    public $orderId;

    // 消息ID
    //
    /**
     * @var string
     */
    public $msgId;

    // 使用租户新回调地址
    /**
     * @var bool
     */
    public $usingNewCallbackUrl;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'tenantId'            => 'tenant_id',
        'env'                 => 'env',
        'orderId'             => 'order_id',
        'msgId'               => 'msg_id',
        'usingNewCallbackUrl' => 'using_new_callback_url',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('env', $this->env, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('msgId', $this->msgId, true);
        Model::validateRequired('usingNewCallbackUrl', $this->usingNewCallbackUrl, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->msgId) {
            $res['msg_id'] = $this->msgId;
        }
        if (null !== $this->usingNewCallbackUrl) {
            $res['using_new_callback_url'] = $this->usingNewCallbackUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RetryInnerOrdermsgRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['env'])) {
            $model->env = $map['env'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['msg_id'])) {
            $model->msgId = $map['msg_id'];
        }
        if (isset($map['using_new_callback_url'])) {
            $model->usingNewCallbackUrl = $map['using_new_callback_url'];
        }

        return $model;
    }
}
