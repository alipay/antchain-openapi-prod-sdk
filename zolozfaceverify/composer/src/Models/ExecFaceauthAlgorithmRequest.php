<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ZOLOZFACEVERIFY\Models;

use AlibabaCloud\Tea\Model;

class ExecFaceauthAlgorithmRequest extends Model
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

    // 业务ID
    /**
     * @var string
     */
    public $bizId;

    // 渠道
    /**
     * @var string
     */
    public $channel;

    // base64图片
    /**
     * @var string
     */
    public $imgStr;

    // Pano类型
    /**
     * @var string
     */
    public $imgType;

    // 场景
    /**
     * @var string
     */
    public $scene;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'channel'           => 'channel',
        'imgStr'            => 'img_str',
        'imgType'           => 'img_type',
        'scene'             => 'scene',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('imgStr', $this->imgStr, true);
        Model::validateRequired('imgType', $this->imgType, true);
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
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->imgStr) {
            $res['img_str'] = $this->imgStr;
        }
        if (null !== $this->imgType) {
            $res['img_type'] = $this->imgType;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecFaceauthAlgorithmRequest
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
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['img_str'])) {
            $model->imgStr = $map['img_str'];
        }
        if (isset($map['img_type'])) {
            $model->imgType = $map['img_type'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }

        return $model;
    }
}
