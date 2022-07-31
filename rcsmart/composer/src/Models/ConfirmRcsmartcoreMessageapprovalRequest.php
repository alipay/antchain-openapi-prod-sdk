<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RCSMART\Models;

use AlibabaCloud\Tea\Model;

class ConfirmRcsmartcoreMessageapprovalRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求ID
    /**
     * @var string
     */
    public $requestId;

    // 商户ID
    /**
     * @var string
     */
    public $merchantId;

    // 规格code
    /**
     * @var string
     */
    public $specCode;

    // 审核场景
    /**
     * @var string
     */
    public $scene;

    // xxxx
    /**
     * @var MessageDataVO
     */
    public $messageData;
    protected $_name = [
        'authToken'   => 'auth_token',
        'requestId'   => 'request_id',
        'merchantId'  => 'merchant_id',
        'specCode'    => 'spec_code',
        'scene'       => 'scene',
        'messageData' => 'message_data',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('specCode', $this->specCode, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('messageData', $this->messageData, true);
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
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->specCode) {
            $res['spec_code'] = $this->specCode;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->messageData) {
            $res['message_data'] = null !== $this->messageData ? $this->messageData->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmRcsmartcoreMessageapprovalRequest
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
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['spec_code'])) {
            $model->specCode = $map['spec_code'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['message_data'])) {
            $model->messageData = MessageDataVO::fromMap($map['message_data']);
        }

        return $model;
    }
}
