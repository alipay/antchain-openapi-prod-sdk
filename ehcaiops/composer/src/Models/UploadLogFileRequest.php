<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\EHCAIOPS\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class UploadLogFileRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 文件参数
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

    // 业务码
    /**
     * @var string
     */
    public $busCode;

    // 场景码
    /**
     * @var string
     */
    public $sceneCode;

    // 行内日志分隔符
    /**
     * @var string
     */
    public $elementSeparator;
    protected $_name = [
        'authToken'        => 'auth_token',
        'fileId'           => 'file_id',
        'busCode'          => 'bus_code',
        'sceneCode'        => 'scene_code',
        'elementSeparator' => 'element_separator',
    ];

    public function validate()
    {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('busCode', $this->busCode, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('elementSeparator', $this->elementSeparator, true);
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
        if (null !== $this->busCode) {
            $res['bus_code'] = $this->busCode;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->elementSeparator) {
            $res['element_separator'] = $this->elementSeparator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadLogFileRequest
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
        if (isset($map['bus_code'])) {
            $model->busCode = $map['bus_code'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['element_separator'])) {
            $model->elementSeparator = $map['element_separator'];
        }

        return $model;
    }
}
