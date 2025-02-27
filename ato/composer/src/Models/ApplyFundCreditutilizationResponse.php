<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class ApplyFundCreditutilizationResponse extends Model
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

    // 用信Id
    /**
     * @var string
     */
    public $utilizationId;

    // 用信授权id
    /**
     * @var string
     */
    public $utilizationAuthId;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'utilizationId'     => 'utilization_id',
        'utilizationAuthId' => 'utilization_auth_id',
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
        if (null !== $this->utilizationId) {
            $res['utilization_id'] = $this->utilizationId;
        }
        if (null !== $this->utilizationAuthId) {
            $res['utilization_auth_id'] = $this->utilizationAuthId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyFundCreditutilizationResponse
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
        if (isset($map['utilization_id'])) {
            $model->utilizationId = $map['utilization_id'];
        }
        if (isset($map['utilization_auth_id'])) {
            $model->utilizationAuthId = $map['utilization_auth_id'];
        }

        return $model;
    }
}
