<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryPfPledgeResponse extends Model
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

    // 账单id
    /**
     * @var string
     */
    public $billId;

    // 融资主体did
    /**
     * @var string
     */
    public $financingSubjectDid;

    // 已提交  COMMIT
    // 推送中 PUSHING
    // 推送成功 PUSH_SUC
    // 推送失败 PUSH_FAIL
    /**
     * @var string
     */
    public $status;

    // 状态描述
    /**
     * @var string
     */
    public $desc;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'billId'              => 'bill_id',
        'financingSubjectDid' => 'financing_subject_did',
        'status'              => 'status',
        'desc'                => 'desc',
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
        if (null !== $this->billId) {
            $res['bill_id'] = $this->billId;
        }
        if (null !== $this->financingSubjectDid) {
            $res['financing_subject_did'] = $this->financingSubjectDid;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPfPledgeResponse
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
        if (isset($map['bill_id'])) {
            $model->billId = $map['bill_id'];
        }
        if (isset($map['financing_subject_did'])) {
            $model->financingSubjectDid = $map['financing_subject_did'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }

        return $model;
    }
}
