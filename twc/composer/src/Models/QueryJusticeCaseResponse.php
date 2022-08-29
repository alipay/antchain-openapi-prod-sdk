<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryJusticeCaseResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 案件ID
    /**
     * @var int
     */
    public $caseId;

    // 维权记录ID
    /**
     * @var int
     */
    public $recordId;

    // 外部业务id
    /**
     * @var string
     */
    public $externalBizId;

    // 案件阶段
    // 待发起维权
    // 待提交
    // 收案处理中
    // 结果待确认
    // 已关闭
    /**
     * @var string
     */
    public $casePhaseDesc;

    // 维权方式, (目前仅支持司法调解)
    // 诉讼-2
    // 仲裁-3
    // 仲裁执行-4
    // 司法调解-5
    /**
     * @var string
     */
    public $judicialRecordTypeDesc;

    // 维权状态字段描述.
    //
    /**
     * @var string
     */
    public $judicialRecordStatusDesc;

    // "yyyy-MM-dd" , 当前的状态更新时间
    /**
     * @var string
     */
    public $judicialRecordStatusTime;

    // 维权过程中的文件列表
    /**
     * @var JudicialFileInfo[]
     */
    public $judicialFiles;
    protected $_name = [
        'reqMsgId'                 => 'req_msg_id',
        'resultCode'               => 'result_code',
        'resultMsg'                => 'result_msg',
        'caseId'                   => 'case_id',
        'recordId'                 => 'record_id',
        'externalBizId'            => 'external_biz_id',
        'casePhaseDesc'            => 'case_phase_desc',
        'judicialRecordTypeDesc'   => 'judicial_record_type_desc',
        'judicialRecordStatusDesc' => 'judicial_record_status_desc',
        'judicialRecordStatusTime' => 'judicial_record_status_time',
        'judicialFiles'            => 'judicial_files',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->caseId) {
            $res['case_id'] = $this->caseId;
        }
        if (null !== $this->recordId) {
            $res['record_id'] = $this->recordId;
        }
        if (null !== $this->externalBizId) {
            $res['external_biz_id'] = $this->externalBizId;
        }
        if (null !== $this->casePhaseDesc) {
            $res['case_phase_desc'] = $this->casePhaseDesc;
        }
        if (null !== $this->judicialRecordTypeDesc) {
            $res['judicial_record_type_desc'] = $this->judicialRecordTypeDesc;
        }
        if (null !== $this->judicialRecordStatusDesc) {
            $res['judicial_record_status_desc'] = $this->judicialRecordStatusDesc;
        }
        if (null !== $this->judicialRecordStatusTime) {
            $res['judicial_record_status_time'] = $this->judicialRecordStatusTime;
        }
        if (null !== $this->judicialFiles) {
            $res['judicial_files'] = [];
            if (null !== $this->judicialFiles && \is_array($this->judicialFiles)) {
                $n = 0;
                foreach ($this->judicialFiles as $item) {
                    $res['judicial_files'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryJusticeCaseResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['case_id'])) {
            $model->caseId = $map['case_id'];
        }
        if (isset($map['record_id'])) {
            $model->recordId = $map['record_id'];
        }
        if (isset($map['external_biz_id'])) {
            $model->externalBizId = $map['external_biz_id'];
        }
        if (isset($map['case_phase_desc'])) {
            $model->casePhaseDesc = $map['case_phase_desc'];
        }
        if (isset($map['judicial_record_type_desc'])) {
            $model->judicialRecordTypeDesc = $map['judicial_record_type_desc'];
        }
        if (isset($map['judicial_record_status_desc'])) {
            $model->judicialRecordStatusDesc = $map['judicial_record_status_desc'];
        }
        if (isset($map['judicial_record_status_time'])) {
            $model->judicialRecordStatusTime = $map['judicial_record_status_time'];
        }
        if (isset($map['judicial_files'])) {
            if (!empty($map['judicial_files'])) {
                $model->judicialFiles = [];
                $n                    = 0;
                foreach ($map['judicial_files'] as $item) {
                    $model->judicialFiles[$n++] = null !== $item ? JudicialFileInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
