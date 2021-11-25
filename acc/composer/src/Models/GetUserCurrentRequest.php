<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class GetUserCurrentRequest extends Model
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

    // 账号id
    /**
     * @var int
     */
    public $userId;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 不传默认是 BASE_INFO
    // BASE_INFO 基本信息
    // ORG_CERT_FILE 企业图片
    // LP_CERT_FILE 法人图片
    /**
     * @var string[]
     */
    public $queryOptions;

    // 企业用户userId
    /**
     * @var int
     */
    public $firmUserId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId'            => 'user_id',
        'tenantId'          => 'tenant_id',
        'queryOptions'      => 'query_options',
        'firmUserId'        => 'firm_user_id',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->queryOptions) {
            $res['query_options'] = $this->queryOptions;
        }
        if (null !== $this->firmUserId) {
            $res['firm_user_id'] = $this->firmUserId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetUserCurrentRequest
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['query_options'])) {
            if (!empty($map['query_options'])) {
                $model->queryOptions = $map['query_options'];
            }
        }
        if (isset($map['firm_user_id'])) {
            $model->firmUserId = $map['firm_user_id'];
        }

        return $model;
    }
}
