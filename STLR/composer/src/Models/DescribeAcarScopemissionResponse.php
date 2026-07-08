<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class DescribeAcarScopemissionResponse extends Model
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

    // 总排放量
    /**
     * @var int
     */
    public $totalEmissions;

    // 单位
    /**
     * @var string
     */
    public $unit;

    // 各范围的排放情况列表
    /**
     * @var EmissionsScopeStatistics[]
     */
    public $scopeEmissionsList;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'totalEmissions'     => 'total_emissions',
        'unit'               => 'unit',
        'scopeEmissionsList' => 'scope_emissions_list',
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
        if (null !== $this->totalEmissions) {
            $res['total_emissions'] = $this->totalEmissions;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        if (null !== $this->scopeEmissionsList) {
            $res['scope_emissions_list'] = [];
            if (null !== $this->scopeEmissionsList && \is_array($this->scopeEmissionsList)) {
                $n = 0;
                foreach ($this->scopeEmissionsList as $item) {
                    $res['scope_emissions_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DescribeAcarScopemissionResponse
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
        if (isset($map['total_emissions'])) {
            $model->totalEmissions = $map['total_emissions'];
        }
        if (isset($map['unit'])) {
            $model->unit = $map['unit'];
        }
        if (isset($map['scope_emissions_list'])) {
            if (!empty($map['scope_emissions_list'])) {
                $model->scopeEmissionsList = [];
                $n                         = 0;
                foreach ($map['scope_emissions_list'] as $item) {
                    $model->scopeEmissionsList[$n++] = null !== $item ? EmissionsScopeStatistics::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
