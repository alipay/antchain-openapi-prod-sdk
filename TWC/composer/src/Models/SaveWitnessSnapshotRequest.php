<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SaveWitnessSnapshotRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 快照数据
    /**
     * @var string
     */
    public $data;

    // 快照步骤，最大20长度，START-开始，UPDATE-更新，FINISH-结束，允许自定义
    /**
     * @var string
     */
    public $step;

    // 快照步骤描述，最大40长度
    /**
     * @var string
     */
    public $stepDescription;

    // 见证流程id
    /**
     * @var string
     */
    public $witnessFlowId;

    // 发起请求的实例应用ID
    /**
     * @var string
     */
    public $appId;

    // 发起请求的鉴权token
    /**
     * @var string
     */
    public $token;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'data'              => 'data',
        'step'              => 'step',
        'stepDescription'   => 'step_description',
        'witnessFlowId'     => 'witness_flow_id',
        'appId'             => 'app_id',
        'token'             => 'token',
    ];

    public function validate()
    {
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('step', $this->step, true);
        Model::validateRequired('stepDescription', $this->stepDescription, true);
        Model::validateRequired('witnessFlowId', $this->witnessFlowId, true);
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('token', $this->token, true);
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
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->step) {
            $res['step'] = $this->step;
        }
        if (null !== $this->stepDescription) {
            $res['step_description'] = $this->stepDescription;
        }
        if (null !== $this->witnessFlowId) {
            $res['witness_flow_id'] = $this->witnessFlowId;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveWitnessSnapshotRequest
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
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['step'])) {
            $model->step = $map['step'];
        }
        if (isset($map['step_description'])) {
            $model->stepDescription = $map['step_description'];
        }
        if (isset($map['witness_flow_id'])) {
            $model->witnessFlowId = $map['witness_flow_id'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }

        return $model;
    }
}
