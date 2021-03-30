<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class ApplyPfFinancingqualificationResponse extends Model
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

    // 申请流水号
    /**
     * @var string
     */
    public $aplSeqNo;

    // 受理标志
    // 0-受理失败
    // 1-受理成功
    /**
     * @var string
     */
    public $acceptanceFlag;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'aplSeqNo'       => 'apl_seq_no',
        'acceptanceFlag' => 'acceptance_flag',
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
        if (null !== $this->aplSeqNo) {
            $res['apl_seq_no'] = $this->aplSeqNo;
        }
        if (null !== $this->acceptanceFlag) {
            $res['acceptance_flag'] = $this->acceptanceFlag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyPfFinancingqualificationResponse
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
        if (isset($map['apl_seq_no'])) {
            $model->aplSeqNo = $map['apl_seq_no'];
        }
        if (isset($map['acceptance_flag'])) {
            $model->acceptanceFlag = $map['acceptance_flag'];
        }

        return $model;
    }
}
