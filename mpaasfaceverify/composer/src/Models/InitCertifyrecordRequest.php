<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MPAASFACEVERIFY\Models;

use AlibabaCloud\Tea\Model;

class InitCertifyrecordRequest extends Model
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

    // 计费规则码
    /**
     * @var string
     */
    public $chargeCode;

    // 预留扩展业务参数
    /**
     * @var string
     */
    public $externParam;

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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'chargeCode'        => 'charge_code',
        'externParam'       => 'extern_param',
        'metainfo'          => 'metainfo',
        'operationType'     => 'operation_type',
        'refImg'            => 'ref_img',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('chargeCode', $this->chargeCode, true);
        Model::validateRequired('externParam', $this->externParam, true);
        Model::validateRequired('metainfo', $this->metainfo, true);
        Model::validateRequired('operationType', $this->operationType, true);
        Model::validateRequired('refImg', $this->refImg, true);
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
        if (null !== $this->chargeCode) {
            $res['charge_code'] = $this->chargeCode;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitCertifyrecordRequest
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
        if (isset($map['charge_code'])) {
            $model->chargeCode = $map['charge_code'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
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

        return $model;
    }
}
