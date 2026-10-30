<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class StepsBlockchainBotIotagentSessionTrajectoryRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'agentId' => 'agent_id',
        'instanceId' => 'instance_id',
        'sessionId' => 'session_id',
        'turnId' => 'turn_id',
        'cursor' => 'cursor',
        'pageSize' => 'page_size',
        'focusStepId' => 'focus_step_id',
    ];
    public function validate() {
        Model::validateRequired('agentId', $this->agentId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('turnId', $this->turnId, true);
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
        if (null !== $this->turnId) {
            $res['turn_id'] = $this->turnId;
        }
        if (null !== $this->cursor) {
            $res['cursor'] = $this->cursor;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->focusStepId) {
            $res['focus_step_id'] = $this->focusStepId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return StepsBlockchainBotIotagentSessionTrajectoryRequest
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
        if(isset($map['turn_id'])){
            $model->turnId = $map['turn_id'];
        }
        if(isset($map['cursor'])){
            $model->cursor = $map['cursor'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['focus_step_id'])){
            $model->focusStepId = $map['focus_step_id'];
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

    // 实例ID
    /**
     * @var string
     */
    public $instanceId;

    // 会话ID
    /**
     * @var string
     */
    public $sessionId;

    // 轮次ID或操作ID
    /**
     * @var string
     */
    public $turnId;

    // 分页游标，首次为空
    /**
     * @var string
     */
    public $cursor;

    // 每页大小 1-200，默认 100
    /**
     * @var int
     */
    public $pageSize;

    // 定位步骤ID，首次定位用，不可与cursor同传
    /**
     * @var string
     */
    public $focusStepId;

}
