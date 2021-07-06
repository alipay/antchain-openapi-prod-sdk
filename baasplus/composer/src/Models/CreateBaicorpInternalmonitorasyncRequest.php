<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class CreateBaicorpInternalmonitorasyncRequest extends Model
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

    // 场景id
    /**
     * @var string
     */
    public $bizId;

    // 用于内部业务统计的信息
    /**
     * @var BizInfo
     */
    public $bizInfo;

    // 监测传播时间，单位暂定天
    /**
     * @var int
     */
    public $broadcastTime;

    // 基于安全考虑，填充NonceId
    /**
     * @var string
     */
    public $customId;

    // 待检测内容RAW数据
    /**
     * @var string
     */
    public $entityData;

    // 待监测内容类型
    /**
     * @var string
     */
    public $entityType;

    // 待检测内容url，支持HTTP和OSS，OSS从默认源拉取,input_url和input_data不可同时存在
    /**
     * @var string
     */
    public $entityUrl;

    // 监测输入的多个关键词
    /**
     * @var string[]
     */
    public $keyWords;

    // 匹配时长，单位秒
    /**
     * @var int
     */
    public $matchedDuration;

    // 监测时长，单位为天
    /**
     * @var int
     */
    public $monitorDuration;

    // 监测频次，单位暂定天
    /**
     * @var int
     */
    public $monitorFrequency;

    // 监测范围
    /**
     * @var string[]
     */
    public $monitorScope;

    // 监测事件发送时的回调通知URL，若为空则不发送通知，24小时内最少发送成功一次
    /**
     * @var string
     */
    public $notifyUrl;

    // provider id
    /**
     * @var string
     */
    public $providerId;

    // 监测启动日期，若为空，则立刻开始，从1970开始的毫秒数。
    /**
     * @var int
     */
    public $startDate;

    // 业务方任务id，业务方保证唯一
    /**
     * @var string
     */
    public $taskId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'bizInfo'           => 'biz_info',
        'broadcastTime'     => 'broadcast_time',
        'customId'          => 'custom_id',
        'entityData'        => 'entity_data',
        'entityType'        => 'entity_type',
        'entityUrl'         => 'entity_url',
        'keyWords'          => 'key_words',
        'matchedDuration'   => 'matched_duration',
        'monitorDuration'   => 'monitor_duration',
        'monitorFrequency'  => 'monitor_frequency',
        'monitorScope'      => 'monitor_scope',
        'notifyUrl'         => 'notify_url',
        'providerId'        => 'provider_id',
        'startDate'         => 'start_date',
        'taskId'            => 'task_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizInfo', $this->bizInfo, true);
        Model::validateRequired('entityType', $this->entityType, true);
        Model::validateRequired('keyWords', $this->keyWords, true);
        Model::validateRequired('monitorFrequency', $this->monitorFrequency, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->bizInfo) {
            $res['biz_info'] = null !== $this->bizInfo ? $this->bizInfo->toMap() : null;
        }
        if (null !== $this->broadcastTime) {
            $res['broadcast_time'] = $this->broadcastTime;
        }
        if (null !== $this->customId) {
            $res['custom_id'] = $this->customId;
        }
        if (null !== $this->entityData) {
            $res['entity_data'] = $this->entityData;
        }
        if (null !== $this->entityType) {
            $res['entity_type'] = $this->entityType;
        }
        if (null !== $this->entityUrl) {
            $res['entity_url'] = $this->entityUrl;
        }
        if (null !== $this->keyWords) {
            $res['key_words'] = $this->keyWords;
        }
        if (null !== $this->matchedDuration) {
            $res['matched_duration'] = $this->matchedDuration;
        }
        if (null !== $this->monitorDuration) {
            $res['monitor_duration'] = $this->monitorDuration;
        }
        if (null !== $this->monitorFrequency) {
            $res['monitor_frequency'] = $this->monitorFrequency;
        }
        if (null !== $this->monitorScope) {
            $res['monitor_scope'] = $this->monitorScope;
        }
        if (null !== $this->notifyUrl) {
            $res['notify_url'] = $this->notifyUrl;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->startDate) {
            $res['start_date'] = $this->startDate;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBaicorpInternalmonitorasyncRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['biz_info'])) {
            $model->bizInfo = BizInfo::fromMap($map['biz_info']);
        }
        if (isset($map['broadcast_time'])) {
            $model->broadcastTime = $map['broadcast_time'];
        }
        if (isset($map['custom_id'])) {
            $model->customId = $map['custom_id'];
        }
        if (isset($map['entity_data'])) {
            $model->entityData = $map['entity_data'];
        }
        if (isset($map['entity_type'])) {
            $model->entityType = $map['entity_type'];
        }
        if (isset($map['entity_url'])) {
            $model->entityUrl = $map['entity_url'];
        }
        if (isset($map['key_words'])) {
            if (!empty($map['key_words'])) {
                $model->keyWords = $map['key_words'];
            }
        }
        if (isset($map['matched_duration'])) {
            $model->matchedDuration = $map['matched_duration'];
        }
        if (isset($map['monitor_duration'])) {
            $model->monitorDuration = $map['monitor_duration'];
        }
        if (isset($map['monitor_frequency'])) {
            $model->monitorFrequency = $map['monitor_frequency'];
        }
        if (isset($map['monitor_scope'])) {
            if (!empty($map['monitor_scope'])) {
                $model->monitorScope = $map['monitor_scope'];
            }
        }
        if (isset($map['notify_url'])) {
            $model->notifyUrl = $map['notify_url'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['start_date'])) {
            $model->startDate = $map['start_date'];
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }

        return $model;
    }
}
