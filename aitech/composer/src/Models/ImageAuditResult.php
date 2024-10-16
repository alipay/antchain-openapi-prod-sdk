<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class ImageAuditResult extends Model
{
    // 任务ID
    /**
     * @example 任务ID
     *
     * @var string
     */
    public $taskId;

    // 数据ID
    /**
     * @example 数据ID
     *
     * @var string
     */
    public $dataId;

    // LOGO审核结果
    /**
     * @example
     *
     * @var LogoAuditResult
     */
    public $logoAuditResult;

    // QRCode审核结果
    /**
     * @example
     *
     * @var QRCodeAuditResult
     */
    public $qrCodeAuditResult;
    protected $_name = [
        'taskId'            => 'task_id',
        'dataId'            => 'data_id',
        'logoAuditResult'   => 'logo_audit_result',
        'qrCodeAuditResult' => 'qr_code_audit_result',
    ];

    public function validate()
    {
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateRequired('logoAuditResult', $this->logoAuditResult, true);
        Model::validateRequired('qrCodeAuditResult', $this->qrCodeAuditResult, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->logoAuditResult) {
            $res['logo_audit_result'] = null !== $this->logoAuditResult ? $this->logoAuditResult->toMap() : null;
        }
        if (null !== $this->qrCodeAuditResult) {
            $res['qr_code_audit_result'] = null !== $this->qrCodeAuditResult ? $this->qrCodeAuditResult->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImageAuditResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['data_id'])) {
            $model->dataId = $map['data_id'];
        }
        if (isset($map['logo_audit_result'])) {
            $model->logoAuditResult = LogoAuditResult::fromMap($map['logo_audit_result']);
        }
        if (isset($map['qr_code_audit_result'])) {
            $model->qrCodeAuditResult = QRCodeAuditResult::fromMap($map['qr_code_audit_result']);
        }

        return $model;
    }
}
