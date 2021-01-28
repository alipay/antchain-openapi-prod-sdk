<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryContractAccountResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'code' => 'code',
        'message' => 'message',
        'accountId' => 'account_id',
        'name' => 'name',
        'idType' => 'id_type',
        'idNumber' => 'id_number',
        'mobile' => 'mobile',
        'email' => 'email',
        'thirdPartyUserId' => 'third_party_user_id',
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
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
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->thirdPartyUserId) {
            $res['third_party_user_id'] = $this->thirdPartyUserId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryContractAccountResponse
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
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['message'])){
            $model->message = $map['message'];
        }
        if(isset($map['account_id'])){
            $model->accountId = $map['account_id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['id_type'])){
            $model->idType = $map['id_type'];
        }
        if(isset($map['id_number'])){
            $model->idNumber = $map['id_number'];
        }
        if(isset($map['mobile'])){
            $model->mobile = $map['mobile'];
        }
        if(isset($map['email'])){
            $model->email = $map['email'];
        }
        if(isset($map['third_party_user_id'])){
            $model->thirdPartyUserId = $map['third_party_user_id'];
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

    // 业务码，0表示成功
    /**
     * @var int
     */
    public $code;

    // 业务码信息
    /**
     * @var string
     */
    public $message;

    // 个人账号id
    /**
     * @var string
     */
    public $accountId;

    // 姓名
    /**
     * @var string
     */
    public $name;

    // 证件类型，详见个人证件类型说明
    /**
     * @var string
     */
    public $idType;

    // 证件号
    /**
     * @var string
     */
    public $idNumber;

    // 联系方式，手机号码
    /**
     * @var string
     */
    public $mobile;

    // 联系方式，邮箱地址
    /**
     * @var string
     */
    public $email;

    // 第三方平台的用户id
    /**
     * @var string
     */
    public $thirdPartyUserId;

}
