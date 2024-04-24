<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryRiskGeneralResponse extends Model
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

    // 是否计费
    /**
     * @var bool
     */
    public $meter;

    // 批量调用情况下的计费数量
    /**
     * @var int
     */
    public $meterCount;

    // 风险咨询结果的批量查询结果
    /**
     * @var ResultList[]
     */
    public $resultList;

    // 拓展输出字段
    /**
     * @var string
     */
    public $extData;

    // 是否查得
    /**
     * @var bool
     */
    public $found;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'meter'      => 'meter',
        'meterCount' => 'meter_count',
        'resultList' => 'result_list',
        'extData'    => 'ext_data',
        'found'      => 'found',
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
        if (null !== $this->meter) {
            $res['meter'] = $this->meter;
        }
        if (null !== $this->meterCount) {
            $res['meter_count'] = $this->meterCount;
        }
        if (null !== $this->resultList) {
            $res['result_list'] = [];
            if (null !== $this->resultList && \is_array($this->resultList)) {
                $n = 0;
                foreach ($this->resultList as $item) {
                    $res['result_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->extData) {
            $res['ext_data'] = $this->extData;
        }
        if (null !== $this->found) {
            $res['found'] = $this->found;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRiskGeneralResponse
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
        if (isset($map['meter'])) {
            $model->meter = $map['meter'];
        }
        if (isset($map['meter_count'])) {
            $model->meterCount = $map['meter_count'];
        }
        if (isset($map['result_list'])) {
            if (!empty($map['result_list'])) {
                $model->resultList = [];
                $n                 = 0;
                foreach ($map['result_list'] as $item) {
                    $model->resultList[$n++] = null !== $item ? ResultList::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ext_data'])) {
            $model->extData = $map['ext_data'];
        }
        if (isset($map['found'])) {
            $model->found = $map['found'];
        }

        return $model;
    }
}
