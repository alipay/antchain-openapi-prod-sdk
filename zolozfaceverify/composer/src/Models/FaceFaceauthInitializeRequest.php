<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ZOLOZFACEVERIFY\Models;

use AlibabaCloud\Tea\Model;

class FaceFaceauthInitializeRequest extends Model
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

    // metainfo环境参数
    /**
     * @var string
     */
    public $metainfo;

    // 操作类型
    /**
     * @var string
     */
    public $operationType;

    // 比对源图片
    /**
     * @var string
     */
    public $refImg;

    // 比对源图片oss中转
    /**
     * @var string
     */
    public $refImgOssObj;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'externParam'       => 'extern_param',
        'identityParam'     => 'identity_param',
        'metainfo'          => 'metainfo',
        'operationType'     => 'operation_type',
        'refImg'            => 'ref_img',
        'refImgOssObj'      => 'ref_img_oss_obj',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('identityParam', $this->identityParam, true);
        Model::validateRequired('metainfo', $this->metainfo, true);
        Model::validateRequired('refImgOssObj', $this->refImgOssObj, true);
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
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }
        if (null !== $this->identityParam) {
            $res['identity_param'] = $this->identityParam;
        }
        if (null !== $this->metainfo) {
            $res['metainfo'] = $this->metainfo;
        }
        if (null !== $this->operationType) {
            $res['operation_type'] = $this->operationType;
        }
        if (null !== $this->refImg) {
            $res['ref_img'] = $this->refImg;
        }
        if (null !== $this->refImgOssObj) {
            $res['ref_img_oss_obj'] = $this->refImgOssObj;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FaceFaceauthInitializeRequest
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
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }
        if (isset($map['identity_param'])) {
            $model->identityParam = $map['identity_param'];
        }
        if (isset($map['metainfo'])) {
            $model->metainfo = $map['metainfo'];
        }
        if (isset($map['operation_type'])) {
            $model->operationType = $map['operation_type'];
        }
        if (isset($map['ref_img'])) {
            $model->refImg = $map['ref_img'];
        }
        if (isset($map['ref_img_oss_obj'])) {
            $model->refImgOssObj = $map['ref_img_oss_obj'];
        }

        return $model;
    }
}
