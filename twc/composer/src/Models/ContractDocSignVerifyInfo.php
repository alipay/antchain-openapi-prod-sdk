<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractDocSignVerifyInfo extends Model
{
    // 证书信息
    /**
     * @example
     *
     * @var ContractDocSignVerifyCertInfo
     */
    public $cert;

    // 签名信息
    /**
     * @example
     *
     * @var ContractDocSignVerifySignatureInfo
     */
    public $signature;

    // 印章数据
    /**
     * @example 35058319XXxxxxxx33
     *
     * @var string
     */
    public $sealData;
    protected $_name = [
        'cert'      => 'cert',
        'signature' => 'signature',
        'sealData'  => 'seal_data',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cert) {
            $res['cert'] = null !== $this->cert ? $this->cert->toMap() : null;
        }
        if (null !== $this->signature) {
            $res['signature'] = null !== $this->signature ? $this->signature->toMap() : null;
        }
        if (null !== $this->sealData) {
            $res['seal_data'] = $this->sealData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractDocSignVerifyInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cert'])) {
            $model->cert = ContractDocSignVerifyCertInfo::fromMap($map['cert']);
        }
        if (isset($map['signature'])) {
            $model->signature = ContractDocSignVerifySignatureInfo::fromMap($map['signature']);
        }
        if (isset($map['seal_data'])) {
            $model->sealData = $map['seal_data'];
        }

        return $model;
    }
}
