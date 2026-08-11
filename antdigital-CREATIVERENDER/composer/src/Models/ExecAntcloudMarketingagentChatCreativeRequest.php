<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVERENDER\Models\CreativeAssetRef;

class ExecAntcloudMarketingagentChatCreativeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'sessionId' => 'session_id',
        'entryType' => 'entry_type',
        'prompt' => 'prompt',
        'referenceStyle' => 'reference_style',
        'inputElements' => 'input_elements',
        'scene' => 'scene',
        'width' => 'width',
        'height' => 'height',
    ];
    public function validate() {
        Model::validateRequired('prompt', $this->prompt, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->entryType) {
            $res['entry_type'] = $this->entryType;
        }
        if (null !== $this->prompt) {
            $res['prompt'] = $this->prompt;
        }
        if (null !== $this->referenceStyle) {
            $res['reference_style'] = null !== $this->referenceStyle ? $this->referenceStyle->toMap() : null;
        }
        if (null !== $this->inputElements) {
            $res['input_elements'] = [];
            if(null !== $this->inputElements && is_array($this->inputElements)){
                $n = 0;
                foreach($this->inputElements as $item){
                    $res['input_elements'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->width) {
            $res['width'] = $this->width;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecAntcloudMarketingagentChatCreativeRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['session_id'])){
            $model->sessionId = $map['session_id'];
        }
        if(isset($map['entry_type'])){
            $model->entryType = $map['entry_type'];
        }
        if(isset($map['prompt'])){
            $model->prompt = $map['prompt'];
        }
        if(isset($map['reference_style'])){
            $model->referenceStyle = CreativeAssetRef::fromMap($map['reference_style']);
        }
        if(isset($map['input_elements'])){
            if(!empty($map['input_elements'])){
                $model->inputElements = [];
                $n = 0;
                foreach($map['input_elements'] as $item) {
                    $model->inputElements[$n++] = null !== $item ? CreativeAssetRef::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['scene'])){
            $model->scene = $map['scene'];
        }
        if(isset($map['width'])){
            $model->width = $map['width'];
        }
        if(isset($map['height'])){
            $model->height = $map['height'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 会话ID，如需支持多轮对话，需要传入之前的会话ID
    /**
     * @var string
     */
    public $sessionId;

    // 服务类型（默认IMAGE_RENDER）
    /**
     * @var string
     */
    public $entryType;

    // 表达用户意图
    /**
     * @var string
     */
    public $prompt;

    // 参考样式
    /**
     * @var CreativeAssetRef
     */
    public $referenceStyle;

    // 输入元素
    /**
     * @var CreativeAssetRef[]
     */
    public $inputElements;

    // 使用场景
    /**
     * @var string
     */
    public $scene;

    // 生图宽度
    /**
     * @var int
     */
    public $width;

    // 生图高度
    /**
     * @var int
     */
    public $height;

}
