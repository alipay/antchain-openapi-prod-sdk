<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class GetTwcNotaryContractFileuploadurlRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'accountId' => 'account_id',
        'contentMd5' => 'content_md5',
        'contentType' => 'content_type',
        'convert2Pdf' => 'convert_2_pdf',
        'fileName' => 'file_name',
        'fileSize' => 'file_size',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->contentMd5) {
            $res['content_md5'] = $this->contentMd5;
        }
        if (null !== $this->contentType) {
            $res['content_type'] = $this->contentType;
        }
        if (null !== $this->convert2Pdf) {
            $res['convert_2_pdf'] = $this->convert2Pdf;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileSize) {
            $res['file_size'] = $this->fileSize;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetTwcNotaryContractFileuploadurlRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['account_id'])){
            $model->accountId = $map['account_id'];
        }
        if(isset($map['content_md5'])){
            $model->contentMd5 = $map['content_md5'];
        }
        if(isset($map['content_type'])){
            $model->contentType = $map['content_type'];
        }
        if(isset($map['convert_2_pdf'])){
            $model->convert2Pdf = $map['convert_2_pdf'];
        }
        if(isset($map['file_name'])){
            $model->fileName = $map['file_name'];
        }
        if(isset($map['file_size'])){
            $model->fileSize = $map['file_size'];
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

    /**
     * @var string
     */
    public $regionName;

    // 所属账号id，即个人账号id或机构账号id，如不传，则默认属于对接平台
    /**
     * @var string
     */
    public $accountId;

    // 先计算文件md5值，在对该md5值进行base64编码
    /**
     * @var string
     */
    public $contentMd5;

    // 目标文件的MIME类型
    /**
     * @var string
     */
    public $contentType;

    // 是否转换成pdf文档，默认false，代表不做转换。转换是异步行为，如果指定要转换，需要调用查询文件信息接口查询状态，转换完成后才可使用。
    /**
     * @var string
     */
    public $convert2Pdf;

    // 文件名称（必须带上文件扩展名，不然会导致后续发起流程校验过不去 示例：合同.pdf ）
    /**
     * @var string
     */
    public $fileName;

    // 文件大小，单位byte
    /**
     * @var int
     */
    public $fileSize;

}
