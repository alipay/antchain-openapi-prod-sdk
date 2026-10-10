<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class StatusBlockchainBotIotagentMusicResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'tokenType' => 'token_type',
        'nickname' => 'nickname',
        'avatarUrl' => 'avatar_url',
        'gender' => 'gender',
        'vipType' => 'vip_type',
        'vipExpireTime' => 'vip_expire_time',
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
        if (null !== $this->tokenType) {
            $res['token_type'] = $this->tokenType;
        }
        if (null !== $this->nickname) {
            $res['nickname'] = $this->nickname;
        }
        if (null !== $this->avatarUrl) {
            $res['avatar_url'] = $this->avatarUrl;
        }
        if (null !== $this->gender) {
            $res['gender'] = $this->gender;
        }
        if (null !== $this->vipType) {
            $res['vip_type'] = $this->vipType;
        }
        if (null !== $this->vipExpireTime) {
            $res['vip_expire_time'] = $this->vipExpireTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return StatusBlockchainBotIotagentMusicResponse
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
        if(isset($map['token_type'])){
            $model->tokenType = $map['token_type'];
        }
        if(isset($map['nickname'])){
            $model->nickname = $map['nickname'];
        }
        if(isset($map['avatar_url'])){
            $model->avatarUrl = $map['avatar_url'];
        }
        if(isset($map['gender'])){
            $model->gender = $map['gender'];
        }
        if(isset($map['vip_type'])){
            $model->vipType = $map['vip_type'];
        }
        if(isset($map['vip_expire_time'])){
            $model->vipExpireTime = $map['vip_expire_time'];
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

    // token 类型，取值范围：NONE=未登录 / ANONYMOUS=匿名 token / FORMAL=正式登录
    /**
     * @var string
     */
    public $tokenType;

    // 昵称
    /**
     * @var string
     */
    public $nickname;

    // 头像 URL
    /**
     * @var string
     */
    public $avatarUrl;

    // 性别，取值范围：0=未知 / 1=男 / 2=女
    /**
     * @var int
     */
    public $gender;

    // VIP 类型，取值范围：FREE=非会员 / BLACK_VIP=黑胶 VIP / SVIP=SVIP / SINGLE_DEVICE=单设备会员
    /**
     * @var string
     */
    public $vipType;

    // VIP 到期时间（毫秒时间戳）
    /**
     * @var int
     */
    public $vipExpireTime;

}
