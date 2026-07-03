<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRtopCrowdriskStatisticResponse extends Model
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

    /**
     * @var RtopLevelDistribution[]
     */
    public $levelDistribution;

    // 按地区统计
    /**
     * @var RtopRegionalDistribution[]
     */
    public $regionDistribution;

    /**
     * @var RtopTypeDistribution[]
     */
    public $typeDistribution;
    protected $_name = [
        'reqMsgId'           => 'req_msg_id',
        'resultCode'         => 'result_code',
        'resultMsg'          => 'result_msg',
        'levelDistribution'  => 'level_distribution',
        'regionDistribution' => 'region_distribution',
        'typeDistribution'   => 'type_distribution',
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
        if (null !== $this->levelDistribution) {
            $res['level_distribution'] = [];
            if (null !== $this->levelDistribution && \is_array($this->levelDistribution)) {
                $n = 0;
                foreach ($this->levelDistribution as $item) {
                    $res['level_distribution'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->regionDistribution) {
            $res['region_distribution'] = [];
            if (null !== $this->regionDistribution && \is_array($this->regionDistribution)) {
                $n = 0;
                foreach ($this->regionDistribution as $item) {
                    $res['region_distribution'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->typeDistribution) {
            $res['type_distribution'] = [];
            if (null !== $this->typeDistribution && \is_array($this->typeDistribution)) {
                $n = 0;
                foreach ($this->typeDistribution as $item) {
                    $res['type_distribution'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRtopCrowdriskStatisticResponse
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
        if (isset($map['level_distribution'])) {
            if (!empty($map['level_distribution'])) {
                $model->levelDistribution = [];
                $n                        = 0;
                foreach ($map['level_distribution'] as $item) {
                    $model->levelDistribution[$n++] = null !== $item ? RtopLevelDistribution::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['region_distribution'])) {
            if (!empty($map['region_distribution'])) {
                $model->regionDistribution = [];
                $n                         = 0;
                foreach ($map['region_distribution'] as $item) {
                    $model->regionDistribution[$n++] = null !== $item ? RtopRegionalDistribution::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['type_distribution'])) {
            if (!empty($map['type_distribution'])) {
                $model->typeDistribution = [];
                $n                       = 0;
                foreach ($map['type_distribution'] as $item) {
                    $model->typeDistribution[$n++] = null !== $item ? RtopTypeDistribution::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
