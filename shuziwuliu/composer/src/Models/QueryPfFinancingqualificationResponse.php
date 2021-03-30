<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryPfFinancingqualificationResponse extends Model
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

    // 请求号
    /**
     * @var string
     */
    public $aplSeqNo;

    // 申请日期
    /**
     * @var string
     */
    public $appDate;

    // 审批通过时间
    //
    //
    /**
     * @var string
     */
    public $approveDate;

    // 额度协议文件编号
    //
    //
    /**
     * @var string
     */
    public $amntAgrmntFn;

    // 处理状态
    // A01-审批中
    // A02-审批失败
    // A03-审批通过
    // A04-审批作废
    /**
     * @var string
     */
    public $proceStatus;

    // 失败原因
    /**
     * @var string
     */
    public $failRslt;

    // 错误码
    /**
     * @var string
     */
    public $genReason;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'aplSeqNo'     => 'apl_seq_no',
        'appDate'      => 'app_date',
        'approveDate'  => 'approve_date',
        'amntAgrmntFn' => 'amnt_agrmnt_fn',
        'proceStatus'  => 'proce_status',
        'failRslt'     => 'fail_rslt',
        'genReason'    => 'gen_reason',
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
        if (null !== $this->appDate) {
            $res['app_date'] = $this->appDate;
        }
        if (null !== $this->approveDate) {
            $res['approve_date'] = $this->approveDate;
        }
        if (null !== $this->amntAgrmntFn) {
            $res['amnt_agrmnt_fn'] = $this->amntAgrmntFn;
        }
        if (null !== $this->proceStatus) {
            $res['proce_status'] = $this->proceStatus;
        }
        if (null !== $this->failRslt) {
            $res['fail_rslt'] = $this->failRslt;
        }
        if (null !== $this->genReason) {
            $res['gen_reason'] = $this->genReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPfFinancingqualificationResponse
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
        if (isset($map['app_date'])) {
            $model->appDate = $map['app_date'];
        }
        if (isset($map['approve_date'])) {
            $model->approveDate = $map['approve_date'];
        }
        if (isset($map['amnt_agrmnt_fn'])) {
            $model->amntAgrmntFn = $map['amnt_agrmnt_fn'];
        }
        if (isset($map['proce_status'])) {
            $model->proceStatus = $map['proce_status'];
        }
        if (isset($map['fail_rslt'])) {
            $model->failRslt = $map['fail_rslt'];
        }
        if (isset($map['gen_reason'])) {
            $model->genReason = $map['gen_reason'];
        }

        return $model;
    }
}
