<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ExecElectrocarBatchpubRequest extends Model
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

    // 设备tuid列表
    /**
     * @var string[]
     */
    public $tuidList;

    // 用户自定义Topic
    /**
     * @var string
     */
    public $userTopic;

    // 消息类型
    /**
     * @var string
     */
    public $messageType;

    // 消息内容
    /**
     * @var string
     */
    public $messageContent;

    // 触发模式（IMMEDIATE/SCHEDULED）
    /**
     * @var string
     */
    public $triggerMode;

    // 定时执行时间戳（triggerMode为SCHEDULED时必填）
    /**
     * @var int
     */
    public $scheduleTime;

    // 批次名称
    /**
     * @var string
     */
    public $batchName;

    // 重试次数
    /**
     * @var int
     */
    public $retryCount;

    // 操作人
    /**
     * @var string
     */
    public $operator;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tuidList'          => 'tuid_list',
        'userTopic'         => 'user_topic',
        'messageType'       => 'message_type',
        'messageContent'    => 'message_content',
        'triggerMode'       => 'trigger_mode',
        'scheduleTime'      => 'schedule_time',
        'batchName'         => 'batch_name',
        'retryCount'        => 'retry_count',
        'operator'          => 'operator',
    ];

    public function validate()
    {
        Model::validateRequired('tuidList', $this->tuidList, true);
        Model::validateRequired('userTopic', $this->userTopic, true);
        Model::validateRequired('messageType', $this->messageType, true);
        Model::validateRequired('messageContent', $this->messageContent, true);
        Model::validateRequired('triggerMode', $this->triggerMode, true);
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
        if (null !== $this->tuidList) {
            $res['tuid_list'] = $this->tuidList;
        }
        if (null !== $this->userTopic) {
            $res['user_topic'] = $this->userTopic;
        }
        if (null !== $this->messageType) {
            $res['message_type'] = $this->messageType;
        }
        if (null !== $this->messageContent) {
            $res['message_content'] = $this->messageContent;
        }
        if (null !== $this->triggerMode) {
            $res['trigger_mode'] = $this->triggerMode;
        }
        if (null !== $this->scheduleTime) {
            $res['schedule_time'] = $this->scheduleTime;
        }
        if (null !== $this->batchName) {
            $res['batch_name'] = $this->batchName;
        }
        if (null !== $this->retryCount) {
            $res['retry_count'] = $this->retryCount;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecElectrocarBatchpubRequest
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
        if (isset($map['tuid_list'])) {
            if (!empty($map['tuid_list'])) {
                $model->tuidList = $map['tuid_list'];
            }
        }
        if (isset($map['user_topic'])) {
            $model->userTopic = $map['user_topic'];
        }
        if (isset($map['message_type'])) {
            $model->messageType = $map['message_type'];
        }
        if (isset($map['message_content'])) {
            $model->messageContent = $map['message_content'];
        }
        if (isset($map['trigger_mode'])) {
            $model->triggerMode = $map['trigger_mode'];
        }
        if (isset($map['schedule_time'])) {
            $model->scheduleTime = $map['schedule_time'];
        }
        if (isset($map['batch_name'])) {
            $model->batchName = $map['batch_name'];
        }
        if (isset($map['retry_count'])) {
            $model->retryCount = $map['retry_count'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }

        return $model;
    }
}
