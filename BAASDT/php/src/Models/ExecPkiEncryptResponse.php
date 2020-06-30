<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecPkiEncryptResponse extends Model {
    protected $_name = [
        'encryptedContent' => 'encrypted_content',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->encryptedContent) {
            $res['encrypted_content'] = $this->encryptedContent;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecPkiEncryptResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['encrypted_content'])){
            $model->encryptedContent = $map['encrypted_content'];
        }
        return $model;
    }
    /**
     * @description 密文 base64编码 
     * @example BETi2OI8DrI73WzqeBKwVgbKSi85UheXLE9gaK26yeDzMtKe9SLsZ...
     * @var string
     */
    public $encryptedContent;

}
