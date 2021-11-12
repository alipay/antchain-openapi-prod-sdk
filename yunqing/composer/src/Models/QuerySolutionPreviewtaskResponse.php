<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class QuerySolutionPreviewtaskResponse extends Model
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

    // 产品预览任务查询
    /**
     * @var ProdPreviewTasks[]
     */
    public $prodPreviewTasks;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'prodPreviewTasks' => 'prod_preview_tasks',
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
        if (null !== $this->prodPreviewTasks) {
            $res['prod_preview_tasks'] = [];
            if (null !== $this->prodPreviewTasks && \is_array($this->prodPreviewTasks)) {
                $n = 0;
                foreach ($this->prodPreviewTasks as $item) {
                    $res['prod_preview_tasks'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySolutionPreviewtaskResponse
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
        if (isset($map['prod_preview_tasks'])) {
            if (!empty($map['prod_preview_tasks'])) {
                $model->prodPreviewTasks = [];
                $n                       = 0;
                foreach ($map['prod_preview_tasks'] as $item) {
                    $model->prodPreviewTasks[$n++] = null !== $item ? ProdPreviewTasks::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
