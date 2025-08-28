<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerAgreementterminateconfigResponse extends Model
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

    // 商家处理超时时长-HOUR类型时长
    /**
     * @var string
     */
    public $timeoutHour;

    // 商家处理超时时长-DAY类型时长
    /**
     * @var string
     */
    public $timeoutDay;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'timeoutHour' => 'timeout_hour',
        'timeoutDay'  => 'timeout_day',
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
        if (null !== $this->timeoutHour) {
            $res['timeout_hour'] = $this->timeoutHour;
        }
        if (null !== $this->timeoutDay) {
            $res['timeout_day'] = $this->timeoutDay;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInnerAgreementterminateconfigResponse
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
        if (isset($map['timeout_hour'])) {
            $model->timeoutHour = $map['timeout_hour'];
        }
        if (isset($map['timeout_day'])) {
            $model->timeoutDay = $map['timeout_day'];
        }

        return $model;
    }
}
