<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class GetProductSaassdkResponse extends Model
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

    // 当前的sdk版本
    /**
     * @var string
     */
    public $currentVersion;

    // 要发布的版本
    /**
     * @var string
     */
    public $publishVersion;

    // 打包是否正在进行
    /**
     * @var bool
     */
    public $taskRunning;

    // 已经过发布的sdk
    /**
     * @var MultiSdkItem[]
     */
    public $publishedSdks;

    // 任务状态
    /**
     * @var string
     */
    public $taskStatus;

    // 任务码
    /**
     * @var string
     */
    public $taskId;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'currentVersion' => 'current_version',
        'publishVersion' => 'publish_version',
        'taskRunning'    => 'task_running',
        'publishedSdks'  => 'published_sdks',
        'taskStatus'     => 'task_status',
        'taskId'         => 'task_id',
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
        if (null !== $this->currentVersion) {
            $res['current_version'] = $this->currentVersion;
        }
        if (null !== $this->publishVersion) {
            $res['publish_version'] = $this->publishVersion;
        }
        if (null !== $this->taskRunning) {
            $res['task_running'] = $this->taskRunning;
        }
        if (null !== $this->publishedSdks) {
            $res['published_sdks'] = [];
            if (null !== $this->publishedSdks && \is_array($this->publishedSdks)) {
                $n = 0;
                foreach ($this->publishedSdks as $item) {
                    $res['published_sdks'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->taskStatus) {
            $res['task_status'] = $this->taskStatus;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetProductSaassdkResponse
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
        if (isset($map['current_version'])) {
            $model->currentVersion = $map['current_version'];
        }
        if (isset($map['publish_version'])) {
            $model->publishVersion = $map['publish_version'];
        }
        if (isset($map['task_running'])) {
            $model->taskRunning = $map['task_running'];
        }
        if (isset($map['published_sdks'])) {
            if (!empty($map['published_sdks'])) {
                $model->publishedSdks = [];
                $n                    = 0;
                foreach ($map['published_sdks'] as $item) {
                    $model->publishedSdks[$n++] = null !== $item ? MultiSdkItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['task_status'])) {
            $model->taskStatus = $map['task_status'];
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }

        return $model;
    }
}
