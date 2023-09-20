<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class QueryNftAssetbyskuRequest extends Model
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

    // 手机号或者支付宝uid或者open_uid
    /**
     * @var string
     */
    public $idNo;

    // 用户id类型
    /**
     * @var string
     */
    public $idType;

    // sku_meta的ip_id
    /**
     * @var string
     */
    public $skuId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'idNo'              => 'id_no',
        'idType'            => 'id_type',
        'skuId'             => 'sku_id',
    ];

    public function validate()
    {
        Model::validateRequired('idNo', $this->idNo, true);
        Model::validateRequired('idType', $this->idType, true);
        Model::validateRequired('skuId', $this->skuId, true);
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
        if (null !== $this->idNo) {
            $res['id_no'] = $this->idNo;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }
        if (null !== $this->skuId) {
            $res['sku_id'] = $this->skuId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryNftAssetbyskuRequest
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
        if (isset($map['id_no'])) {
            $model->idNo = $map['id_no'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }
        if (isset($map['sku_id'])) {
            $model->skuId = $map['sku_id'];
        }

        return $model;
    }
}
