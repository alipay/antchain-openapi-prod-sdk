<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class QueryQueryFirmfinancialResponse extends Model
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

    // 是否成功
    /**
     * @var bool
     */
    public $success;

    // 结果码
    /**
     * @var string
     */
    public $errorCode;

    // 结果消息
    /**
     * @var string
     */
    public $errorMsg;

    // 财报状态(true已上传，false未上传)
    /**
     * @var bool
     */
    public $status;

    // 查询结果
    /**
     * @var FileInfo[]
     */
    public $accountResult;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'success'       => 'success',
        'errorCode'     => 'error_code',
        'errorMsg'      => 'error_msg',
        'status'        => 'status',
        'accountResult' => 'account_result',
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
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->accountResult) {
            $res['account_result'] = [];
            if (null !== $this->accountResult && \is_array($this->accountResult)) {
                $n = 0;
                foreach ($this->accountResult as $item) {
                    $res['account_result'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryQueryFirmfinancialResponse
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
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['account_result'])) {
            if (!empty($map['account_result'])) {
                $model->accountResult = [];
                $n                    = 0;
                foreach ($map['account_result'] as $item) {
                    $model->accountResult[$n++] = null !== $item ? FileInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
