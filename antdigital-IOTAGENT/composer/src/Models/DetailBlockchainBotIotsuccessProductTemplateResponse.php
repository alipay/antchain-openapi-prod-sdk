<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IOTAGENT\Models\OpenApiVoiceParameters;

class DetailBlockchainBotIotsuccessProductTemplateResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'language' => 'language',
        'voiceId' => 'voice_id',
        'rolePrompt' => 'role_prompt',
        'modelId' => 'model_id',
        'voiceParameters' => 'voice_parameters',
        'templateId' => 'template_id',
        'name' => 'name',
        'defaultTemplate' => 'default_template',
        'baseTemplateId' => 'base_template_id',
    ];
    public function validate() {
        Model::validateRequired('language', $this->language, true);
        Model::validateRequired('voiceId', $this->voiceId, true);
        Model::validateRequired('rolePrompt', $this->rolePrompt, true);
        Model::validateRequired('modelId', $this->modelId, true);
        Model::validateRequired('voiceParameters', $this->voiceParameters, true);
        Model::validateRequired('templateId', $this->templateId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('defaultTemplate', $this->defaultTemplate, true);
    }
    public function toMap() {
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
        if (null !== $this->language) {
            $res['language'] = $this->language;
        }
        if (null !== $this->voiceId) {
            $res['voice_id'] = $this->voiceId;
        }
        if (null !== $this->rolePrompt) {
            $res['role_prompt'] = $this->rolePrompt;
        }
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }
        if (null !== $this->voiceParameters) {
            $res['voice_parameters'] = null !== $this->voiceParameters ? $this->voiceParameters->toMap() : null;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->defaultTemplate) {
            $res['default_template'] = $this->defaultTemplate;
        }
        if (null !== $this->baseTemplateId) {
            $res['base_template_id'] = $this->baseTemplateId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DetailBlockchainBotIotsuccessProductTemplateResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['language'])){
            $model->language = $map['language'];
        }
        if(isset($map['voice_id'])){
            $model->voiceId = $map['voice_id'];
        }
        if(isset($map['role_prompt'])){
            $model->rolePrompt = $map['role_prompt'];
        }
        if(isset($map['model_id'])){
            $model->modelId = $map['model_id'];
        }
        if(isset($map['voice_parameters'])){
            $model->voiceParameters = OpenApiVoiceParameters::fromMap($map['voice_parameters']);
        }
        if(isset($map['template_id'])){
            $model->templateId = $map['template_id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['default_template'])){
            $model->defaultTemplate = $map['default_template'];
        }
        if(isset($map['base_template_id'])){
            $model->baseTemplateId = $map['base_template_id'];
        }
        return $model;
    }
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

    /**
     * @var string
     */
    public $language;

    /**
     * @var string
     */
    public $voiceId;

    /**
     * @var string
     */
    public $rolePrompt;

    /**
     * @var string
     */
    public $modelId;

    /**
     * @var OpenApiVoiceParameters
     */
    public $voiceParameters;

    /**
     * @var string
     */
    public $templateId;

    /**
     * @var string
     */
    public $name;

    /**
     * @var bool
     */
    public $defaultTemplate;

    /**
     * @var string
     */
    public $baseTemplateId;

}
