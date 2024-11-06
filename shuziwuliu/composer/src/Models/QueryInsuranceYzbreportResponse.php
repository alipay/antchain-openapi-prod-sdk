<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryInsuranceYzbreportResponse extends Model
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

    // 报案号
    /**
     * @var string
     */
    public $reportNo;

    // 保单号
    /**
     * @var string
     */
    public $policyNo;

    // 赔案号
    /**
     * @var string
     */
    public $claimNo;

    // 报案时间，格式yyyy-mm-dd hh:mm:ss
    /**
     * @var string
     */
    public $reportReqTime;

    // 案件状态，已报案，已结案，已赔付
    /**
     * @var string
     */
    public $reportStatus;

    // 案件赔付金额，单位元，两位小数;
    /**
     * @var string
     */
    public $reportPaidAmount;

    // 险种名称
    /**
     * @var string
     */
    public $externalProductName;

    // 结案时间，格式yyyy-mm-dd hh:mm:ss
    /**
     * @var string
     */
    public $reportEndTime;

    // 案件赔付结论，1-赔付 2-零结 3-商业险拒赔 4-整案拒赔 5-注销
    /**
     * @var string
     */
    public $reportPaidDesc;

    // 案件赔付时间，格式yyyy-mm-dd hh:mm:ss
    //
    /**
     * @var string
     */
    public $reportPaidTime;

    // 案件结论描述
    /**
     * @var string
     */
    public $reportVerdictDesc;

    // 收款账户名称
    /**
     * @var string
     */
    public $receiverAccountName;

    // 收款账户类型 ,1-支付宝，2-银行卡
    /**
     * @var string
     */
    public $receiverAccountType;

    // 收款人账户
    /**
     * @var string
     */
    public $receiverAccount;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'reportNo'            => 'report_no',
        'policyNo'            => 'policy_no',
        'claimNo'             => 'claim_no',
        'reportReqTime'       => 'report_req_time',
        'reportStatus'        => 'report_status',
        'reportPaidAmount'    => 'report_paid_amount',
        'externalProductName' => 'external_product_name',
        'reportEndTime'       => 'report_end_time',
        'reportPaidDesc'      => 'report_paid_desc',
        'reportPaidTime'      => 'report_paid_time',
        'reportVerdictDesc'   => 'report_verdict_desc',
        'receiverAccountName' => 'receiver_account_name',
        'receiverAccountType' => 'receiver_account_type',
        'receiverAccount'     => 'receiver_account',
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
        if (null !== $this->reportNo) {
            $res['report_no'] = $this->reportNo;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }
        if (null !== $this->claimNo) {
            $res['claim_no'] = $this->claimNo;
        }
        if (null !== $this->reportReqTime) {
            $res['report_req_time'] = $this->reportReqTime;
        }
        if (null !== $this->reportStatus) {
            $res['report_status'] = $this->reportStatus;
        }
        if (null !== $this->reportPaidAmount) {
            $res['report_paid_amount'] = $this->reportPaidAmount;
        }
        if (null !== $this->externalProductName) {
            $res['external_product_name'] = $this->externalProductName;
        }
        if (null !== $this->reportEndTime) {
            $res['report_end_time'] = $this->reportEndTime;
        }
        if (null !== $this->reportPaidDesc) {
            $res['report_paid_desc'] = $this->reportPaidDesc;
        }
        if (null !== $this->reportPaidTime) {
            $res['report_paid_time'] = $this->reportPaidTime;
        }
        if (null !== $this->reportVerdictDesc) {
            $res['report_verdict_desc'] = $this->reportVerdictDesc;
        }
        if (null !== $this->receiverAccountName) {
            $res['receiver_account_name'] = $this->receiverAccountName;
        }
        if (null !== $this->receiverAccountType) {
            $res['receiver_account_type'] = $this->receiverAccountType;
        }
        if (null !== $this->receiverAccount) {
            $res['receiver_account'] = $this->receiverAccount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInsuranceYzbreportResponse
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
        if (isset($map['report_no'])) {
            $model->reportNo = $map['report_no'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }
        if (isset($map['claim_no'])) {
            $model->claimNo = $map['claim_no'];
        }
        if (isset($map['report_req_time'])) {
            $model->reportReqTime = $map['report_req_time'];
        }
        if (isset($map['report_status'])) {
            $model->reportStatus = $map['report_status'];
        }
        if (isset($map['report_paid_amount'])) {
            $model->reportPaidAmount = $map['report_paid_amount'];
        }
        if (isset($map['external_product_name'])) {
            $model->externalProductName = $map['external_product_name'];
        }
        if (isset($map['report_end_time'])) {
            $model->reportEndTime = $map['report_end_time'];
        }
        if (isset($map['report_paid_desc'])) {
            $model->reportPaidDesc = $map['report_paid_desc'];
        }
        if (isset($map['report_paid_time'])) {
            $model->reportPaidTime = $map['report_paid_time'];
        }
        if (isset($map['report_verdict_desc'])) {
            $model->reportVerdictDesc = $map['report_verdict_desc'];
        }
        if (isset($map['receiver_account_name'])) {
            $model->receiverAccountName = $map['receiver_account_name'];
        }
        if (isset($map['receiver_account_type'])) {
            $model->receiverAccountType = $map['receiver_account_type'];
        }
        if (isset($map['receiver_account'])) {
            $model->receiverAccount = $map['receiver_account'];
        }

        return $model;
    }
}
