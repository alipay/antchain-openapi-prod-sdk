<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class QueryMeiyouItagrelationRequest extends Model
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

    // 主键id
    /**
     * @var int
     */
    public $id;

    // 审核记录ID
    /**
     * @var int
     */
    public $auditId;

    // 主题ID
    /**
     * @var int
     */
    public $topicId;

    // itag任务ID
    /**
     * @var int
     */
    public $itagTaskId;

    // itag数据集ID
    /**
     * @var int
     */
    public $itagDatasetId;

    // itag数据ID
    /**
     * @var int
     */
    public $itagDataId;

    // 美柚任务审核结果推送状态
    /**
     * @var string
     */
    public $meiyouAuditState;

    // 审核记录状态
    /**
     * @var string
     */
    public $auditState;

    // 主题记录状态
    /**
     * @var string
     */
    public $topicState;

    // 更新时间-start
    /**
     * @var string
     */
    public $gmtModifiedStart;

    // 更新时间-end
    /**
     * @var string
     */
    public $gmtModifiedEnd;

    // 操作人
    /**
     * @var string
     */
    public $auditOperator;

    // 数据来源
    /**
     * @var string
     */
    public $source;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'auditId'           => 'audit_id',
        'topicId'           => 'topic_id',
        'itagTaskId'        => 'itag_task_id',
        'itagDatasetId'     => 'itag_dataset_id',
        'itagDataId'        => 'itag_data_id',
        'meiyouAuditState'  => 'meiyou_audit_state',
        'auditState'        => 'audit_state',
        'topicState'        => 'topic_state',
        'gmtModifiedStart'  => 'gmt_modified_start',
        'gmtModifiedEnd'    => 'gmt_modified_end',
        'auditOperator'     => 'audit_operator',
        'source'            => 'source',
    ];

    public function validate()
    {
        Model::validatePattern('gmtModifiedStart', $this->gmtModifiedStart, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModifiedEnd', $this->gmtModifiedEnd, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->auditId) {
            $res['audit_id'] = $this->auditId;
        }
        if (null !== $this->topicId) {
            $res['topic_id'] = $this->topicId;
        }
        if (null !== $this->itagTaskId) {
            $res['itag_task_id'] = $this->itagTaskId;
        }
        if (null !== $this->itagDatasetId) {
            $res['itag_dataset_id'] = $this->itagDatasetId;
        }
        if (null !== $this->itagDataId) {
            $res['itag_data_id'] = $this->itagDataId;
        }
        if (null !== $this->meiyouAuditState) {
            $res['meiyou_audit_state'] = $this->meiyouAuditState;
        }
        if (null !== $this->auditState) {
            $res['audit_state'] = $this->auditState;
        }
        if (null !== $this->topicState) {
            $res['topic_state'] = $this->topicState;
        }
        if (null !== $this->gmtModifiedStart) {
            $res['gmt_modified_start'] = $this->gmtModifiedStart;
        }
        if (null !== $this->gmtModifiedEnd) {
            $res['gmt_modified_end'] = $this->gmtModifiedEnd;
        }
        if (null !== $this->auditOperator) {
            $res['audit_operator'] = $this->auditOperator;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMeiyouItagrelationRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['audit_id'])) {
            $model->auditId = $map['audit_id'];
        }
        if (isset($map['topic_id'])) {
            $model->topicId = $map['topic_id'];
        }
        if (isset($map['itag_task_id'])) {
            $model->itagTaskId = $map['itag_task_id'];
        }
        if (isset($map['itag_dataset_id'])) {
            $model->itagDatasetId = $map['itag_dataset_id'];
        }
        if (isset($map['itag_data_id'])) {
            $model->itagDataId = $map['itag_data_id'];
        }
        if (isset($map['meiyou_audit_state'])) {
            $model->meiyouAuditState = $map['meiyou_audit_state'];
        }
        if (isset($map['audit_state'])) {
            $model->auditState = $map['audit_state'];
        }
        if (isset($map['topic_state'])) {
            $model->topicState = $map['topic_state'];
        }
        if (isset($map['gmt_modified_start'])) {
            $model->gmtModifiedStart = $map['gmt_modified_start'];
        }
        if (isset($map['gmt_modified_end'])) {
            $model->gmtModifiedEnd = $map['gmt_modified_end'];
        }
        if (isset($map['audit_operator'])) {
            $model->auditOperator = $map['audit_operator'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }

        return $model;
    }
}
