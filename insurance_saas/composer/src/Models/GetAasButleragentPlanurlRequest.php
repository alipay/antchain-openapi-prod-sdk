<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class GetAasButleragentPlanurlRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 产品编码
    /**
     * @var string
     */
    public $productCode;

    // 业务请求唯一标识
    /**
     * @var string
     */
    public $requestId;

    // 方案唯一标识
    /**
     * @var string
     */
    public $planNo;

    // 生成计划书时的用户唯一标识
    /**
     * @var string
     */
    public $customerId;
    protected $_name = [
        'authToken'   => 'auth_token',
        'productCode' => 'product_code',
        'requestId'   => 'request_id',
        'planNo'      => 'plan_no',
        'customerId'  => 'customer_id',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('planNo', $this->planNo, true);
        Model::validateRequired('customerId', $this->customerId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->planNo) {
            $res['plan_no'] = $this->planNo;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAasButleragentPlanurlRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['plan_no'])) {
            $model->planNo = $map['plan_no'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }

        return $model;
    }
}
