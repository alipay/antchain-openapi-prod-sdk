<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryResourceVswitchResponse extends Model
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

    // 列表条目数
    /**
     * @var int
     */
    public $totalCount;

    // 交换机的详细信息
    /**
     * @var VSwitch[]
     */
    public $vSwitches;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'totalCount' => 'total_count',
        'vSwitches'  => 'v_switches',
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
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->vSwitches) {
            $res['v_switches'] = [];
            if (null !== $this->vSwitches && \is_array($this->vSwitches)) {
                $n = 0;
                foreach ($this->vSwitches as $item) {
                    $res['v_switches'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryResourceVswitchResponse
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
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['v_switches'])) {
            if (!empty($map['v_switches'])) {
                $model->vSwitches = [];
                $n                = 0;
                foreach ($map['v_switches'] as $item) {
                    $model->vSwitches[$n++] = null !== $item ? VSwitch::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
