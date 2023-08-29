<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5511b931fbd04feba92b64ebc082aac0\Models;

use AlibabaCloud\Tea\Model;

class InitAntchainEkycMultiZimRequest extends Model
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

    // 环境参数
    /**
     * @var string
     */
    public $metaInfo;

    // 实人认证id
    /**
     * @var string
     */
    public $certifyId;

    // 产品类型
    /**
     * @var string
     */
    public $productType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'metaInfo'          => 'meta_info',
        'certifyId'         => 'certify_id',
        'productType'       => 'product_type',
    ];

    public function validate()
    {
        Model::validateRequired('metaInfo', $this->metaInfo, true);
        Model::validateRequired('certifyId', $this->certifyId, true);
        Model::validateRequired('productType', $this->productType, true);
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
        if (null !== $this->metaInfo) {
            $res['meta_info'] = $this->metaInfo;
        }
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
        }
        if (null !== $this->productType) {
            $res['product_type'] = $this->productType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitAntchainEkycMultiZimRequest
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
        if (isset($map['meta_info'])) {
            $model->metaInfo = $map['meta_info'];
        }
        if (isset($map['certify_id'])) {
            $model->certifyId = $map['certify_id'];
        }
        if (isset($map['product_type'])) {
            $model->productType = $map['product_type'];
        }

        return $model;
    }
}
