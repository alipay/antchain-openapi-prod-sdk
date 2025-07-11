<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryInterestSceneorderRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求流水号
    /**
     * @var string
     */
    public $requestNo;

    // 我方权益申请流水号
    /**
     * @var string
     */
    public $interestNo;

    // 产品编码
    /**
     * @var string
     */
    public $productCode;
    protected $_name = [
        'authToken'   => 'auth_token',
        'requestNo'   => 'request_no',
        'interestNo'  => 'interest_no',
        'productCode' => 'product_code',
    ];

    public function validate()
    {
        Model::validateRequired('requestNo', $this->requestNo, true);
        Model::validateRequired('interestNo', $this->interestNo, true);
        Model::validateRequired('productCode', $this->productCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->requestNo) {
            $res['request_no'] = $this->requestNo;
        }
        if (null !== $this->interestNo) {
            $res['interest_no'] = $this->interestNo;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInterestSceneorderRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['request_no'])) {
            $model->requestNo = $map['request_no'];
        }
        if (isset($map['interest_no'])) {
            $model->interestNo = $map['interest_no'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }

        return $model;
    }
}
