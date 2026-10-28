<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryAgentDailysummaryRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'clientId' => 'client_id',
        'agentId' => 'agent_id',
        'date' => 'date',
    ];
    public function validate() {
        Model::validateRequired('date', $this->date, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->clientId) {
            $res['client_id'] = $this->clientId;
        }
        if (null !== $this->agentId) {
            $res['agent_id'] = $this->agentId;
        }
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAgentDailysummaryRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['client_id'])){
            $model->clientId = $map['client_id'];
        }
        if(isset($map['agent_id'])){
            $model->agentId = $map['agent_id'];
        }
        if(isset($map['date'])){
            $model->date = $map['date'];
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

    // 设备客户端ID；与 agent_id 至少传一个
    /**
     * @var string
     */
    public $clientId;

    // 智能体ID；与 client_id 至少传一个，两者同时传入时必须与设备绑定的智能体一致
    /**
     * @var string
     */
    public $agentId;

    // 总结日期，格式 yyyy-MM-dd，按 GMT+8 自然日
    /**
     * @var string
     */
    public $date;

}
