<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class QuerySecurityImageRequest extends Model
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

    // 调用方唯一标示
    /**
     * @var string
     */
    public $enterprise;

    // 租户id
    /**
     * @var string
     */
    public $businessId;

    // 图片风险监测code
    /**
     * @var string
     */
    public $sceneCode;

    // 标示是否是同一个Q&A
    /**
     * @var string
     */
    public $messageId;

    // 待检测图片地址
    /**
     * @var string
     */
    public $imageUrl;

    // 图片检测内容
    /**
     * @var string
     */
    public $content;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'enterprise'        => 'enterprise',
        'businessId'        => 'business_id',
        'sceneCode'         => 'scene_code',
        'messageId'         => 'message_id',
        'imageUrl'          => 'image_url',
        'content'           => 'content',
    ];

    public function validate()
    {
        Model::validateRequired('businessId', $this->businessId, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('messageId', $this->messageId, true);
        Model::validateRequired('imageUrl', $this->imageUrl, true);
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
        if (null !== $this->enterprise) {
            $res['enterprise'] = $this->enterprise;
        }
        if (null !== $this->businessId) {
            $res['business_id'] = $this->businessId;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        if (null !== $this->imageUrl) {
            $res['image_url'] = $this->imageUrl;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySecurityImageRequest
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
        if (isset($map['enterprise'])) {
            $model->enterprise = $map['enterprise'];
        }
        if (isset($map['business_id'])) {
            $model->businessId = $map['business_id'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['message_id'])) {
            $model->messageId = $map['message_id'];
        }
        if (isset($map['image_url'])) {
            $model->imageUrl = $map['image_url'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }

        return $model;
    }
}
