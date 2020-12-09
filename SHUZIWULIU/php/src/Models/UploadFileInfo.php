<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UploadFileInfo extends Model {
    protected $_name = [
        'fileId' => 'file_id',
        'fileHash' => 'file_hash',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->fileHash) {
            $res['file_hash'] = $this->fileHash;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadFileInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['file_id'])){
            $model->fileId = $map['file_id'];
        }
        if(isset($map['file_hash'])){
            $model->fileHash = $map['file_hash'];
        }
        return $model;
    }
    // 文件id
    /**
     * @example 123456
     * @var string
     */
    public $fileId;

    // 文件hash
    /**
     * @example ca94860b2f902e1ba7917d2c6a983cc43e5b3921f4b7ab28ea791ac28314ba52
     * @var string
     */
    public $fileHash;

}
