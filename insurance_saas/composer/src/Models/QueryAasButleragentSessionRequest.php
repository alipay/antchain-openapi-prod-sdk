<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryAasButleragentSessionRequest extends Model
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

    // 请求唯一标识
    /**
     * @var string
     */
    public $requestId;

    // 客户唯一标识
    /**
     * @var string
     */
    public $customerId;

    // 查询会话起始时间
    /**
     * @var string
     */
    public $startTime;

    // 查询会话结束时间
    /**
     * @var string
     */
    public $endTime;
    protected $_name = [
        'authToken'   => 'auth_token',
        'productCode' => 'product_code',
        'requestId'   => 'request_id',
        'customerId'  => 'customer_id',
        'startTime'   => 'start_time',
        'endTime'     => 'end_time',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('customerId', $this->customerId, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
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
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAasButleragentSessionRequest
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
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }

        return $model;
    }
}
