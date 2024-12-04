<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class CheckOpticalIdentifyRequest extends Model
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

    // json数据，包含tenantId,sceneId,outBizId,fakeType,certType
    /**
     * @var string
     */
    public $reservedData;

    // 图片链接,image_url和image_content 2选1优先选择image_content
    /**
     * @var string
     */
    public $imageUrl;

    // base64编码的图片,image_url和image_content 2选1，优先选择image_content
    /**
     * @var string
     */
    public $imageContent;

    // raas产品码
    /**
     * @var string
     */
    public $raasProducts;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'reservedData'      => 'reserved_data',
        'imageUrl'          => 'image_url',
        'imageContent'      => 'image_content',
        'raasProducts'      => 'raas_products',
    ];

    public function validate()
    {
        Model::validateRequired('reservedData', $this->reservedData, true);
        Model::validateRequired('raasProducts', $this->raasProducts, true);
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
        if (null !== $this->reservedData) {
            $res['reserved_data'] = $this->reservedData;
        }
        if (null !== $this->imageUrl) {
            $res['image_url'] = $this->imageUrl;
        }
        if (null !== $this->imageContent) {
            $res['image_content'] = $this->imageContent;
        }
        if (null !== $this->raasProducts) {
            $res['raas_products'] = $this->raasProducts;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckOpticalIdentifyRequest
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
        if (isset($map['reserved_data'])) {
            $model->reservedData = $map['reserved_data'];
        }
        if (isset($map['image_url'])) {
            $model->imageUrl = $map['image_url'];
        }
        if (isset($map['image_content'])) {
            $model->imageContent = $map['image_content'];
        }
        if (isset($map['raas_products'])) {
            $model->raasProducts = $map['raas_products'];
        }

        return $model;
    }
}
