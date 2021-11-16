<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryLeaseFinancecertifyResponse extends Model
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

    // 核验结果
    /**
     * @var string
     */
    public $certifyResult;

    // 1636600547
    /**
     * @var int
     */
    public $certifyTime;

    // 还款信息详情
    /**
     * @var FinanceCertifyRentalInfo[]
     */
    public $rentalInfos;

    // 错误码
    /**
     * @var string
     */
    public $code;

    // 错误码描述
    /**
     * @var string
     */
    public $message;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'certifyResult' => 'certify_result',
        'certifyTime'   => 'certify_time',
        'rentalInfos'   => 'rental_infos',
        'code'          => 'code',
        'message'       => 'message',
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
        if (null !== $this->certifyResult) {
            $res['certify_result'] = $this->certifyResult;
        }
        if (null !== $this->certifyTime) {
            $res['certify_time'] = $this->certifyTime;
        }
        if (null !== $this->rentalInfos) {
            $res['rental_infos'] = [];
            if (null !== $this->rentalInfos && \is_array($this->rentalInfos)) {
                $n = 0;
                foreach ($this->rentalInfos as $item) {
                    $res['rental_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLeaseFinancecertifyResponse
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
        if (isset($map['certify_result'])) {
            $model->certifyResult = $map['certify_result'];
        }
        if (isset($map['certify_time'])) {
            $model->certifyTime = $map['certify_time'];
        }
        if (isset($map['rental_infos'])) {
            if (!empty($map['rental_infos'])) {
                $model->rentalInfos = [];
                $n                  = 0;
                foreach ($map['rental_infos'] as $item) {
                    $model->rentalInfos[$n++] = null !== $item ? FinanceCertifyRentalInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
