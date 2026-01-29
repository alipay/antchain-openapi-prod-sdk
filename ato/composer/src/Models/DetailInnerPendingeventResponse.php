<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class DetailInnerPendingeventResponse extends Model
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

    // 事件id
    /**
     * @var string
     */
    public $eventId;

    // 通知:NOTIFICATION
    // 确认函:CONFIRMATION
    /**
     * @var string
     */
    public $type;

    // ("PENDING","待办中"), ("CONFIRMED","确认"), ("REJECTED","已拒绝") ("FAILED","失败"),("EXPIRED","已过期");
    /**
     * @var string
     */
    public $status;

    // 待办内容主题
    /**
     * @var string
     */
    public $contentSubject;

    // 待办内容详情
    // content_type=link，是文件访问链接
    // content_type=text，是富文本
    /**
     * @var string
     */
    public $contentDetails;

    // 待办类型
    // text
    // link
    /**
     * @var string
     */
    public $contentType;

    // 待办处理页面操作按钮
    // ACKNOWLEDGE 我已知晓
    // CONFIRM 确认
    // RETURN 返回
    // REJECT 拒绝
    /**
     * @var string
     */
    public $actionOptionsConfig;

    // 事件有效期开始
    /**
     * @var string
     */
    public $effectiveStartTime;

    // 事件有效期结束
    /**
     * @var string
     */
    public $effectiveEndTime;

    // 待办事件模版code
    // "INDIRECT_MERCHANT_CONFIRM","间联模式二级商户进件确认",
    // "FINANCING_GRANT_CREDIT","融资授信场景"
    // "FINANCING_USE_CREDIT","融资用信场景"
    /**
     * @var string
     */
    public $pendingTemplateCode;

    // 操作时间
    /**
     * @var string
     */
    public $operateTime;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'eventId'             => 'event_id',
        'type'                => 'type',
        'status'              => 'status',
        'contentSubject'      => 'content_subject',
        'contentDetails'      => 'content_details',
        'contentType'         => 'content_type',
        'actionOptionsConfig' => 'action_options_config',
        'effectiveStartTime'  => 'effective_start_time',
        'effectiveEndTime'    => 'effective_end_time',
        'pendingTemplateCode' => 'pending_template_code',
        'operateTime'         => 'operate_time',
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
        if (null !== $this->eventId) {
            $res['event_id'] = $this->eventId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->contentSubject) {
            $res['content_subject'] = $this->contentSubject;
        }
        if (null !== $this->contentDetails) {
            $res['content_details'] = $this->contentDetails;
        }
        if (null !== $this->contentType) {
            $res['content_type'] = $this->contentType;
        }
        if (null !== $this->actionOptionsConfig) {
            $res['action_options_config'] = $this->actionOptionsConfig;
        }
        if (null !== $this->effectiveStartTime) {
            $res['effective_start_time'] = $this->effectiveStartTime;
        }
        if (null !== $this->effectiveEndTime) {
            $res['effective_end_time'] = $this->effectiveEndTime;
        }
        if (null !== $this->pendingTemplateCode) {
            $res['pending_template_code'] = $this->pendingTemplateCode;
        }
        if (null !== $this->operateTime) {
            $res['operate_time'] = $this->operateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailInnerPendingeventResponse
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
        if (isset($map['event_id'])) {
            $model->eventId = $map['event_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['content_subject'])) {
            $model->contentSubject = $map['content_subject'];
        }
        if (isset($map['content_details'])) {
            $model->contentDetails = $map['content_details'];
        }
        if (isset($map['content_type'])) {
            $model->contentType = $map['content_type'];
        }
        if (isset($map['action_options_config'])) {
            $model->actionOptionsConfig = $map['action_options_config'];
        }
        if (isset($map['effective_start_time'])) {
            $model->effectiveStartTime = $map['effective_start_time'];
        }
        if (isset($map['effective_end_time'])) {
            $model->effectiveEndTime = $map['effective_end_time'];
        }
        if (isset($map['pending_template_code'])) {
            $model->pendingTemplateCode = $map['pending_template_code'];
        }
        if (isset($map['operate_time'])) {
            $model->operateTime = $map['operate_time'];
        }

        return $model;
    }
}
