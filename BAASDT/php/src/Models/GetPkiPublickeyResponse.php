<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class GetPkiPublickeyResponse extends Model {
    protected $_name = [
        'publicKey' => 'public_key',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->publicKey) {
            $res['public_key'] = $this->publicKey;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetPkiPublickeyResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['public_key'])){
            $model->publicKey = $map['public_key'];
        }
        return $model;
    }
    /**
     * @description 公钥字符串（base64）
     * @example 3ZIrtYZVkAlluTxKVl95bdmIIpD09RzM9LGoS3v3YO7lTOb0/Md1jJbO7qzm+QUn3S1oTX+BHVQ35jl9Lwgqbw==
     * @var string
     */
    public $publicKey;

}
