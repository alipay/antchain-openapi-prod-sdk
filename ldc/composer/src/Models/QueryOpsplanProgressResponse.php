<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryOpsplanProgressResponse extends Model
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

    // 应用执行进度
    /**
     * @var ExecuteProgress[]
     */
    public $appExecuteProgress;

    // 发布单进度
    /**
     * @var ExecuteProgress
     */
    public $executeProgress;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'appExecuteProgress' => 'app_execute_progress',
        'executeProgress'    => 'execute_progress',
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
        if (null !== $this->appExecuteProgress) {
            $res['app_execute_progress'] = [];
            if (null !== $this->appExecuteProgress && \is_array($this->appExecuteProgress)) {
                $n = 0;
                foreach ($this->appExecuteProgress as $item) {
                    $res['app_execute_progress'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->executeProgress) {
            $res['execute_progress'] = null !== $this->executeProgress ? $this->executeProgress->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOpsplanProgressResponse
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
        if (isset($map['app_execute_progress'])) {
            if (!empty($map['app_execute_progress'])) {
                $model->appExecuteProgress = [];
                $n                         = 0;
                foreach ($map['app_execute_progress'] as $item) {
                    $model->appExecuteProgress[$n++] = null !== $item ? ExecuteProgress::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['execute_progress'])) {
            $model->executeProgress = ExecuteProgress::fromMap($map['execute_progress']);
        }

        return $model;
    }
}
