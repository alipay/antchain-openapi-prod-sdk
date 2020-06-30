<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecPkiEncryptRequest extends Model {
    protected $_name = [
        'accountId' => 'account_id',
        'content' => 'content',
        'optTenantId' => 'opt_tenant_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->optTenantId) {
            $res['opt_tenant_id'] = $this->optTenantId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecPkiEncryptRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['account_id'])){
            $model->accountId = $map['account_id'];
        }
        if(isset($map['content'])){
            $model->content = $map['content'];
        }
        if(isset($map['opt_tenant_id'])){
            $model->optTenantId = $map['opt_tenant_id'];
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
     * @description 明文（base64编码）
     * @example aGVsbG8gbXlrbXM=
     * @var string
     */
    public $content;

    /**
     * @description 商户管理员/其用户归属的租户ID
     * @example tenant001
     * @var string
     */
    public $optTenantId;

}
