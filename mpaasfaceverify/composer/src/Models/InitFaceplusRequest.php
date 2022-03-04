<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MPAASFACEVERIFY\Models;

use AlibabaCloud\Tea\Model;

class InitFaceplusRequest extends Model
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

    // 业务唯一单号
    /**
     * @var string
     */
    public $bizId;

    // 身份，需要公钥加密
    /**
     * @var string
     */
    public $identityParam;

    // 客户端采集
    /**
     * @var string
     */
    public $metainfo;

    // 外部参数
    /**
     * @var string
     */
    public $externParam;

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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'identityParam'     => 'identity_param',
        'metainfo'          => 'metainfo',
        'externParam'       => 'extern_param',
        'operationType'     => 'operation_type',
        'refImg'            => 'ref_img',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('identityParam', $this->identityParam, true);
        Model::validateRequired('metainfo', $this->metainfo, true);
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
        if (null !== $this->identityParam) {
            $res['identity_param'] = $this->identityParam;
        }
        if (null !== $this->metainfo) {
            $res['metainfo'] = $this->metainfo;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
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
     * @return InitFaceplusRequest
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
        if (isset($map['identity_param'])) {
            $model->identityParam = $map['identity_param'];
        }
        if (isset($map['metainfo'])) {
            $model->metainfo = $map['metainfo'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
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
