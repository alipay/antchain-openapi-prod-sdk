<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryRightsprodVoucherResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'userId' => 'user_id',
        'phoneNumber' => 'phone_number',
        'openId' => 'open_id',
        'appId' => 'app_id',
        'rightsCode' => 'rights_code',
        'rightsName' => 'rights_name',
        'voucherCode' => 'voucher_code',
        'status' => 'status',
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->rightsCode) {
            $res['rights_code'] = $this->rightsCode;
        }
        if (null !== $this->rightsName) {
            $res['rights_name'] = $this->rightsName;
        }
        if (null !== $this->voucherCode) {
            $res['voucher_code'] = $this->voucherCode;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryRightsprodVoucherResponse
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
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['phone_number'])){
            $model->phoneNumber = $map['phone_number'];
        }
        if(isset($map['open_id'])){
            $model->openId = $map['open_id'];
        }
        if(isset($map['app_id'])){
            $model->appId = $map['app_id'];
        }
        if(isset($map['rights_code'])){
            $model->rightsCode = $map['rights_code'];
        }
        if(isset($map['rights_name'])){
            $model->rightsName = $map['rights_name'];
        }
        if(isset($map['voucher_code'])){
            $model->voucherCode = $map['voucher_code'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
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

    // 用户ID
    /**
     * @var string
     */
    public $userId;

    // 用户手机号
    /**
     * @var string
     */
    public $phoneNumber;

    // 用户openId
    /**
     * @var string
     */
    public $openId;

    // 应用ID
    /**
     * @var string
     */
    public $appId;

    // 权益编码
    /**
     * @var string
     */
    public $rightsCode;

    // 权益名称
    /**
     * @var string
     */
    public $rightsName;

    // 券实例编码
    /**
     * @var string
     */
    public $voucherCode;

    // 券状态
    // WAIT_EFFECT：待生效
    // WAIT_VERIFY：待核销
    // EXPIRED：已过期
    // VERIFY_SUCCESS：核销成功（已核销）
    // INVALID：已失效
    // 公域场景下只会包含以上五种状态，私域场景会包含下方状态基
    // FREEZE：已冻结
    // VERIFYING：核销处理中
    // VERIFY_FAIL：核销失败
    // VERIFY_CANCELING：核销撤销中
    // NO_NEED_VERIFY：无需核销
    /**
     * @var string
     */
    public $status;

}
