<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AIOSPRODUCT\Models;

use AlibabaCloud\Tea\Model;

class QueryGwdefaultChatstreamRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId' => 'user_id',
        'tenantId' => 'tenant_id',
        'agentCode' => 'agent_code',
        'message' => 'message',
        'sessionId' => 'session_id',
        'extInfo' => 'ext_info',
        'tagInfo' => 'tag_info',
    ];
    public function validate() {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('agentCode', $this->agentCode, true);
        Model::validateRequired('message', $this->message, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->agentCode) {
            $res['agent_code'] = $this->agentCode;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }
        if (null !== $this->tagInfo) {
            $res['tag_info'] = $this->tagInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryGwdefaultChatstreamRequest
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
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['agent_code'])){
            $model->agentCode = $map['agent_code'];
        }
        if(isset($map['message'])){
            $model->message = $map['message'];
        }
        if(isset($map['session_id'])){
            $model->sessionId = $map['session_id'];
        }
        if(isset($map['ext_info'])){
            $model->extInfo = $map['ext_info'];
        }
        if(isset($map['tag_info'])){
            $model->tagInfo = $map['tag_info'];
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

    // 用户标识
    /**
     * @var string
     */
    public $userId;

    // 租户标识
    /**
     * @var string
     */
    public $tenantId;

    // 业务配置标识（必传），决定模型、策略、提示词
    /**
     * @var string
     */
    public $agentCode;

    // 用户输入
    /**
     * @var string
     */
    public $message;

    // 会话标识（可选），新会话不传，继续会话传
    /**
     * @var string
     */
    public $sessionId;

    // 扩展字段（可选），用于后端服务直接调用时指定技术参数
    /**
     * @var string
     */
    public $extInfo;

    // 标签过滤字段（可选），用于按标签过滤生效的 expertAgents/skills/tools。
    /**
     * @var string
     */
    public $tagInfo;

}
