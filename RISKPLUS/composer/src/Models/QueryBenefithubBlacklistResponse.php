<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryBenefithubBlacklistResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'hit' => 'hit',
        'hitType' => 'hit_type',
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
        if (null !== $this->hit) {
            $res['hit'] = $this->hit;
        }
        if (null !== $this->hitType) {
            $res['hit_type'] = $this->hitType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBenefithubBlacklistResponse
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
        if(isset($map['hit'])){
            $model->hit = $map['hit'];
        }
        if(isset($map['hit_type'])){
            $model->hitType = $map['hit_type'];
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

    // true-命中黑名单,false-非命中黑名单
    /**
     * @var bool
     */
    public $hit;

    // UUID-流量平台用户id维度命中，MOBILE-手机号匹配命中。
    /**
     * @var string
     */
    public $hitType;

}
