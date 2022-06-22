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

    // 测试结果
    /**
     * @var string
     */
    public $riskResult;

    // 风险咨询结果描述
    /**
     * @var string
     */
    public $riskResultDesc;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'riskResult'     => 'risk_result',
        'riskResultDesc' => 'risk_result_desc',
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
        if (null !== $this->riskResult) {
            $res['risk_result'] = $this->riskResult;
        }
        if (null !== $this->riskResultDesc) {
            $res['risk_result_desc'] = $this->riskResultDesc;
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
        if (isset($map['risk_result'])) {
            $model->riskResult = $map['risk_result'];
        }
        if (isset($map['risk_result_desc'])) {
            $model->riskResultDesc = $map['risk_result_desc'];
        }

        return $model;
    }
}
