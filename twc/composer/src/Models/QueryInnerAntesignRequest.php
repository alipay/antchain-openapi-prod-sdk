<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerAntesignRequest extends Model
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

    // 租户信息
    /**
     * @var string
     */
    public $tenantName;

    // 业务线
    /**
     * @var string
     */
    public $businessLineCode;

    // 场景值
    /**
     * @var string
     */
    public $sceneCode;

    // 签署合同id 传值默认查询签署流程下全部任务状态
    /**
     * @var string
     */
    public $signFlowId;

    // 签署任务创建id 默认查signTaskId 单任务状态
    /**
     * @var string
     */
    public $signTaskId;

    // 应用方来源信息
    /**
     * @var string
     */
    public $appName;

    // 业务流水号
    /**
     * @var string
     */
    public $bizNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantName'        => 'tenant_name',
        'businessLineCode'  => 'business_line_code',
        'sceneCode'         => 'scene_code',
        'signFlowId'        => 'sign_flow_id',
        'signTaskId'        => 'sign_task_id',
        'appName'           => 'app_name',
        'bizNo'             => 'biz_no',
    ];

    public function validate()
    {
        Model::validateRequired('signFlowId', $this->signFlowId, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('bizNo', $this->bizNo, true);
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
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->businessLineCode) {
            $res['business_line_code'] = $this->businessLineCode;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->signFlowId) {
            $res['sign_flow_id'] = $this->signFlowId;
        }
        if (null !== $this->signTaskId) {
            $res['sign_task_id'] = $this->signTaskId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInnerAntesignRequest
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
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['business_line_code'])) {
            $model->businessLineCode = $map['business_line_code'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['sign_flow_id'])) {
            $model->signFlowId = $map['sign_flow_id'];
        }
        if (isset($map['sign_task_id'])) {
            $model->signTaskId = $map['sign_task_id'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }

        return $model;
    }
}
