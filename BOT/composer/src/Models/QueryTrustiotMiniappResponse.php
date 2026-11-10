<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryTrustiotMiniappResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'redirectUrl' => 'redirect_url',
        'validFrom' => 'valid_from',
        'validTo' => 'valid_to',
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
        if (null !== $this->redirectUrl) {
            $res['redirect_url'] = $this->redirectUrl;
        }
        if (null !== $this->validFrom) {
            $res['valid_from'] = $this->validFrom;
        }
        if (null !== $this->validTo) {
            $res['valid_to'] = $this->validTo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryTrustiotMiniappResponse
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
        if(isset($map['redirect_url'])){
            $model->redirectUrl = $map['redirect_url'];
        }
        if(isset($map['valid_from'])){
            $model->validFrom = $map['valid_from'];
        }
        if(isset($map['valid_to'])){
            $model->validTo = $map['valid_to'];
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

    // 一次性跳转链接。链接整体 24 小时有效（见 valid_to），令牌一次性消费、用后即失效
    /**
     * @var string
     */
    public $redirectUrl;

    // 链接生效时间，毫秒级时间戳
    /**
     * @var int
     */
    public $validFrom;

    // 链接过期时间，毫秒级时间戳，valid_from 起 24 小时。过期后链接不可用
    /**
     * @var int
     */
    public $validTo;

}
