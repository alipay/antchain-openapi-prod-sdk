<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVERENDER\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class ExecAntcloudMarketingagentTemplateAnalysisRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'fileId' => 'file_id',
        'materialId' => 'material_id',
        'requestId' => 'request_id',
    ];
    public function validate() {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('materialId', $this->materialId, true);
        Model::validateRequired('requestId', $this->requestId, true);
    }
    public function toMap() {
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
        if (null !== $this->materialId) {
            $res['material_id'] = $this->materialId;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecAntcloudMarketingagentTemplateAnalysisRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['fileObject'])){
            $model->fileObject = $map['fileObject'];
        }
        if(isset($map['fileObjectName'])){
            $model->fileObjectName = $map['fileObjectName'];
        }
        if(isset($map['file_id'])){
            $model->fileId = $map['file_id'];
        }
        if(isset($map['material_id'])){
            $model->materialId = $map['material_id'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // string
    /**
     * @description 待上传文件
     * @var Stream
     */
    public $fileObject;

    /**
     * @description 待上传文件名
     * @var string
     */
    public $fileObjectName;

    /**
     * @var string
     */
    public $fileId;

    // 视频素材id
    /**
     * @var string
     */
    public $materialId;

    // 本次操作幂等键，最多64字符
    /**
     * @var string
     */
    public $requestId;

}
