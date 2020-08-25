<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractDocAddress extends Model {
    protected $_name = [
        'fileId' => 'file_id',
        'fileName' => 'file_name',
        'fileUrl' => 'file_url',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ContractDocAddress
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['file_id'])){
            $model->fileId = $map['file_id'];
        }
        if(isset($map['file_name'])){
            $model->fileName = $map['file_name'];
        }
        if(isset($map['file_url'])){
            $model->fileUrl = $map['file_url'];
        }
        return $model;
    }
    // 电子合同文档ID
    /**
     * @example 01e50a9cedb74493a2d320b4f4732a29
     * @var string
     */
    public $fileId;

    // 电子合同文档名称，默认文件名称
    /**
     * @example 第一份合同.pdf
     * @var string
     */
    public $fileName;

    // 电子合同下载文档地址, 有效时间1小时
    /**
     * @example https://xxxoss.oss-cn-hangzhou.aliyuncs.com/xxx.pdf?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx
     * @var string
     */
    public $fileUrl;

}
