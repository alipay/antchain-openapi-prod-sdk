<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACNCONTRACTREVIEW\Models;

use AlibabaCloud\Tea\Model;

class AuditRecordItem extends Model
{
    // 审核id
    /**
     * @example CAR00000000000000000000052
     *
     * @var string
     */
    public $auditId;

    // 状态
    /**
     * @example PROCESSING：合同审核任务已提交，正在异步处理中 SUCCESS：合同审核已完成，结果可查询;FAIL：合同审核过程中发生错误，审核失败;FINALIZED：合同已完成定稿操作，生成最终版本
     *
     * @var string
     */
    public $status;

    // 合同名称
    /**
     * @example XXX.docx
     *
     * @var string
     */
    public $contractFileName;

    // 创建人id
    /**
     * @example 2088000000000001
     *
     * @var string
     */
    public $creatorWorkNo;

    // 创建人名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $creatorName;

    // 基准线库名称
    /**
     * @example 基准线库
     *
     * @var string
     */
    public $baselineLibraryName;

    // 基准线id
    /**
     * @example BUS00020250909000000038865
     *
     * @var string
     */
    public $buId;

    // 创建时间
    /**
     * @example 2026-03-26 17:02:05
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 2026-03-26 17:04:18
     *
     * @var string
     */
    public $gmtModified;

    // 原始文件
    /**
     * @example undefined
     *
     * @var ContractFile
     */
    public $originalFile;

    // 当前编辑文件（定稿文件）
    /**
     * @example undefined
     *
     * @var ContractFile
     */
    public $finalFile;
    protected $_name = [
        'auditId'             => 'audit_id',
        'status'              => 'status',
        'contractFileName'    => 'contract_file_name',
        'creatorWorkNo'       => 'creator_work_no',
        'creatorName'         => 'creator_name',
        'baselineLibraryName' => 'baseline_library_name',
        'buId'                => 'bu_id',
        'gmtCreate'           => 'gmt_create',
        'gmtModified'         => 'gmt_modified',
        'originalFile'        => 'original_file',
        'finalFile'           => 'final_file',
    ];

    public function validate()
    {
        Model::validateRequired('auditId', $this->auditId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('contractFileName', $this->contractFileName, true);
        Model::validateRequired('creatorWorkNo', $this->creatorWorkNo, true);
        Model::validateRequired('creatorName', $this->creatorName, true);
        Model::validateRequired('baselineLibraryName', $this->baselineLibraryName, true);
        Model::validateRequired('buId', $this->buId, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->auditId) {
            $res['audit_id'] = $this->auditId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->contractFileName) {
            $res['contract_file_name'] = $this->contractFileName;
        }
        if (null !== $this->creatorWorkNo) {
            $res['creator_work_no'] = $this->creatorWorkNo;
        }
        if (null !== $this->creatorName) {
            $res['creator_name'] = $this->creatorName;
        }
        if (null !== $this->baselineLibraryName) {
            $res['baseline_library_name'] = $this->baselineLibraryName;
        }
        if (null !== $this->buId) {
            $res['bu_id'] = $this->buId;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->originalFile) {
            $res['original_file'] = null !== $this->originalFile ? $this->originalFile->toMap() : null;
        }
        if (null !== $this->finalFile) {
            $res['final_file'] = null !== $this->finalFile ? $this->finalFile->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuditRecordItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['audit_id'])) {
            $model->auditId = $map['audit_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['contract_file_name'])) {
            $model->contractFileName = $map['contract_file_name'];
        }
        if (isset($map['creator_work_no'])) {
            $model->creatorWorkNo = $map['creator_work_no'];
        }
        if (isset($map['creator_name'])) {
            $model->creatorName = $map['creator_name'];
        }
        if (isset($map['baseline_library_name'])) {
            $model->baselineLibraryName = $map['baseline_library_name'];
        }
        if (isset($map['bu_id'])) {
            $model->buId = $map['bu_id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['original_file'])) {
            $model->originalFile = ContractFile::fromMap($map['original_file']);
        }
        if (isset($map['final_file'])) {
            $model->finalFile = ContractFile::fromMap($map['final_file']);
        }

        return $model;
    }
}
