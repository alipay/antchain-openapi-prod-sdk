<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryIpTwcaccountResponse extends Model
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

    // 机构账号
    /**
     * @var string
     */
    public $organizationId;

    // 用户类型为个人时返回用户账号；用户类型为机构时返回经办人账号
    /**
     * @var string
     */
    public $userId;

    // 是否签署了静默授权
    /**
     * @var bool
     */
    public $silentlySign;

    // 账户链上ID
    /**
     * @var string
     */
    public $accountId;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'organizationId' => 'organization_id',
        'userId'         => 'user_id',
        'silentlySign'   => 'silently_sign',
        'accountId'      => 'account_id',
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
        if (null !== $this->organizationId) {
            $res['organization_id'] = $this->organizationId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->silentlySign) {
            $res['silently_sign'] = $this->silentlySign;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIpTwcaccountResponse
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
        if (isset($map['organization_id'])) {
            $model->organizationId = $map['organization_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['silently_sign'])) {
            $model->silentlySign = $map['silently_sign'];
        }
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }

        return $model;
    }
}
