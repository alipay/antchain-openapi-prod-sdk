<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class QueryCpfUserResponse extends Model
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

    // 个人账户信息
    /**
     * @var CpfUserAccountInfo[]
     */
    public $userAccountInfo;

    // 贷款信息
    /**
     * @var CpfUserLoanInfo[]
     */
    public $userLoanInfo;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'userAccountInfo' => 'user_account_info',
        'userLoanInfo'    => 'user_loan_info',
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
        if (null !== $this->userAccountInfo) {
            $res['user_account_info'] = [];
            if (null !== $this->userAccountInfo && \is_array($this->userAccountInfo)) {
                $n = 0;
                foreach ($this->userAccountInfo as $item) {
                    $res['user_account_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->userLoanInfo) {
            $res['user_loan_info'] = [];
            if (null !== $this->userLoanInfo && \is_array($this->userLoanInfo)) {
                $n = 0;
                foreach ($this->userLoanInfo as $item) {
                    $res['user_loan_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCpfUserResponse
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
        if (isset($map['user_account_info'])) {
            if (!empty($map['user_account_info'])) {
                $model->userAccountInfo = [];
                $n                      = 0;
                foreach ($map['user_account_info'] as $item) {
                    $model->userAccountInfo[$n++] = null !== $item ? CpfUserAccountInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['user_loan_info'])) {
            if (!empty($map['user_loan_info'])) {
                $model->userLoanInfo = [];
                $n                   = 0;
                foreach ($map['user_loan_info'] as $item) {
                    $model->userLoanInfo[$n++] = null !== $item ? CpfUserLoanInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
