<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models;

use AlibabaCloud\Tea\Model;

class CertificateData extends Model
{
    // 任务ID
    /**
     * @example 任务ID
     *
     * @var string
     */
    public $taskId;

    // 版权用户UID
    /**
     * @example 版权用户UID
     *
     * @var string
     */
    public $userId;

    // DCI码
    /**
     * @example DCI码
     *
     * @var string
     */
    public $dciCode;

    // 证书下载的链接地址
    /**
     * @example 证书下载的链接地址
     *
     * @var string
     */
    public $certificateUrl;
    protected $_name = [
        'taskId'         => 'task_id',
        'userId'         => 'user_id',
        'dciCode'        => 'dci_code',
        'certificateUrl' => 'certificate_url',
    ];

    public function validate()
    {
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('dciCode', $this->dciCode, true);
        Model::validateRequired('certificateUrl', $this->certificateUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->dciCode) {
            $res['dci_code'] = $this->dciCode;
        }
        if (null !== $this->certificateUrl) {
            $res['certificate_url'] = $this->certificateUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CertificateData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['dci_code'])) {
            $model->dciCode = $map['dci_code'];
        }
        if (isset($map['certificate_url'])) {
            $model->certificateUrl = $map['certificate_url'];
        }

        return $model;
    }
}
