<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class QueryApiSimpleauthstandardRequest extends Model
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
    public $identityId;

    // 用于幂等控制
    /**
     * @var string
     */
    public $bizRequestId;

    // 该请求最终发起方(金融机构)的租户号，若是征信通道模式，则是征信机构终端客户的租户号，该租户号由我方分配。
    /**
     * @var string
     */
    public $instCode;

    // 产品类型；
    // 发票数据：301；税务数据：302；发票及税务数据：303； (通过征信机构链接时请在数字前加“ZX”，如：ZX301)
    /**
     * @var string
     */
    public $authType;

    // 是指行方生成的授权编号
    /**
     * @var string
     */
    public $authCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'identityId'        => 'identity_id',
        'bizRequestId'      => 'biz_request_id',
        'instCode'          => 'inst_code',
        'authType'          => 'auth_type',
        'authCode'          => 'auth_code',
    ];

    public function validate()
    {
        Model::validateRequired('identityId', $this->identityId, true);
        Model::validateRequired('bizRequestId', $this->bizRequestId, true);
        Model::validateRequired('instCode', $this->instCode, true);
        Model::validateRequired('authType', $this->authType, true);
        Model::validateRequired('authCode', $this->authCode, true);
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
        if (null !== $this->identityId) {
            $res['identity_id'] = $this->identityId;
        }
        if (null !== $this->bizRequestId) {
            $res['biz_request_id'] = $this->bizRequestId;
        }
        if (null !== $this->instCode) {
            $res['inst_code'] = $this->instCode;
        }
        if (null !== $this->authType) {
            $res['auth_type'] = $this->authType;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryApiSimpleauthstandardRequest
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
        if (isset($map['identity_id'])) {
            $model->identityId = $map['identity_id'];
        }
        if (isset($map['biz_request_id'])) {
            $model->bizRequestId = $map['biz_request_id'];
        }
        if (isset($map['inst_code'])) {
            $model->instCode = $map['inst_code'];
        }
        if (isset($map['auth_type'])) {
            $model->authType = $map['auth_type'];
        }
        if (isset($map['auth_code'])) {
            $model->authCode = $map['auth_code'];
        }

        return $model;
    }
}
