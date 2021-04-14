<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class GetTextResponse extends Model
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

    // 存证信息
    /**
     * @var string
     */
    public $content;

    // 可信信息
    /**
     * @var TsrResponse
     */
    public $tsr;

    // 文本存证类型
    /**
     * @var string
     */
    public $textNotaryType;

    // 哈希算法
    /**
     * @var string
     */
    public $hashAlgorithm;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'content'        => 'content',
        'tsr'            => 'tsr',
        'textNotaryType' => 'text_notary_type',
        'hashAlgorithm'  => 'hash_algorithm',
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
        if (null !== $this->tsr) {
            $res['tsr'] = null !== $this->tsr ? $this->tsr->toMap() : null;
        }
        if (null !== $this->textNotaryType) {
            $res['text_notary_type'] = $this->textNotaryType;
        }
        if (null !== $this->hashAlgorithm) {
            $res['hash_algorithm'] = $this->hashAlgorithm;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetTextResponse
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
        if (isset($map['tsr'])) {
            $model->tsr = TsrResponse::fromMap($map['tsr']);
        }
        if (isset($map['text_notary_type'])) {
            $model->textNotaryType = $map['text_notary_type'];
        }
        if (isset($map['hash_algorithm'])) {
            $model->hashAlgorithm = $map['hash_algorithm'];
        }

        return $model;
    }
}
