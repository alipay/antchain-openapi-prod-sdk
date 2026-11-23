<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class ExecAntcloudMarketingagentCreativeRemakeRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'fileId' => 'file_id',
        'storyboardMessageId' => 'storyboard_message_id',
        'newStoryboardScript' => 'new_storyboard_script',
        'sessionId' => 'session_id',
        'canvasId' => 'canvas_id',
        'prompt' => 'prompt',
    ];
    public function validate() {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('storyboardMessageId', $this->storyboardMessageId, true);
        Model::validateRequired('newStoryboardScript', $this->newStoryboardScript, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->fileObject) {
            $res['fileObject'] = $this->fileObject;
        }
        if (null !== $this->fileObjectName) {
            $res['fileObjectName'] = $this->fileObjectName;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
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
        if (null !== $this->canvasId) {
            $res['canvas_id'] = $this->canvasId;
        }
        if (null !== $this->prompt) {
            $res['prompt'] = $this->prompt;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecAntcloudMarketingagentCreativeRemakeRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['fileObject'])){
            $model->fileObject = $map['fileObject'];
        }
        if(isset($map['fileObjectName'])){
            $model->fileObjectName = $map['fileObjectName'];
        }
        if(isset($map['file_id'])){
            $model->fileId = $map['file_id'];
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
        if(isset($map['canvas_id'])){
            $model->canvasId = $map['canvas_id'];
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

    // string
    /**
     * @description 待上传文件
     * @var Stream
     */
    public $fileObject;

    /**
     * @description 待上传文件名
     * @var string
     */
    public $fileObjectName;

    /**
     * @var string
     */
    public $fileId;

    // 阶段一 task_id（= 阶段一 messageId），后端据此反查阶段一全部快照
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

    // 画布id
    /**
     * @var string
     */
    public $canvasId;

    // 本轮 USER 消息展示文案
    /**
     * @var string
     */
    public $prompt;

}
