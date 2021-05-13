<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class QueryStatusflowTemplateResponse extends Model
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

    // 联盟ID
    /**
     * @var string
     */
    public $unionId;

    // 状态流模版名称
    /**
     * @var string
     */
    public $flowName;

    // 自定义流程返回DTO
    /**
     * @var FlowTemplate[]
     */
    public $listTemplateProcess;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'unionId'             => 'union_id',
        'flowName'            => 'flow_name',
        'listTemplateProcess' => 'list_template_process',
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
        if (null !== $this->unionId) {
            $res['union_id'] = $this->unionId;
        }
        if (null !== $this->flowName) {
            $res['flow_name'] = $this->flowName;
        }
        if (null !== $this->listTemplateProcess) {
            $res['list_template_process'] = [];
            if (null !== $this->listTemplateProcess && \is_array($this->listTemplateProcess)) {
                $n = 0;
                foreach ($this->listTemplateProcess as $item) {
                    $res['list_template_process'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryStatusflowTemplateResponse
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
        if (isset($map['union_id'])) {
            $model->unionId = $map['union_id'];
        }
        if (isset($map['flow_name'])) {
            $model->flowName = $map['flow_name'];
        }
        if (isset($map['list_template_process'])) {
            if (!empty($map['list_template_process'])) {
                $model->listTemplateProcess = [];
                $n                          = 0;
                foreach ($map['list_template_process'] as $item) {
                    $model->listTemplateProcess[$n++] = null !== $item ? FlowTemplate::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
