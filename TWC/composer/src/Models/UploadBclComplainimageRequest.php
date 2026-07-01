<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class UploadBclComplainimageRequest extends Model
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

    // 图片格式，支持格式：jpg、jpeg、png
    /**
     * @var string
     */
    public $imageName;

    // 图片二进制字节流
    /**
     * @var string
     */
    public $imageContent;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'imageName'         => 'image_name',
        'imageContent'      => 'image_content',
    ];

    public function validate()
    {
        Model::validateRequired('imageName', $this->imageName, true);
        Model::validateRequired('imageContent', $this->imageContent, true);
        Model::validateMaxLength('imageName', $this->imageName, 64);
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
        if (null !== $this->imageName) {
            $res['image_name'] = $this->imageName;
        }
        if (null !== $this->imageContent) {
            $res['image_content'] = $this->imageContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadBclComplainimageRequest
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
        if (isset($map['image_name'])) {
            $model->imageName = $map['image_name'];
        }
        if (isset($map['image_content'])) {
            $model->imageContent = $map['image_content'];
        }

        return $model;
    }
}
