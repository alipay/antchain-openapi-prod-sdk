<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ListPeripheralBysceneResponse extends Model
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

    // 外围设备信息列表
    //
    //
    /**
     * @var Peripheral[]
     */
    public $peripheralList;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'peripheralList' => 'peripheral_list',
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
        if (null !== $this->peripheralList) {
            $res['peripheral_list'] = [];
            if (null !== $this->peripheralList && \is_array($this->peripheralList)) {
                $n = 0;
                foreach ($this->peripheralList as $item) {
                    $res['peripheral_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListPeripheralBysceneResponse
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
        if (isset($map['peripheral_list'])) {
            if (!empty($map['peripheral_list'])) {
                $model->peripheralList = [];
                $n                     = 0;
                foreach ($map['peripheral_list'] as $item) {
                    $model->peripheralList[$n++] = null !== $item ? Peripheral::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
