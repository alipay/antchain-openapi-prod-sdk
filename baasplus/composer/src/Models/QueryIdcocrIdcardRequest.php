<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryIdcocrIdcardRequest extends Model
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

    // 身份证图片base64编码内容
    /**
     * @var string
     */
    public $imageContent;

    // face: 身份证正面
    // back: 身份证反面
    /**
     * @var string
     */
    public $side;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'imageContent'      => 'image_content',
        'side'              => 'side',
    ];

    public function validate()
    {
        Model::validateRequired('imageContent', $this->imageContent, true);
        Model::validateRequired('side', $this->side, true);
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
        if (null !== $this->imageContent) {
            $res['image_content'] = $this->imageContent;
        }
        if (null !== $this->side) {
            $res['side'] = $this->side;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIdcocrIdcardRequest
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
        if (isset($map['image_content'])) {
            $model->imageContent = $map['image_content'];
        }
        if (isset($map['side'])) {
            $model->side = $map['side'];
        }

        return $model;
    }
}
