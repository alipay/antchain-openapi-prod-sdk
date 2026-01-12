<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class UpdateAuthStatusRequest extends Model
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

    // 数据源可信空间id
    /**
     * @var string
     */
    public $sourceServiceNodeId;

    // 数据源租户id
    /**
     * @var string
     */
    public $sourceTenantId;

    // 被授权方企业信用代码
    /**
     * @var string
     */
    public $authEnterpriseCode;

    // 场景码
    /**
     * @var string
     */
    public $sceneCode;

    // 授权状态
    /**
     * @var bool
     */
    public $authStatus;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'sourceServiceNodeId' => 'source_service_node_id',
        'sourceTenantId'      => 'source_tenant_id',
        'authEnterpriseCode'  => 'auth_enterprise_code',
        'sceneCode'           => 'scene_code',
        'authStatus'          => 'auth_status',
    ];

    public function validate()
    {
        Model::validateRequired('sourceServiceNodeId', $this->sourceServiceNodeId, true);
        Model::validateRequired('sourceTenantId', $this->sourceTenantId, true);
        Model::validateRequired('authEnterpriseCode', $this->authEnterpriseCode, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('authStatus', $this->authStatus, true);
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
        if (null !== $this->sourceServiceNodeId) {
            $res['source_service_node_id'] = $this->sourceServiceNodeId;
        }
        if (null !== $this->sourceTenantId) {
            $res['source_tenant_id'] = $this->sourceTenantId;
        }
        if (null !== $this->authEnterpriseCode) {
            $res['auth_enterprise_code'] = $this->authEnterpriseCode;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->authStatus) {
            $res['auth_status'] = $this->authStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateAuthStatusRequest
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
        if (isset($map['source_service_node_id'])) {
            $model->sourceServiceNodeId = $map['source_service_node_id'];
        }
        if (isset($map['source_tenant_id'])) {
            $model->sourceTenantId = $map['source_tenant_id'];
        }
        if (isset($map['auth_enterprise_code'])) {
            $model->authEnterpriseCode = $map['auth_enterprise_code'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['auth_status'])) {
            $model->authStatus = $map['auth_status'];
        }

        return $model;
    }
}
