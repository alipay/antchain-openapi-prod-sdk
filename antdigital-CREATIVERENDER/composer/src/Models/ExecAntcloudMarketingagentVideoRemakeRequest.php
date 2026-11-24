<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

class ExecAntcloudMarketingagentVideoRemakeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'storyboardMessageId' => 'storyboard_message_id',
        'newStoryboardScript' => 'new_storyboard_script',
        'sessionId' => 'session_id',
        'prompt' => 'prompt',
    ];
    public function validate() {
        Model::validateRequired('storyboardMessageId', $this->storyboardMessageId, true);
        Model::validateRequired('newStoryboardScript', $this->newStoryboardScript, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->storyboardMessageId) {
            $res['storyboard_message_id'] = $this->storyboardMessageId;
        }
        if (null !== $this->newStoryboardScript) {
            $res['new_storyboard_script'] = $this->newStoryboardScript;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->prompt) {
            $res['prompt'] = $this->prompt;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecAntcloudMarketingagentVideoRemakeRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['storyboard_message_id'])){
            $model->storyboardMessageId = $map['storyboard_message_id'];
        }
        if(isset($map['new_storyboard_script'])){
            $model->newStoryboardScript = $map['new_storyboard_script'];
        }
        if(isset($map['session_id'])){
            $model->sessionId = $map['session_id'];
        }
        if(isset($map['prompt'])){
            $model->prompt = $map['prompt'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 阶段一 task_id（= 阶段一 messageId）
    /**
     * @var string
     */
    public $storyboardMessageId;

    // 用户编辑后的新分镜脚本（纯字符串）；
    /**
     * @var string
     */
    public $newStoryboardScript;

    // 拆解返回的会话id
    /**
     * @var string
     */
    public $sessionId;

    // 本轮 USER 消息展示文案
    /**
     * @var string
     */
    public $prompt;

}
