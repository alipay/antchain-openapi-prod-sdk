<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecPkiDecryptRequest extends Model {
    protected $_name = [
        'accountId' => 'account_id',
        'delegatedTenantId' => 'delegated_tenant_id',
        'encryptedContent' => 'encrypted_content',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
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
     * @return ExecPkiDecryptRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['account_id'])){
            $model->accountId = $map['account_id'];
        }
        if(isset($map['delegated_tenant_id'])){
            $model->delegatedTenantId = $map['delegated_tenant_id'];
        }
        if(isset($map['encrypted_content'])){
            $model->encryptedContent = $map['encrypted_content'];
        }
        return $model;
    }
    /**
     * @description 商户管理员/其用户的链上账户ID
     * @example b4d773a23dd3a46ed3a8589996cd950c67fd396785538214a095004ae3e94c64
     * @var string
     */
    public $accountId;

    /**
     * @description 要代理操作的租户ID
     * @example delegated_tenant_id
     * @var string
     */
    public $delegatedTenantId;

    /**
     * @description 密文（base64）
     * @example base64 密文
     * @var string
     */
    public $encryptedContent;

}
