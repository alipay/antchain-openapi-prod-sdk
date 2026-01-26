<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AICLAIM\Models;

use AlibabaCloud\Tea\Model;

class QueryImageExtractionResponse extends Model
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

    // 任务号
    /**
     * @var string
     */
    public $batchNo;

    // 参考Document参数
    /**
     * @var Document[]
     */
    public $documents;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'batchNo'    => 'batch_no',
        'documents'  => 'documents',
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
        if (null !== $this->batchNo) {
            $res['batch_no'] = $this->batchNo;
        }
        if (null !== $this->documents) {
            $res['documents'] = [];
            if (null !== $this->documents && \is_array($this->documents)) {
                $n = 0;
                foreach ($this->documents as $item) {
                    $res['documents'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryImageExtractionResponse
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
        if (isset($map['batch_no'])) {
            $model->batchNo = $map['batch_no'];
        }
        if (isset($map['documents'])) {
            if (!empty($map['documents'])) {
                $model->documents = [];
                $n                = 0;
                foreach ($map['documents'] as $item) {
                    $model->documents[$n++] = null !== $item ? Document::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
