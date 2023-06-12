<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class DetailEcarOffsettranslateResponse extends Model
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

    // 业务方的业务单号
    /**
     * @var string
     */
    public $translationItemNo;

    // 发生时间
    /**
     * @var string
     */
    public $occurrenceTime;

    // 业务发生量：转移量
    /**
     * @var string
     */
    public $amount;

    // 碳补偿项目编码
    /**
     * @var string
     */
    public $projectNo;

    // 碳普惠项目名称
    /**
     * @var string
     */
    public $projectName;

    // 转出碳账户DID
    /**
     * @var string
     */
    public $drawingAccountDid;

    // 转入碳账户DID
    /**
     * @var string
     */
    public $receiptAccountDid;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'translationItemNo' => 'translation_item_no',
        'occurrenceTime'    => 'occurrence_time',
        'amount'            => 'amount',
        'projectNo'         => 'project_no',
        'projectName'       => 'project_name',
        'drawingAccountDid' => 'drawing_account_did',
        'receiptAccountDid' => 'receipt_account_did',
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
        if (null !== $this->translationItemNo) {
            $res['translation_item_no'] = $this->translationItemNo;
        }
        if (null !== $this->occurrenceTime) {
            $res['occurrence_time'] = $this->occurrenceTime;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->projectNo) {
            $res['project_no'] = $this->projectNo;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->drawingAccountDid) {
            $res['drawing_account_did'] = $this->drawingAccountDid;
        }
        if (null !== $this->receiptAccountDid) {
            $res['receipt_account_did'] = $this->receiptAccountDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailEcarOffsettranslateResponse
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
        if (isset($map['translation_item_no'])) {
            $model->translationItemNo = $map['translation_item_no'];
        }
        if (isset($map['occurrence_time'])) {
            $model->occurrenceTime = $map['occurrence_time'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['project_no'])) {
            $model->projectNo = $map['project_no'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['drawing_account_did'])) {
            $model->drawingAccountDid = $map['drawing_account_did'];
        }
        if (isset($map['receipt_account_did'])) {
            $model->receiptAccountDid = $map['receipt_account_did'];
        }

        return $model;
    }
}
