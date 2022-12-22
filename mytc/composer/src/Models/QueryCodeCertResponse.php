<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class QueryCodeCertResponse extends Model
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

    // 存证内容。
    // 在注册溯源码、溯源码关联信息等接口调用情况下，上链内容会包装加密后上链。
    // 因此返回内容不可读，需要按照指定要求解密读取。
    /**
     * @var string
     */
    public $content;

    // 链交易信息
    /**
     * @var BlockChainTransactionInfo
     */
    public $chainTransactionInfo;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'content'              => 'content',
        'chainTransactionInfo' => 'chain_transaction_info',
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
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->chainTransactionInfo) {
            $res['chain_transaction_info'] = null !== $this->chainTransactionInfo ? $this->chainTransactionInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCodeCertResponse
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
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['chain_transaction_info'])) {
            $model->chainTransactionInfo = BlockChainTransactionInfo::fromMap($map['chain_transaction_info']);
        }

        return $model;
    }
}
