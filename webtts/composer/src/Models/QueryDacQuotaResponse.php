<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTTS\Models;

use AlibabaCloud\Tea\Model;

class QueryDacQuotaResponse extends Model
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

    // quotaType:DEPOSIT/WITHDRAWAL
    /**
     * @var string
     */
    public $quotaType;

    // quotaAmount
    /**
     * @var string
     */
    public $quotaAmount;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'quotaType'   => 'quota_type',
        'quotaAmount' => 'quota_amount',
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
        if (null !== $this->quotaType) {
            $res['quota_type'] = $this->quotaType;
        }
        if (null !== $this->quotaAmount) {
            $res['quota_amount'] = $this->quotaAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDacQuotaResponse
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
        if (isset($map['quota_type'])) {
            $model->quotaType = $map['quota_type'];
        }
        if (isset($map['quota_amount'])) {
            $model->quotaAmount = $map['quota_amount'];
        }

        return $model;
    }
}
