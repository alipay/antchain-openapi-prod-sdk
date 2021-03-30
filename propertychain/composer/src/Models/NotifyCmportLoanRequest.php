<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class NotifyCmportLoanRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 平台融资编号
    /**
     * @var string
     */
    public $financialNo;

    // 确认放款日期
    /**
     * @var string
     */
    public $confirmLoanDate;

    // 放款描述
    /**
     * @var string
     */
    public $confirmLoanComment;

    // 流程标记： 1->流程通过;2->流程打回到上一级;3->直接拒绝
    /**
     * @var int
     */
    public $confirmLoanFlag;

    // 融资状态:
    // 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
    /**
     * @var int
     */
    public $financialStatus;

    // 上链账户
    /**
     * @var string
     */
    public $userDid;

    // 联盟id
    /**
     * @var int
     */
    public $unionId;

    // Channel 名称
    /**
     * @var string
     */
    public $channelName;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'financialNo'        => 'financial_no',
        'confirmLoanDate'    => 'confirm_loan_date',
        'confirmLoanComment' => 'confirm_loan_comment',
        'confirmLoanFlag'    => 'confirm_loan_flag',
        'financialStatus'    => 'financial_status',
        'userDid'            => 'user_did',
        'unionId'            => 'union_id',
        'channelName'        => 'channel_name',
    ];

    public function validate()
    {
        Model::validateRequired('financialNo', $this->financialNo, true);
        Model::validateRequired('confirmLoanDate', $this->confirmLoanDate, true);
        Model::validateRequired('confirmLoanComment', $this->confirmLoanComment, true);
        Model::validateRequired('confirmLoanFlag', $this->confirmLoanFlag, true);
        Model::validateRequired('financialStatus', $this->financialStatus, true);
        Model::validateRequired('userDid', $this->userDid, true);
        Model::validateRequired('unionId', $this->unionId, true);
        Model::validateRequired('channelName', $this->channelName, true);
        Model::validatePattern('confirmLoanDate', $this->confirmLoanDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->financialNo) {
            $res['financial_no'] = $this->financialNo;
        }
        if (null !== $this->confirmLoanDate) {
            $res['confirm_loan_date'] = $this->confirmLoanDate;
        }
        if (null !== $this->confirmLoanComment) {
            $res['confirm_loan_comment'] = $this->confirmLoanComment;
        }
        if (null !== $this->confirmLoanFlag) {
            $res['confirm_loan_flag'] = $this->confirmLoanFlag;
        }
        if (null !== $this->financialStatus) {
            $res['financial_status'] = $this->financialStatus;
        }
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }
        if (null !== $this->unionId) {
            $res['union_id'] = $this->unionId;
        }
        if (null !== $this->channelName) {
            $res['channel_name'] = $this->channelName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyCmportLoanRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['financial_no'])) {
            $model->financialNo = $map['financial_no'];
        }
        if (isset($map['confirm_loan_date'])) {
            $model->confirmLoanDate = $map['confirm_loan_date'];
        }
        if (isset($map['confirm_loan_comment'])) {
            $model->confirmLoanComment = $map['confirm_loan_comment'];
        }
        if (isset($map['confirm_loan_flag'])) {
            $model->confirmLoanFlag = $map['confirm_loan_flag'];
        }
        if (isset($map['financial_status'])) {
            $model->financialStatus = $map['financial_status'];
        }
        if (isset($map['user_did'])) {
            $model->userDid = $map['user_did'];
        }
        if (isset($map['union_id'])) {
            $model->unionId = $map['union_id'];
        }
        if (isset($map['channel_name'])) {
            $model->channelName = $map['channel_name'];
        }

        return $model;
    }
}
