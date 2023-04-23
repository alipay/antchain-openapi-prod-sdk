<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class QueryPartnerSettleinResponse extends Model
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

    // 结果码
    /**
     * @var string
     */
    public $code;

    // 错误描述
    /**
     * @var string
     */
    public $errorMessage;

    // 签约状态
    /**
     * @var string
     */
    public $status;

    // 开始时间
    /**
     * @var string
     */
    public $gmtStart;

    // 结束时间
    /**
     * @var string
     */
    public $gmtEnd;

    // 签约信息
    /**
     * @var SignRecord
     */
    public $signRecord;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'code'         => 'code',
        'errorMessage' => 'error_message',
        'status'       => 'status',
        'gmtStart'     => 'gmt_start',
        'gmtEnd'       => 'gmt_end',
        'signRecord'   => 'sign_record',
    ];

    public function validate()
    {
        Model::validatePattern('gmtStart', $this->gmtStart, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtEnd', $this->gmtEnd, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->gmtStart) {
            $res['gmt_start'] = $this->gmtStart;
        }
        if (null !== $this->gmtEnd) {
            $res['gmt_end'] = $this->gmtEnd;
        }
        if (null !== $this->signRecord) {
            $res['sign_record'] = null !== $this->signRecord ? $this->signRecord->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPartnerSettleinResponse
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
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['error_message'])) {
            $model->errorMessage = $map['error_message'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['gmt_start'])) {
            $model->gmtStart = $map['gmt_start'];
        }
        if (isset($map['gmt_end'])) {
            $model->gmtEnd = $map['gmt_end'];
        }
        if (isset($map['sign_record'])) {
            $model->signRecord = SignRecord::fromMap($map['sign_record']);
        }

        return $model;
    }
}
