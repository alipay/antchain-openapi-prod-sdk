<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseRiskResponse extends Model
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

    // 风控结果
    // SUCCESS：通过
    // FAIL：不通过
    /**
     * @var string
     */
    public $paas;

    // 风控识别id，与订单id对应
    /**
     * @var string
     */
    public $riskId;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'paas'       => 'paas',
        'riskId'     => 'risk_id',
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
        if (null !== $this->paas) {
            $res['paas'] = $this->paas;
        }
        if (null !== $this->riskId) {
            $res['risk_id'] = $this->riskId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeaseRiskResponse
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
        if (isset($map['paas'])) {
            $model->paas = $map['paas'];
        }
        if (isset($map['risk_id'])) {
            $model->riskId = $map['risk_id'];
        }

        return $model;
    }
}
