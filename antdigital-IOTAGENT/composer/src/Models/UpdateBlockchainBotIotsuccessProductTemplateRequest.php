<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IOTAGENT\Models\OpenApiVoiceParameters;

class UpdateBlockchainBotIotsuccessProductTemplateRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productKey' => 'product_key',
        'templateId' => 'template_id',
        'language' => 'language',
        'voiceId' => 'voice_id',
        'rolePrompt' => 'role_prompt',
        'modelId' => 'model_id',
        'voiceParameters' => 'voice_parameters',
    ];
    public function validate() {
        Model::validateRequired('productKey', $this->productKey, true);
        Model::validateRequired('templateId', $this->templateId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->productKey) {
            $res['product_key'] = $this->productKey;
        }
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
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
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateBlockchainBotIotsuccessProductTemplateRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['product_key'])){
            $model->productKey = $map['product_key'];
        }
        if(isset($map['template_id'])){
            $model->templateId = $map['template_id'];
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

    /**
     * @var string
     */
    public $productKey;

    /**
     * @var string
     */
    public $templateId;

    // 支持的BCP47语言值，目录为准
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

}
