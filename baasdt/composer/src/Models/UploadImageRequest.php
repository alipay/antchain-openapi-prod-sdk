<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UploadImageRequest extends Model
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

    // 链ID
    /**
     * @var string
     */
    public $chainId;

    // 图片MIME类型，目前仅支持 image/jpeg
    /**
     * @var string
     */
    public $contentType;

    // 要代理操作的租户ID
    /**
     * @var string
     */
    public $delegatedTenantId;

    // 图片信息（base64编码）
    /**
     * @var string
     */
    public $image;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'chainId'           => 'chain_id',
        'contentType'       => 'content_type',
        'delegatedTenantId' => 'delegated_tenant_id',
        'image'             => 'image',
    ];

    public function validate()
    {
        Model::validateRequired('chainId', $this->chainId, true);
        Model::validateRequired('contentType', $this->contentType, true);
        Model::validateRequired('image', $this->image, true);
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
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->contentType) {
            $res['content_type'] = $this->contentType;
        }
        if (null !== $this->delegatedTenantId) {
            $res['delegated_tenant_id'] = $this->delegatedTenantId;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadImageRequest
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
        if (isset($map['chain_id'])) {
            $model->chainId = $map['chain_id'];
        }
        if (isset($map['content_type'])) {
            $model->contentType = $map['content_type'];
        }
        if (isset($map['delegated_tenant_id'])) {
            $model->delegatedTenantId = $map['delegated_tenant_id'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }

        return $model;
    }
}
