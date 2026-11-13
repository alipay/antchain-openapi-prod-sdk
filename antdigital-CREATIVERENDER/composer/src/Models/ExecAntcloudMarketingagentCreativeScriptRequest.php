<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

class ExecAntcloudMarketingagentCreativeScriptRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'prompt' => 'prompt',
    ];
    public function validate() {
        Model::validateRequired('prompt', $this->prompt, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->prompt) {
            $res['prompt'] = $this->prompt;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecAntcloudMarketingagentCreativeScriptRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
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

    // 待扩写的原始脚本或简要描述，复用现有文生视频的脚本扩写逻辑
    /**
     * @var string
     */
    public $prompt;

}
