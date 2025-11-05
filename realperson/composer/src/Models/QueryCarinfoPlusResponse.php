<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryCarinfoPlusResponse extends Model
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

    // 扩展信息，为JSONObject。
    //
    /**
     * @var string
     */
    public $externInfo;

    // 用户名下车辆数量，格式：1，2，3...
    /**
     * @var string
     */
    public $amont;

    // 车辆信息
    /**
     * @var CarInfoPlus[]
     */
    public $carInfos;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'externInfo' => 'extern_info',
        'amont'      => 'amont',
        'carInfos'   => 'car_infos',
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
        if (null !== $this->externInfo) {
            $res['extern_info'] = $this->externInfo;
        }
        if (null !== $this->amont) {
            $res['amont'] = $this->amont;
        }
        if (null !== $this->carInfos) {
            $res['car_infos'] = [];
            if (null !== $this->carInfos && \is_array($this->carInfos)) {
                $n = 0;
                foreach ($this->carInfos as $item) {
                    $res['car_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCarinfoPlusResponse
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
        if (isset($map['extern_info'])) {
            $model->externInfo = $map['extern_info'];
        }
        if (isset($map['amont'])) {
            $model->amont = $map['amont'];
        }
        if (isset($map['car_infos'])) {
            if (!empty($map['car_infos'])) {
                $model->carInfos = [];
                $n               = 0;
                foreach ($map['car_infos'] as $item) {
                    $model->carInfos[$n++] = null !== $item ? CarInfoPlus::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
