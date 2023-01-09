<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryDciPreviewResponse extends Model
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

    // 作品预览处理状态
    /**
     * @var string
     */
    public $filePreviewStatus;

    // 作品片段预览状态
    /**
     * @var string
     */
    public $filePartPreviewStatus;

    // 作品预览处理结果
    /**
     * @var string
     */
    public $filePreviewUrl;

    // 作品预览截取片段结果
    /**
     * @var string
     */
    public $filePartPreviewUrl;

    // 作品名称
    /**
     * @var string
     */
    public $workName;

    // dci码
    /**
     * @var string
     */
    public $dciCode;

    // 文件类型
    /**
     * @var string
     */
    public $fileType;

    // 当前查询时间
    /**
     * @var string
     */
    public $queryTime;

    // 数登登记号
    /**
     * @var string
     */
    public $regNumber;
    protected $_name = [
        'reqMsgId'              => 'req_msg_id',
        'resultCode'            => 'result_code',
        'resultMsg'             => 'result_msg',
        'filePreviewStatus'     => 'file_preview_status',
        'filePartPreviewStatus' => 'file_part_preview_status',
        'filePreviewUrl'        => 'file_preview_url',
        'filePartPreviewUrl'    => 'file_part_preview_url',
        'workName'              => 'work_name',
        'dciCode'               => 'dci_code',
        'fileType'              => 'file_type',
        'queryTime'             => 'query_time',
        'regNumber'             => 'reg_number',
    ];

    public function validate()
    {
        Model::validatePattern('queryTime', $this->queryTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->filePreviewStatus) {
            $res['file_preview_status'] = $this->filePreviewStatus;
        }
        if (null !== $this->filePartPreviewStatus) {
            $res['file_part_preview_status'] = $this->filePartPreviewStatus;
        }
        if (null !== $this->filePreviewUrl) {
            $res['file_preview_url'] = $this->filePreviewUrl;
        }
        if (null !== $this->filePartPreviewUrl) {
            $res['file_part_preview_url'] = $this->filePartPreviewUrl;
        }
        if (null !== $this->workName) {
            $res['work_name'] = $this->workName;
        }
        if (null !== $this->dciCode) {
            $res['dci_code'] = $this->dciCode;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->queryTime) {
            $res['query_time'] = $this->queryTime;
        }
        if (null !== $this->regNumber) {
            $res['reg_number'] = $this->regNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDciPreviewResponse
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
        if (isset($map['file_preview_status'])) {
            $model->filePreviewStatus = $map['file_preview_status'];
        }
        if (isset($map['file_part_preview_status'])) {
            $model->filePartPreviewStatus = $map['file_part_preview_status'];
        }
        if (isset($map['file_preview_url'])) {
            $model->filePreviewUrl = $map['file_preview_url'];
        }
        if (isset($map['file_part_preview_url'])) {
            $model->filePartPreviewUrl = $map['file_part_preview_url'];
        }
        if (isset($map['work_name'])) {
            $model->workName = $map['work_name'];
        }
        if (isset($map['dci_code'])) {
            $model->dciCode = $map['dci_code'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['query_time'])) {
            $model->queryTime = $map['query_time'];
        }
        if (isset($map['reg_number'])) {
            $model->regNumber = $map['reg_number'];
        }

        return $model;
    }
}
