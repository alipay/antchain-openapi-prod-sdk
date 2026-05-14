<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class GetAasButleragentChaturlRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求唯一流水号
    /**
     * @var string
     */
    public $requestId;

    // 您方待认证信息
    /**
     * @var string
     */
    public $customerAuthInfo;

    // 产品编码
    /**
     * @var string
     */
    public $productCode;
    protected $_name = [
        'authToken'        => 'auth_token',
        'requestId'        => 'request_id',
        'customerAuthInfo' => 'customer_auth_info',
        'productCode'      => 'product_code',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('customerAuthInfo', $this->customerAuthInfo, true);
        Model::validateRequired('productCode', $this->productCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->customerAuthInfo) {
            $res['customer_auth_info'] = $this->customerAuthInfo;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAasButleragentChaturlRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['customer_auth_info'])) {
            $model->customerAuthInfo = $map['customer_auth_info'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }

        return $model;
    }
}
