<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class GetInternalMasterResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'certNo' => 'cert_no',
        'certType' => 'cert_type',
        'customerId' => 'customer_id',
        'email' => 'email',
        'firmName' => 'firm_name',
        'havanaId' => 'havana_id',
        'id' => 'id',
        'loginName' => 'login_name',
        'mobile' => 'mobile',
        'realName' => 'real_name',
        'sourceUserType' => 'source_user_type',
        'industryLabel' => 'industry_label',
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
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->firmName) {
            $res['firm_name'] = $this->firmName;
        }
        if (null !== $this->havanaId) {
            $res['havana_id'] = $this->havanaId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }
        if (null !== $this->sourceUserType) {
            $res['source_user_type'] = $this->sourceUserType;
        }
        if (null !== $this->industryLabel) {
            $res['industry_label'] = $this->industryLabel;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetInternalMasterResponse
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
        if(isset($map['cert_no'])){
            $model->certNo = $map['cert_no'];
        }
        if(isset($map['cert_type'])){
            $model->certType = $map['cert_type'];
        }
        if(isset($map['customer_id'])){
            $model->customerId = $map['customer_id'];
        }
        if(isset($map['email'])){
            $model->email = $map['email'];
        }
        if(isset($map['firm_name'])){
            $model->firmName = $map['firm_name'];
        }
        if(isset($map['havana_id'])){
            $model->havanaId = $map['havana_id'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['login_name'])){
            $model->loginName = $map['login_name'];
        }
        if(isset($map['mobile'])){
            $model->mobile = $map['mobile'];
        }
        if(isset($map['real_name'])){
            $model->realName = $map['real_name'];
        }
        if(isset($map['source_user_type'])){
            $model->sourceUserType = $map['source_user_type'];
        }
        if(isset($map['industry_label'])){
            $model->industryLabel = $map['industry_label'];
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

    // 证件ID
    /**
     * @var string
     */
    public $certNo;

    // 证件类型
    /**
     * @var string
     */
    public $certType;

    // 所属客户ID
    /**
     * @var string
     */
    public $customerId;

    // 邮箱
    /**
     * @var string
     */
    public $email;

    // 企业认证名称
    /**
     * @var string
     */
    public $firmName;

    // havanaId
    /**
     * @var string
     */
    public $havanaId;

    // 主账号ID
    /**
     * @var string
     */
    public $id;

    // 登录名
    /**
     * @var string
     */
    public $loginName;

    // 手机
    /**
     * @var string
     */
    public $mobile;

    // 真实姓名
    /**
     * @var string
     */
    public $realName;

    // 来源用户类型，CUSTOMER（企业用户），PERSONAL（个人用户）
    /**
     * @var string
     */
    public $sourceUserType;

    // 主账号行业标签，I表示金融机构，C表示特殊机构，N表示非金融机构
    /**
     * @var string
     */
    public $industryLabel;

}
