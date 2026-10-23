<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudMarketingagentCreativeResultRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'messageId' => 'message_id',
        'returnSubImages' => 'return_sub_images',
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
        if (null !== $this->returnSubImages) {
            $res['return_sub_images'] = $this->returnSubImages;
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
        if(isset($map['return_sub_images'])){
            $model->returnSubImages = $map['return_sub_images'];
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

    // 是否返回基金长图的子图列表，默认 false。为 true 时，在长图生成完成后返回 assistant_extra.sub_images；不影响长图生成流程。
    /**
     * @var bool
     */
    public $returnSubImages;

}
