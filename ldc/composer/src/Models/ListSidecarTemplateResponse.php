<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ListSidecarTemplateResponse extends Model
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

    // sidecar 模板列表
    /**
     * @var SidecarTemplate[]
     */
    public $sidecarTemplates;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'sidecarTemplates' => 'sidecar_templates',
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
        if (null !== $this->sidecarTemplates) {
            $res['sidecar_templates'] = [];
            if (null !== $this->sidecarTemplates && \is_array($this->sidecarTemplates)) {
                $n = 0;
                foreach ($this->sidecarTemplates as $item) {
                    $res['sidecar_templates'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListSidecarTemplateResponse
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
        if (isset($map['sidecar_templates'])) {
            if (!empty($map['sidecar_templates'])) {
                $model->sidecarTemplates = [];
                $n                       = 0;
                foreach ($map['sidecar_templates'] as $item) {
                    $model->sidecarTemplates[$n++] = null !== $item ? SidecarTemplate::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
