<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class NotifyInterestSupplierpolicyRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 请求流水号，每次推送需要唯一
    /**
     * @var string
     */
    public $requestNo;

    // 我方权益申请流水号
    /**
     * @var string
     */
    public $interestNo;

    // 保单信息 json字符串
    /**
     * @var string
     */
    public $policyInfo;
    protected $_name = [
        'authToken'  => 'auth_token',
        'requestNo'  => 'request_no',
        'interestNo' => 'interest_no',
        'policyInfo' => 'policy_info',
    ];

    public function validate()
    {
        Model::validateRequired('requestNo', $this->requestNo, true);
        Model::validateRequired('interestNo', $this->interestNo, true);
        Model::validateRequired('policyInfo', $this->policyInfo, true);
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
        if (null !== $this->policyInfo) {
            $res['policy_info'] = $this->policyInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyInterestSupplierpolicyRequest
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
        if (isset($map['policy_info'])) {
            $model->policyInfo = $map['policy_info'];
        }

        return $model;
    }
}
