<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryContractEsignaccountResponse extends Model
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

    // 账号id
    /**
     * @var string
     */
    public $accountId;

    // 名称
    /**
     * @var string
     */
    public $name;

    // 证件类型
    /**
     * @var string
     */
    public $idType;

    // 证件号
    /**
     * @var string
     */
    public $idNumber;

    // 机构法定代表人证件号
    /**
     * @var string
     */
    public $orgLegalIdNumber;

    // 机构法定代表人名称
    /**
     * @var string
     */
    public $orgLegalName;

    // 创建账号的唯一标识
    /**
     * @var string
     */
    public $thirdPartyUserid;

    // 手机号
    /**
     * @var string
     */
    public $mobile;

    // 邮箱
    /**
     * @var string
     */
    public $email;

    // 授权生效时间（时间是unix时间戳（毫秒）格式）
    /**
     * @var string
     */
    public $authStartTime;

    // 授权失效时间（时间是unix时间戳（毫秒）格式）
    /**
     * @var string
     */
    public $authEndTime;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'accountId'        => 'account_id',
        'name'             => 'name',
        'idType'           => 'id_type',
        'idNumber'         => 'id_number',
        'orgLegalIdNumber' => 'org_legal_id_number',
        'orgLegalName'     => 'org_legal_name',
        'thirdPartyUserid' => 'third_party_userid',
        'mobile'           => 'mobile',
        'email'            => 'email',
        'authStartTime'    => 'auth_start_time',
        'authEndTime'      => 'auth_end_time',
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
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }
        if (null !== $this->idNumber) {
            $res['id_number'] = $this->idNumber;
        }
        if (null !== $this->orgLegalIdNumber) {
            $res['org_legal_id_number'] = $this->orgLegalIdNumber;
        }
        if (null !== $this->orgLegalName) {
            $res['org_legal_name'] = $this->orgLegalName;
        }
        if (null !== $this->thirdPartyUserid) {
            $res['third_party_userid'] = $this->thirdPartyUserid;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->authStartTime) {
            $res['auth_start_time'] = $this->authStartTime;
        }
        if (null !== $this->authEndTime) {
            $res['auth_end_time'] = $this->authEndTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContractEsignaccountResponse
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
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }
        if (isset($map['id_number'])) {
            $model->idNumber = $map['id_number'];
        }
        if (isset($map['org_legal_id_number'])) {
            $model->orgLegalIdNumber = $map['org_legal_id_number'];
        }
        if (isset($map['org_legal_name'])) {
            $model->orgLegalName = $map['org_legal_name'];
        }
        if (isset($map['third_party_userid'])) {
            $model->thirdPartyUserid = $map['third_party_userid'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['auth_start_time'])) {
            $model->authStartTime = $map['auth_start_time'];
        }
        if (isset($map['auth_end_time'])) {
            $model->authEndTime = $map['auth_end_time'];
        }

        return $model;
    }
}
