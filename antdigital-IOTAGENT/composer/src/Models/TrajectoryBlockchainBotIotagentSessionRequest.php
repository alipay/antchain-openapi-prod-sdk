<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

class TrajectoryBlockchainBotIotagentSessionRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'agentId' => 'agent_id',
        'instanceId' => 'instance_id',
        'sessionId' => 'session_id',
        'scope' => 'scope',
        'cursor' => 'cursor',
        'pageSize' => 'page_size',
        'diagnostics' => 'diagnostics',
        'keyword' => 'keyword',
        'topBy' => 'top_by',
    ];
    public function validate() {
        Model::validateRequired('agentId', $this->agentId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
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
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->cursor) {
            $res['cursor'] = $this->cursor;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->diagnostics) {
            $res['diagnostics'] = $this->diagnostics;
        }
        if (null !== $this->keyword) {
            $res['keyword'] = $this->keyword;
        }
        if (null !== $this->topBy) {
            $res['top_by'] = $this->topBy;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TrajectoryBlockchainBotIotagentSessionRequest
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
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        if(isset($map['cursor'])){
            $model->cursor = $map['cursor'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['diagnostics'])){
            $model->diagnostics = $map['diagnostics'];
        }
        if(isset($map['keyword'])){
            $model->keyword = $map['keyword'];
        }
        if(isset($map['top_by'])){
            $model->topBy = $map['top_by'];
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

    // 作用域类型 TURNS|CONTEXT_OPERATIONS，默认 TURNS
    /**
     * @var string
     */
    public $scope;

    // 分页游标，首次为空
    /**
     * @var string
     */
    public $cursor;

    // 每页大小 1-50，默认 20
    /**
     * @var int
     */
    public $pageSize;

    // 诊断标签过滤，逗号分隔
    /**
     * @var string
     */
    public $diagnostics;

    // 关键词搜索，最长100字
    /**
     * @var string
     */
    public $keyword;

    // 排序 NONE|DURATION|TOKENS
    /**
     * @var string
     */
    public $topBy;

}
