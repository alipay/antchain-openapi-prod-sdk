<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models;

use AlibabaCloud\Tea\Model;

class CreateAntchainBbpCustomerResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 统一客户ID
    /**
     * @var string
     */
    public $customerId;

    // 统一账户ID
    /**
     * @var string
     */
    public $accId;

    // 客户认证结果
    /**
     * @var CustomerAuthResult
     */
    public $authFourElementsResponse;
    protected $_name = [
        'reqMsgId'                 => 'req_msg_id',
        'resultCode'               => 'result_code',
        'resultMsg'                => 'result_msg',
        'customerId'               => 'customer_id',
        'accId'                    => 'acc_id',
        'authFourElementsResponse' => 'auth_four_elements_response',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->accId) {
            $res['acc_id'] = $this->accId;
        }
        if (null !== $this->authFourElementsResponse) {
            $res['auth_four_elements_response'] = null !== $this->authFourElementsResponse ? $this->authFourElementsResponse->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAntchainBbpCustomerResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['acc_id'])) {
            $model->accId = $map['acc_id'];
        }
        if (isset($map['auth_four_elements_response'])) {
            $model->authFourElementsResponse = CustomerAuthResult::fromMap($map['auth_four_elements_response']);
        }

        return $model;
    }
}
