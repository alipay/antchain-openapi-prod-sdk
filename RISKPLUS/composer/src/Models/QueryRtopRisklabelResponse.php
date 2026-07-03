<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRtopRisklabelResponse extends Model
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

    // 返回码
    /**
     * @var string
     */
    public $responseCode;

    // 标签信息
    /**
     * @var RiskLabelInfo[]
     */
    public $riskLabelInfos;

    // scroll_id
    /**
     * @var string
     */
    public $scrollId;

    // 是否调用成功
    /**
     * @var bool
     */
    public $success;

    // total
    /**
     * @var int
     */
    public $total;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'responseCode'   => 'response_code',
        'riskLabelInfos' => 'risk_label_infos',
        'scrollId'       => 'scroll_id',
        'success'        => 'success',
        'total'          => 'total',
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
        if (null !== $this->responseCode) {
            $res['response_code'] = $this->responseCode;
        }
        if (null !== $this->riskLabelInfos) {
            $res['risk_label_infos'] = [];
            if (null !== $this->riskLabelInfos && \is_array($this->riskLabelInfos)) {
                $n = 0;
                foreach ($this->riskLabelInfos as $item) {
                    $res['risk_label_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->scrollId) {
            $res['scroll_id'] = $this->scrollId;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRtopRisklabelResponse
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
        if (isset($map['response_code'])) {
            $model->responseCode = $map['response_code'];
        }
        if (isset($map['risk_label_infos'])) {
            if (!empty($map['risk_label_infos'])) {
                $model->riskLabelInfos = [];
                $n                     = 0;
                foreach ($map['risk_label_infos'] as $item) {
                    $model->riskLabelInfos[$n++] = null !== $item ? RiskLabelInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['scroll_id'])) {
            $model->scrollId = $map['scroll_id'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }

        return $model;
    }
}
