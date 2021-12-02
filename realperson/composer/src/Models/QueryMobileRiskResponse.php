<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryMobileRiskResponse extends Model
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

    // 设备相关数据，默认只返回apdid，由Map<String,String>序列化
    /**
     * @var string
     */
    public $deviceInfo;

    // 设备风险标签，由Map<String,String>序列化
    /**
     * @var string
     */
    public $riskInfo;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'deviceInfo' => 'device_info',
        'riskInfo'   => 'risk_info',
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
        if (null !== $this->deviceInfo) {
            $res['device_info'] = $this->deviceInfo;
        }
        if (null !== $this->riskInfo) {
            $res['risk_info'] = $this->riskInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMobileRiskResponse
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
        if (isset($map['device_info'])) {
            $model->deviceInfo = $map['device_info'];
        }
        if (isset($map['risk_info'])) {
            $model->riskInfo = $map['risk_info'];
        }

        return $model;
    }
}
