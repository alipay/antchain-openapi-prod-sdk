<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryAiidentificationQrcodeRequest extends Model
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

    // 用户身份标识
    /**
     * @var string
     */
    public $appKey;

    // 图片内容的base64字符串
    /**
     * @var string
     */
    public $queryImageBase64;

    // 底图内容的base64字符串
    /**
     * @var string
     */
    public $galleryImageBase64;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'appKey'             => 'app_key',
        'queryImageBase64'   => 'query_image_base64',
        'galleryImageBase64' => 'gallery_image_base64',
    ];

    public function validate()
    {
        Model::validateRequired('appKey', $this->appKey, true);
        Model::validateRequired('queryImageBase64', $this->queryImageBase64, true);
        Model::validateRequired('galleryImageBase64', $this->galleryImageBase64, true);
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
        if (null !== $this->appKey) {
            $res['app_key'] = $this->appKey;
        }
        if (null !== $this->queryImageBase64) {
            $res['query_image_base64'] = $this->queryImageBase64;
        }
        if (null !== $this->galleryImageBase64) {
            $res['gallery_image_base64'] = $this->galleryImageBase64;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAiidentificationQrcodeRequest
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
        if (isset($map['app_key'])) {
            $model->appKey = $map['app_key'];
        }
        if (isset($map['query_image_base64'])) {
            $model->queryImageBase64 = $map['query_image_base64'];
        }
        if (isset($map['gallery_image_base64'])) {
            $model->galleryImageBase64 = $map['gallery_image_base64'];
        }

        return $model;
    }
}
