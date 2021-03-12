<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ExecDataauthorizationProcessRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 审批操作意见
    /**
     * @var string
     */
    public $comment;

    // 扩展参数
    /**
     * @var string
     */
    public $extensionInfo;

    // 新节点ID列表
    /**
     * @var string[]
     */
    public $forwardNodeIds;

    // 审批操作结果
    /**
     * @var string
     */
    public $operateResult;

    // 审批操作时间
    /**
     * @var int
     */
    public $operateTime;

    // 审批操作人ID
    /**
     * @var string
     */
    public $operatorId;

    // 流程ID
    /**
     * @var string
     */
    public $processId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'comment'           => 'comment',
        'extensionInfo'     => 'extension_info',
        'forwardNodeIds'    => 'forward_node_ids',
        'operateResult'     => 'operate_result',
        'operateTime'       => 'operate_time',
        'operatorId'        => 'operator_id',
        'processId'         => 'process_id',
    ];

    public function validate()
    {
        Model::validateRequired('comment', $this->comment, true);
        Model::validateRequired('operateResult', $this->operateResult, true);
        Model::validateRequired('operateTime', $this->operateTime, true);
        Model::validateRequired('operatorId', $this->operatorId, true);
        Model::validateRequired('processId', $this->processId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
        }
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = $this->extensionInfo;
        }
        if (null !== $this->forwardNodeIds) {
            $res['forward_node_ids'] = $this->forwardNodeIds;
        }
        if (null !== $this->operateResult) {
            $res['operate_result'] = $this->operateResult;
        }
        if (null !== $this->operateTime) {
            $res['operate_time'] = $this->operateTime;
        }
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->processId) {
            $res['process_id'] = $this->processId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecDataauthorizationProcessRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['comment'])) {
            $model->comment = $map['comment'];
        }
        if (isset($map['extension_info'])) {
            $model->extensionInfo = $map['extension_info'];
        }
        if (isset($map['forward_node_ids'])) {
            if (!empty($map['forward_node_ids'])) {
                $model->forwardNodeIds = $map['forward_node_ids'];
            }
        }
        if (isset($map['operate_result'])) {
            $model->operateResult = $map['operate_result'];
        }
        if (isset($map['operate_time'])) {
            $model->operateTime = $map['operate_time'];
        }
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }
        if (isset($map['process_id'])) {
            $model->processId = $map['process_id'];
        }

        return $model;
    }
}
