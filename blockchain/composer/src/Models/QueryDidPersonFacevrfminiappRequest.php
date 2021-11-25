<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDidPersonFacevrfminiappRequest extends Model
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

    // 请求的唯一标识，通常为32字符宽度的字符串内容，也可以只用UUID，此参数通常用来支持幂等，或者排查问题，调用方可以使用业务流水号。 与创建申请认证的接口的bizId目前不强校验一致性。
    /**
     * @var string
     */
    public $bizId;

    // 可信实人认证的唯一标识，用于核心查询认证结果的唯一标识。
    /**
     * @var string
     */
    public $certifyId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizCode'           => 'biz_code',
        'bizId'             => 'biz_id',
        'certifyId'         => 'certify_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('certifyId', $this->certifyId, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDidPersonFacevrfminiappRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['certify_id'])) {
            $model->certifyId = $map['certify_id'];
        }

        return $model;
    }
}
