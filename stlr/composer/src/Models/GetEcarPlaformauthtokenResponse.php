<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class GetEcarPlaformauthtokenResponse extends Model
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

    // 三方平台客户ID
    /**
     * @var string
     */
    public $customerId;

    // 碳账户编号，碳矩阵为客户分配的碳账户编号
    /**
     * @var string
     */
    public $carbonAccountNo;

    // 授权三方平台客户信登的TOKEN
    /**
     * @var string
     */
    public $accessToken;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'customerId'      => 'customer_id',
        'carbonAccountNo' => 'carbon_account_no',
        'accessToken'     => 'access_token',
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
        if (null !== $this->carbonAccountNo) {
            $res['carbon_account_no'] = $this->carbonAccountNo;
        }
        if (null !== $this->accessToken) {
            $res['access_token'] = $this->accessToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetEcarPlaformauthtokenResponse
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
        if (isset($map['carbon_account_no'])) {
            $model->carbonAccountNo = $map['carbon_account_no'];
        }
        if (isset($map['access_token'])) {
            $model->accessToken = $map['access_token'];
        }

        return $model;
    }
}
