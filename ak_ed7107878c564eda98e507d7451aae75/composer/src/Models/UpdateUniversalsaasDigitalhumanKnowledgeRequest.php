<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models;

use AlibabaCloud\Tea\Model;

class UpdateUniversalsaasDigitalhumanKnowledgeRequest extends Model
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

    // 租户编码
    /**
     * @var string
     */
    public $tenantCode;

    // 知识库ID
    /**
     * @var int
     */
    public $libraryId;

    // 知识点id
    /**
     * @var int
     */
    public $id;

    // 标问标题
    /**
     * @var string
     */
    public $questionTitle;

    // 问法列表
    /**
     * @var string[]
     */
    public $sentenceList;

    // 答案文案
    /**
     * @var string
     */
    public $content;

    // 动画播报内容
    /**
     * @var string
     */
    public $broadcastContent;

    // 行动点配置
    /**
     * @var BubbleButton[]
     */
    public $bubbleButtonConfig;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'tenantCode'         => 'tenant_code',
        'libraryId'          => 'library_id',
        'id'                 => 'id',
        'questionTitle'      => 'question_title',
        'sentenceList'       => 'sentence_list',
        'content'            => 'content',
        'broadcastContent'   => 'broadcast_content',
        'bubbleButtonConfig' => 'bubble_button_config',
    ];

    public function validate()
    {
        Model::validateRequired('tenantCode', $this->tenantCode, true);
        Model::validateRequired('libraryId', $this->libraryId, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('questionTitle', $this->questionTitle, true);
        Model::validateRequired('sentenceList', $this->sentenceList, true);
        Model::validateRequired('content', $this->content, true);
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
        if (null !== $this->tenantCode) {
            $res['tenant_code'] = $this->tenantCode;
        }
        if (null !== $this->libraryId) {
            $res['library_id'] = $this->libraryId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->questionTitle) {
            $res['question_title'] = $this->questionTitle;
        }
        if (null !== $this->sentenceList) {
            $res['sentence_list'] = $this->sentenceList;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->broadcastContent) {
            $res['broadcast_content'] = $this->broadcastContent;
        }
        if (null !== $this->bubbleButtonConfig) {
            $res['bubble_button_config'] = [];
            if (null !== $this->bubbleButtonConfig && \is_array($this->bubbleButtonConfig)) {
                $n = 0;
                foreach ($this->bubbleButtonConfig as $item) {
                    $res['bubble_button_config'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateUniversalsaasDigitalhumanKnowledgeRequest
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
        if (isset($map['tenant_code'])) {
            $model->tenantCode = $map['tenant_code'];
        }
        if (isset($map['library_id'])) {
            $model->libraryId = $map['library_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['question_title'])) {
            $model->questionTitle = $map['question_title'];
        }
        if (isset($map['sentence_list'])) {
            if (!empty($map['sentence_list'])) {
                $model->sentenceList = $map['sentence_list'];
            }
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['broadcast_content'])) {
            $model->broadcastContent = $map['broadcast_content'];
        }
        if (isset($map['bubble_button_config'])) {
            if (!empty($map['bubble_button_config'])) {
                $model->bubbleButtonConfig = [];
                $n                         = 0;
                foreach ($map['bubble_button_config'] as $item) {
                    $model->bubbleButtonConfig[$n++] = null !== $item ? BubbleButton::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
