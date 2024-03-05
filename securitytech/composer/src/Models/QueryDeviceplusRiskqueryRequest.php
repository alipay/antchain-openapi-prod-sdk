<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryDeviceplusRiskqueryRequest extends Model
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

    // 客户id
    /**
     * @var string
     */
    public $clientId;

    // 场景码
    /**
     * @var string
     */
    public $sceneCode;

    // 加密电话号码
    /**
     * @var string
     */
    public $phoneNumber;

    // 电话号码加密类型, 明文: 0; MD5加密: 1; SHA256: 2
    /**
     * @var string
     */
    public $phoneNumberType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'clientId'          => 'client_id',
        'sceneCode'         => 'scene_code',
        'phoneNumber'       => 'phone_number',
        'phoneNumberType'   => 'phone_number_type',
    ];

    public function validate()
    {
        Model::validateRequired('clientId', $this->clientId, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('phoneNumber', $this->phoneNumber, true);
        Model::validateRequired('phoneNumberType', $this->phoneNumberType, true);
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
        if (null !== $this->clientId) {
            $res['client_id'] = $this->clientId;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->phoneNumberType) {
            $res['phone_number_type'] = $this->phoneNumberType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDeviceplusRiskqueryRequest
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
        if (isset($map['client_id'])) {
            $model->clientId = $map['client_id'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['phone_number_type'])) {
            $model->phoneNumberType = $map['phone_number_type'];
        }

        return $model;
    }
}
