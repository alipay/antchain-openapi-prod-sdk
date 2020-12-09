<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryDigitalLogisticCreditIssuereceivableResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'clearAmt' => 'clear_amt',
        'compensateAmt' => 'compensate_amt',
        'errMsg' => 'err_msg',
        'finishDate' => 'finish_date',
        'hasCompensate' => 'has_compensate',
        'issueId' => 'issue_id',
        'outBizNo' => 'out_biz_no',
        'outOrderNo' => 'out_order_no',
        'productId' => 'product_id',
        'status' => 'status',
        'totalAmt' => 'total_amt',
        'type' => 'type',
    ];
    public function validate() {}
    public function toMap() {
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
        if (null !== $this->clearAmt) {
            $res['clear_amt'] = $this->clearAmt;
        }
        if (null !== $this->compensateAmt) {
            $res['compensate_amt'] = $this->compensateAmt;
        }
        if (null !== $this->errMsg) {
            $res['err_msg'] = $this->errMsg;
        }
        if (null !== $this->finishDate) {
            $res['finish_date'] = $this->finishDate;
        }
        if (null !== $this->hasCompensate) {
            $res['has_compensate'] = $this->hasCompensate;
        }
        if (null !== $this->issueId) {
            $res['issue_id'] = $this->issueId;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->outOrderNo) {
            $res['out_order_no'] = $this->outOrderNo;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->totalAmt) {
            $res['total_amt'] = $this->totalAmt;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDigitalLogisticCreditIssuereceivableResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['clear_amt'])){
            $model->clearAmt = $map['clear_amt'];
        }
        if(isset($map['compensate_amt'])){
            $model->compensateAmt = $map['compensate_amt'];
        }
        if(isset($map['err_msg'])){
            $model->errMsg = $map['err_msg'];
        }
        if(isset($map['finish_date'])){
            $model->finishDate = $map['finish_date'];
        }
        if(isset($map['has_compensate'])){
            $model->hasCompensate = $map['has_compensate'];
        }
        if(isset($map['issue_id'])){
            $model->issueId = $map['issue_id'];
        }
        if(isset($map['out_biz_no'])){
            $model->outBizNo = $map['out_biz_no'];
        }
        if(isset($map['out_order_no'])){
            $model->outOrderNo = $map['out_order_no'];
        }
        if(isset($map['product_id'])){
            $model->productId = $map['product_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['total_amt'])){
            $model->totalAmt = $map['total_amt'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 已清分金额
    /**
     * @var string
     */
    public $clearAmt;

    // 代偿金额
    /**
     * @var string
     */
    public $compensateAmt;

    // 错误信息
    /**
     * @var string
     */
    public $errMsg;

    // 完成日期 long类型字符串
    /**
     * @var string
     */
    public $finishDate;

    // 是否代偿,true为代偿，false为不代偿
    /**
     * @var bool
     */
    public $hasCompensate;

    // 信用凭证id
    /**
     * @var string
     */
    public $issueId;

    // 全局唯一业务号
    /**
     * @var string
     */
    public $outBizNo;

    // 外部订单号，也就是凭证发行时传递的支付订单
    /**
     * @var string
     */
    public $outOrderNo;

    // 产品id--PRODUCT_MYBANK 、PRODUCT_MYBANK_B;
    /**
     * @var string
     */
    public $productId;

    // 清分结果状态--- 0：未清分， 1：清分完成
    /**
     * @var int
     */
    public $status;

    // 凭证总金额
    /**
     * @var string
     */
    public $totalAmt;

    // 清分类型--主动清分 、 到期清分
    /**
     * @var string
     */
    public $type;

}
