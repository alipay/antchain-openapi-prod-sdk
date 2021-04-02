<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryThingsdidAsyncprocessResponse extends Model
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

    // 需要查询的实体Did，可为空
    /**
     * @var string
     */
    public $thingDid;

    // 随机数, 用以标识智能合约执行的索引，等于输入
    /**
     * @var string
     */
    public $nonce;

    // 交易执行当前状态，原始文本，和async_code, async_subcode匹配，将来可能会删除此字段
    /**
     * @var string
     */
    public $asyncStatus;

    // 从智能合约执行返回的结果编码，200成功，其他参考相应文档
    /**
     * @var string
     */
    public $asyncCode;

    // 可为空，代表async_code信息不能表示完整语义时的子结果码
    /**
     * @var string
     */
    public $asyncSubcode;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'thingDid'     => 'thing_did',
        'nonce'        => 'nonce',
        'asyncStatus'  => 'async_status',
        'asyncCode'    => 'async_code',
        'asyncSubcode' => 'async_subcode',
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
        if (null !== $this->thingDid) {
            $res['thing_did'] = $this->thingDid;
        }
        if (null !== $this->nonce) {
            $res['nonce'] = $this->nonce;
        }
        if (null !== $this->asyncStatus) {
            $res['async_status'] = $this->asyncStatus;
        }
        if (null !== $this->asyncCode) {
            $res['async_code'] = $this->asyncCode;
        }
        if (null !== $this->asyncSubcode) {
            $res['async_subcode'] = $this->asyncSubcode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryThingsdidAsyncprocessResponse
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
        if (isset($map['thing_did'])) {
            $model->thingDid = $map['thing_did'];
        }
        if (isset($map['nonce'])) {
            $model->nonce = $map['nonce'];
        }
        if (isset($map['async_status'])) {
            $model->asyncStatus = $map['async_status'];
        }
        if (isset($map['async_code'])) {
            $model->asyncCode = $map['async_code'];
        }
        if (isset($map['async_subcode'])) {
            $model->asyncSubcode = $map['async_subcode'];
        }

        return $model;
    }
}
