<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IOTAGENT\Models\OpenApiVoiceParameters;

class OpenApiTemplateInfo extends Model {
    protected $_name = [
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
     * @return OpenApiTemplateInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
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
    /**
     * @example undefined
     * @var string
     */
    public $language;

    /**
     * @example id_example
     * @var string
     */
    public $voiceId;

    /**
     * @example 示例说明
     * @var string
     */
    public $rolePrompt;

    /**
     * @example id_example
     * @var string
     */
    public $modelId;

    /**
     * @example undefined
     * @var OpenApiVoiceParameters
     */
    public $voiceParameters;

    /**
     * @example id_example
     * @var string
     */
    public $templateId;

    /**
     * @example 测试产品
     * @var string
     */
    public $name;

    /**
     * @example undefined
     * @var bool
     */
    public $defaultTemplate;

    /**
     * @example undefined
     * @var string
     */
    public $baseTemplateId;

}
