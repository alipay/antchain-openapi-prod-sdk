<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class QuerySimpleauthIdentitystateRequest extends Model
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

    // 纳税人识别号
    /**
     * @var string
     */
    public $identity;

    // 租户号
    /**
     * @var string
     */
    public $instCode;

    // 请求id
    /**
     * @var string
     */
    public $bizUniqueId;

    // 产品类型
    /**
     * @var string
     */
    public $authType;

    // 授权编码
    /**
     * @var string
     */
    public $authCode;

    // 纳税人名称
    /**
     * @var string
     */
    public $nsrsmc;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'identity'          => 'identity',
        'instCode'          => 'inst_code',
        'bizUniqueId'       => 'biz_unique_id',
        'authType'          => 'auth_type',
        'authCode'          => 'auth_code',
        'nsrsmc'            => 'nsrsmc',
    ];

    public function validate()
    {
        Model::validateRequired('identity', $this->identity, true);
        Model::validateRequired('instCode', $this->instCode, true);
        Model::validateRequired('bizUniqueId', $this->bizUniqueId, true);
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('authCode', $this->authCode, true);
        Model::validateRequired('nsrsmc', $this->nsrsmc, true);
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
        if (null !== $this->identity) {
            $res['identity'] = $this->identity;
        }
        if (null !== $this->instCode) {
            $res['inst_code'] = $this->instCode;
        }
        if (null !== $this->bizUniqueId) {
            $res['biz_unique_id'] = $this->bizUniqueId;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }
        if (null !== $this->nsrsmc) {
            $res['nsrsmc'] = $this->nsrsmc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySimpleauthIdentitystateRequest
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
        if (isset($map['identity'])) {
            $model->identity = $map['identity'];
        }
        if (isset($map['inst_code'])) {
            $model->instCode = $map['inst_code'];
        }
        if (isset($map['biz_unique_id'])) {
            $model->bizUniqueId = $map['biz_unique_id'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['auth_code'])) {
            $model->authCode = $map['auth_code'];
        }
        if (isset($map['nsrsmc'])) {
            $model->nsrsmc = $map['nsrsmc'];
        }

        return $model;
    }
}
