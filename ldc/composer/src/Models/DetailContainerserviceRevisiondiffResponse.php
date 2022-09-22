<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class DetailContainerserviceRevisiondiffResponse extends Model
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

    // 源版本配置详情
    /**
     * @var ContainerServiceConfig
     */
    public $sourceConfig;

    // 源版本号
    /**
     * @var string
     */
    public $sourceRevision;

    // 目标版本配置详情
    /**
     * @var ContainerServiceConfig
     */
    public $targetConfig;

    // 目标版本号
    /**
     * @var string
     */
    public $targetRevision;

    // 摘要信息
    /**
     * @var string
     */
    public $summary;

    // diff详情，JSON数组字符串
    /**
     * @var string
     */
    public $diffDetail;

    // 风险等级: ORDINARY-一般、HIGH-高危
    /**
     * @var string
     */
    public $riskLevel;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'sourceConfig'   => 'source_config',
        'sourceRevision' => 'source_revision',
        'targetConfig'   => 'target_config',
        'targetRevision' => 'target_revision',
        'summary'        => 'summary',
        'diffDetail'     => 'diff_detail',
        'riskLevel'      => 'risk_level',
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
        if (null !== $this->sourceConfig) {
            $res['source_config'] = null !== $this->sourceConfig ? $this->sourceConfig->toMap() : null;
        }
        if (null !== $this->sourceRevision) {
            $res['source_revision'] = $this->sourceRevision;
        }
        if (null !== $this->targetConfig) {
            $res['target_config'] = null !== $this->targetConfig ? $this->targetConfig->toMap() : null;
        }
        if (null !== $this->targetRevision) {
            $res['target_revision'] = $this->targetRevision;
        }
        if (null !== $this->summary) {
            $res['summary'] = $this->summary;
        }
        if (null !== $this->diffDetail) {
            $res['diff_detail'] = $this->diffDetail;
        }
        if (null !== $this->riskLevel) {
            $res['risk_level'] = $this->riskLevel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailContainerserviceRevisiondiffResponse
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
        if (isset($map['source_config'])) {
            $model->sourceConfig = ContainerServiceConfig::fromMap($map['source_config']);
        }
        if (isset($map['source_revision'])) {
            $model->sourceRevision = $map['source_revision'];
        }
        if (isset($map['target_config'])) {
            $model->targetConfig = ContainerServiceConfig::fromMap($map['target_config']);
        }
        if (isset($map['target_revision'])) {
            $model->targetRevision = $map['target_revision'];
        }
        if (isset($map['summary'])) {
            $model->summary = $map['summary'];
        }
        if (isset($map['diff_detail'])) {
            $model->diffDetail = $map['diff_detail'];
        }
        if (isset($map['risk_level'])) {
            $model->riskLevel = $map['risk_level'];
        }

        return $model;
    }
}
