<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models;

use AlibabaCloud\Tea\Model;

class AvatarLlmChatInfo extends Model
{
    // 大模型对话配置编码
    /**
     * @example 8810606430954027635
     *
     * @var string
     */
    public $llmChatCode;

    // 大模型对话配置名
    /**
     * @example 智能体
     *
     * @var string
     */
    public $llmChatName;

    // 描述
    /**
     * @example 大模型
     *
     * @var string
     */
    public $description;

    // 模型配置名
    /**
     * @example 百炼
     *
     * @var string
     */
    public $modelName;

    // 模型配置编码
    /**
     * @example bailian
     *
     * @var string
     */
    public $modelCode;

    // 模型配置id
    /**
     * @example 1
     *
     * @var string
     */
    public $modelId;

    // 大模型对话自定义配置信息
    /**
     * @example {}
     *
     * @var string
     */
    public $config;
    protected $_name = [
        'llmChatCode' => 'llm_chat_code',
        'llmChatName' => 'llm_chat_name',
        'description' => 'description',
        'modelName'   => 'model_name',
        'modelCode'   => 'model_code',
        'modelId'     => 'model_id',
        'config'      => 'config',
    ];

    public function validate()
    {
        Model::validateRequired('llmChatCode', $this->llmChatCode, true);
        Model::validateRequired('llmChatName', $this->llmChatName, true);
        Model::validateRequired('modelName', $this->modelName, true);
        Model::validateRequired('modelCode', $this->modelCode, true);
        Model::validateRequired('modelId', $this->modelId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->llmChatCode) {
            $res['llm_chat_code'] = $this->llmChatCode;
        }
        if (null !== $this->llmChatName) {
            $res['llm_chat_name'] = $this->llmChatName;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->modelName) {
            $res['model_name'] = $this->modelName;
        }
        if (null !== $this->modelCode) {
            $res['model_code'] = $this->modelCode;
        }
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }
        if (null !== $this->config) {
            $res['config'] = $this->config;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AvatarLlmChatInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['llm_chat_code'])) {
            $model->llmChatCode = $map['llm_chat_code'];
        }
        if (isset($map['llm_chat_name'])) {
            $model->llmChatName = $map['llm_chat_name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['model_name'])) {
            $model->modelName = $map['model_name'];
        }
        if (isset($map['model_code'])) {
            $model->modelCode = $map['model_code'];
        }
        if (isset($map['model_id'])) {
            $model->modelId = $map['model_id'];
        }
        if (isset($map['config'])) {
            $model->config = $map['config'];
        }

        return $model;
    }
}
