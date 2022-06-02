<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class QueryApiAuthteplateResponse extends Model
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

    // JWT生成，设置失效时间，维持会话数据
    /**
     * @var string
     */
    public $token;

    // Unix时间戳 秒
    /**
     * @var int
     */
    public $expireTime;

    // 模版树
    /**
     * @var TreeTemplate
     */
    public $treeTemplate;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'token'        => 'token',
        'expireTime'   => 'expire_time',
        'treeTemplate' => 'tree_template',
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
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->expireTime) {
            $res['expire_time'] = $this->expireTime;
        }
        if (null !== $this->treeTemplate) {
            $res['tree_template'] = null !== $this->treeTemplate ? $this->treeTemplate->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryApiAuthteplateResponse
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
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['expire_time'])) {
            $model->expireTime = $map['expire_time'];
        }
        if (isset($map['tree_template'])) {
            $model->treeTemplate = TreeTemplate::fromMap($map['tree_template']);
        }

        return $model;
    }
}
