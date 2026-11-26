<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IOTAGENT\Models\FileInfo;

class ChatBlockchainBotIotagentSessionRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'agentId' => 'agent_id',
        'sessionId' => 'session_id',
        'userId' => 'user_id',
        'type' => 'type',
        'query' => 'query',
        'attachFiles' => 'attach_files',
        'extraParams' => 'extra_params',
        'resume' => 'resume',
        'modelKey' => 'model_key',
        'reasoningEffort' => 'reasoning_effort',
    ];
    public function validate() {
        Model::validateRequired('agentId', $this->agentId, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('type', $this->type, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->agentId) {
            $res['agent_id'] = $this->agentId;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->query) {
            $res['query'] = $this->query;
        }
        if (null !== $this->attachFiles) {
            $res['attach_files'] = [];
            if(null !== $this->attachFiles && is_array($this->attachFiles)){
                $n = 0;
                foreach($this->attachFiles as $item){
                    $res['attach_files'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->extraParams) {
            $res['extra_params'] = $this->extraParams;
        }
        if (null !== $this->resume) {
            $res['resume'] = $this->resume;
        }
        if (null !== $this->modelKey) {
            $res['model_key'] = $this->modelKey;
        }
        if (null !== $this->reasoningEffort) {
            $res['reasoning_effort'] = $this->reasoningEffort;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ChatBlockchainBotIotagentSessionRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['agent_id'])){
            $model->agentId = $map['agent_id'];
        }
        if(isset($map['session_id'])){
            $model->sessionId = $map['session_id'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['query'])){
            $model->query = $map['query'];
        }
        if(isset($map['attach_files'])){
            if(!empty($map['attach_files'])){
                $model->attachFiles = [];
                $n = 0;
                foreach($map['attach_files'] as $item) {
                    $model->attachFiles[$n++] = null !== $item ? FileInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['extra_params'])){
            $model->extraParams = $map['extra_params'];
        }
        if(isset($map['resume'])){
            $model->resume = $map['resume'];
        }
        if(isset($map['model_key'])){
            $model->modelKey = $map['model_key'];
        }
        if(isset($map['reasoning_effort'])){
            $model->reasoningEffort = $map['reasoning_effort'];
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

    // 智能体id
    /**
     * @var string
     */
    public $agentId;

    // 会话id
    /**
     * @var string
     */
    public $sessionId;

    // 用户ID
    /**
     * @var string
     */
    public $userId;

    // 会话类型
    /**
     * @var string
     */
    public $type;

    // 问题（新建模式必填；携 resume 续接时互斥不传）
    /**
     * @var string
     */
    public $query;

    // 附件
    /**
     * @var FileInfo[]
     */
    public $attachFiles;

    // josn字符串
    /**
     * @var string
     */
    public $extraParams;

    // 续接结构体 JSON（系分 §8.1.1）：{turnId 必填, afterSequence 可选, command 可选={type:DECIDE/ANSWER/CANCEL, expectedVersion, payload}}；payload 键 camelCase：DECIDE={interactionId,decision,scope} ANSWER={interactionId,answer} CANCEL={reason}
    /**
     * @var string
     */
    public $resume;

    // 用户侧模型选择（§8.1.2）：本地模型目录稳定键（如 dtmaas/deepseek-flash），独立顶层参数唯一入口；仅新建 Turn 可传，省略沿默认配置，空/非法值拒绝；不得经 extra_params 携带
    /**
     * @var string
     */
    public $modelKey;

    // 用户侧思考等级选择（§8.1.2）：受控选项，须为选中模型目录声明 supported_efforts 内取值（model.list 返回），非法值拒绝；仅新建 Turn 可传，不得经 extra_params 携带
    /**
     * @var string
     */
    public $reasoningEffort;

}
