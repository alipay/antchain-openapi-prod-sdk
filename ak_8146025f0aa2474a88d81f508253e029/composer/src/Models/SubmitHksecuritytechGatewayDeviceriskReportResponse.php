<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_8146025f0aa2474a88d81f508253e029\Models;

use AlibabaCloud\Tea\Model;

class SubmitHksecuritytechGatewayDeviceriskReportResponse extends Model
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

    // 1000
    /**
     * @var int
     */
    public $resultStatus;

    // result
    /**
     * @var DeviceRiskReportResult
     */
    public $result;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'resultStatus' => 'result_status',
        'result'       => 'result',
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
        if (null !== $this->resultStatus) {
            $res['result_status'] = $this->resultStatus;
        }
        if (null !== $this->result) {
            $res['result'] = null !== $this->result ? $this->result->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitHksecuritytechGatewayDeviceriskReportResponse
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
        if (isset($map['result_status'])) {
            $model->resultStatus = $map['result_status'];
        }
        if (isset($map['result'])) {
            $model->result = DeviceRiskReportResult::fromMap($map['result']);
        }

        return $model;
    }
}
