<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInsureRequest extends Model
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

    // 商户的订单号
    /**
     * @var string
     */
    public $orderId;

    // 保险类型枚举，PERFORMANCE：履约
    /**
     * @var string
     */
    public $insureProductType;

    // 保险公司枚举，PA：平安保险
    /**
     * @var string
     */
    public $insureCompanyType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'insureProductType' => 'insure_product_type',
        'insureCompanyType' => 'insure_company_type',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('insureProductType', $this->insureProductType, true);
        Model::validateRequired('insureCompanyType', $this->insureCompanyType, true);
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
        if (null !== $this->insureProductType) {
            $res['insure_product_type'] = $this->insureProductType;
        }
        if (null !== $this->insureCompanyType) {
            $res['insure_company_type'] = $this->insureCompanyType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInsureRequest
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
        if (isset($map['insure_product_type'])) {
            $model->insureProductType = $map['insure_product_type'];
        }
        if (isset($map['insure_company_type'])) {
            $model->insureCompanyType = $map['insure_company_type'];
        }

        return $model;
    }
}
