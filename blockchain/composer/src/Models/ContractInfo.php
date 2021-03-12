<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ContractInfo extends Model
{
    // 合约地址
    /**
     * @example ac01ceb0d8df822e042e5ea3b677201655250dbf54b9bd0c364de6f3f2a1dc7e
     *
     * @var string
     */
    public $contract;

    // 部署hash
    /**
     * @example 1c625b49992ed3b55abaac677f964a35c4151d4112da8204ac874b6497bf1143
     *
     * @var string
     */
    public $hash;

    // 合约部署时间
    /**
     * @example 1573401600000
     *
     * @var int
     */
    public $timestamp;
    protected $_name = [
        'contract'  => 'contract',
        'hash'      => 'hash',
        'timestamp' => 'timestamp',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contract) {
            $res['contract'] = $this->contract;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['contract'])) {
            $model->contract = $map['contract'];
        }
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }

        return $model;
    }
}
