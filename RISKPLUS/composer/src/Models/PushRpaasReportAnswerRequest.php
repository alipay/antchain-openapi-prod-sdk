<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class PushRpaasReportAnswerRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // chat trace id
    /**
     * @var string
     */
    public $chatTraceId;

    // 响应结果
    /**
     * @var string
     */
    public $answer;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'chatTraceId'       => 'chat_trace_id',
        'answer'            => 'answer',
    ];

    public function validate()
    {
        Model::validateRequired('chatTraceId', $this->chatTraceId, true);
        Model::validateRequired('answer', $this->answer, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->chatTraceId) {
            $res['chat_trace_id'] = $this->chatTraceId;
        }
        if (null !== $this->answer) {
            $res['answer'] = $this->answer;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushRpaasReportAnswerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['chat_trace_id'])) {
            $model->chatTraceId = $map['chat_trace_id'];
        }
        if (isset($map['answer'])) {
            $model->answer = $map['answer'];
        }

        return $model;
    }
}
