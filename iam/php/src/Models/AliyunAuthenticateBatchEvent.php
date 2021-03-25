<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IAM\Models\AliyunRamAuthContext;
use AntChain\IAM\Models\AliyunPopRequestInfo;

class AliyunAuthenticateBatchEvent extends Model {
    protected $_name = [
        'userId' => 'user_id',
        'ramAuthContexts' => 'ram_auth_contexts',
        'requestInfo' => 'request_info',
    ];
    public function validate() {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('ramAuthContexts', $this->ramAuthContexts, true);
        Model::validateRequired('requestInfo', $this->requestInfo, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->ramAuthContexts) {
            $res['ram_auth_contexts'] = [];
            if(null !== $this->ramAuthContexts && is_array($this->ramAuthContexts)){
                $n = 0;
                foreach($this->ramAuthContexts as $item){
                    $res['ram_auth_contexts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->requestInfo) {
            $res['request_info'] = null !== $this->requestInfo ? $this->requestInfo->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AliyunAuthenticateBatchEvent
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['ram_auth_contexts'])){
            if(!empty($map['ram_auth_contexts'])){
                $model->ramAuthContexts = [];
                $n = 0;
                foreach($map['ram_auth_contexts'] as $item) {
                    $model->ramAuthContexts[$n++] = null !== $item ? AliyunRamAuthContext::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['request_info'])){
            $model->requestInfo = AliyunPopRequestInfo::fromMap($map['request_info']);
        }
        return $model;
    }
    // 金融云用户ID
    /**
     * @example 123
     * @var string
     */
    public $userId;

    // 阿里云鉴权列表
    /**
     * @example 
     * @var AliyunRamAuthContext[]
     */
    public $ramAuthContexts;

    // BSB透传下来的阿里云信息
    /**
     * @example 
     * @var AliyunPopRequestInfo
     */
    public $requestInfo;

}
