<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudMarketingagentCreativeImageeditRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'messageId' => 'message_id',
    ];
    public function validate() {
        Model::validateRequired('messageId', $this->messageId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudMarketingagentCreativeImageeditRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['message_id'])){
            $model->messageId = $map['message_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 子图编辑接口返回的独立消息 ID，必须属于当前调用用户及租户。
    /**
     * @var string
     */
    public $messageId;

}
