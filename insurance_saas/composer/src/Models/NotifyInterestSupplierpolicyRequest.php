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

    // 权益订单号
    /**
     * @var string
     */
    public $orderNo;

    // 保单信息 json字符串
    /**
     * @var string
     */
    public $policyInfo;
    protected $_name = [
        'authToken'  => 'auth_token',
        'requestNo'  => 'request_no',
        'orderNo'    => 'order_no',
        'policyInfo' => 'policy_info',
    ];

    public function validate()
    {
        Model::validateRequired('requestNo', $this->requestNo, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
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
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
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
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['policy_info'])) {
            $model->policyInfo = $map['policy_info'];
        }

        return $model;
    }
}
