<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INDUSTRY\Models;

use AlibabaCloud\Tea\Model;

class QueryMerchantSignRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // source, 由中台为业务方分配, 标识业务来源
    /**
     * @var string
     */
    public $source;

    // 申请单id, 跟merchant_user_id不能同时为空
    /**
     * @var string
     */
    public $orderId;

    // 平台方下的用户id, 保持唯一，跟order_id不能同时为空; 如果只传该字段, 获取该用户id的最新一次进件结果
    /**
     * @var string
     */
    public $merchantUserId;
    protected $_name = [
        'authToken'      => 'auth_token',
        'source'         => 'source',
        'orderId'        => 'order_id',
        'merchantUserId' => 'merchant_user_id',
    ];

    public function validate()
    {
        Model::validateRequired('source', $this->source, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->merchantUserId) {
            $res['merchant_user_id'] = $this->merchantUserId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMerchantSignRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['merchant_user_id'])) {
            $model->merchantUserId = $map['merchant_user_id'];
        }

        return $model;
    }
}
