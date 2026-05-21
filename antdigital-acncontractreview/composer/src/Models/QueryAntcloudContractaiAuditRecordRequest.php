<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACNCONTRACTREVIEW\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudContractaiAuditRecordRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 当前页
    /**
     * @var int
     */
    public $pageNo;

    // 页大小
    /**
     * @var int
     */
    public $pageSize;

    // 合同名称
    /**
     * @var string
     */
    public $contractFileName;

    // 开始时间
    /**
     * @var string
     */
    public $createStartTime;

    // 结束时间
    /**
     * @var string
     */
    public $createEndTime;

    // PROCESSING：合同审核任务已提交，正在异步处理中
    // SUCCESS：合同审核已完成，结果可查询
    // FAIL：合同审核过程中发生错误，审核失败
    // FINALIZED：合同已完成定稿操作，生成最终版本
    /**
     * @var string
     */
    public $status;

    // 创建人id
    /**
     * @var string
     */
    public $creatorWorkNo;

    // 创建人名称
    /**
     * @var string
     */
    public $creatorName;

    // 基准线库名称
    /**
     * @var string
     */
    public $baselineLibraryName;

    // 终端客户id
    /**
     * @var string
     */
    public $endCustomerId;
    protected $_name = [
        'authToken'           => 'auth_token',
        'pageNo'              => 'page_no',
        'pageSize'            => 'page_size',
        'contractFileName'    => 'contract_file_name',
        'createStartTime'     => 'create_start_time',
        'createEndTime'       => 'create_end_time',
        'status'              => 'status',
        'creatorWorkNo'       => 'creator_work_no',
        'creatorName'         => 'creator_name',
        'baselineLibraryName' => 'baseline_library_name',
        'endCustomerId'       => 'end_customer_id',
    ];

    public function validate()
    {
        Model::validateRequired('pageNo', $this->pageNo, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validatePattern('createStartTime', $this->createStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('createEndTime', $this->createEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->contractFileName) {
            $res['contract_file_name'] = $this->contractFileName;
        }
        if (null !== $this->createStartTime) {
            $res['create_start_time'] = $this->createStartTime;
        }
        if (null !== $this->createEndTime) {
            $res['create_end_time'] = $this->createEndTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
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
        if (null !== $this->endCustomerId) {
            $res['end_customer_id'] = $this->endCustomerId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntcloudContractaiAuditRecordRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['page_no'])) {
            $model->pageNo = $map['page_no'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['contract_file_name'])) {
            $model->contractFileName = $map['contract_file_name'];
        }
        if (isset($map['create_start_time'])) {
            $model->createStartTime = $map['create_start_time'];
        }
        if (isset($map['create_end_time'])) {
            $model->createEndTime = $map['create_end_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
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
        if (isset($map['end_customer_id'])) {
            $model->endCustomerId = $map['end_customer_id'];
        }

        return $model;
    }
}
