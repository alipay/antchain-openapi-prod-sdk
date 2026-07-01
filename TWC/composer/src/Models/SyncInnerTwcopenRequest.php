<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SyncInnerTwcopenRequest extends Model
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

    // id
    /**
     * @var int
     */
    public $id;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 产品code
    /**
     * @var string
     */
    public $productCode;

    // 状态
    /**
     * @var string
     */
    public $status;

    // 业务id
    /**
     * @var int
     */
    public $bizId;

    // 开通渠道
    /**
     * @var int
     */
    public $orderChannel;

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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'tenantId'          => 'tenant_id',
        'productCode'       => 'product_code',
        'status'            => 'status',
        'bizId'             => 'biz_id',
        'orderChannel'      => 'order_channel',
        'gmtCreate'         => 'gmt_create',
        'gmtModified'       => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('orderChannel', $this->orderChannel, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->orderChannel) {
            $res['order_channel'] = $this->orderChannel;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncInnerTwcopenRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['order_channel'])) {
            $model->orderChannel = $map['order_channel'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }

        return $model;
    }
}
