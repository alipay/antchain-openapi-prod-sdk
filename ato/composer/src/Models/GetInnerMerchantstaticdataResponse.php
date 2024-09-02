<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class GetInnerMerchantstaticdataResponse extends Model
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

    // 商户入驻静态数据
    /**
     * @var StaticData[]
     */
    public $staticDataList;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'staticDataList' => 'static_data_list',
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
        if (null !== $this->staticDataList) {
            $res['static_data_list'] = [];
            if (null !== $this->staticDataList && \is_array($this->staticDataList)) {
                $n = 0;
                foreach ($this->staticDataList as $item) {
                    $res['static_data_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetInnerMerchantstaticdataResponse
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
        if (isset($map['static_data_list'])) {
            if (!empty($map['static_data_list'])) {
                $model->staticDataList = [];
                $n                     = 0;
                foreach ($map['static_data_list'] as $item) {
                    $model->staticDataList[$n++] = null !== $item ? StaticData::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
