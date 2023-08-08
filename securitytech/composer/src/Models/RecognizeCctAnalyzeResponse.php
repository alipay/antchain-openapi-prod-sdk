<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class RecognizeCctAnalyzeResponse extends Model
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

    // biz_request_id
    /**
     * @var string
     */
    public $bizRequestId;

    // suggestion
    /**
     * @var string
     */
    public $suggestion;

    // detect_labels
    /**
     * @var CctDetectCheckLabel[]
     */
    public $detectLabels;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'bizRequestId' => 'biz_request_id',
        'suggestion'   => 'suggestion',
        'detectLabels' => 'detect_labels',
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
        if (null !== $this->bizRequestId) {
            $res['biz_request_id'] = $this->bizRequestId;
        }
        if (null !== $this->suggestion) {
            $res['suggestion'] = $this->suggestion;
        }
        if (null !== $this->detectLabels) {
            $res['detect_labels'] = [];
            if (null !== $this->detectLabels && \is_array($this->detectLabels)) {
                $n = 0;
                foreach ($this->detectLabels as $item) {
                    $res['detect_labels'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RecognizeCctAnalyzeResponse
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
        if (isset($map['biz_request_id'])) {
            $model->bizRequestId = $map['biz_request_id'];
        }
        if (isset($map['suggestion'])) {
            $model->suggestion = $map['suggestion'];
        }
        if (isset($map['detect_labels'])) {
            if (!empty($map['detect_labels'])) {
                $model->detectLabels = [];
                $n                   = 0;
                foreach ($map['detect_labels'] as $item) {
                    $model->detectLabels[$n++] = null !== $item ? CctDetectCheckLabel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
