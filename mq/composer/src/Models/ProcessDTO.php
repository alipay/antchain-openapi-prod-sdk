<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ProcessDTO extends Model
{
    // 工单名称
    /**
     * @example Source审批
     *
     * @var string
     */
    public $processName;

    // 状态
    /**
     * @example APPENDING
     *
     * @var string
     */
    public $processStatus;

    // 工单链接
    /**
     * @example http://www.taobao.com
     *
     * @var string
     */
    public $processUrl;
    protected $_name = [
        'processName'   => 'process_name',
        'processStatus' => 'process_status',
        'processUrl'    => 'process_url',
    ];

    public function validate()
    {
        Model::validateRequired('processName', $this->processName, true);
        Model::validateRequired('processStatus', $this->processStatus, true);
        Model::validateRequired('processUrl', $this->processUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->processName) {
            $res['process_name'] = $this->processName;
        }
        if (null !== $this->processStatus) {
            $res['process_status'] = $this->processStatus;
        }
        if (null !== $this->processUrl) {
            $res['process_url'] = $this->processUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProcessDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['process_name'])) {
            $model->processName = $map['process_name'];
        }
        if (isset($map['process_status'])) {
            $model->processStatus = $map['process_status'];
        }
        if (isset($map['process_url'])) {
            $model->processUrl = $map['process_url'];
        }

        return $model;
    }
}
