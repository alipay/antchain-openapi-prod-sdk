<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecPkiDecryptRequest extends Model
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

    // 商户管理员/其用户的链上账户ID
    /**
     * @var string
     */
    public $accountId;

    // 要代理操作的租户ID
    /**
     * @var string
     */
    public $delegatedTenantId;

    // 密文（base64）
    /**
     * @var string
     */
    public $encryptedContent;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'accountId'         => 'account_id',
        'delegatedTenantId' => 'delegated_tenant_id',
        'encryptedContent'  => 'encrypted_content',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('encryptedContent', $this->encryptedContent, true);
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
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->delegatedTenantId) {
            $res['delegated_tenant_id'] = $this->delegatedTenantId;
        }
        if (null !== $this->encryptedContent) {
            $res['encrypted_content'] = $this->encryptedContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecPkiDecryptRequest
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
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['delegated_tenant_id'])) {
            $model->delegatedTenantId = $map['delegated_tenant_id'];
        }
        if (isset($map['encrypted_content'])) {
            $model->encryptedContent = $map['encrypted_content'];
        }

        return $model;
    }
}
