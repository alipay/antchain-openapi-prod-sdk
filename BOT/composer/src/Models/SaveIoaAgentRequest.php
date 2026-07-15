<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SaveIoaAgentRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'agentId' => 'agent_id',
        'agentName' => 'agent_name',
        'langCode' => 'lang_code',
        'ttsVoiceId' => 'tts_voice_id',
        'systemPrompt' => 'system_prompt',
        'parentTemplateAgentId' => 'parent_template_agent_id',
    ];
    public function validate() {
        Model::validateRequired('agentId', $this->agentId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->agentId) {
            $res['agent_id'] = $this->agentId;
        }
        if (null !== $this->agentName) {
            $res['agent_name'] = $this->agentName;
        }
        if (null !== $this->langCode) {
            $res['lang_code'] = $this->langCode;
        }
        if (null !== $this->ttsVoiceId) {
            $res['tts_voice_id'] = $this->ttsVoiceId;
        }
        if (null !== $this->systemPrompt) {
            $res['system_prompt'] = $this->systemPrompt;
        }
        if (null !== $this->parentTemplateAgentId) {
            $res['parent_template_agent_id'] = $this->parentTemplateAgentId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SaveIoaAgentRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['agent_id'])){
            $model->agentId = $map['agent_id'];
        }
        if(isset($map['agent_name'])){
            $model->agentName = $map['agent_name'];
        }
        if(isset($map['lang_code'])){
            $model->langCode = $map['lang_code'];
        }
        if(isset($map['tts_voice_id'])){
            $model->ttsVoiceId = $map['tts_voice_id'];
        }
        if(isset($map['system_prompt'])){
            $model->systemPrompt = $map['system_prompt'];
        }
        if(isset($map['parent_template_agent_id'])){
            $model->parentTemplateAgentId = $map['parent_template_agent_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 智能体ID
    /**
     * @var string
     */
    public $agentId;

    // 智能体名称
    /**
     * @var string
     */
    public $agentName;

    // 语言Code
    /**
     * @var string
     */
    public $langCode;

    // 音色ID
    /**
     * @var string
     */
    public $ttsVoiceId;

    // 系统提示词
    /**
     * @var string
     */
    public $systemPrompt;

    // 父模板智能体ID
    /**
     * @var string
     */
    public $parentTemplateAgentId;

}
