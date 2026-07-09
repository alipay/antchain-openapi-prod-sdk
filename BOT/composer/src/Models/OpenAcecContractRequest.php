<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class OpenAcecContractRequest extends Model
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

    // 订单号
    /**
     * @var string
     */
    public $orderNo;

    // 产品码，全局唯一
    /**
     * @var string
     */
    public $productCode;

    // 开通产品的租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 实例Id
    /**
     * @var string
     */
    public $instanceId;

    // 服务接入码
    /**
     * @var string
     */
    public $accessCode;

    // 用户自定义数据
    /**
     * @var string
     */
    public $customData;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNo'           => 'order_no',
        'productCode'       => 'product_code',
        'tenantId'          => 'tenant_id',
        'instanceId'        => 'instance_id',
        'accessCode'        => 'access_code',
        'customData'        => 'custom_data',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('accessCode', $this->accessCode, true);
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
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->accessCode) {
            $res['access_code'] = $this->accessCode;
        }
        if (null !== $this->customData) {
            $res['custom_data'] = $this->customData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpenAcecContractRequest
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
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['access_code'])) {
            $model->accessCode = $map['access_code'];
        }
        if (isset($map['custom_data'])) {
            $model->customData = $map['custom_data'];
        }

        return $model;
    }
}
