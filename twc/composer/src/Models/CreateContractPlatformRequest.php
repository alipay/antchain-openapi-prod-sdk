<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateContractPlatformRequest extends Model
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

    // 平台方经办人信息
    /**
     * @var ContractAccountApplication
     */
    public $creator;

    // 平台机构信息
    /**
     * @var ContractOrganizationApplication
     */
    public $platform;

    // 代理客户时，实际用户的租户ID
    //
    /**
     * @var string
     */
    public $subTenantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'creator'           => 'creator',
        'platform'          => 'platform',
        'subTenantId'       => 'sub_tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('creator', $this->creator, true);
        Model::validateRequired('platform', $this->platform, true);
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
        if (null !== $this->creator) {
            $res['creator'] = null !== $this->creator ? $this->creator->toMap() : null;
        }
        if (null !== $this->platform) {
            $res['platform'] = null !== $this->platform ? $this->platform->toMap() : null;
        }
        if (null !== $this->subTenantId) {
            $res['sub_tenant_id'] = $this->subTenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateContractPlatformRequest
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
        if (isset($map['creator'])) {
            $model->creator = ContractAccountApplication::fromMap($map['creator']);
        }
        if (isset($map['platform'])) {
            $model->platform = ContractOrganizationApplication::fromMap($map['platform']);
        }
        if (isset($map['sub_tenant_id'])) {
            $model->subTenantId = $map['sub_tenant_id'];
        }

        return $model;
    }
}
