<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class UploadUmktParamsFileRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // file_id
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

    // 场景策略id
    /**
     * @var int
     */
    public $sceneStrategyId;

    // 预计执行时间，不设置则为立即执行
    /**
     * @var string
     */
    public $execTime;

    // 支持不同的文件模版：
    // MOBILE_MD5_WITH_MS_VARIABLE、MOBILE_MD5
    // 后续支持
    // DEVICE_MD5
    /**
     * @var string
     */
    public $fileTemplate;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileId'            => 'file_id',
        'sceneStrategyId'   => 'scene_strategy_id',
        'execTime'          => 'exec_time',
        'fileTemplate'      => 'file_template',
    ];

    public function validate()
    {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('sceneStrategyId', $this->sceneStrategyId, true);
        Model::validateRequired('fileTemplate', $this->fileTemplate, true);
        Model::validateMinimum('sceneStrategyId', $this->sceneStrategyId, 1);
        Model::validatePattern('execTime', $this->execTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
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
        if (null !== $this->sceneStrategyId) {
            $res['scene_strategy_id'] = $this->sceneStrategyId;
        }
        if (null !== $this->execTime) {
            $res['exec_time'] = $this->execTime;
        }
        if (null !== $this->fileTemplate) {
            $res['file_template'] = $this->fileTemplate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadUmktParamsFileRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
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
        if (isset($map['scene_strategy_id'])) {
            $model->sceneStrategyId = $map['scene_strategy_id'];
        }
        if (isset($map['exec_time'])) {
            $model->execTime = $map['exec_time'];
        }
        if (isset($map['file_template'])) {
            $model->fileTemplate = $map['file_template'];
        }

        return $model;
    }
}
