<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryOpsplanDetailResponse extends Model
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

    // 发布单包含的应用数
    /**
     * @var int
     */
    public $appCount;

    // 应用信息列表
    /**
     * @var AppSimpleInfo[]
     */
    public $appInfos;

    // 执行人
    /**
     * @var string
     */
    public $executor;

    // 发布结束时间
    /**
     * @var string
     */
    public $finishTime;

    // 应用分组概要信息列表
    /**
     * @var AppGroupSimpleViewList[]
     */
    public $groupCollectionList;

    // 发布单id
    /**
     * @var string
     */
    public $id;

    // 错误信息
    /**
     * @var string
     */
    public $messageDetail;

    // 运维单类型
    //
    /**
     * @var string
     */
    public $mode;

    // 发布单标题
    /**
     * @var string
     */
    public $name;

    // 备注信息
    /**
     * @var string
     */
    public $remark;

    // 发布开始时间
    /**
     * @var string
     */
    public $startTime;

    // 发布单状态
    //
    /**
     * @var string
     */
    public $state;

    // 发布单号
    /**
     * @var string
     */
    public $timeSeriesId;

    // 发布单类型
    /**
     * @var string
     */
    public $type;

    // pod数量
    /**
     * @var int
     */
    public $podCount;

    // 审批状态：AGREE-同意，REJECTED-拒绝，CANCELED-取消
    /**
     * @var string
     */
    public $approvalStatus;

    // 审批详情url
    /**
     * @var string
     */
    public $approvalUrl;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'appCount'            => 'app_count',
        'appInfos'            => 'app_infos',
        'executor'            => 'executor',
        'finishTime'          => 'finish_time',
        'groupCollectionList' => 'group_collection_list',
        'id'                  => 'id',
        'messageDetail'       => 'message_detail',
        'mode'                => 'mode',
        'name'                => 'name',
        'remark'              => 'remark',
        'startTime'           => 'start_time',
        'state'               => 'state',
        'timeSeriesId'        => 'time_series_id',
        'type'                => 'type',
        'podCount'            => 'pod_count',
        'approvalStatus'      => 'approval_status',
        'approvalUrl'         => 'approval_url',
    ];

    public function validate()
    {
        Model::validatePattern('finishTime', $this->finishTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->appCount) {
            $res['app_count'] = $this->appCount;
        }
        if (null !== $this->appInfos) {
            $res['app_infos'] = [];
            if (null !== $this->appInfos && \is_array($this->appInfos)) {
                $n = 0;
                foreach ($this->appInfos as $item) {
                    $res['app_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->executor) {
            $res['executor'] = $this->executor;
        }
        if (null !== $this->finishTime) {
            $res['finish_time'] = $this->finishTime;
        }
        if (null !== $this->groupCollectionList) {
            $res['group_collection_list'] = [];
            if (null !== $this->groupCollectionList && \is_array($this->groupCollectionList)) {
                $n = 0;
                foreach ($this->groupCollectionList as $item) {
                    $res['group_collection_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->messageDetail) {
            $res['message_detail'] = $this->messageDetail;
        }
        if (null !== $this->mode) {
            $res['mode'] = $this->mode;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->timeSeriesId) {
            $res['time_series_id'] = $this->timeSeriesId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->podCount) {
            $res['pod_count'] = $this->podCount;
        }
        if (null !== $this->approvalStatus) {
            $res['approval_status'] = $this->approvalStatus;
        }
        if (null !== $this->approvalUrl) {
            $res['approval_url'] = $this->approvalUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOpsplanDetailResponse
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
        if (isset($map['app_count'])) {
            $model->appCount = $map['app_count'];
        }
        if (isset($map['app_infos'])) {
            if (!empty($map['app_infos'])) {
                $model->appInfos = [];
                $n               = 0;
                foreach ($map['app_infos'] as $item) {
                    $model->appInfos[$n++] = null !== $item ? AppSimpleInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['executor'])) {
            $model->executor = $map['executor'];
        }
        if (isset($map['finish_time'])) {
            $model->finishTime = $map['finish_time'];
        }
        if (isset($map['group_collection_list'])) {
            if (!empty($map['group_collection_list'])) {
                $model->groupCollectionList = [];
                $n                          = 0;
                foreach ($map['group_collection_list'] as $item) {
                    $model->groupCollectionList[$n++] = null !== $item ? AppGroupSimpleViewList::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['message_detail'])) {
            $model->messageDetail = $map['message_detail'];
        }
        if (isset($map['mode'])) {
            $model->mode = $map['mode'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['time_series_id'])) {
            $model->timeSeriesId = $map['time_series_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['pod_count'])) {
            $model->podCount = $map['pod_count'];
        }
        if (isset($map['approval_status'])) {
            $model->approvalStatus = $map['approval_status'];
        }
        if (isset($map['approval_url'])) {
            $model->approvalUrl = $map['approval_url'];
        }

        return $model;
    }
}
