<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class DeleteApigroupAuthuserRequest extends Model
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

    // api分组标识
    /**
     * @var string
     */
    public $apiGroupId;

    // 用户id列表
    /**
     * @var string[]
     */
    public $userIdList;

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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'apiGroupId'        => 'api_group_id',
        'userIdList'        => 'user_id_list',
        'tenantId'          => 'tenant_id',
        'workspaceId'       => 'workspace_id',
    ];

    public function validate()
    {
        Model::validateRequired('apiGroupId', $this->apiGroupId, true);
        Model::validateRequired('userIdList', $this->userIdList, true);
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
        if (null !== $this->apiGroupId) {
            $res['api_group_id'] = $this->apiGroupId;
        }
        if (null !== $this->userIdList) {
            $res['user_id_list'] = $this->userIdList;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteApigroupAuthuserRequest
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
        if (isset($map['api_group_id'])) {
            $model->apiGroupId = $map['api_group_id'];
        }
        if (isset($map['user_id_list'])) {
            if (!empty($map['user_id_list'])) {
                $model->userIdList = $map['user_id_list'];
            }
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }

        return $model;
    }
}
