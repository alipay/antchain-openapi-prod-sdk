<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRpgwSignUrlRequest extends Model
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

    // 企业标识，固定值
    /**
     * @var string
     */
    public $companyCode;

    // 调用方平台用户id
    /**
     * @var string
     */
    public $platformUserIdentification;

    // 手机号
    /**
     * @var string
     */
    public $userCode;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'companyCode'                => 'company_code',
        'platformUserIdentification' => 'platform_user_identification',
        'userCode'                   => 'user_code',
    ];

    public function validate()
    {
        Model::validateRequired('companyCode', $this->companyCode, true);
        Model::validateRequired('platformUserIdentification', $this->platformUserIdentification, true);
        Model::validateRequired('userCode', $this->userCode, true);
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
        if (null !== $this->companyCode) {
            $res['company_code'] = $this->companyCode;
        }
        if (null !== $this->platformUserIdentification) {
            $res['platform_user_identification'] = $this->platformUserIdentification;
        }
        if (null !== $this->userCode) {
            $res['user_code'] = $this->userCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRpgwSignUrlRequest
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
        if (isset($map['company_code'])) {
            $model->companyCode = $map['company_code'];
        }
        if (isset($map['platform_user_identification'])) {
            $model->platformUserIdentification = $map['platform_user_identification'];
        }
        if (isset($map['user_code'])) {
            $model->userCode = $map['user_code'];
        }

        return $model;
    }
}
