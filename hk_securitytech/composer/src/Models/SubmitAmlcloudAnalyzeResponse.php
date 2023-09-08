<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\HK_SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class SubmitAmlcloudAnalyzeResponse extends Model
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

    // Unique business ID for tracing purposes
    /**
     * @var string
     */
    public $requestId;

    // Screening decisions:
    //
    // ACCEPT: Did not hit any watchlist
    //
    // REJECT: Hit some watchlists
    //
    // REVIEW: Potentially hit some watchlists
    /**
     * @var string
     */
    public $decision;

    // Hit details
    /**
     * @var HitResults
     */
    public $hitResults;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'requestId'  => 'request_id',
        'decision'   => 'decision',
        'hitResults' => 'hit_results',
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
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->decision) {
            $res['decision'] = $this->decision;
        }
        if (null !== $this->hitResults) {
            $res['hit_results'] = null !== $this->hitResults ? $this->hitResults->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitAmlcloudAnalyzeResponse
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
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['decision'])) {
            $model->decision = $map['decision'];
        }
        if (isset($map['hit_results'])) {
            $model->hitResults = HitResults::fromMap($map['hit_results']);
        }

        return $model;
    }
}
