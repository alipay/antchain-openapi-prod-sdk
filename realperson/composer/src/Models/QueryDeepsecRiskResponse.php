<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryDeepsecRiskResponse extends Model
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

    // 是否调用成功
    /**
     * @var bool
     */
    public $success;

    // 业务返回码
    /**
     * @var string
     */
    public $code;

    // message	返回信息
    /**
     * @var string
     */
    public $message;

    // 设备风险标签
    /**
     * @var string
     */
    public $riskInfo;

    // 设备染色风险标签
    /**
     * @var string
     */
    public $dcRisk;

    // 业务风险标签
    /**
     * @var string
     */
    public $bizRisk;

    // 设备元数据
    /**
     * @var string
     */
    public $deviceInfo;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'success'    => 'success',
        'code'       => 'code',
        'message'    => 'message',
        'riskInfo'   => 'risk_info',
        'dcRisk'     => 'dc_risk',
        'bizRisk'    => 'biz_risk',
        'deviceInfo' => 'device_info',
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->riskInfo) {
            $res['risk_info'] = $this->riskInfo;
        }
        if (null !== $this->dcRisk) {
            $res['dc_risk'] = $this->dcRisk;
        }
        if (null !== $this->bizRisk) {
            $res['biz_risk'] = $this->bizRisk;
        }
        if (null !== $this->deviceInfo) {
            $res['device_info'] = $this->deviceInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDeepsecRiskResponse
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
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['risk_info'])) {
            $model->riskInfo = $map['risk_info'];
        }
        if (isset($map['dc_risk'])) {
            $model->dcRisk = $map['dc_risk'];
        }
        if (isset($map['biz_risk'])) {
            $model->bizRisk = $map['biz_risk'];
        }
        if (isset($map['device_info'])) {
            $model->deviceInfo = $map['device_info'];
        }

        return $model;
    }
}
