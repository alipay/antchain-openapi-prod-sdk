<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class AuthFundCreditgrantingRequest extends Model
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

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 商户统一社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 资方统一社会信用代码
    /**
     * @var string
     */
    public $fundId;

    // 授权id
    /**
     * @var string
     */
    public $authId;

    // 授权开始时间，格式为yyyy-MM-dd
    /**
     * @var string
     */
    public $authBeginTime;

    // 授权结束时间，格式为yyyy-MM-dd
    /**
     * @var string
     */
    public $authEndTime;

    // 订单查询开始时间，格式为yyyy-MM-dd HH:mm:ss，需要在auth_begin_time之后。
    /**
     * @var string
     */
    public $orderQueryBegin;

    // 订单查询结束时间，格式为yyyy-MM-dd HH:mm:ss，需要在auth_end_time之前
    /**
     * @var string
     */
    public $orderQueryEnd;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'merchantId'        => 'merchant_id',
        'fundId'            => 'fund_id',
        'authId'            => 'auth_id',
        'authBeginTime'     => 'auth_begin_time',
        'authEndTime'       => 'auth_end_time',
        'orderQueryBegin'   => 'order_query_begin',
        'orderQueryEnd'     => 'order_query_end',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('authId', $this->authId, true);
        Model::validateRequired('authBeginTime', $this->authBeginTime, true);
        Model::validateRequired('authEndTime', $this->authEndTime, true);
        Model::validateRequired('orderQueryBegin', $this->orderQueryBegin, true);
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
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->authId) {
            $res['auth_id'] = $this->authId;
        }
        if (null !== $this->authBeginTime) {
            $res['auth_begin_time'] = $this->authBeginTime;
        }
        if (null !== $this->authEndTime) {
            $res['auth_end_time'] = $this->authEndTime;
        }
        if (null !== $this->orderQueryBegin) {
            $res['order_query_begin'] = $this->orderQueryBegin;
        }
        if (null !== $this->orderQueryEnd) {
            $res['order_query_end'] = $this->orderQueryEnd;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthFundCreditgrantingRequest
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
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['auth_id'])) {
            $model->authId = $map['auth_id'];
        }
        if (isset($map['auth_begin_time'])) {
            $model->authBeginTime = $map['auth_begin_time'];
        }
        if (isset($map['auth_end_time'])) {
            $model->authEndTime = $map['auth_end_time'];
        }
        if (isset($map['order_query_begin'])) {
            $model->orderQueryBegin = $map['order_query_begin'];
        }
        if (isset($map['order_query_end'])) {
            $model->orderQueryEnd = $map['order_query_end'];
        }

        return $model;
    }
}
