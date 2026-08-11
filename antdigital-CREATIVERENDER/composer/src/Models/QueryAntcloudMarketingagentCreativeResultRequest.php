<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudMarketingagentCreativeResultRequest extends Model {
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
     * @return QueryAntcloudMarketingagentCreativeResultRequest
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

    // 消息ID
    /**
     * @var string
     */
    public $messageId;

}
