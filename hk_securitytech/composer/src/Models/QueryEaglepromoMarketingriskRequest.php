<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryEaglepromoMarketingriskRequest extends Model
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

    // security_data
    /**
     * @var MarketingRiskSecurityData
     */
    public $securityData;

    // sign_factor
    /**
     * @var string
     */
    public $signFactor;

    // client_id
    /**
     * @var string
     */
    public $clientId;

    // request_id
    /**
     * @var string
     */
    public $requestId;

    // biz_code
    /**
     * @var string
     */
    public $bizCode;

    // terminal_type
    /**
     * @var string
     */
    public $terminalType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'securityData'      => 'security_data',
        'signFactor'        => 'sign_factor',
        'clientId'          => 'client_id',
        'requestId'         => 'request_id',
        'bizCode'           => 'biz_code',
        'terminalType'      => 'terminal_type',
    ];

    public function validate()
    {
        Model::validateRequired('securityData', $this->securityData, true);
        Model::validateRequired('signFactor', $this->signFactor, true);
        Model::validateRequired('clientId', $this->clientId, true);
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
        if (null !== $this->securityData) {
            $res['security_data'] = null !== $this->securityData ? $this->securityData->toMap() : null;
        }
        if (null !== $this->signFactor) {
            $res['sign_factor'] = $this->signFactor;
        }
        if (null !== $this->clientId) {
            $res['client_id'] = $this->clientId;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->terminalType) {
            $res['terminal_type'] = $this->terminalType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryEaglepromoMarketingriskRequest
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
        if (isset($map['security_data'])) {
            $model->securityData = MarketingRiskSecurityData::fromMap($map['security_data']);
        }
        if (isset($map['sign_factor'])) {
            $model->signFactor = $map['sign_factor'];
        }
        if (isset($map['client_id'])) {
            $model->clientId = $map['client_id'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['terminal_type'])) {
            $model->terminalType = $map['terminal_type'];
        }

        return $model;
    }
}
