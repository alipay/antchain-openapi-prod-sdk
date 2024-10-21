<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class KeyInfo extends Model
{
    // 密钥ID
    /**
     * @example 1826615104029319169
     *
     * @var string
     */
    public $keyId;

    // 密钥名称
    /**
     * @example manager_key
     *
     * @var string
     */
    public $keyName;

    // 密钥地址
    /**
     * @example 0x9168f016a64df83d7de267fa5588674377a15be7
     *
     * @var string
     */
    public $keyAddress;

    // 密钥类型(MINT：发行密钥；BURN：赎回密钥；TRANSFER：转账密钥；MANAGER：管理密钥)
    /**
     * @example MINT
     *
     * @var string
     */
    public $keyType;
    protected $_name = [
        'keyId'      => 'key_id',
        'keyName'    => 'key_name',
        'keyAddress' => 'key_address',
        'keyType'    => 'key_type',
    ];

    public function validate()
    {
        Model::validateRequired('keyId', $this->keyId, true);
        Model::validateRequired('keyName', $this->keyName, true);
        Model::validateRequired('keyAddress', $this->keyAddress, true);
        Model::validateRequired('keyType', $this->keyType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->keyId) {
            $res['key_id'] = $this->keyId;
        }
        if (null !== $this->keyName) {
            $res['key_name'] = $this->keyName;
        }
        if (null !== $this->keyAddress) {
            $res['key_address'] = $this->keyAddress;
        }
        if (null !== $this->keyType) {
            $res['key_type'] = $this->keyType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return KeyInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['key_id'])) {
            $model->keyId = $map['key_id'];
        }
        if (isset($map['key_name'])) {
            $model->keyName = $map['key_name'];
        }
        if (isset($map['key_address'])) {
            $model->keyAddress = $map['key_address'];
        }
        if (isset($map['key_type'])) {
            $model->keyType = $map['key_type'];
        }

        return $model;
    }
}
