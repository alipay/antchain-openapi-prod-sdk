<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class DetailEcarEnterprisememberResponse extends Model
{
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

    // 账户DID
    /**
     * @var string
     */
    public $accountDid;

    // 会员姓名，脱敏处理
    /**
     * @var string
     */
    public $name;

    // 会员手机号码，脱敏处理
    /**
     * @var string
     */
    public $mobile;

    // 注册时间
    /**
     * @var string
     */
    public $registerTime;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'accountDid'   => 'account_did',
        'name'         => 'name',
        'mobile'       => 'mobile',
        'registerTime' => 'register_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
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
        if (null !== $this->accountDid) {
            $res['account_did'] = $this->accountDid;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->registerTime) {
            $res['register_time'] = $this->registerTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailEcarEnterprisememberResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['account_did'])) {
            $model->accountDid = $map['account_did'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['register_time'])) {
            $model->registerTime = $map['register_time'];
        }

        return $model;
    }
}
