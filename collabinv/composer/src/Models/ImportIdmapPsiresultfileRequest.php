<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class ImportIdmapPsiresultfileRequest extends Model
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

    // 文件路径
    /**
     * @var string
     */
    public $filePath;

    // 文件名称
    /**
     * @var string
     */
    public $fileName;

    // 项目唯一标识
    /**
     * @var string
     */
    public $projectInfoId;

    // 样本编码
    /**
     * @var string
     */
    public $sampleCode;

    // 样本任务编码
    /**
     * @var string
     */
    public $sampleTaskCode;

    // 数据源编码
    /**
     * @var string
     */
    public $dataSource;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'filePath'          => 'file_path',
        'fileName'          => 'file_name',
        'projectInfoId'     => 'project_info_id',
        'sampleCode'        => 'sample_code',
        'sampleTaskCode'    => 'sample_task_code',
        'dataSource'        => 'data_source',
    ];

    public function validate()
    {
        Model::validateRequired('filePath', $this->filePath, true);
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('projectInfoId', $this->projectInfoId, true);
        Model::validateRequired('sampleCode', $this->sampleCode, true);
        Model::validateRequired('sampleTaskCode', $this->sampleTaskCode, true);
        Model::validateRequired('dataSource', $this->dataSource, true);
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
        if (null !== $this->filePath) {
            $res['file_path'] = $this->filePath;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->projectInfoId) {
            $res['project_info_id'] = $this->projectInfoId;
        }
        if (null !== $this->sampleCode) {
            $res['sample_code'] = $this->sampleCode;
        }
        if (null !== $this->sampleTaskCode) {
            $res['sample_task_code'] = $this->sampleTaskCode;
        }
        if (null !== $this->dataSource) {
            $res['data_source'] = $this->dataSource;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportIdmapPsiresultfileRequest
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
        if (isset($map['file_path'])) {
            $model->filePath = $map['file_path'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['project_info_id'])) {
            $model->projectInfoId = $map['project_info_id'];
        }
        if (isset($map['sample_code'])) {
            $model->sampleCode = $map['sample_code'];
        }
        if (isset($map['sample_task_code'])) {
            $model->sampleTaskCode = $map['sample_task_code'];
        }
        if (isset($map['data_source'])) {
            $model->dataSource = $map['data_source'];
        }

        return $model;
    }
}
