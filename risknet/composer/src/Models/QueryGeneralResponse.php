<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKNET\Models;

use AlibabaCloud\Tea\Model;

class QueryGeneralResponse extends Model
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

    // 风险咨询是否查得
    /**
     * @var string
     */
    public $found;

    // 风险咨询结果
    /**
     * @var string
     */
    public $riskResult;

    // 风险咨询结果补充讯息
    /**
     * @var string
     */
    public $riskResultExt;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'found'         => 'found',
        'riskResult'    => 'risk_result',
        'riskResultExt' => 'risk_result_ext',
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
        if (null !== $this->found) {
            $res['found'] = $this->found;
        }
        if (null !== $this->riskResult) {
            $res['risk_result'] = $this->riskResult;
        }
        if (null !== $this->riskResultExt) {
            $res['risk_result_ext'] = $this->riskResultExt;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryGeneralResponse
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
        if (isset($map['found'])) {
            $model->found = $map['found'];
        }
        if (isset($map['risk_result'])) {
            $model->riskResult = $map['risk_result'];
        }
        if (isset($map['risk_result_ext'])) {
            $model->riskResultExt = $map['risk_result_ext'];
        }

        return $model;
    }
}
