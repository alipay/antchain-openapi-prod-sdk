<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class CheckSpProductOrderparameterRequest extends Model
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

    // 加载业务的场景。具体内容同产品方定义，但产品下需保证唯一。
    /**
     * @var string
     */
    public $businessAction;

    // 用于加载对应场景数据的上下文（JSON格式具体同产品方定义）
    /**
     * @var string
     */
    public $businessContext;

    // 业务流水号。
    /**
     * @var string
     */
    public $orderNo;

    // 商品的渠道产品码
    /**
     * @var string
     */
    public $productCode;

    // 地域。支持不同地域显示不同内容。
    /**
     * @var string
     */
    public $region;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 需要校验的数据
    /**
     * @var string
     */
    public $input;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productAccessCode' => 'product_access_code',
        'businessAction'    => 'business_action',
        'businessContext'   => 'business_context',
        'orderNo'           => 'order_no',
        'productCode'       => 'product_code',
        'region'            => 'region',
        'tenantId'          => 'tenant_id',
        'input'             => 'input',
    ];

    public function validate()
    {
        Model::validateRequired('businessAction', $this->businessAction, true);
        Model::validateRequired('businessContext', $this->businessContext, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('input', $this->input, true);
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
        if (null !== $this->businessAction) {
            $res['business_action'] = $this->businessAction;
        }
        if (null !== $this->businessContext) {
            $res['business_context'] = $this->businessContext;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->input) {
            $res['input'] = $this->input;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckSpProductOrderparameterRequest
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
        if (isset($map['business_action'])) {
            $model->businessAction = $map['business_action'];
        }
        if (isset($map['business_context'])) {
            $model->businessContext = $map['business_context'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['input'])) {
            $model->input = $map['input'];
        }

        return $model;
    }
}
