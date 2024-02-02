<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryMeteringItemRequest extends Model
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

    // 商业产品码
    /**
     * @var string
     */
    public $businessCode;

    // 计量域
    /**
     * @var string
     */
    public $meteringDomainCode;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'businessCode'       => 'business_code',
        'meteringDomainCode' => 'metering_domain_code',
    ];

    public function validate()
    {
        Model::validateRequired('businessCode', $this->businessCode, true);
        Model::validateRequired('meteringDomainCode', $this->meteringDomainCode, true);
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
        if (null !== $this->businessCode) {
            $res['business_code'] = $this->businessCode;
        }
        if (null !== $this->meteringDomainCode) {
            $res['metering_domain_code'] = $this->meteringDomainCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMeteringItemRequest
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
        if (isset($map['business_code'])) {
            $model->businessCode = $map['business_code'];
        }
        if (isset($map['metering_domain_code'])) {
            $model->meteringDomainCode = $map['metering_domain_code'];
        }

        return $model;
    }
}
