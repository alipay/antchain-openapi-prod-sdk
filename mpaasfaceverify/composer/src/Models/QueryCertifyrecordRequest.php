<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MPAASFACEVERIFY\Models;

use AlibabaCloud\Tea\Model;

class QueryCertifyrecordRequest extends Model
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

    // certifyId，用于查询认证结果
    /**
     * @var string
     */
    public $certifyId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'externParam'       => 'extern_param',
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCertifyrecordRequest
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
        if (isset($map['certify_id'])) {
            $model->certifyId = $map['certify_id'];
        }

        return $model;
    }
}
