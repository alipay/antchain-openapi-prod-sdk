<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class OnlineApiRequest extends Model
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

    // API标识
    /**
     * @var string[]
     */
    public $apiIdList;

    // 上线描述
    /**
     * @var string
     */
    public $onlineDesc;

    // 租户标识
    /**
     * @var string
     */
    public $tenantId;

    // 工作空间标识
    /**
     * @var string
     */
    public $workspaceId;

    // api_type
    /**
     * @var string
     */
    public $apiType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'apiIdList'         => 'api_id_list',
        'onlineDesc'        => 'online_desc',
        'tenantId'          => 'tenant_id',
        'workspaceId'       => 'workspace_id',
        'apiType'           => 'api_type',
    ];

    public function validate()
    {
        Model::validateRequired('apiIdList', $this->apiIdList, true);
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
        if (null !== $this->apiIdList) {
            $res['api_id_list'] = $this->apiIdList;
        }
        if (null !== $this->onlineDesc) {
            $res['online_desc'] = $this->onlineDesc;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->apiType) {
            $res['api_type'] = $this->apiType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OnlineApiRequest
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
        if (isset($map['api_id_list'])) {
            if (!empty($map['api_id_list'])) {
                $model->apiIdList = $map['api_id_list'];
            }
        }
        if (isset($map['online_desc'])) {
            $model->onlineDesc = $map['online_desc'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['api_type'])) {
            $model->apiType = $map['api_type'];
        }

        return $model;
    }
}
