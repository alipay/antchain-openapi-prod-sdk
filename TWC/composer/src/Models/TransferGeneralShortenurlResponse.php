<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class TransferGeneralShortenurlResponse extends Model
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

    // 短链接
    /**
     * @var string
     */
    public $targetUrl;

    // 原网址
    /**
     * @var string
     */
    public $sourceUrl;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'targetUrl'  => 'target_url',
        'sourceUrl'  => 'source_url',
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
        if (null !== $this->targetUrl) {
            $res['target_url'] = $this->targetUrl;
        }
        if (null !== $this->sourceUrl) {
            $res['source_url'] = $this->sourceUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransferGeneralShortenurlResponse
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
        if (isset($map['target_url'])) {
            $model->targetUrl = $map['target_url'];
        }
        if (isset($map['source_url'])) {
            $model->sourceUrl = $map['source_url'];
        }

        return $model;
    }
}
