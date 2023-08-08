<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class QueryAntsaasStaffingcContractSignResponse extends Model
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

    // 流程id
    /**
     * @var string
     */
    public $flowId;

    // 文件有效截止日期
    /**
     * @var int
     */
    public $contractValidity;

    // 流程描述
    /**
     * @var string
     */
    public $flowDesc;

    // 流程开始时间
    /**
     * @var string
     */
    public $flowStartTime;

    // 流程结束时间
    /**
     * @var string
     */
    public $flowEndTime;

    // 流程状态（0-草稿、1-签署中、2-完成、3-撤销、4-终止、5-过期、6-删除、7-拒签）
    /**
     * @var int
     */
    public $flowStatus;

    // 合同文件id
    /**
     * @var string
     */
    public $fileId;

    // 合同文件名称
    /**
     * @var string
     */
    public $fileName;

    // 合同文件下载地址（1小时内有效）
    /**
     * @var string
     */
    public $fileUrl;

    // 如果未签署，将返回签署链接
    /**
     * @var SignUrlResp[]
     */
    public $signUrlList;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'flowId'           => 'flow_id',
        'contractValidity' => 'contract_validity',
        'flowDesc'         => 'flow_desc',
        'flowStartTime'    => 'flow_start_time',
        'flowEndTime'      => 'flow_end_time',
        'flowStatus'       => 'flow_status',
        'fileId'           => 'file_id',
        'fileName'         => 'file_name',
        'fileUrl'          => 'file_url',
        'signUrlList'      => 'sign_url_list',
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
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->contractValidity) {
            $res['contract_validity'] = $this->contractValidity;
        }
        if (null !== $this->flowDesc) {
            $res['flow_desc'] = $this->flowDesc;
        }
        if (null !== $this->flowStartTime) {
            $res['flow_start_time'] = $this->flowStartTime;
        }
        if (null !== $this->flowEndTime) {
            $res['flow_end_time'] = $this->flowEndTime;
        }
        if (null !== $this->flowStatus) {
            $res['flow_status'] = $this->flowStatus;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->signUrlList) {
            $res['sign_url_list'] = [];
            if (null !== $this->signUrlList && \is_array($this->signUrlList)) {
                $n = 0;
                foreach ($this->signUrlList as $item) {
                    $res['sign_url_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntsaasStaffingcContractSignResponse
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
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['contract_validity'])) {
            $model->contractValidity = $map['contract_validity'];
        }
        if (isset($map['flow_desc'])) {
            $model->flowDesc = $map['flow_desc'];
        }
        if (isset($map['flow_start_time'])) {
            $model->flowStartTime = $map['flow_start_time'];
        }
        if (isset($map['flow_end_time'])) {
            $model->flowEndTime = $map['flow_end_time'];
        }
        if (isset($map['flow_status'])) {
            $model->flowStatus = $map['flow_status'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }
        if (isset($map['sign_url_list'])) {
            if (!empty($map['sign_url_list'])) {
                $model->signUrlList = [];
                $n                  = 0;
                foreach ($map['sign_url_list'] as $item) {
                    $model->signUrlList[$n++] = null !== $item ? SignUrlResp::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
