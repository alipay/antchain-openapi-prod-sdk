<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class CreateBlockchainBotIotagentSessionRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'agentId' => 'agent_id',
        'userId' => 'user_id',
        'clientId' => 'client_id',
        'instanceId' => 'instance_id',
        'clientType' => 'client_type',
    ];
    public function validate() {
        Model::validateRequired('agentId', $this->agentId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->clientId) {
            $res['client_id'] = $this->clientId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->clientType) {
            $res['client_type'] = $this->clientType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateBlockchainBotIotagentSessionRequest
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
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['client_id'])){
            $model->clientId = $map['client_id'];
        }
        if(isset($map['instance_id'])){
            $model->instanceId = $map['instance_id'];
        }
        if(isset($map['client_type'])){
            $model->clientType = $map['client_type'];
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

    // 智能体ID
    /**
     * @var string
     */
    public $agentId;

    // 用户ID
    /**
     * @var string
     */
    public $userId;

    // 客户端ID，可选；显式传时服务端按绑定记录恢复实际clientType，不传默认DEFAULT_IOA_API
    /**
     * @var string
     */
    public $clientId;

    // 实例ID
    /**
     * @var string
     */
    public $instanceId;

    // 客户端类型，可选；支持 DEFAULT_IOA_API（默认）、MOBILE_IOA_API（移动端 H5/App）、WEB_IOA_API（PC 网页端），不传默认走 DEFAULT_IOA_API
    /**
     * @var string
     */
    public $clientType;

}
