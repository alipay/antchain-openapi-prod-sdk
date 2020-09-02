<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CheckTwcNotaryNotarizationOrderResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'bizId' => 'biz_id',
        'faceAuthCode' => 'face_auth_code',
        'orgId' => 'org_id',
        'userId' => 'user_id',
        'valid' => 'valid',
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->faceAuthCode) {
            $res['face_auth_code'] = $this->faceAuthCode;
        }
        if (null !== $this->orgId) {
            $res['org_id'] = $this->orgId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->valid) {
            $res['valid'] = $this->valid;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CheckTwcNotaryNotarizationOrderResponse
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
        if(isset($map['biz_id'])){
            if(!empty($map['biz_id'])){
                $model->bizId = $map['biz_id'];
            }
        }
        if(isset($map['face_auth_code'])){
            $model->faceAuthCode = $map['face_auth_code'];
        }
        if(isset($map['org_id'])){
            $model->orgId = $map['org_id'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['valid'])){
            $model->valid = $map['valid'];
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

    // 下单的业务类型ID列表
    /**
     * @var string[]
     */
    public $bizId;

    // 实人认证接口调用授权码，与公证订单一一对应，有效次数默认为3次，超过调用次数则失效
    /**
     * @var string
     */
    public $faceAuthCode;

    // 平台公证机构ID
    /**
     * @var string
     */
    public $orgId;

    // 下单客户的账号ID
    /**
     * @var string
     */
    public $userId;

    // 是否为合法订单
    /**
     * @var bool
     */
    public $valid;

}
