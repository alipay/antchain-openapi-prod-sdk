<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SyncInnerProvisionRequest extends Model
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

    // 自增id
    /**
     * @var int
     */
    public $id;

    // 创建时间
    /**
     * @var int
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @var int
     */
    public $gmtModified;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 租户名称
    /**
     * @var string
     */
    public $tenantName;

    // 产品码
    /**
     * @var string
     */
    public $productCode;

    // 是否正式账号
    /**
     * @var bool
     */
    public $isOfficial;

    // 业务分类
    /**
     * @var int
     */
    public $bizId;

    // 是否法院节点
    /**
     * @var bool
     */
    public $legalAccount;

    // 服务状态
    /**
     * @var int
     */
    public $status;

    // 商品开通实例id
    /**
     * @var string
     */
    public $instanceId;

    // 订单渠道
    /**
     * @var int
     */
    public $orderChannel;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'gmtCreate'         => 'gmt_create',
        'gmtModified'       => 'gmt_modified',
        'tenantId'          => 'tenant_id',
        'tenantName'        => 'tenant_name',
        'productCode'       => 'product_code',
        'isOfficial'        => 'is_official',
        'bizId'             => 'biz_id',
        'legalAccount'      => 'legal_account',
        'status'            => 'status',
        'instanceId'        => 'instance_id',
        'orderChannel'      => 'order_channel',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('status', $this->status, true);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->isOfficial) {
            $res['is_official'] = $this->isOfficial;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->legalAccount) {
            $res['legal_account'] = $this->legalAccount;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->orderChannel) {
            $res['order_channel'] = $this->orderChannel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncInnerProvisionRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['is_official'])) {
            $model->isOfficial = $map['is_official'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['legal_account'])) {
            $model->legalAccount = $map['legal_account'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['order_channel'])) {
            $model->orderChannel = $map['order_channel'];
        }

        return $model;
    }
}
