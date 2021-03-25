<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryContractOrganizationResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'code' => 'code',
        'message' => 'message',
        'orgId' => 'org_id',
        'name' => 'name',
        'idType' => 'id_type',
        'idNumber' => 'id_number',
        'orgLegalIdNumber' => 'org_legal_id_number',
        'orgLegalName' => 'org_legal_name',
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
        if (null !== $this->orgId) {
            $res['org_id'] = $this->orgId;
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
        if (null !== $this->thirdPartyUserId) {
            $res['third_party_user_id'] = $this->thirdPartyUserId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryContractOrganizationResponse
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
        if(isset($map['org_id'])){
            $model->orgId = $map['org_id'];
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
        if(isset($map['org_legal_id_number'])){
            $model->orgLegalIdNumber = $map['org_legal_id_number'];
        }
        if(isset($map['org_legal_name'])){
            $model->orgLegalName = $map['org_legal_name'];
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

    // 机构账号Id
    /**
     * @var string
     */
    public $orgId;

    // 机构名称
    /**
     * @var string
     */
    public $name;

    // 证件类型，详见机构证件类型说明
    /**
     * @var string
     */
    public $idType;

    // 证件号
    /**
     * @var string
     */
    public $idNumber;

    // 企业法人证件号
    /**
     * @var string
     */
    public $orgLegalIdNumber;

    // 企业法人名称
    /**
     * @var string
     */
    public $orgLegalName;

    // 第三方平台的机构id
    /**
     * @var string
     */
    public $thirdPartyUserId;

}
