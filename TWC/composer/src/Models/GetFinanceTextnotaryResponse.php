<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class GetFinanceTextnotaryResponse extends Model
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

    // 哈希算法
    /**
     * @var string
     */
    public $hashAlgorithm;

    // 文本哈希
    /**
     * @var string
     */
    public $textHash;

    // 可信时间戳
    /**
     * @var TsrResponse
     */
    public $tsr;

    // 存证阶段
    /**
     * @var string
     */
    public $phase;

    // 扩展属性
    /**
     * @var string
     */
    public $properties;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'hashAlgorithm' => 'hash_algorithm',
        'textHash'      => 'text_hash',
        'tsr'           => 'tsr',
        'phase'         => 'phase',
        'properties'    => 'properties',
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
        if (null !== $this->hashAlgorithm) {
            $res['hash_algorithm'] = $this->hashAlgorithm;
        }
        if (null !== $this->textHash) {
            $res['text_hash'] = $this->textHash;
        }
        if (null !== $this->tsr) {
            $res['tsr'] = null !== $this->tsr ? $this->tsr->toMap() : null;
        }
        if (null !== $this->phase) {
            $res['phase'] = $this->phase;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetFinanceTextnotaryResponse
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
        if (isset($map['hash_algorithm'])) {
            $model->hashAlgorithm = $map['hash_algorithm'];
        }
        if (isset($map['text_hash'])) {
            $model->textHash = $map['text_hash'];
        }
        if (isset($map['tsr'])) {
            $model->tsr = TsrResponse::fromMap($map['tsr']);
        }
        if (isset($map['phase'])) {
            $model->phase = $map['phase'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }

        return $model;
    }
}
