<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class QueryDigitalkeyNfccarinfoResponse extends Model
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

    // 分页器
    /**
     * @var Paginator
     */
    public $paginator;

    // 车辆信息列表
    /**
     * @var CarInfoVO[]
     */
    public $carInfoList;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'paginator'   => 'paginator',
        'carInfoList' => 'car_info_list',
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
        if (null !== $this->paginator) {
            $res['paginator'] = null !== $this->paginator ? $this->paginator->toMap() : null;
        }
        if (null !== $this->carInfoList) {
            $res['car_info_list'] = [];
            if (null !== $this->carInfoList && \is_array($this->carInfoList)) {
                $n = 0;
                foreach ($this->carInfoList as $item) {
                    $res['car_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDigitalkeyNfccarinfoResponse
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
        if (isset($map['paginator'])) {
            $model->paginator = Paginator::fromMap($map['paginator']);
        }
        if (isset($map['car_info_list'])) {
            if (!empty($map['car_info_list'])) {
                $model->carInfoList = [];
                $n                  = 0;
                foreach ($map['car_info_list'] as $item) {
                    $model->carInfoList[$n++] = null !== $item ? CarInfoVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
