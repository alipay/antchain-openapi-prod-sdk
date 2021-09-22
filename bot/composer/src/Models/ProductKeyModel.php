<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ProductKeyModel extends Model
{
    // 主键id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 更新时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 设备端ProductKey
    /**
     * @example DEV-0101
     *
     * @var string
     */
    public $productKey;

    // 场景码
    /**
     * @example testScene
     *
     * @var string
     */
    public $scene;

    // 租户Id
    /**
     * @example testTenant
     *
     * @var string
     */
    public $tenantName;

    // 数据模型id
    /**
     * @example model_001
     *
     * @var string
     */
    public $dataModelId;

    // sdk前缀
    /**
     * @example sdk_
     *
     * @var string
     */
    public $sdkVersionPrefix;

    // 制造商
    /**
     * @example alibaba
     *
     * @var string
     */
    public $manufacturer;

    // 顾客
    /**
     * @example alipay
     *
     * @var string
     */
    public $customer;
    protected $_name = [
        'id'               => 'id',
        'gmtCreate'        => 'gmt_create',
        'gmtModified'      => 'gmt_modified',
        'productKey'       => 'product_key',
        'scene'            => 'scene',
        'tenantName'       => 'tenant_name',
        'dataModelId'      => 'data_model_id',
        'sdkVersionPrefix' => 'sdk_version_prefix',
        'manufacturer'     => 'manufacturer',
        'customer'         => 'customer',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('productKey', $this->productKey, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('tenantName', $this->tenantName, true);
        Model::validateRequired('dataModelId', $this->dataModelId, true);
        Model::validateRequired('sdkVersionPrefix', $this->sdkVersionPrefix, true);
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
        if (null !== $this->productKey) {
            $res['product_key'] = $this->productKey;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->dataModelId) {
            $res['data_model_id'] = $this->dataModelId;
        }
        if (null !== $this->sdkVersionPrefix) {
            $res['sdk_version_prefix'] = $this->sdkVersionPrefix;
        }
        if (null !== $this->manufacturer) {
            $res['manufacturer'] = $this->manufacturer;
        }
        if (null !== $this->customer) {
            $res['customer'] = $this->customer;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductKeyModel
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
        if (isset($map['product_key'])) {
            $model->productKey = $map['product_key'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['data_model_id'])) {
            $model->dataModelId = $map['data_model_id'];
        }
        if (isset($map['sdk_version_prefix'])) {
            $model->sdkVersionPrefix = $map['sdk_version_prefix'];
        }
        if (isset($map['manufacturer'])) {
            $model->manufacturer = $map['manufacturer'];
        }
        if (isset($map['customer'])) {
            $model->customer = $map['customer'];
        }

        return $model;
    }
}
