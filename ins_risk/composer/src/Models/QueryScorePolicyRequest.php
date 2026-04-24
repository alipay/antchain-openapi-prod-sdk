<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INS_RISK\Models;

use AlibabaCloud\Tea\Model;

class QueryScorePolicyRequest extends Model
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

    // 请求流水号，保证唯一
    /**
     * @var string
     */
    public $requestId;

    // 业务编码
    /**
     * @var string
     */
    public $businessCode;

    // 产品编码
    /**
     * @var string
     */
    public $expectProductCode;

    // 请求参数
    /**
     * @var string
     */
    public $params;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestId'         => 'request_id',
        'businessCode'      => 'business_code',
        'expectProductCode' => 'expect_product_code',
        'params'            => 'params',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('businessCode', $this->businessCode, true);
        Model::validateRequired('expectProductCode', $this->expectProductCode, true);
        Model::validateRequired('params', $this->params, true);
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
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->businessCode) {
            $res['business_code'] = $this->businessCode;
        }
        if (null !== $this->expectProductCode) {
            $res['expect_product_code'] = $this->expectProductCode;
        }
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryScorePolicyRequest
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
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['business_code'])) {
            $model->businessCode = $map['business_code'];
        }
        if (isset($map['expect_product_code'])) {
            $model->expectProductCode = $map['expect_product_code'];
        }
        if (isset($map['params'])) {
            $model->params = $map['params'];
        }

        return $model;
    }
}
