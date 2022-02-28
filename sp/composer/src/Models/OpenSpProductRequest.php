<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class OpenSpProductRequest extends Model
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

    /**
     * @var string
     */
    public $productAccessCode;

    // 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
    /**
     * @var string
     */
    public $orderNo;

    // 产品码 全局唯一
    /**
     * @var string
     */
    public $productCode;

    // 开通产品的租户
    /**
     * @var string
     */
    public $tenant;

    // 产品实例ID
    /**
     * @var string
     */
    public $instanceId;

    // 支持透传给产品非生产规格的自定义数据（JSON格式并按key排序）
    /**
     * @var string
     */
    public $customData;

    // 开通产品的租户ID，格式为2088XXXXXXXXXXXX
    /**
     * @var string
     */
    public $tenantId;

    // 服务接入码，产品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
    /**
     * @var string
     */
    public $accessCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productAccessCode' => 'product_access_code',
        'orderNo'           => 'order_no',
        'productCode'       => 'product_code',
        'tenant'            => 'tenant',
        'instanceId'        => 'instance_id',
        'customData'        => 'custom_data',
        'tenantId'          => 'tenant_id',
        'accessCode'        => 'access_code',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('tenant', $this->tenant, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('accessCode', $this->accessCode, true);
        Model::validateMaxLength('orderNo', $this->orderNo, 64);
        Model::validateMaxLength('productCode', $this->productCode, 20);
        Model::validateMaxLength('tenant', $this->tenant, 8);
        Model::validateMaxLength('instanceId', $this->instanceId, 50);
        Model::validateMaxLength('tenantId', $this->tenantId, 16);
        Model::validateMaxLength('accessCode', $this->accessCode, 24);
        Model::validateMinLength('orderNo', $this->orderNo, 32);
        Model::validateMinLength('productCode', $this->productCode, 3);
        Model::validateMinLength('tenant', $this->tenant, 8);
        Model::validateMinLength('instanceId', $this->instanceId, 20);
        Model::validateMinLength('tenantId', $this->tenantId, 16);
        Model::validateMinLength('accessCode', $this->accessCode, 3);
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
        if (null !== $this->productAccessCode) {
            $res['product_access_code'] = $this->productAccessCode;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->customData) {
            $res['custom_data'] = $this->customData;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->accessCode) {
            $res['access_code'] = $this->accessCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpenSpProductRequest
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
        if (isset($map['product_access_code'])) {
            $model->productAccessCode = $map['product_access_code'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['custom_data'])) {
            $model->customData = $map['custom_data'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['access_code'])) {
            $model->accessCode = $map['access_code'];
        }

        return $model;
    }
}
