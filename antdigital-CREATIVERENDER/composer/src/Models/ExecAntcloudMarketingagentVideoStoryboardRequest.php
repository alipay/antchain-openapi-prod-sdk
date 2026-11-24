<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVERENDER\Models\CreativeVideoAssetRef;

class ExecAntcloudMarketingagentVideoStoryboardRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'prompt' => 'prompt',
        'videoModel' => 'video_model',
        'ratio' => 'ratio',
        'resolution' => 'resolution',
        'mediaRefs' => 'media_refs',
        'sessionId' => 'session_id',
    ];
    public function validate() {
        Model::validateRequired('prompt', $this->prompt, true);
        Model::validateRequired('mediaRefs', $this->mediaRefs, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
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
            $res['media_refs'] = [];
            if(null !== $this->mediaRefs && is_array($this->mediaRefs)){
                $n = 0;
                foreach($this->mediaRefs as $item){
                    $res['media_refs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecAntcloudMarketingagentVideoStoryboardRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
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
            if(!empty($map['media_refs'])){
                $model->mediaRefs = [];
                $n = 0;
                foreach($map['media_refs'] as $item) {
                    $model->mediaRefs[$n++] = null !== $item ? CreativeVideoAssetRef::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['session_id'])){
            $model->sessionId = $map['session_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

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
     * @var CreativeVideoAssetRef[]
     */
    public $mediaRefs;

    // 会话ID
    /**
     * @var string
     */
    public $sessionId;

}
