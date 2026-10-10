<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class PlayhistoryBlockchainBotIotagentMusicRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'agentId' => 'agent_id',
        'clientId' => 'client_id',
        'limit' => 'limit',
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
        if (null !== $this->limit) {
            $res['limit'] = $this->limit;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PlayhistoryBlockchainBotIotagentMusicRequest
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
        if(isset($map['limit'])){
            $model->limit = $map['limit'];
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

    // 智能体 ID，与client_id至少填1项
    /**
     * @var string
     */
    public $agentId;

    // 客户端 ID，与agent_id至少填1项
    /**
     * @var string
     */
    public $clientId;

    // 返回条数，默认 50
    /**
     * @var int
     */
    public $limit;

}
