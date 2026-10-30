<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class UsageBlockchainBotIotagentSessionRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'agentId' => 'agent_id',
        'instanceId' => 'instance_id',
        'sessionId' => 'session_id',
        'pageIndex' => 'page_index',
        'pageSize' => 'page_size',
    ];
    public function validate() {
        Model::validateRequired('agentId', $this->agentId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('pageIndex', $this->pageIndex, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UsageBlockchainBotIotagentSessionRequest
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
        if(isset($map['instance_id'])){
            $model->instanceId = $map['instance_id'];
        }
        if(isset($map['session_id'])){
            $model->sessionId = $map['session_id'];
        }
        if(isset($map['page_index'])){
            $model->pageIndex = $map['page_index'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
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

    // ioa平台开通的实例ID
    /**
     * @var string
     */
    public $instanceId;

    // 会话ID
    /**
     * @var string
     */
    public $sessionId;

    // 页码，从1开始，默认1
    /**
     * @var int
     */
    public $pageIndex;

    // 每页数量，默认20
    /**
     * @var int
     */
    public $pageSize;

}
