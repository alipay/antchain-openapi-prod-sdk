<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryIoaAgentRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'agentId' => 'agent_id',
        'clientId' => 'client_id',
    ];
    public function validate() {}
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
        if (null !== $this->clientId) {
            $res['client_id'] = $this->clientId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryIoaAgentRequest
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
        if(isset($map['client_id'])){
            $model->clientId = $map['client_id'];
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

    // 客户端ID，一般是设备MAC地址，若没有agentId时可传入client_id查询对应的agent_id
    /**
     * @var string
     */
    public $clientId;

}
