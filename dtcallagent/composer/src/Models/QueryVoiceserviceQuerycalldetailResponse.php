<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTCALLAGENT\Models;

use AlibabaCloud\Tea\Model;

class QueryVoiceserviceQuerycalldetailResponse extends Model
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

    // 请求状态码。
    // ● 返回 OK 代表请求成功。
    /**
     * @var string
     */
    public $code;

    // 状态码的描述。
    /**
     * @var string
     */
    public $message;

    // 返回的呼叫详情。JSON 格式。以下字段仅供参考，以具体返回详情为准。
    // ● caller：主叫号码。
    // ● startDate：通话开始时间。
    // ● stateDesc：通话状态描述。
    // ● duration：通话时长。单位：秒。0：用户未接通。
    // ● callerShowNumber：被叫显号。
    // ● gmtCreate：通话请求的接收时间。
    // ● state：通话状态。通话状态是运营商实时返回的，更多状态信息，请参见通话结果状态码。
    // ● endDate：通话结束时间。
    // ● calleeShowNumber：被叫显号。
    // ● callee：被叫号码。
    // ● aRingTime：a 路响铃开始时间。格式：yyyy-MM-dd HH:mm:ss。
    // ● aEndTime：a 路响铃结束时间。格式：yyyy-MM-dd HH:mm:ss。
    // （待确认）
    // ● bRingTime：b 路响铃开始时间。格式：yyyy-MM-dd HH:mm:ss。
    // ● bEndTime：b 路响铃结束时间。格式：yyyy-MM-dd HH:mm:ss。
    /**
     * @var string
     */
    public $data;

    // 本次调用请求的 ID，是由阿里云为该请求生成的唯一标识符，可用于排查和定位问题。
    /**
     * @var string
     */
    public $requestId;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'code'       => 'code',
        'message'    => 'message',
        'data'       => 'data',
        'requestId'  => 'request_id',
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryVoiceserviceQuerycalldetailResponse
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
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }

        return $model;
    }
}
