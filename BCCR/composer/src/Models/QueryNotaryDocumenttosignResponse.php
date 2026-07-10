<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryNotaryDocumenttosignResponse extends Model
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

    // 需要用户签署的文件列表
    /**
     * @var SignDocument[]
     */
    public $signDocumentList;

    // 生成文件的时间，需要在提交申办接口传入
    /**
     * @var int
     */
    public $previewTime;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'signDocumentList' => 'sign_document_list',
        'previewTime'      => 'preview_time',
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
        if (null !== $this->signDocumentList) {
            $res['sign_document_list'] = [];
            if (null !== $this->signDocumentList && \is_array($this->signDocumentList)) {
                $n = 0;
                foreach ($this->signDocumentList as $item) {
                    $res['sign_document_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->previewTime) {
            $res['preview_time'] = $this->previewTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryNotaryDocumenttosignResponse
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
        if (isset($map['sign_document_list'])) {
            if (!empty($map['sign_document_list'])) {
                $model->signDocumentList = [];
                $n                       = 0;
                foreach ($map['sign_document_list'] as $item) {
                    $model->signDocumentList[$n++] = null !== $item ? SignDocument::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['preview_time'])) {
            $model->previewTime = $map['preview_time'];
        }

        return $model;
    }
}
