<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class CreateProjectFileRequest extends Model
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

    // 项目编号
    /**
     * @var string
     */
    public $projectCode;

    // 文件id
    /**
     * @var string
     */
    public $fileId;

    // 文件业务id
    /**
     * @var string
     */
    public $fileBizId;

    // 文件编号
    /**
     * @var string
     */
    public $fileCode;

    // 文件名称
    /**
     * @var string
     */
    public $fileName;

    // 文件类型
    /**
     * @var string
     */
    public $fileType;

    // 扩展字段
    /**
     * @var string
     */
    public $extraData;

    // 数据时间戳
    /**
     * @var string
     */
    public $dataTimestamp;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'projectCode'       => 'project_code',
        'fileId'            => 'file_id',
        'fileBizId'         => 'file_biz_id',
        'fileCode'          => 'file_code',
        'fileName'          => 'file_name',
        'fileType'          => 'file_type',
        'extraData'         => 'extra_data',
        'dataTimestamp'     => 'data_timestamp',
    ];

    public function validate()
    {
        Model::validateRequired('projectCode', $this->projectCode, true);
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('dataTimestamp', $this->dataTimestamp, true);
        Model::validatePattern('dataTimestamp', $this->dataTimestamp, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->projectCode) {
            $res['project_code'] = $this->projectCode;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->fileBizId) {
            $res['file_biz_id'] = $this->fileBizId;
        }
        if (null !== $this->fileCode) {
            $res['file_code'] = $this->fileCode;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->extraData) {
            $res['extra_data'] = $this->extraData;
        }
        if (null !== $this->dataTimestamp) {
            $res['data_timestamp'] = $this->dataTimestamp;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateProjectFileRequest
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
        if (isset($map['project_code'])) {
            $model->projectCode = $map['project_code'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['file_biz_id'])) {
            $model->fileBizId = $map['file_biz_id'];
        }
        if (isset($map['file_code'])) {
            $model->fileCode = $map['file_code'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['extra_data'])) {
            $model->extraData = $map['extra_data'];
        }
        if (isset($map['data_timestamp'])) {
            $model->dataTimestamp = $map['data_timestamp'];
        }

        return $model;
    }
}
