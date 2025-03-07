<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class OrderPromiseExcelInfo extends Model
{
    // 文件下载地址
    /**
     * @example http://www.baidu.com
     *
     * @var string
     */
    public $downloadUrl;

    // 文件类型,订单明细表:ORDER_DETAIL 还款记录表:ORDER_FULFILLMENT
    /**
     * @example ORDER_DETAIL
     *
     * @var string
     */
    public $fileType;

    // 任务状态
    // ● RUNNING:生成中
    // ● SUCCESS:已生成
    // ● FAILED:失败
    /**
     * @example RUNNING
     *
     * @var string
     */
    public $taskStatus;
    protected $_name = [
        'downloadUrl' => 'download_url',
        'fileType'    => 'file_type',
        'taskStatus'  => 'task_status',
    ];

    public function validate()
    {
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('taskStatus', $this->taskStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->downloadUrl) {
            $res['download_url'] = $this->downloadUrl;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->taskStatus) {
            $res['task_status'] = $this->taskStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderPromiseExcelInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['download_url'])) {
            $model->downloadUrl = $map['download_url'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['task_status'])) {
            $model->taskStatus = $map['task_status'];
        }

        return $model;
    }
}
