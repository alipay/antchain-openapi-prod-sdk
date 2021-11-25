<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDidPersonFacevrfRequest extends Model
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

    // 可能由于租户ID被多个调用方公用时候，使用bizCode作为隔离区分。
    /**
     * @var string
     */
    public $bizCode;

    // 可信实人认证的唯一标识，用于核心查询认证结果的唯一标识。
    /**
     * @var string
     */
    public $certifyId;

    // 认证材料（人脸图像，如移动端采集认证后获得的人脸图像）的哈希
    /**
     * @var string
     */
    public $materialHash;

    // 请求的唯一标识，通常为32字符宽度的字符串内容，也可以只用UUID，此参数通常用来支持幂等，或者排查问题，调用方可以使用业务流水号。
    // 与创建申请认证的接口的bizId目前不强校验一致性。
    /**
     * @var string
     */
    public $bizId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizCode'           => 'biz_code',
        'certifyId'         => 'certify_id',
        'materialHash'      => 'material_hash',
        'bizId'             => 'biz_id',
    ];

    public function validate()
    {
        Model::validateRequired('certifyId', $this->certifyId, true);
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
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
        }
        if (null !== $this->materialHash) {
            $res['material_hash'] = $this->materialHash;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDidPersonFacevrfRequest
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
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['certify_id'])) {
            $model->certifyId = $map['certify_id'];
        }
        if (isset($map['material_hash'])) {
            $model->materialHash = $map['material_hash'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }

        return $model;
    }
}
