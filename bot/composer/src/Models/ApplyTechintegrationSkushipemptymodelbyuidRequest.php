<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ApplyTechintegrationSkushipemptymodelbyuidRequest extends Model
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

    // 场景码
    /**
     * @var string
     */
    public $vendorId;

    // 设备型号
    /**
     * @var string
     */
    public $productId;

    // 设备SN号
    /**
     * @var string
     */
    public $deviceId;

    // 产品类型
    /**
     * @var int
     */
    public $productType;

    // 凭证种类，高八位表示是否下发凭证，低八位表示安全方案
    /**
     * @var int
     */
    public $certType;

    // id2 authCode
    /**
     * @var string
     */
    public $id2;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'vendorId'          => 'vendor_id',
        'productId'         => 'product_id',
        'deviceId'          => 'device_id',
        'productType'       => 'product_type',
        'certType'          => 'cert_type',
        'id2'               => 'id2',
    ];

    public function validate()
    {
        Model::validateRequired('vendorId', $this->vendorId, true);
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('deviceId', $this->deviceId, true);
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
        if (null !== $this->vendorId) {
            $res['vendor_id'] = $this->vendorId;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->productType) {
            $res['product_type'] = $this->productType;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->id2) {
            $res['id2'] = $this->id2;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyTechintegrationSkushipemptymodelbyuidRequest
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
        if (isset($map['vendor_id'])) {
            $model->vendorId = $map['vendor_id'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['product_type'])) {
            $model->productType = $map['product_type'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['id2'])) {
            $model->id2 = $map['id2'];
        }

        return $model;
    }
}
