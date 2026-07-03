<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeCustomerCommonagreementsignResponse extends Model
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

    // 客户编号
    /**
     * @var string
     */
    public $customNo;

    // 客户名称
    /**
     * @var string
     */
    public $customName;

    // 流水号
    /**
     * @var string
     */
    public $transSerials;

    // 签约状态
    /**
     * @var string
     */
    public $status;

    // 签约用户唯一标识
    /**
     * @var string
     */
    public $accountUserId;

    // 脱敏的签约账号
    /**
     * @var string
     */
    public $accountNo;

    // 协议号
    /**
     * @var string
     */
    public $protocolNo;

    // 协议签约时间
    /**
     * @var string
     */
    public $signTime;

    // 协议生效时间
    /**
     * @var string
     */
    public $validTime;

    // 协议失效时间
    /**
     * @var string
     */
    public $invalidTime;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'customNo'      => 'custom_no',
        'customName'    => 'custom_name',
        'transSerials'  => 'trans_serials',
        'status'        => 'status',
        'accountUserId' => 'account_user_id',
        'accountNo'     => 'account_no',
        'protocolNo'    => 'protocol_no',
        'signTime'      => 'sign_time',
        'validTime'     => 'valid_time',
        'invalidTime'   => 'invalid_time',
    ];

    public function validate()
    {
        Model::validatePattern('signTime', $this->signTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('validTime', $this->validTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('invalidTime', $this->invalidTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->customNo) {
            $res['custom_no'] = $this->customNo;
        }
        if (null !== $this->customName) {
            $res['custom_name'] = $this->customName;
        }
        if (null !== $this->transSerials) {
            $res['trans_serials'] = $this->transSerials;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->accountUserId) {
            $res['account_user_id'] = $this->accountUserId;
        }
        if (null !== $this->accountNo) {
            $res['account_no'] = $this->accountNo;
        }
        if (null !== $this->protocolNo) {
            $res['protocol_no'] = $this->protocolNo;
        }
        if (null !== $this->signTime) {
            $res['sign_time'] = $this->signTime;
        }
        if (null !== $this->validTime) {
            $res['valid_time'] = $this->validTime;
        }
        if (null !== $this->invalidTime) {
            $res['invalid_time'] = $this->invalidTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeCustomerCommonagreementsignResponse
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
        if (isset($map['custom_no'])) {
            $model->customNo = $map['custom_no'];
        }
        if (isset($map['custom_name'])) {
            $model->customName = $map['custom_name'];
        }
        if (isset($map['trans_serials'])) {
            $model->transSerials = $map['trans_serials'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['account_user_id'])) {
            $model->accountUserId = $map['account_user_id'];
        }
        if (isset($map['account_no'])) {
            $model->accountNo = $map['account_no'];
        }
        if (isset($map['protocol_no'])) {
            $model->protocolNo = $map['protocol_no'];
        }
        if (isset($map['sign_time'])) {
            $model->signTime = $map['sign_time'];
        }
        if (isset($map['valid_time'])) {
            $model->validTime = $map['valid_time'];
        }
        if (isset($map['invalid_time'])) {
            $model->invalidTime = $map['invalid_time'];
        }

        return $model;
    }
}
