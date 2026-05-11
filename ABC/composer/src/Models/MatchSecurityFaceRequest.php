<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ABC\Models;

use AlibabaCloud\Tea\Model;

class MatchSecurityFaceRequest extends Model
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

    // 123
    /**
     * @var string
     */
    public $bizId;

    // 123
    /**
     * @var FaceImage
     */
    public $face1;

    // 123
    /**
     * @var FaceImage
     */
    public $face2;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'face1'             => 'face1',
        'face2'             => 'face2',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->face1) {
            $res['face1'] = null !== $this->face1 ? $this->face1->toMap() : null;
        }
        if (null !== $this->face2) {
            $res['face2'] = null !== $this->face2 ? $this->face2->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MatchSecurityFaceRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['face1'])) {
            $model->face1 = FaceImage::fromMap($map['face1']);
        }
        if (isset($map['face2'])) {
            $model->face2 = FaceImage::fromMap($map['face2']);
        }

        return $model;
    }
}
