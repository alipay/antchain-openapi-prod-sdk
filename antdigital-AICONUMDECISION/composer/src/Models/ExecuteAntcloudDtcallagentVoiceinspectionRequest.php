<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AICONUMDECISION\Models;

use AlibabaCloud\Tea\Model;

class ExecuteAntcloudDtcallagentVoiceinspectionRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenantId' => 'tenant_id',
        'instanceCode' => 'instance_code',
        'qcRuleSetId' => 'qc_rule_set_id',
        'voiceText' => 'voice_text',
        'voiceUrl' => 'voice_url',
        'batchId' => 'batch_id',
        'externalCallId' => 'external_call_id',
    ];
    public function validate() {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('instanceCode', $this->instanceCode, true);
        Model::validateRequired('qcRuleSetId', $this->qcRuleSetId, true);
        Model::validateRequired('voiceText', $this->voiceText, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->instanceCode) {
            $res['instance_code'] = $this->instanceCode;
        }
        if (null !== $this->qcRuleSetId) {
            $res['qc_rule_set_id'] = $this->qcRuleSetId;
        }
        if (null !== $this->voiceText) {
            $res['voice_text'] = $this->voiceText;
        }
        if (null !== $this->voiceUrl) {
            $res['voice_url'] = $this->voiceUrl;
        }
        if (null !== $this->batchId) {
            $res['batch_id'] = $this->batchId;
        }
        if (null !== $this->externalCallId) {
            $res['external_call_id'] = $this->externalCallId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecuteAntcloudDtcallagentVoiceinspectionRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['instance_code'])){
            $model->instanceCode = $map['instance_code'];
        }
        if(isset($map['qc_rule_set_id'])){
            $model->qcRuleSetId = $map['qc_rule_set_id'];
        }
        if(isset($map['voice_text'])){
            $model->voiceText = $map['voice_text'];
        }
        if(isset($map['voice_url'])){
            $model->voiceUrl = $map['voice_url'];
        }
        if(isset($map['batch_id'])){
            $model->batchId = $map['batch_id'];
        }
        if(isset($map['external_call_id'])){
            $model->externalCallId = $map['external_call_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户 ID
    /**
     * @var string
     */
    public $tenantId;

    // 业务空间实例编码，如 demo
    /**
     * @var string
     */
    public $instanceCode;

    // 质检规则集 ID，如 qc-heiniu-v1
    /**
     * @var string
     */
    public $qcRuleSetId;

    // 对话文本
    /**
     * @var string
     */
    public $voiceText;

    // 录音地址
    /**
     * @var string
     */
    public $voiceUrl;

    // 调用方批次 ID
    /**
     * @var string
     */
    public $batchId;

    // 调用方通话唯一标识
    /**
     * @var string
     */
    public $externalCallId;

}
