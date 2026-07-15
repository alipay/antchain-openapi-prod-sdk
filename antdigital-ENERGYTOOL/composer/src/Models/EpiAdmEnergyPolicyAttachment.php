<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class EpiAdmEnergyPolicyAttachment extends Model {
    protected $_name = [
        'filename' => 'filename',
        'fileurl' => 'fileurl',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->filename) {
            $res['filename'] = $this->filename;
        }
        if (null !== $this->fileurl) {
            $res['fileurl'] = $this->fileurl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return EpiAdmEnergyPolicyAttachment
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['filename'])){
            $model->filename = $map['filename'];
        }
        if(isset($map['fileurl'])){
            $model->fileurl = $map['fileurl'];
        }
        return $model;
    }
    // 文件名称
    /**
     * @example 文件名称.pdf
     * @var string
     */
    public $filename;

    // 文件下载地址
    /**
     * @example https://www.oss.com/download
     * @var string
     */
    public $fileurl;

}
