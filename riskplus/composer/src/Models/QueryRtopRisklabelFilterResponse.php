<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRtopRisklabelFilterResponse extends Model
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

    // 标签配置全量信息
    /**
     * @var RiskLabelFilterConfigInfo[]
     */
    public $riskLabelFilterConfigInfo;

    // 是否调用成功
    /**
     * @var bool
     */
    public $success;

    // 总数
    /**
     * @var int
     */
    public $total;
    protected $_name = [
        'reqMsgId'                  => 'req_msg_id',
        'resultCode'                => 'result_code',
        'resultMsg'                 => 'result_msg',
        'responseCode'              => 'response_code',
        'riskLabelFilterConfigInfo' => 'risk_label_filter_config_info',
        'success'                   => 'success',
        'total'                     => 'total',
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
        if (null !== $this->riskLabelFilterConfigInfo) {
            $res['risk_label_filter_config_info'] = [];
            if (null !== $this->riskLabelFilterConfigInfo && \is_array($this->riskLabelFilterConfigInfo)) {
                $n = 0;
                foreach ($this->riskLabelFilterConfigInfo as $item) {
                    $res['risk_label_filter_config_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
     * @return QueryRtopRisklabelFilterResponse
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
        if (isset($map['risk_label_filter_config_info'])) {
            if (!empty($map['risk_label_filter_config_info'])) {
                $model->riskLabelFilterConfigInfo = [];
                $n                                = 0;
                foreach ($map['risk_label_filter_config_info'] as $item) {
                    $model->riskLabelFilterConfigInfo[$n++] = null !== $item ? RiskLabelFilterConfigInfo::fromMap($item) : $item;
                }
            }
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
