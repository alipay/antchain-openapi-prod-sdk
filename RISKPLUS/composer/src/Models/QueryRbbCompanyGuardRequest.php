<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRbbCompanyGuardRequest extends Model
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

    // 查询token
    /**
     * @var string
     */
    public $token;

    // 虚拟云租户code
    /**
     * @var string
     */
    public $virtualCloudTenantCode;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'token'                  => 'token',
        'virtualCloudTenantCode' => 'virtual_cloud_tenant_code',
    ];

    public function validate()
    {
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
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->virtualCloudTenantCode) {
            $res['virtual_cloud_tenant_code'] = $this->virtualCloudTenantCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRbbCompanyGuardRequest
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
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['virtual_cloud_tenant_code'])) {
            $model->virtualCloudTenantCode = $map['virtual_cloud_tenant_code'];
        }

        return $model;
    }
}
