<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateContractPlatformResponse extends Model
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

    // 创建人ID
    /**
     * @var string
     */
    public $creatorId;

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
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'creatorId'  => 'creator_id',
        'platformId' => 'platform_id',
        'secret'     => 'secret',
        'code'       => 'code',
        'message'    => 'message',
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
        if (null !== $this->creatorId) {
            $res['creator_id'] = $this->creatorId;
        }
        if (null !== $this->platformId) {
            $res['platform_id'] = $this->platformId;
        }
        if (null !== $this->secret) {
            $res['secret'] = $this->secret;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateContractPlatformResponse
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
        if (isset($map['creator_id'])) {
            $model->creatorId = $map['creator_id'];
        }
        if (isset($map['platform_id'])) {
            $model->platformId = $map['platform_id'];
        }
        if (isset($map['secret'])) {
            $model->secret = $map['secret'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
