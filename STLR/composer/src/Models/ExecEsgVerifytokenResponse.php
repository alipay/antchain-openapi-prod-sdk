<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class ExecEsgVerifytokenResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'roleNos' => 'role_nos',
        'userId' => 'user_id',
        'userName' => 'user_name',
        'nickName' => 'nick_name',
        'realName' => 'real_name',
        'phoneNumber' => 'phone_number',
        'enterpriseNo' => 'enterprise_no',
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
        if (null !== $this->roleNos) {
            $res['role_nos'] = $this->roleNos;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->enterpriseNo) {
            $res['enterprise_no'] = $this->enterpriseNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecEsgVerifytokenResponse
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
        if(isset($map['role_nos'])){
            if(!empty($map['role_nos'])){
                $model->roleNos = $map['role_nos'];
            }
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['user_name'])){
            $model->userName = $map['user_name'];
        }
        if(isset($map['nick_name'])){
            $model->nickName = $map['nick_name'];
        }
        if(isset($map['real_name'])){
            $model->realName = $map['real_name'];
        }
        if(isset($map['phone_number'])){
            $model->phoneNumber = $map['phone_number'];
        }
        if(isset($map['enterprise_no'])){
            $model->enterpriseNo = $map['enterprise_no'];
        }
        return $model;
    }
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

    // 当前操作员全部去重后的角色编码
    /**
     * @var string[]
     */
    public $roleNos;

    // 当前碳矩阵操作员 ID。
    /**
     * @var string
     */
    public $userId;

    // 当前碳矩阵登录账号名称。
    /**
     * @var string
     */
    public $userName;

    // 操作员昵称
    /**
     * @var string
     */
    public $nickName;

    // 操作员真实姓名
    /**
     * @var string
     */
    public $realName;

    // 操作员手机号
    /**
     * @var string
     */
    public $phoneNumber;

    // 企业编码
    /**
     * @var string
     */
    public $enterpriseNo;

}
