<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class AllTemplateResponse extends Model
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

    // 时间
    /**
     * @var int
     */
    public $date;

    // 请求id
    /**
     * @var string
     */
    public $requestId;

    // 数据字典信息
    /**
     * @var TemplateInfo[]
     */
    public $templateInfoList;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'date'             => 'date',
        'requestId'        => 'request_id',
        'templateInfoList' => 'template_info_list',
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
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->templateInfoList) {
            $res['template_info_list'] = [];
            if (null !== $this->templateInfoList && \is_array($this->templateInfoList)) {
                $n = 0;
                foreach ($this->templateInfoList as $item) {
                    $res['template_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AllTemplateResponse
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
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['template_info_list'])) {
            if (!empty($map['template_info_list'])) {
                $model->templateInfoList = [];
                $n                       = 0;
                foreach ($map['template_info_list'] as $item) {
                    $model->templateInfoList[$n++] = null !== $item ? TemplateInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
