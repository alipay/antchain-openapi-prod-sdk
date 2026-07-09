<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ImportTechintegrationSkugrantwhitelistRequest extends Model
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

    // 产品型号
    /**
     * @var string
     */
    public $skuModel;

    // 产品形态，取值范围：RTOS、TEE、Android
    /**
     * @var string
     */
    public $schemeType;

    // 场景码
    /**
     * @var string
     */
    public $scene;

    // SN列表，单次最多100条
    /**
     * @var string[]
     */
    public $snList;

    // 凭证种类列表，取值范围： ["PAYMENT"]：支付码， ["PAYMENT","TRANSIT"]：支付码+乘车码
    /**
     * @var string[]
     */
    public $features;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'skuModel'          => 'sku_model',
        'schemeType'        => 'scheme_type',
        'scene'             => 'scene',
        'snList'            => 'sn_list',
        'features'          => 'features',
    ];

    public function validate()
    {
        Model::validateRequired('skuModel', $this->skuModel, true);
        Model::validateRequired('schemeType', $this->schemeType, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('snList', $this->snList, true);
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
        if (null !== $this->skuModel) {
            $res['sku_model'] = $this->skuModel;
        }
        if (null !== $this->schemeType) {
            $res['scheme_type'] = $this->schemeType;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->snList) {
            $res['sn_list'] = $this->snList;
        }
        if (null !== $this->features) {
            $res['features'] = $this->features;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportTechintegrationSkugrantwhitelistRequest
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
        if (isset($map['sku_model'])) {
            $model->skuModel = $map['sku_model'];
        }
        if (isset($map['scheme_type'])) {
            $model->schemeType = $map['scheme_type'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['sn_list'])) {
            if (!empty($map['sn_list'])) {
                $model->snList = $map['sn_list'];
            }
        }
        if (isset($map['features'])) {
            if (!empty($map['features'])) {
                $model->features = $map['features'];
            }
        }

        return $model;
    }
}
