<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class CallbackMarketingPolicycancelRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求 id
    /**
     * @var string
     */
    public $requestId;

    // 保单号（可脱敏处理）
    /**
     * @var string
     */
    public $policyNo;

    // 退保时间（yyyy-MM-dd  HH:mm:ss）
    /**
     * @var string
     */
    public $cancelTime;

    // 保险止期（yyyy-MM-dd  HH:mm:ss）
    /**
     * @var string
     */
    public $endTime;
    protected $_name = [
        'authToken'  => 'auth_token',
        'requestId'  => 'request_id',
        'policyNo'   => 'policy_no',
        'cancelTime' => 'cancel_time',
        'endTime'    => 'end_time',
    ];

    public function validate()
    {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('policyNo', $this->policyNo, true);
        Model::validateRequired('cancelTime', $this->cancelTime, true);
        Model::validateRequired('endTime', $this->endTime, true);
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
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->cancelTime) {
            $res['cancel_time'] = $this->cancelTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackMarketingPolicycancelRequest
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
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['cancel_time'])) {
            $model->cancelTime = $map['cancel_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }

        return $model;
    }
}
