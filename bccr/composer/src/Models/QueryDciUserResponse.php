<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryDciUserResponse extends Model
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

    // dci用户id
    /**
     * @var string
     */
    public $dciUserId;

    // dci用户状态
    /**
     * @var string
     */
    public $dciUserStatus;

    // 名称
    /**
     * @var string
     */
    public $name;

    // 证件类型
    /**
     * @var string
     */
    public $certificateType;

    // 证件号
    /**
     * @var string
     */
    public $certificateNumber;

    // 地址
    /**
     * @var string
     */
    public $address;

    // 证件有效期开始时间
    /**
     * @var string
     */
    public $certStartTime;

    // 证件有效期结束时间
    /**
     * @var string
     */
    public $certEndTime;

    // 法人名称
    /**
     * @var string
     */
    public $legalPerson;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'dciUserId'         => 'dci_user_id',
        'dciUserStatus'     => 'dci_user_status',
        'name'              => 'name',
        'certificateType'   => 'certificate_type',
        'certificateNumber' => 'certificate_number',
        'address'           => 'address',
        'certStartTime'     => 'cert_start_time',
        'certEndTime'       => 'cert_end_time',
        'legalPerson'       => 'legal_person',
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
        if (null !== $this->dciUserId) {
            $res['dci_user_id'] = $this->dciUserId;
        }
        if (null !== $this->dciUserStatus) {
            $res['dci_user_status'] = $this->dciUserStatus;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->certificateType) {
            $res['certificate_type'] = $this->certificateType;
        }
        if (null !== $this->certificateNumber) {
            $res['certificate_number'] = $this->certificateNumber;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->certStartTime) {
            $res['cert_start_time'] = $this->certStartTime;
        }
        if (null !== $this->certEndTime) {
            $res['cert_end_time'] = $this->certEndTime;
        }
        if (null !== $this->legalPerson) {
            $res['legal_person'] = $this->legalPerson;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDciUserResponse
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
        if (isset($map['dci_user_id'])) {
            $model->dciUserId = $map['dci_user_id'];
        }
        if (isset($map['dci_user_status'])) {
            $model->dciUserStatus = $map['dci_user_status'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['certificate_type'])) {
            $model->certificateType = $map['certificate_type'];
        }
        if (isset($map['certificate_number'])) {
            $model->certificateNumber = $map['certificate_number'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['cert_start_time'])) {
            $model->certStartTime = $map['cert_start_time'];
        }
        if (isset($map['cert_end_time'])) {
            $model->certEndTime = $map['cert_end_time'];
        }
        if (isset($map['legal_person'])) {
            $model->legalPerson = $map['legal_person'];
        }

        return $model;
    }
}
