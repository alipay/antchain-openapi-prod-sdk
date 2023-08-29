<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5511b931fbd04feba92b64ebc082aac0\Models;

use AlibabaCloud\Tea\Model;

class InitAntchainEkycVerificationWebsdkRequest extends Model
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

    // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
    /**
     * @var string
     */
    public $bizId;

    // 场景ID
    /**
     * @var string
     */
    public $sceneId;

    // 预留扩展参数
    /**
     * @var string
     */
    public $externParam;

    // 用户身份信息
    /**
     * @var string
     */
    public $identityParam;

    // metainfo环境参数
    /**
     * @var string
     */
    public $metainfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'sceneId'           => 'scene_id',
        'externParam'       => 'extern_param',
        'identityParam'     => 'identity_param',
        'metainfo'          => 'metainfo',
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
        if (null !== $this->sceneId) {
            $res['scene_id'] = $this->sceneId;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }
        if (null !== $this->identityParam) {
            $res['identity_param'] = $this->identityParam;
        }
        if (null !== $this->metainfo) {
            $res['metainfo'] = $this->metainfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitAntchainEkycVerificationWebsdkRequest
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
        if (isset($map['scene_id'])) {
            $model->sceneId = $map['scene_id'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }
        if (isset($map['identity_param'])) {
            $model->identityParam = $map['identity_param'];
        }
        if (isset($map['metainfo'])) {
            $model->metainfo = $map['metainfo'];
        }

        return $model;
    }
}
