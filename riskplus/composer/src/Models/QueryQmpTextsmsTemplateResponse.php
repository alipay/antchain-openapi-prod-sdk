<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryQmpTextsmsTemplateResponse extends Model
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

    // 总数
    /**
     * @var int
     */
    public $total;

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 每页记录数
    /**
     * @var int
     */
    public $pageSize;

    // 模板列表
    /**
     * @var SmsTemplate[]
     */
    public $smsTemplates;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'total'        => 'total',
        'pageNum'      => 'page_num',
        'pageSize'     => 'page_size',
        'smsTemplates' => 'sms_templates',
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
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->smsTemplates) {
            $res['sms_templates'] = [];
            if (null !== $this->smsTemplates && \is_array($this->smsTemplates)) {
                $n = 0;
                foreach ($this->smsTemplates as $item) {
                    $res['sms_templates'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryQmpTextsmsTemplateResponse
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
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['sms_templates'])) {
            if (!empty($map['sms_templates'])) {
                $model->smsTemplates = [];
                $n                   = 0;
                foreach ($map['sms_templates'] as $item) {
                    $model->smsTemplates[$n++] = null !== $item ? SmsTemplate::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
