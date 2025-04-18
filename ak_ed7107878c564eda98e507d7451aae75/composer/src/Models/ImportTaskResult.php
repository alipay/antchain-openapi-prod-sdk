<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models;

use AlibabaCloud\Tea\Model;

class ImportTaskResult extends Model
{
    // 任务状态
    /**
     * @example init/running/end/error
     *
     * @var string
     */
    public $status;

    // 进度值
    /**
     * @example 99
     *
     * @var int
     */
    public $progress;

    // 错误日志
    /**
     * @example 错误日志
     *
     * @var string
     */
    public $errorMessage;

    // 导入日志文件url
    /**
     * @example www.123.com
     *
     * @var string
     */
    public $fileUrl;
    protected $_name = [
        'status'       => 'status',
        'progress'     => 'progress',
        'errorMessage' => 'error_message',
        'fileUrl'      => 'file_url',
    ];

    public function validate()
    {
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->progress) {
            $res['progress'] = $this->progress;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportTaskResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['progress'])) {
            $model->progress = $map['progress'];
        }
        if (isset($map['error_message'])) {
            $model->errorMessage = $map['error_message'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }

        return $model;
    }
}
