<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractTextSignVerifySignInfo extends Model
{
    // 签名信息
    /**
     * @example
     *
     * @var ContractTextSignVerifySignatureInfo
     */
    public $signature;

    // 证书信息
    /**
     * @example
     *
     * @var ContractTextSignVerifyCertInfo
     */
    public $cert;
    protected $_name = [
        'signature' => 'signature',
        'cert'      => 'cert',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->signature) {
            $res['signature'] = null !== $this->signature ? $this->signature->toMap() : null;
        }
        if (null !== $this->cert) {
            $res['cert'] = null !== $this->cert ? $this->cert->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractTextSignVerifySignInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['signature'])) {
            $model->signature = ContractTextSignVerifySignatureInfo::fromMap($map['signature']);
        }
        if (isset($map['cert'])) {
            $model->cert = ContractTextSignVerifyCertInfo::fromMap($map['cert']);
        }

        return $model;
    }
}
