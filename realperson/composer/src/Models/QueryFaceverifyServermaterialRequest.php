<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryFaceverifyServermaterialRequest extends Model
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

    // 实人认证唯一标识
    /**
     * @var string
     */
    public $certifyId;

    // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
    /**
     * @var string
     */
    public $outerOrderNo;

    // 场景ID
    /**
     * @var string
     */
    public $sceneId;

    // 预留扩展业务参数
    /**
     * @var string
     */
    public $externParam;

    // 图片的传入加密模式 0：明文 1：AES加密
    /**
     * @var string
     */
    public $materialEncType;

    // 公钥加密后的密钥，用于传入的加密图片/视频
    /**
     * @var string
     */
    public $materialEncToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'certifyId'         => 'certify_id',
        'outerOrderNo'      => 'outer_order_no',
        'sceneId'           => 'scene_id',
        'externParam'       => 'extern_param',
        'materialEncType'   => 'material_enc_type',
        'materialEncToken'  => 'material_enc_token',
    ];

    public function validate()
    {
        Model::validateRequired('certifyId', $this->certifyId, true);
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('sceneId', $this->sceneId, true);
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
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
        }
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->sceneId) {
            $res['scene_id'] = $this->sceneId;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }
        if (null !== $this->materialEncType) {
            $res['material_enc_type'] = $this->materialEncType;
        }
        if (null !== $this->materialEncToken) {
            $res['material_enc_token'] = $this->materialEncToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFaceverifyServermaterialRequest
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
        if (isset($map['certify_id'])) {
            $model->certifyId = $map['certify_id'];
        }
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['scene_id'])) {
            $model->sceneId = $map['scene_id'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }
        if (isset($map['material_enc_type'])) {
            $model->materialEncType = $map['material_enc_type'];
        }
        if (isset($map['material_enc_token'])) {
            $model->materialEncToken = $map['material_enc_token'];
        }

        return $model;
    }
}
