<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_f0f16236ed254bd499e3fe0f9600e0d5\Models;

use AlibabaCloud\Tea\Model;

class UploadMaxCopilotKnowledgeResponse extends Model
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

    // 知识库文件id
    /**
     * @var string
     */
    public $knowledgeId;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'knowledgeId' => 'knowledge_id',
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
        if (null !== $this->knowledgeId) {
            $res['knowledge_id'] = $this->knowledgeId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadMaxCopilotKnowledgeResponse
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
        if (isset($map['knowledge_id'])) {
            $model->knowledgeId = $map['knowledge_id'];
        }

        return $model;
    }
}
