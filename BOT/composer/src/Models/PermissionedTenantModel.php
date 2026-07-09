<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PermissionedTenantModel extends Model
{
    // 主键Id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 创建时间
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $gmtModified;

    // 租户名称
    /**
     * @example testTenant
     *
     * @var string
     */
    public $tenantName;

    // 公司名称
    /**
     * @example alipay
     *
     * @var string
     */
    public $orgName;

    // 租户所有人标识
    /**
     * @example alipay
     *
     * @var string
     */
    public $owner;

    // 网关私钥
    /**
     * @example MEUCIDxNw...
     *
     * @var string
     */
    public $gatewayPrivateKey;

    // 网关公钥
    /**
     * @example MEUCID...
     *
     * @var string
     */
    public $gatewayPublicKey;
    protected $_name = [
        'id'                => 'id',
        'gmtCreate'         => 'gmt_create',
        'gmtModified'       => 'gmt_modified',
        'tenantName'        => 'tenant_name',
        'orgName'           => 'org_name',
        'owner'             => 'owner',
        'gatewayPrivateKey' => 'gateway_private_key',
        'gatewayPublicKey'  => 'gateway_public_key',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('tenantName', $this->tenantName, true);
        Model::validateRequired('orgName', $this->orgName, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->orgName) {
            $res['org_name'] = $this->orgName;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->gatewayPrivateKey) {
            $res['gateway_private_key'] = $this->gatewayPrivateKey;
        }
        if (null !== $this->gatewayPublicKey) {
            $res['gateway_public_key'] = $this->gatewayPublicKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PermissionedTenantModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['org_name'])) {
            $model->orgName = $map['org_name'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }
        if (isset($map['gateway_private_key'])) {
            $model->gatewayPrivateKey = $map['gateway_private_key'];
        }
        if (isset($map['gateway_public_key'])) {
            $model->gatewayPublicKey = $map['gateway_public_key'];
        }

        return $model;
    }
}
