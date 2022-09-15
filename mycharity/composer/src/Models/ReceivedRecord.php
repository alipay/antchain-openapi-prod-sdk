<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYCHARITY\Models;

use AlibabaCloud\Tea\Model;

class ReceivedRecord extends Model
{
    // 执行记录id
    /**
     * @example 1
     *
     * @var string
     */
    public $id;

    // 支付宝用户标识
    /**
     * @example 2088612847668613
     *
     * @var string
     */
    public $receiverAlipayUserId;

    // 领取人姓名
    /**
     * @example 张无忌
     *
     * @var string
     */
    public $receiverName;

    // 领取人身份证号码
    /**
     * @example 330127199312239501
     *
     * @var string
     */
    public $receiverCardNo;

    // 联系号码
    /**
     * @example 151848223253
     *
     * @var string
     */
    public $receiverPhoneNo;

    // 是否是受益人本人 0本人，1代领
    /**
     * @example 0
     *
     * @var int
     */
    public $agentFlag;

    // 领取人和受益人关系
    /**
     * @example 父母
     *
     * @var string
     */
    public $relationship;

    // 受益人信息
    /**
     * @example 张**
     *
     * @var string
     */
    public $beneficiaryMessage;

    // 领取人所属机构
    /**
     * @example xx学校
     *
     * @var string
     */
    public $receiverOrg;

    // 领取说明
    /**
     * @example 说明
     *
     * @var string
     */
    public $receiveNote;

    // 受益人数
    /**
     * @example 1
     *
     * @var int
     */
    public $benefitNumber;

    // 快递地址
    /**
     * @example 杭州市
     *
     * @var string
     */
    public $expressAddress;

    // 发放数量
    /**
     * @example
     *
     * @var int
     */
    public $issueAmount;
    protected $_name = [
        'id'                   => 'id',
        'receiverAlipayUserId' => 'receiver_alipay_user_id',
        'receiverName'         => 'receiver_name',
        'receiverCardNo'       => 'receiver_card_no',
        'receiverPhoneNo'      => 'receiver_phone_no',
        'agentFlag'            => 'agent_flag',
        'relationship'         => 'relationship',
        'beneficiaryMessage'   => 'beneficiary_message',
        'receiverOrg'          => 'receiver_org',
        'receiveNote'          => 'receive_note',
        'benefitNumber'        => 'benefit_number',
        'expressAddress'       => 'express_address',
        'issueAmount'          => 'issue_amount',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('receiverAlipayUserId', $this->receiverAlipayUserId, true);
        Model::validateRequired('receiverName', $this->receiverName, true);
        Model::validateRequired('receiverCardNo', $this->receiverCardNo, true);
        Model::validateRequired('agentFlag', $this->agentFlag, true);
        Model::validateMaxLength('id', $this->id, 50);
        Model::validateMaxLength('receiverAlipayUserId', $this->receiverAlipayUserId, 16);
        Model::validateMaxLength('receiverName', $this->receiverName, 50);
        Model::validateMaxLength('receiverPhoneNo', $this->receiverPhoneNo, 20);
        Model::validateMaxLength('relationship', $this->relationship, 100);
        Model::validateMaxLength('beneficiaryMessage', $this->beneficiaryMessage, 200);
        Model::validateMaxLength('receiverOrg', $this->receiverOrg, 100);
        Model::validateMaxLength('receiveNote', $this->receiveNote, 100);
        Model::validateMaxLength('expressAddress', $this->expressAddress, 100);
        Model::validateMinLength('receiverAlipayUserId', $this->receiverAlipayUserId, 16);
        Model::validateMaximum('benefitNumber', $this->benefitNumber, 999999999);
        Model::validateMaximum('issueAmount', $this->issueAmount, 100000000);
        Model::validateMinimum('benefitNumber', $this->benefitNumber, 1);
        Model::validateMinimum('issueAmount', $this->issueAmount, 1);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->receiverAlipayUserId) {
            $res['receiver_alipay_user_id'] = $this->receiverAlipayUserId;
        }
        if (null !== $this->receiverName) {
            $res['receiver_name'] = $this->receiverName;
        }
        if (null !== $this->receiverCardNo) {
            $res['receiver_card_no'] = $this->receiverCardNo;
        }
        if (null !== $this->receiverPhoneNo) {
            $res['receiver_phone_no'] = $this->receiverPhoneNo;
        }
        if (null !== $this->agentFlag) {
            $res['agent_flag'] = $this->agentFlag;
        }
        if (null !== $this->relationship) {
            $res['relationship'] = $this->relationship;
        }
        if (null !== $this->beneficiaryMessage) {
            $res['beneficiary_message'] = $this->beneficiaryMessage;
        }
        if (null !== $this->receiverOrg) {
            $res['receiver_org'] = $this->receiverOrg;
        }
        if (null !== $this->receiveNote) {
            $res['receive_note'] = $this->receiveNote;
        }
        if (null !== $this->benefitNumber) {
            $res['benefit_number'] = $this->benefitNumber;
        }
        if (null !== $this->expressAddress) {
            $res['express_address'] = $this->expressAddress;
        }
        if (null !== $this->issueAmount) {
            $res['issue_amount'] = $this->issueAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReceivedRecord
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['receiver_alipay_user_id'])) {
            $model->receiverAlipayUserId = $map['receiver_alipay_user_id'];
        }
        if (isset($map['receiver_name'])) {
            $model->receiverName = $map['receiver_name'];
        }
        if (isset($map['receiver_card_no'])) {
            $model->receiverCardNo = $map['receiver_card_no'];
        }
        if (isset($map['receiver_phone_no'])) {
            $model->receiverPhoneNo = $map['receiver_phone_no'];
        }
        if (isset($map['agent_flag'])) {
            $model->agentFlag = $map['agent_flag'];
        }
        if (isset($map['relationship'])) {
            $model->relationship = $map['relationship'];
        }
        if (isset($map['beneficiary_message'])) {
            $model->beneficiaryMessage = $map['beneficiary_message'];
        }
        if (isset($map['receiver_org'])) {
            $model->receiverOrg = $map['receiver_org'];
        }
        if (isset($map['receive_note'])) {
            $model->receiveNote = $map['receive_note'];
        }
        if (isset($map['benefit_number'])) {
            $model->benefitNumber = $map['benefit_number'];
        }
        if (isset($map['express_address'])) {
            $model->expressAddress = $map['express_address'];
        }
        if (isset($map['issue_amount'])) {
            $model->issueAmount = $map['issue_amount'];
        }

        return $model;
    }
}
