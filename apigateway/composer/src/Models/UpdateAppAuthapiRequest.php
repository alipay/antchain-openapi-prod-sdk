<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class UpdateAppAuthapiRequest extends Model
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

    // api标识列表
    /**
     * @var string[]
     */
    public $apiInfoIdList;

    // app标识
    /**
     * @var string
     */
    public $appId;

    // 加密状态
    /**
     * @var string
     */
    public $encryptionStatus;

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
        'apiInfoIdList'     => 'api_info_id_list',
        'appId'             => 'app_id',
        'encryptionStatus'  => 'encryption_status',
        'tenantId'          => 'tenant_id',
        'workspaceId'       => 'workspace_id',
    ];

    public function validate()
    {
        Model::validateRequired('apiInfoIdList', $this->apiInfoIdList, true);
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('encryptionStatus', $this->encryptionStatus, true);
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
        if (null !== $this->apiInfoIdList) {
            $res['api_info_id_list'] = $this->apiInfoIdList;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->encryptionStatus) {
            $res['encryption_status'] = $this->encryptionStatus;
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
     * @return UpdateAppAuthapiRequest
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
        if (isset($map['api_info_id_list'])) {
            if (!empty($map['api_info_id_list'])) {
                $model->apiInfoIdList = $map['api_info_id_list'];
            }
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['encryption_status'])) {
            $model->encryptionStatus = $map['encryption_status'];
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
