<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class AddUserRoleRequest extends Model
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

    // 账号标识，蚂蚁金融科技租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 租户名称
    /**
     * @var string
     */
    public $tenantName;

    // 权限标识
    // LEASER(0),
    // BUYERS(1),
    // OWNER(2),
    // ADMIN(9);
    /**
     * @var string
     */
    public $role;

    // 是否支持abm远程
    /**
     * @var bool
     */
    public $supportAbm;

    // 是否含税
    /**
     * @var bool
     */
    public $includTax;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'tenantName'        => 'tenant_name',
        'role'              => 'role',
        'supportAbm'        => 'support_abm',
        'includTax'         => 'includ_tax',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('tenantName', $this->tenantName, true);
        Model::validateRequired('role', $this->role, true);
        Model::validateRequired('supportAbm', $this->supportAbm, true);
        Model::validateRequired('includTax', $this->includTax, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        if (null !== $this->supportAbm) {
            $res['support_abm'] = $this->supportAbm;
        }
        if (null !== $this->includTax) {
            $res['includ_tax'] = $this->includTax;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddUserRoleRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['role'])) {
            $model->role = $map['role'];
        }
        if (isset($map['support_abm'])) {
            $model->supportAbm = $map['support_abm'];
        }
        if (isset($map['includ_tax'])) {
            $model->includTax = $map['includ_tax'];
        }

        return $model;
    }
}
