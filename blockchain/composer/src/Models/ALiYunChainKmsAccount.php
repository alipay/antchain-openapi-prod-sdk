<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunChainKmsAccount extends Model
{
    // 账户公钥
    /**
     * @example 1234567890
     *
     * @var string
     */
    public $pubKey;

    // 托管秘钥ID
    /**
     * @example 1234567890
     *
     * @var string
     */
    public $myKmsKeyId;
    protected $_name = [
        'pubKey'     => 'pub_key',
        'myKmsKeyId' => 'my_kms_key_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->pubKey) {
            $res['pub_key'] = $this->pubKey;
        }
        if (null !== $this->myKmsKeyId) {
            $res['my_kms_key_id'] = $this->myKmsKeyId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunChainKmsAccount
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pub_key'])) {
            $model->pubKey = $map['pub_key'];
        }
        if (isset($map['my_kms_key_id'])) {
            $model->myKmsKeyId = $map['my_kms_key_id'];
        }

        return $model;
    }
}
