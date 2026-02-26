<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class UploadMktFileRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 文件唯一id
    /**
     * @description 待上传文件
     *
     * @var Stream
     */
    public $fileObject;

    /**
     * @description 待上传文件名
     *
     * @var string
     */
    public $fileObjectName;

    /**
     * @var string
     */
    public $fileId;

    // 业务入参json格式字符串
    /**
     * @var string
     */
    public $bizContent;

    // 请求id，每一次请求保持唯一，若重复，则报错；
    /**
     * @var string
     */
    public $requestId;

    // 产品编码，蚂蚁分配
    /**
     * @var string
     */
    public $productCode;

    // 数据类型，
    // 营销人群底包--MKT_AUD_SRC，
    // 营销目标人群包--MKT_AUD_TAR
    /**
     * @var string
     */
    public $dataType;
    protected $_name = [
        'authToken'   => 'auth_token',
        'fileId'      => 'file_id',
        'bizContent'  => 'biz_content',
        'requestId'   => 'request_id',
        'productCode' => 'product_code',
        'dataType'    => 'data_type',
    ];

    public function validate()
    {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('dataType', $this->dataType, true);
        Model::validateMaxLength('bizContent', $this->bizContent, 1024);
        Model::validateMaxLength('requestId', $this->requestId, 128);
        Model::validateMaxLength('productCode', $this->productCode, 64);
        Model::validateMaxLength('dataType', $this->dataType, 64);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->fileObject) {
            $res['fileObject'] = $this->fileObject;
        }
        if (null !== $this->fileObjectName) {
            $res['fileObjectName'] = $this->fileObjectName;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadMktFileRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['fileObject'])) {
            $model->fileObject = $map['fileObject'];
        }
        if (isset($map['fileObjectName'])) {
            $model->fileObjectName = $map['fileObjectName'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['biz_content'])) {
            $model->bizContent = $map['biz_content'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }

        return $model;
    }
}
