<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\DictionaryInfoBO;

class AgentInfoVO extends Model {
    protected $_name = [
        'agentId' => 'agent_id',
        'agentName' => 'agent_name',
        'langCode' => 'lang_code',
        'ttsVoiceId' => 'tts_voice_id',
        'systemPrompt' => 'system_prompt',
        'llmModelList' => 'llm_model_list',
        'ttsVoiceList' => 'tts_voice_list',
        'languageList' => 'language_list',
        'parentTemplateAgentName' => 'parent_template_agent_name',
    ];
    public function validate() {
        Model::validateRequired('agentId', $this->agentId, true);
        Model::validateRequired('agentName', $this->agentName, true);
        Model::validateRequired('langCode', $this->langCode, true);
        Model::validateRequired('ttsVoiceId', $this->ttsVoiceId, true);
        Model::validateRequired('systemPrompt', $this->systemPrompt, true);
    }
    public function toMap() {
        $res = [];
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
        if (null !== $this->llmModelList) {
            $res['llm_model_list'] = [];
            if(null !== $this->llmModelList && is_array($this->llmModelList)){
                $n = 0;
                foreach($this->llmModelList as $item){
                    $res['llm_model_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->ttsVoiceList) {
            $res['tts_voice_list'] = [];
            if(null !== $this->ttsVoiceList && is_array($this->ttsVoiceList)){
                $n = 0;
                foreach($this->ttsVoiceList as $item){
                    $res['tts_voice_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->languageList) {
            $res['language_list'] = [];
            if(null !== $this->languageList && is_array($this->languageList)){
                $n = 0;
                foreach($this->languageList as $item){
                    $res['language_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->parentTemplateAgentName) {
            $res['parent_template_agent_name'] = $this->parentTemplateAgentName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AgentInfoVO
     */
    public static function fromMap($map = []) {
        $model = new self();
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
        if(isset($map['llm_model_list'])){
            if(!empty($map['llm_model_list'])){
                $model->llmModelList = [];
                $n = 0;
                foreach($map['llm_model_list'] as $item) {
                    $model->llmModelList[$n++] = null !== $item ? DictionaryInfoBO::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['tts_voice_list'])){
            if(!empty($map['tts_voice_list'])){
                $model->ttsVoiceList = [];
                $n = 0;
                foreach($map['tts_voice_list'] as $item) {
                    $model->ttsVoiceList[$n++] = null !== $item ? DictionaryInfoBO::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['language_list'])){
            if(!empty($map['language_list'])){
                $model->languageList = [];
                $n = 0;
                foreach($map['language_list'] as $item) {
                    $model->languageList[$n++] = null !== $item ? DictionaryInfoBO::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['parent_template_agent_name'])){
            $model->parentTemplateAgentName = $map['parent_template_agent_name'];
        }
        return $model;
    }
    // 智能体ID
    /**
     * @example 7265889323732762624
     * @var string
     */
    public $agentId;

    // 智能体名称
    /**
     * @example 小蚁
     * @var string
     */
    public $agentName;

    // 语言编码
    /**
     * @example zh
     * @var string
     */
    public $langCode;

    // 音色ID
    /**
     * @example longjing_v2
     * @var string
     */
    public $ttsVoiceId;

    // 系统提示词
    /**
     * @example 你是一个某某智能体
     * @var string
     */
    public $systemPrompt;

    // 可选模型列表
    /**
     * @example [{"label":"qwen-plus","value":"qwen-plus"},{"label":"glm4.7","value":"glm4.7"},{"label":"glm5","value":"glm5"}]
     * @var DictionaryInfoBO[]
     */
    public $llmModelList;

    // 可选音色列表
    /**
     * @example [{"label":"甜甜（女声普通话）","value":"Tina"},{"label":"拉迪奥·戈尔（男声葡萄牙语）","value":"Radio Gol"}]
     * @var DictionaryInfoBO[]
     */
    public $ttsVoiceList;

    // 可选语言列表
    /**
     * @example [{"label": "中文","value": "zh"},{"label": "英文","value": "en"}]
     * @var DictionaryInfoBO[]
     */
    public $languageList;

    // 父模板智能体名称
    /**
     * @example 小蚁模板
     * @var string
     */
    public $parentTemplateAgentName;

}
