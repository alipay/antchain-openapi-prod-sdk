<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ChatAiotdatalinkAntfinanceassistantRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId' => 'user_id',
        'language' => 'language',
        'userInfoMap' => 'user_info_map',
        'extParams' => 'ext_params',
        'userQuery' => 'user_query',
        'queryType' => 'query_type',
        'sessionId' => 'session_id',
        'refChatId' => 'ref_chat_id',
    ];
    public function validate() {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('language', $this->language, true);
        Model::validateRequired('userInfoMap', $this->userInfoMap, true);
        Model::validateRequired('extParams', $this->extParams, true);
        Model::validateRequired('userQuery', $this->userQuery, true);
        Model::validateRequired('queryType', $this->queryType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->language) {
            $res['language'] = $this->language;
        }
        if (null !== $this->userInfoMap) {
            $res['user_info_map'] = $this->userInfoMap;
        }
        if (null !== $this->extParams) {
            $res['ext_params'] = $this->extParams;
        }
        if (null !== $this->userQuery) {
            $res['user_query'] = $this->userQuery;
        }
        if (null !== $this->queryType) {
            $res['query_type'] = $this->queryType;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->refChatId) {
            $res['ref_chat_id'] = $this->refChatId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ChatAiotdatalinkAntfinanceassistantRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['language'])){
            $model->language = $map['language'];
        }
        if(isset($map['user_info_map'])){
            $model->userInfoMap = $map['user_info_map'];
        }
        if(isset($map['ext_params'])){
            $model->extParams = $map['ext_params'];
        }
        if(isset($map['user_query'])){
            $model->userQuery = $map['user_query'];
        }
        if(isset($map['query_type'])){
            $model->queryType = $map['query_type'];
        }
        if(isset($map['session_id'])){
            $model->sessionId = $map['session_id'];
        }
        if(isset($map['ref_chat_id'])){
            $model->refChatId = $map['ref_chat_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 支付宝用户UID
    /**
     * @var string
     */
    public $userId;

    // 语言
    /**
     * @var string
     */
    public $language;

    // 用户/会话维度的扩展信息，JSON对应类型：map<string,string>
    /**
     * @var string
     */
    public $userInfoMap;

    // 透传扩展参数，JSON对应类型：map<string,string>
    /**
     * @var string
     */
    public $extParams;

    // 科技板块怎么样
    /**
     * @var string
     */
    public $userQuery;

    // query 类型，枚举（手输：user_input、语音输入：voice_input、sug点击：card_click）
    /**
     * @var string
     */
    public $queryType;

    // 会话 ID，用于上下文延续
    /**
     * @var string
     */
    public $sessionId;

    // 引用的上一轮 chatId（上下文引用，可空）
    /**
     * @var string
     */
    public $refChatId;

}
