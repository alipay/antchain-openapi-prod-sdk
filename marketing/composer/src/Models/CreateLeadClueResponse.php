<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETING\Models;

use AlibabaCloud\Tea\Model;

class CreateLeadClueResponse extends Model
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

    // 成功与否
    /**
     * @var bool
     */
    public $result;

    // 客户id，行业线自己的会员id
    /**
     * @var string
     */
    public $customerId;

    // 线索id，中台侧线索唯一号
    /**
     * @var string
     */
    public $leadId;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'result'     => 'result',
        'customerId' => 'customer_id',
        'leadId'     => 'lead_id',
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
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->leadId) {
            $res['lead_id'] = $this->leadId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeadClueResponse
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
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['lead_id'])) {
            $model->leadId = $map['lead_id'];
        }

        return $model;
    }
}
