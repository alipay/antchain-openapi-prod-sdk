<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class OpenApiVoiceInfo extends Model {
    protected $_name = [
        'voiceId' => 'voice_id',
        'name' => 'name',
        'languages' => 'languages',
        'supportedFields' => 'supported_fields',
    ];
    public function validate() {
        Model::validateRequired('voiceId', $this->voiceId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('languages', $this->languages, true);
        Model::validateRequired('supportedFields', $this->supportedFields, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->voiceId) {
            $res['voice_id'] = $this->voiceId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->languages) {
            $res['languages'] = $this->languages;
        }
        if (null !== $this->supportedFields) {
            $res['supported_fields'] = $this->supportedFields;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpenApiVoiceInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['voice_id'])){
            $model->voiceId = $map['voice_id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['languages'])){
            if(!empty($map['languages'])){
                $model->languages = $map['languages'];
            }
        }
        if(isset($map['supported_fields'])){
            if(!empty($map['supported_fields'])){
                $model->supportedFields = $map['supported_fields'];
            }
        }
        return $model;
    }
    /**
     * @example undefined
     * @var string
     */
    public $voiceId;

    /**
     * @example undefined
     * @var string
     */
    public $name;

    /**
     * @example undefined
     * @var string[]
     */
    public $languages;

    // 由实际TTS适配器能力产生；不支持的显式参数拒绝，不接受后静默丢弃；枚举:speed,pitch,volume
    /**
     * @example undefined
     * @var string[]
     */
    public $supportedFields;

}
