<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QuerySofamqConnectordateResponse extends Model
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

    // 返回该任务的执行计划的实例摘要
    /**
     * @var InstanceDigest[]
     */
    public $data;

    // 时间列表
    /**
     * @var string[]
     */
    public $dateList;

    // 错误报告
    /**
     * @var ErrorReport
     */
    public $errorReport;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'data'        => 'data',
        'dateList'    => 'date_list',
        'errorReport' => 'error_report',
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
        if (null !== $this->data) {
            $res['data'] = [];
            if (null !== $this->data && \is_array($this->data)) {
                $n = 0;
                foreach ($this->data as $item) {
                    $res['data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->dateList) {
            $res['date_list'] = $this->dateList;
        }
        if (null !== $this->errorReport) {
            $res['error_report'] = null !== $this->errorReport ? $this->errorReport->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySofamqConnectordateResponse
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
        if (isset($map['data'])) {
            if (!empty($map['data'])) {
                $model->data = [];
                $n           = 0;
                foreach ($map['data'] as $item) {
                    $model->data[$n++] = null !== $item ? InstanceDigest::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['date_list'])) {
            if (!empty($map['date_list'])) {
                $model->dateList = $map['date_list'];
            }
        }
        if (isset($map['error_report'])) {
            $model->errorReport = ErrorReport::fromMap($map['error_report']);
        }

        return $model;
    }
}
