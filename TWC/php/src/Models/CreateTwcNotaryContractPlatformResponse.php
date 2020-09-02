<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateTwcNotaryContractPlatformResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'code' => 'code',
        'creatorId' => 'creator_id',
        'message' => 'message',
        'platformId' => 'platform_id',
        'secret' => 'secret',
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
        if (null !== $this->creatorId) {
            $res['creator_id'] = $this->creatorId;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->platformId) {
            $res['platform_id'] = $this->platformId;
        }
        if (null !== $this->secret) {
            $res['secret'] = $this->secret;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateTwcNotaryContractPlatformResponse
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
        if(isset($map['creator_id'])){
            $model->creatorId = $map['creator_id'];
        }
        if(isset($map['message'])){
            $model->message = $map['message'];
        }
        if(isset($map['platform_id'])){
            $model->platformId = $map['platform_id'];
        }
        if(isset($map['secret'])){
            $model->secret = $map['secret'];
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

    // 创建人ID
    /**
     * @var string
     */
    public $creatorId;

    // 业务码信息
    /**
     * @var string
     */
    public $message;

    // 平台方ID
    /**
     * @var string
     */
    public $platformId;

    // 平台用户与智能合同服务间鉴权使用的密钥
    /**
     * @var string
     */
    public $secret;

}
