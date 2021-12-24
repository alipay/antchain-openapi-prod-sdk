<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIALEXTERNAL\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryTradecoreSoldspecinstanceResponse extends Model
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

    // 某开发商已售给某商户的所有规格实例信息
    /**
     * @var SoldSpecInstance[]
     */
    public $soldSpecInstances;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'soldSpecInstances' => 'sold_spec_instances',
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
        if (null !== $this->soldSpecInstances) {
            $res['sold_spec_instances'] = [];
            if (null !== $this->soldSpecInstances && \is_array($this->soldSpecInstances)) {
                $n = 0;
                foreach ($this->soldSpecInstances as $item) {
                    $res['sold_spec_instances'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryTradecoreSoldspecinstanceResponse
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
        if (isset($map['sold_spec_instances'])) {
            if (!empty($map['sold_spec_instances'])) {
                $model->soldSpecInstances = [];
                $n                        = 0;
                foreach ($map['sold_spec_instances'] as $item) {
                    $model->soldSpecInstances[$n++] = null !== $item ? SoldSpecInstance::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
