<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryCreditIssuetransferResponse extends Model
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

    // 错误信息
    /**
     * @var string
     */
    public $errMsg;

    // 转让失败金额
    /**
     * @var string
     */
    public $failAmt;

    // 信用凭证号
    /**
     * @var string
     */
    public $issueId;

    // 请求时传入的全局业务号
    /**
     * @var string
     */
    public $outBizNo;

    // 转入方分布式数字身份
    /**
     * @var string
     */
    public $payeeDid;

    // 转出方分布式数字身份
    /**
     * @var string
     */
    public $payerDid;

    // 产品id
    /**
     * @var string
     */
    public $productId;

    // 转让结果状态 -1:转让失败状态， 0:转让未完成状态， 1:转让部分成功状态，2:转让成功状态
    /**
     * @var int
     */
    public $status;

    // 转让成功金额
    /**
     * @var string
     */
    public $successAmt;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'errMsg'     => 'err_msg',
        'failAmt'    => 'fail_amt',
        'issueId'    => 'issue_id',
        'outBizNo'   => 'out_biz_no',
        'payeeDid'   => 'payee_did',
        'payerDid'   => 'payer_did',
        'productId'  => 'product_id',
        'status'     => 'status',
        'successAmt' => 'success_amt',
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
        if (null !== $this->errMsg) {
            $res['err_msg'] = $this->errMsg;
        }
        if (null !== $this->failAmt) {
            $res['fail_amt'] = $this->failAmt;
        }
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->payeeDid) {
            $res['payee_did'] = $this->payeeDid;
        }
        if (null !== $this->payerDid) {
            $res['payer_did'] = $this->payerDid;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->successAmt) {
            $res['success_amt'] = $this->successAmt;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCreditIssuetransferResponse
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
        if (isset($map['err_msg'])) {
            $model->errMsg = $map['err_msg'];
        }
        if (isset($map['fail_amt'])) {
            $model->failAmt = $map['fail_amt'];
        }
        if (isset($map['issue_id'])) {
            $model->issueId = $map['issue_id'];
        }
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }
        if (isset($map['payee_did'])) {
            $model->payeeDid = $map['payee_did'];
        }
        if (isset($map['payer_did'])) {
            $model->payerDid = $map['payer_did'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['success_amt'])) {
            $model->successAmt = $map['success_amt'];
        }

        return $model;
    }
}
