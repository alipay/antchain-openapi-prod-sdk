<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

use AntChain\CREATIVERENDER\Models\CreativeAssetRef;

class ExecAntcloudMarketingagentCreativeStoryboardRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'fileId' => 'file_id',
        'prompt' => 'prompt',
        'videoModel' => 'video_model',
        'ratio' => 'ratio',
        'resolution' => 'resolution',
        'mediaRefs' => 'media_refs',
        'sessionId' => 'session_id',
        'canvasId' => 'canvas_id',
    ];
    public function validate() {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('prompt', $this->prompt, true);
        Model::validateRequired('mediaRefs', $this->mediaRefs, true);
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
        if (null !== $this->prompt) {
            $res['prompt'] = $this->prompt;
        }
        if (null !== $this->videoModel) {
            $res['video_model'] = $this->videoModel;
        }
        if (null !== $this->ratio) {
            $res['ratio'] = $this->ratio;
        }
        if (null !== $this->resolution) {
            $res['resolution'] = $this->resolution;
        }
        if (null !== $this->mediaRefs) {
            $res['media_refs'] = null !== $this->mediaRefs ? $this->mediaRefs->toMap() : null;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->canvasId) {
            $res['canvas_id'] = $this->canvasId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecAntcloudMarketingagentCreativeStoryboardRequest
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
        if(isset($map['prompt'])){
            $model->prompt = $map['prompt'];
        }
        if(isset($map['video_model'])){
            $model->videoModel = $map['video_model'];
        }
        if(isset($map['ratio'])){
            $model->ratio = $map['ratio'];
        }
        if(isset($map['resolution'])){
            $model->resolution = $map['resolution'];
        }
        if(isset($map['media_refs'])){
            $model->mediaRefs = CreativeAssetRef::fromMap($map['media_refs']);
        }
        if(isset($map['session_id'])){
            $model->sessionId = $map['session_id'];
        }
        if(isset($map['canvas_id'])){
            $model->canvasId = $map['canvas_id'];
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

    // 拆解要求
    /**
     * @var string
     */
    public $prompt;

    // 模型
    /**
     * @var string
     */
    public $videoModel;

    // 画幅
    /**
     * @var string
     */
    public $ratio;

    // 分辨率
    /**
     * @var int
     */
    public $resolution;

    // 原视频+替换图片
    /**
     * @var CreativeAssetRef
     */
    public $mediaRefs;

    // 会话ID
    /**
     * @var string
     */
    public $sessionId;

    // 画布ID
    /**
     * @var string
     */
    public $canvasId;

}
