<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ANTVERSE\Models;

use AlibabaCloud\Tea\Model;

class SendLiveMessageRequest extends Model
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

    // 问题
    /**
     * @var string
     */
    public $question;

    // 回答文本
    /**
     * @var string
     */
    public $answer;

    // 插播类型(QA-问答插播,REAL_TIME-实时消息插播)
    /**
     * @var string
     */
    public $intercutType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'question'          => 'question',
        'answer'            => 'answer',
        'intercutType'      => 'intercut_type',
    ];

    public function validate()
    {
        Model::validateRequired('answer', $this->answer, true);
        Model::validateRequired('intercutType', $this->intercutType, true);
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
        if (null !== $this->question) {
            $res['question'] = $this->question;
        }
        if (null !== $this->answer) {
            $res['answer'] = $this->answer;
        }
        if (null !== $this->intercutType) {
            $res['intercut_type'] = $this->intercutType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendLiveMessageRequest
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
        if (isset($map['question'])) {
            $model->question = $map['question'];
        }
        if (isset($map['answer'])) {
            $model->answer = $map['answer'];
        }
        if (isset($map['intercut_type'])) {
            $model->intercutType = $map['intercut_type'];
        }

        return $model;
    }
}
