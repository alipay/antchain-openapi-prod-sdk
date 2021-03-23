<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ZOLOZFACEVERIFY\Models;

use AlibabaCloud\Tea\Model;

class IdentityFaceauthServermodeRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 活体照片，base64编码
    /**
     * @var string
     */
    public $authImg;

    // BLOB：使用客户端透传的BLOB数据
    // IMAGE：正常图片模式
    /**
     * @var string
     */
    public $authImgType;

    // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
    /**
     * @var string
     */
    public $bizId;

    // 预留扩展业务参数
    /**
     * @var string
     */
    public $externParam;

    // 用户身份信息
    /**
     * @var string
     */
    public $identityParam;

    // 操作类型，NORMAL正常模式，CUSTOM用户自定义比对源
    /**
     * @var string
     */
    public $operationType;

    // 比对源照片，base64编码
    /**
     * @var string
     */
    public $refImg;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authImg'           => 'auth_img',
        'authImgType'       => 'auth_img_type',
        'bizId'             => 'biz_id',
        'externParam'       => 'extern_param',
        'identityParam'     => 'identity_param',
        'operationType'     => 'operation_type',
        'refImg'            => 'ref_img',
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
        if (null !== $this->authImg) {
            $res['auth_img'] = $this->authImg;
        }
        if (null !== $this->authImgType) {
            $res['auth_img_type'] = $this->authImgType;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }
        if (null !== $this->identityParam) {
            $res['identity_param'] = $this->identityParam;
        }
        if (null !== $this->operationType) {
            $res['operation_type'] = $this->operationType;
        }
        if (null !== $this->refImg) {
            $res['ref_img'] = $this->refImg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IdentityFaceauthServermodeRequest
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
        if (isset($map['auth_img'])) {
            $model->authImg = $map['auth_img'];
        }
        if (isset($map['auth_img_type'])) {
            $model->authImgType = $map['auth_img_type'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }
        if (isset($map['identity_param'])) {
            $model->identityParam = $map['identity_param'];
        }
        if (isset($map['operation_type'])) {
            $model->operationType = $map['operation_type'];
        }
        if (isset($map['ref_img'])) {
            $model->refImg = $map['ref_img'];
        }

        return $model;
    }
}
