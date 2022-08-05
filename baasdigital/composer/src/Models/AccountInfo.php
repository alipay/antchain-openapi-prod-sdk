<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class AccountInfo extends Model
{
    // 托管账户的账户名称，也是链上账户名称，交易发起方账户
    /**
     * @example zhangsan
     *
     * @var string
     */
    public $account;

    // 托管账户对应的秘钥ID
    /**
     * @example ORGJxxx33196002-xxxx-xxxx-xxxx-3d466debbc33
     *
     * @var string
     */
    public $kmsId;

    // 托管账户对应的租户ID，默认为空，如有使用其他租户的托管账户时需指定
    /**
     * @example ABCDEFG
     *
     * @var string
     */
    public $tenantId;

    // 非托管模式下必须输入，客户端构建交易出的信息，base64编码
    /**
     * @example eyJleHBpcmF0aW9uIjoiMjAxNS0xM...
     *
     * @var string
     */
    public $signData;
    protected $_name = [
        'account'  => 'account',
        'kmsId'    => 'kms_id',
        'tenantId' => 'tenant_id',
        'signData' => 'sign_data',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->account) {
            $res['account'] = $this->account;
        }
        if (null !== $this->kmsId) {
            $res['kms_id'] = $this->kmsId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->signData) {
            $res['sign_data'] = $this->signData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AccountInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account'])) {
            $model->account = $map['account'];
        }
        if (isset($map['kms_id'])) {
            $model->kmsId = $map['kms_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['sign_data'])) {
            $model->signData = $map['sign_data'];
        }

        return $model;
    }
}
