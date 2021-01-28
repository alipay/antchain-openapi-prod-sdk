<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateContractTemplateRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'contentMd5' => 'content_md5',
        'contentType' => 'content_type',
        'convert2Pdf' => 'convert2_pdf',
        'fileName' => 'file_name',
    ];
    public function validate() {
        Model::validateRequired('contentMd5', $this->contentMd5, true);
        Model::validateRequired('contentType', $this->contentType, true);
        Model::validateRequired('convert2Pdf', $this->convert2Pdf, true);
        Model::validateRequired('fileName', $this->fileName, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->contentMd5) {
            $res['content_md5'] = $this->contentMd5;
        }
        if (null !== $this->contentType) {
            $res['content_type'] = $this->contentType;
        }
        if (null !== $this->convert2Pdf) {
            $res['convert2_pdf'] = $this->convert2Pdf;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateContractTemplateRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['content_md5'])){
            $model->contentMd5 = $map['content_md5'];
        }
        if(isset($map['content_type'])){
            $model->contentType = $map['content_type'];
        }
        if(isset($map['convert2_pdf'])){
            $model->convert2Pdf = $map['convert2_pdf'];
        }
        if(isset($map['file_name'])){
            $model->fileName = $map['file_name'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 模板文件md5值，再做base64编码
    /**
     * @var string
     */
    public $contentMd5;

    // 目标文件的MIME类型
    /**
     * @var string
     */
    public $contentType;

    // 是否需要转成pdf，如果模板文件为.doc/.docx 传true，为pdf传false
    /**
     * @var bool
     */
    public $convert2Pdf;

    // 文件名称，必须带扩展名如:.pdf,.doc,.docx
    /**
     * @var string
     */
    public $fileName;

}
