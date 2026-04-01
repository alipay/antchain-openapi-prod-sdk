<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INS_RISK\Models;

use AlibabaCloud\Tea\Model;

class QuerySecurityPolicyRequest extends Model
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

    // l1_domain_code
    /**
     * @var string
     */
    public $l1DomainCode;

    // l2_domain_code
    /**
     * @var string
     */
    public $l2DomainCode;

    // 请求流水号
    /**
     * @var string
     */
    public $requestId;

    // 业务code
    /**
     * @var string
     */
    public $businessCode;

    // expectProductCodes
    /**
     * @var string[]
     */
    public $expectProductCodes;

    // 参数
    /**
     * @var string
     */
    public $params;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'l1DomainCode'       => 'l1_domain_code',
        'l2DomainCode'       => 'l2_domain_code',
        'requestId'          => 'request_id',
        'businessCode'       => 'business_code',
        'expectProductCodes' => 'expect_product_codes',
        'params'             => 'params',
    ];

    public function validate()
    {
        Model::validateRequired('l1DomainCode', $this->l1DomainCode, true);
        Model::validateRequired('l2DomainCode', $this->l2DomainCode, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('businessCode', $this->businessCode, true);
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
        if (null !== $this->l1DomainCode) {
            $res['l1_domain_code'] = $this->l1DomainCode;
        }
        if (null !== $this->l2DomainCode) {
            $res['l2_domain_code'] = $this->l2DomainCode;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->businessCode) {
            $res['business_code'] = $this->businessCode;
        }
        if (null !== $this->expectProductCodes) {
            $res['expect_product_codes'] = $this->expectProductCodes;
        }
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySecurityPolicyRequest
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
        if (isset($map['l1_domain_code'])) {
            $model->l1DomainCode = $map['l1_domain_code'];
        }
        if (isset($map['l2_domain_code'])) {
            $model->l2DomainCode = $map['l2_domain_code'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['business_code'])) {
            $model->businessCode = $map['business_code'];
        }
        if (isset($map['expect_product_codes'])) {
            if (!empty($map['expect_product_codes'])) {
                $model->expectProductCodes = $map['expect_product_codes'];
            }
        }
        if (isset($map['params'])) {
            $model->params = $map['params'];
        }

        return $model;
    }
}
